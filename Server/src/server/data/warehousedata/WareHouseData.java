package server.data.warehousedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import History.History;
import po.CentreArrivalPO;
import po.CentreTransforPO;
import po.InStoragePO;
import po.OutStoragePO;
import po.WarehousePO;
import server.database.MySQLDataBase;
import _enum.ResultMessage;
import dataservice.warehousedataservice.WareHouseDataBaseService;

public class WareHouseData extends UnicastRemoteObject implements WareHouseDataBaseService{
	MySQLDataBase db;
	History his;
	public WareHouseData(MySQLDataBase db) throws RemoteException{
		super();
		this.db=db;
		his=new History(db);
	}
	public ResultMessage insert( Object po) throws RemoteException{
		String sql=null;
		if(po instanceof InStoragePO){
			InStoragePO po1=(InStoragePO) po;
			sql="insert into InStorage values("+po1.getId()+",'"+po1.getIndate()+"','"+po1.getDestination()+
					"',"+po1.getPos_qu()+","+po1.getPos_pai()+","+po1.getPos_jia()+
					","+po1.getPos_wei()+","+po1.getIsCheck()+",'"+po1.getWarehouseID()+"');";
		}else{
			OutStoragePO po1=(OutStoragePO) po;
			sql="insert into OutStorage values("+po1.getId()+",'"+po1.getDestination()+"','"+po1.getOutdate()+"','"+po1.getTransportation()+
					"',"+po1.getTrans_id()+","+po1.getIsCheck()+",'"+po1.getWarehouseID()+"');";
		}
		ResultMessage rm=db.insert(sql);
		return rm;
	}

	public ArrayList<InStoragePO> findIn(String date,String WarehouseID) throws RemoteException{
		String sql="select * from InStorage where Warehouse='"+WarehouseID+"' and indate='"+date+"';";
		ResultSet rs=db.find(sql);
		ArrayList<InStoragePO> list=new ArrayList<InStoragePO>();
	    try {
			while(rs.next()){
			     list.add(new InStoragePO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(9),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8)));
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return list;
	}

	public ResultMessage insert(WarehousePO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public ResultMessage clear() throws RemoteException {
		String sql1="truncate table InStorage;";
		String sql2="truncate table OutStorage;";
		ResultMessage rm;
		rm=db.delete(sql1);
		rm=db.delete(sql2);
		return rm;
	}
	public ResultMessage update(WarehousePO po) throws RemoteException {
		
		return null;
	}
	public ArrayList<CentreArrivalPO> getArrival() throws RemoteException {
		String sql="select * from CentreArrival where isCheck=1 and isInStorage=0;";
		ResultSet rs=db.find(sql);
		ArrayList<CentreArrivalPO> list=new ArrayList<CentreArrivalPO>();
		try {
			while(rs.next()){
				list.add(new CentreArrivalPO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public ResultMessage setAlarm(double d) throws RemoteException {
		
		return null;
	}
	public ArrayList<CentreTransforPO> getTransfor() throws RemoteException {
		String sql="select * from CentreTransfor where isCheck=1 and isOutStorage=0";
		ResultSet rs=db.find(sql);
		ArrayList<CentreTransforPO> list=new ArrayList<CentreTransforPO>();
		try {
			while(rs.next()){
				list.add(new CentreTransforPO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getDouble(10),rs.getInt(11),rs.getInt(12)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

      
}
