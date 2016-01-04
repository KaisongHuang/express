package server.data.courierdata;

import po.CourierPO;
import po.SenderPO;
import server.database.MySQLDataBase;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;

import DailyRecord.DailyRecord;
import History.History;
import HistoryService.HistoryService;
import _enum.ResultMessage;
import dataservice.courierdataservice.CourierDataBaseService;

public class CourierData extends UnicastRemoteObject implements CourierDataBaseService{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	MySQLDataBase db;
	HistoryService his;
	DailyRecord record;
	public CourierData(MySQLDataBase db) throws RemoteException{
    	super();
    	this.db=db;
        his=new History(db);
        record=new DailyRecord(db);
    }

	public ResultMessage insert(Object po) throws RemoteException {
		String sql = null;
		ResultMessage rm = null;
		if (po instanceof CourierPO) {

			CourierPO po1 = (CourierPO) po;
			ResultSet rs = db.find("select * from Sender where BarCode='" + po1.getNumber() + "';");
			try {
				if (rs.next()) {
					sql = "insert into Courier values('" + po1.getNumber() + "','" + po1.getName() + "','" + po1.getDate()
							+ "');";
					rm = db.insert(sql);
					
				} else
					return rm = ResultMessage.Fail;
			} catch (SQLException e) {

				e.printStackTrace();
			}
			record.insert("快递员新建收件单");
			return rm;
		} else {
			String sql1 = "select * from Sender";
			ResultSet rs = db.find(sql1);
			String barcode = "1000000000";
			try {
				if (rs.last()) {
					barcode = (1 + Integer.parseInt(rs.getString(18)))+"";
					System.out.println(rs.getString(18));
					System.out.println(barcode+"in");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(barcode+"out");

			SenderPO po1 = (SenderPO) po;
			sql = "insert into Sender values('" + po1.getSenderName() + "'," + "'" + po1.getSenderAddress() + "','"
					+ po1.getSenderCompany() + "'," + "'" + po1.getSenderCall() + "'," + "'" + po1.getSenderPhone()
					+ "'," + "'" + po1.getRecipientName() + "'," + "'" + po1.getRecipientAddress() + "'," + "'"
					+ po1.getRecipientCompany() + "'," + "'" + po1.getRecipientCall() + "'," + "'"
					+ po1.getRecipientPhone() + "'," + po1.getPcs() + "," + po1.getWeight() + "," + po1.getVolume()
					+ ",'" + po1.getCommodity() + "','" + po1.getSize() + "','" + po1.getBagging() + "',"
					+ po1.getTotal() + ",'" + barcode + "','" + po1.getType() + "');";
			rm = db.insert(sql);
			if(rm==ResultMessage.Success){
				his.init(barcode);
			    System.out.println("success");
			}
			record.insert("快递员新建寄件单");
			return rm;
		}

	}

	public double[] getDistanceAndFee(String city1,String city2) throws RemoteException {
		String sql1="select * from DistanceAndFee where city1='"+city1+"' and city2='"+city2+"';";
		ResultSet rs=null;
		rs=db.find(sql1);
		double[] distance=new double[2];

		try {
			if(rs.next()){
				sql1="select * from DistanceAndFee where city1='"+city2+"' and city2='"+city1+"';";
			}
			distance[0]=rs.getDouble(4);
			distance[1]=rs.getDouble(3);
			return distance;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public double getTime(String start,String end) throws RemoteException{
		int i=0;
		double time=0;
		int time1=0;
		int time2=0;
		String sql=null;
		ResultSet rs1=null;
		ResultSet rs2=null;
	    String code=null;
	    sql="select * from CarPack where start='"+start+"' and destination='"+end+"';";
	    rs1=db.find(sql);
	    try {
			while(rs1.next()&&i<1000){
				code=rs1.getString(7);
				time1=Integer.parseInt(rs1.getString(0));
				sql="select * from Courier where number='"+code+"';";
				rs2=db.find(sql);
				time2=Integer.parseInt(rs2.getString(3));
				if(time1/100==time2/100){
					i++;
					time+=(time2-time1);
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    time/=1000;
		return time;
	}
}
