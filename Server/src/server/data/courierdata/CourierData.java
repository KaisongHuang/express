package server.data.courierdata;

import po.CourierPO;
import po.SenderPO;
import server.database.MySQLDataBase;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import _enum.ResultMessage;
import dataservice.courierdataservice.CourierDataService;

public class CourierData extends UnicastRemoteObject implements CourierDataService{
	MySQLDataBase db;
	public CourierData(MySQLDataBase db) throws RemoteException{
    	super();
    	this.db=db;
    }
	public ResultMessage insert(Object po) throws RemoteException{
		String sql=null;
		if(po instanceof CourierPO){
			CourierPO po1=(CourierPO) po;
			sql="insert into Courier values("+po1.getNumber()+",'"+po1.getName()+"','"+po1.getDate()+"')";
	
		}else{
			SenderPO po1=(SenderPO) po;
			sql="insert into Sender values('"+po1.getSenderName()+"',"+"'"+po1.getSenderAddress()+"',"+"'"+po1.getSenderCompany()+"',"+"'"+po1.getSenderCall()+"',"+"'"+po1.getSenderPhone()+"',"+"'"+po1.getRecipientName()+"',"+"'"+po1.getRecipientAddress()+"',"+"'"+po1.getRecipientCompany()+"',"+"'"+po1.getRecipientCall()+"',"+"'"+po1.getRecipientPhone()+"')";
			
		}
	    ResultMessage rm=db.insert(sql);
		return rm;
	}

}
