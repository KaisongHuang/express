package server.data.sellingareadata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;

import _enum.ResultMessage;
import server.database.MySQLDataBase;
import po.*;
import dataservice.sellingareadataservice.SellingAreaDataBaseService;

public class SellingAreaData extends UnicastRemoteObject implements SellingAreaDataBaseService{
	MySQLDataBase db;
	public SellingAreaData(MySQLDataBase db) throws RemoteException{
		super();
		this.db=db;
	}
	public SellingareaPO findCar( String id)  throws RemoteException{
	    String sql="select * from Car where number="+id;
	    ResultSet rs=db.find(sql);
		return null;
	}

	public SellingareaPO findDriver( String id) throws RemoteException {
	    String sql="select * from Driver where number="+id;
	    ResultSet rs=db.find(sql);
		return null;
	}
	public ResultMessage update( Object po)  throws RemoteException{
		String sql;
		ResultMessage rm;
		 if(po instanceof CarPO){
			 CarPO po1=(CarPO)po;
		    	sql="update Car set EngineNumber="+po1.getEngineNumber()+",CarNumber="+po1.getCarNumber()+",ChassisNumber="+po1.getChassisNumber()+
		    			",purchase="+po1.getPurchase()+",ServiceTime="+po1.getServiceTime()+" where number="+po1.getNumber();
		    	rm=db.update(sql);
		    	return rm;
		 }
		    else if(po instanceof DriverPO) {
			    DriverPO po1=(DriverPO) po;
		    	sql="update Driver set name="+po1.getName()+",birthday="+po1.getBirthday()+",ID="+po1.getID()+",phone="+po1.getPhone()+
		    			",CarCompany="+po1.getCarCompany()+",sex="+po1.getSex()+",LicenceTime="+po1.getSex()+
		    			" where number="+po1.getNumber();
		    	rm=db.update(sql);
		    	return rm;
		    }
		return null; 
		
	}

	public ResultMessage delete(Object po)  throws RemoteException{
		String sql=null;
		if(po instanceof CarPO){
			sql="delete from Car where number="+((CarPO) po).getNumber();
		}else if(po instanceof DriverPO){
			sql="delete from Driver where number="+((DriverPO) po).getNumber();
		}
		ResultMessage rm=db.delete(sql);	
		
		
		return rm;
	}

	public ResultMessage insert(Object po)  throws RemoteException{
		String sql=null;
		if(po instanceof CarPackPO){
			CarPackPO po1=(CarPackPO) po;
			sql="insert into  values('"+po1.getDate()+"',"+po1.getNumber()+",'"+po1.getStart()+"','"
				+po1.getDestination()+"',"+po1.getSupervisor()+","+po1.getSupercargo()+","+po1.getList()+","+po1.getFee()+","+po1.getIsCheck()+")";
		}else if(po instanceof CarPO){
			CarPO po1=(CarPO) po;
			sql="insert into Car values("+po1.getNumber()+","+po1.getEngineNumber()+","+po1.getCarNumber()+","+po1.getChassisNumber()+",'"+po1.getPurchase()+"',"+po1.getServiceTime()+")";
		}else if(po instanceof DriverPO){
			DriverPO po1=(DriverPO) po;
			sql="insert into Driver values("+po1.getNumber()+",'"+po1.getName()+"','"+po1.getBirthday()+"',"+po1.getID()+",'"+po1.getPhone()+"','"+po1.getCarCompany()+"','"+po1.getSex()+"','"+po1.getLicenceTime()+"')";
		}else if(po instanceof ReceiptPO){
			ReceiptPO po1=(ReceiptPO) po;
			sql="insert into Receipt values("+po1.getMoney()+",'"+po1.getDate()+"',"+po1.getNumber()+","+po1.getIsChenk()+",'"+po1.getId()+"','"+po1.getSellingArea()+"')";
		}else if(po instanceof AcceptPO){
			AcceptPO po1=(AcceptPO) po;
			sql="insert into Accept values("+po1.getBarCode()+",'"+po1.getDate()+"',"+po1.getNumber()+","+po1.getStart()+","+po1.getState()+","+po1.getIsCheck()+")";
		}else if(po instanceof DeliverPO){
			DeliverPO po1=(DeliverPO) po;
			sql="insert into Deliver values("+po1.getBarCode()+",'"+po1.getDate()+"',"+po1.getNumber()+","+po1.getIsCheck()+")";
		}
		ResultMessage rm=db.insert(sql);
		return null;
	}

}

