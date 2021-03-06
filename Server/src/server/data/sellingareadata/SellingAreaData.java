package server.data.sellingareadata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DailyRecord.DailyRecord;
import History.History;
import _enum.ResultMessage;
import server.database.MySQLDataBase;
import po.*;
import dataservice.sellingareadataservice.SellingAreaDataBaseService;

public class SellingAreaData extends UnicastRemoteObject implements SellingAreaDataBaseService {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MySQLDataBase db;
	History his;
    DailyRecord record;
	public SellingAreaData(MySQLDataBase db) throws RemoteException {
		super();
		this.db = db;
		his = new History(db);
		record=new DailyRecord(db);
	}

	public CarPO findCar(String id) throws RemoteException {
		String sql = "select * from Car where number='" + id+"';";
		ResultSet rs = db.find(sql);
		String number = null;
		String en = null;
		String CarNumber = null;
		String ChassisNumber = null;
		String purchase = null;
		int st = 0;
		try {
			while (rs.next()) {
				number = rs.getString(1);
				en = rs.getString(2);
				CarNumber = rs.getString(3);
				ChassisNumber = rs.getString(4);
				purchase = rs.getString(5);
				st = rs.getInt(6);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		record.insert("营业厅业务员查看车辆信息");
		if (number != null)
			return new CarPO(number, en, CarNumber, ChassisNumber, purchase, st);
		else
			return null;
	}

	public DriverPO findDriver(String id) throws RemoteException {
		String sql = "select * from Driver where number='" + id+"';";
		ResultSet rs = db.find(sql);
		String number = null;
		String name = null;
		String birthday = null;
		String ID = null;
		String phone = null;
		String CarCompany = null;
		String sex = null;
		String LicenceTime = null;
		try {
			while (rs.next()) {
				number = rs.getString(1);
				name = rs.getString(2);
				birthday = rs.getString(3);
				ID = rs.getString(4);
				;
				phone = rs.getString(5);
				CarCompany = rs.getString(6);
				sex = rs.getString(7);
				LicenceTime = rs.getString(8);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		record.insert("营业厅业务员查看司机信息");
		if (number != null)
			return new DriverPO(number, name, birthday, ID, phone, CarCompany, sex, LicenceTime);
		else
			return null;
	}

	public ResultMessage update(Object po) throws RemoteException {
		String sql;
		ResultMessage rm;
		if (po instanceof CarPO) {
			CarPO po1 = (CarPO) po;
			sql = "update Car set EngineNumber='" + po1.getEngineNumber() + "',CarNumber='" + po1.getCarNumber()
					+ "',ChassisNumber='" + po1.getChassisNumber() + "',purchase='" + po1.getPurchase() + "',ServiceTime="
					+ po1.getServiceTime() + " where number='" + po1.getNumber()+"';";
			rm = db.update(sql);
			record.insert("营业厅业务员更新车辆信息");
			return rm;
		} else if (po instanceof DriverPO) {
			DriverPO po1 = (DriverPO) po;
			sql = "update Driver set name='" + po1.getName() + "',birthday='" + po1.getBirthday() + "',ID='" + po1.getID()
					+ "',phone='" + po1.getPhone() + "',CarCompany='" + po1.getCarCompany() + "',sex='" + po1.getSex()
					+ "',LicenceTime='" + po1.getLicenceTime() + "' where number='" + po1.getNumber()+"';";
			rm = db.update(sql);
			record.insert("营业厅业务员更新司机信息");
			return rm;
		}
		return null;

	}

	public ResultMessage delete(Object po) throws RemoteException {
		String sql = null;
		if (po instanceof CarPO) {
			sql = "delete from Car where number='" + ((CarPO) po).getNumber()+"';";
			record.insert("营业厅业务员删除车辆信息");
		} else if (po instanceof DriverPO) {
			sql = "delete from Driver where number='" + ((DriverPO) po).getNumber()+"';";
			record.insert("营业厅业务员删除司机信息");
		}
		ResultMessage rm = db.delete(sql);
		
		return rm;
	}

	public ResultMessage insert(Object po) throws RemoteException {
		String sql = null;
		ResultMessage rm = null;
		if (po instanceof CarPackPO) {
			CarPackPO po1 = (CarPackPO) po;
			ArrayList<String> list = po1.getList();
			for (int i = 0; i < list.size(); i++) {
				sql = "insert into CarPack values('" + po1.getDate() + "','" + po1.getNumber() + "','" + po1.getStart() + "','"
						+ po1.getDestination() + "','" + po1.getSupervisor() + "','" + po1.getSupercargo() + "','"
						+ list.get(i) + "'," + po1.getFee() + "," + po1.getIsCheck() + ",'"+po1.getSellingArea()+"','"+po1.getCarID()+"');";
				rm = db.insert(sql);
				his.SellingArea(list.get(i), po1.getStart(), null);
			}
			record.insert("营业厅业务员新建装车单");
		} else if (po instanceof CarPO) {
			CarPO po1 = (CarPO) po;
			sql = "insert into Car values('" + po1.getNumber() + "','" + po1.getEngineNumber() + "','"
					+ po1.getCarNumber() + "','" + po1.getChassisNumber() + "','" + po1.getPurchase() + "',"
					+ po1.getServiceTime() + ");";
			rm = db.insert(sql);
			record.insert("营业厅业务员新建车辆信息");
		} else if (po instanceof DriverPO) {
			DriverPO po1 = (DriverPO) po;
			sql = "insert into Driver values('" + po1.getNumber() + "','" + po1.getName() + "','" + po1.getBirthday()
					+ "','" + po1.getID() + "','" + po1.getPhone() + "','" + po1.getCarCompany() + "','" + po1.getSex()
					+ "','" + po1.getLicenceTime() + "');";
			rm = db.insert(sql);
			record.insert("营业厅业务员新建司机信息");
		} else if (po instanceof ReceiptPO) {
			ReceiptPO po1 = (ReceiptPO) po;
			sql = "insert into Receipt values(" + po1.getMoney() + ",'" + po1.getDate() + "','" + po1.getNumber() + "',"
					+ po1.getIsCheck() + ",'" + po1.getId() + "','" + po1.getSellingArea() + "');";
			rm = db.insert(sql);
			record.insert("营业厅业务员新建收款单");
		} else if (po instanceof AcceptPO) {
			AcceptPO po1 = (AcceptPO) po;
			sql = "insert into Accept values('" + po1.getBarCode() + "','" + po1.getDate() + "','" + po1.getNumber()
					+ "','" + po1.getStart() + "','" + po1.getState() + "'," + po1.getIsCheck() + ");";
			rm = db.insert(sql);
			his.SellingArea(po1.getBarCode(), po1.getStart(), po1.getState());
			record.insert("营业厅业务员新建接收单");
		} else if (po instanceof DeliverPO) {
			DeliverPO po1 = (DeliverPO) po;
			sql = "insert into Deliver values('" + po1.getBarCode() + "','" + po1.getDate() + "','" + po1.getNumber()
					+ "'," + po1.getIsCheck() + ");";
			rm = db.insert(sql);
			his.SellingArea(po1.getBarCode(), null, null);
			record.insert("营业厅业务员新建派件单");
		}

		return rm;
	}
	
	public double getDistance(String city1,String city2) throws RemoteException {
		String sql1="select * from DistanceAndFee where city1='"+city1+"' and city2='"+city2+"';";
		ResultSet rs=null;
		rs=db.find(sql1);
		double distance=0;
		try {
			if(rs.wasNull()){
				sql1="select * from DistanceAndFee where city1='"+city2+"' and city2='"+city1+"';";
			}
			distance=rs.getDouble(4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return distance;
	}

}
