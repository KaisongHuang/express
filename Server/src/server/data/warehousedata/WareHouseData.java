package server.data.warehousedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
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
					","+po1.getPos_wei()+","+po1.getIsCheck()+")";
		}else{
			OutStoragePO po1=(OutStoragePO) po;
			sql="insert into OutStorage values("+po1.getId()+",'"+po1.getDestination()+"','"+po1.getOutdate()+"','"+po1.getTransportation()+
					"',"+po1.getTrans_id()+","+po1.getIsCheck()+")";
		}
		ResultMessage rm=db.insert(sql);
		return rm;
	}

	public ArrayList<InStoragePO> findIn(String date) throws RemoteException{
		String sql="select * from InStorage where indate="+date;
		ResultSet rs=db.find(sql);
		return null;
	}

	public ArrayList<OutStoragePO> findOut( String date) throws RemoteException{
		String sql="select * from OutStorage where outdate="+date;
		ResultSet rs=db.find(sql);
		return null;
	
	}
	public ResultMessage insert(WarehousePO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public ResultMessage clear() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public ResultMessage update(WarehousePO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public ArrayList<CentreArrivalPO> getArrival() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public ResultMessage setAlarm(double d) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public ArrayList<CentreTransforPO> getTransfor() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	

      
}
