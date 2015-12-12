package server.data.courierdata;

import po.CourierPO;
import po.SenderPO;
import server.database.MySQLDataBase;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;

import History.History;
import _enum.ResultMessage;
import dataservice.courierdataservice.CourierDataBaseService;

public class CourierData extends UnicastRemoteObject implements CourierDataBaseService{
	MySQLDataBase db;
	
	public CourierData(MySQLDataBase db) throws RemoteException{
    	super();
    	this.db=db;
    
    }
	public ResultMessage insert(Object po) throws RemoteException{
		String sql=null;
		ResultMessage rm=null;
		if(po instanceof CourierPO){
			
			CourierPO po1=(CourierPO) po;
			ResultSet rs=db.find("select * from Sender where BarCode='"+po1.getNumber()+"';");
			try {
				if(!rs.wasNull()){
				sql="insert into Courier values("+po1.getNumber()+",'"+po1.getName()+"','"+po1.getDate()+"')";
				rm=db.insert(sql);
				}
				else
					return rm=ResultMessage.Fail;
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return rm;
		}else{
			SenderPO po1=(SenderPO) po;
			sql="insert into Sender values('"+po1.getSenderName()+"',"+"'"+po1.getSenderAddress()+"',"+"'"+po1.getSenderCompany()+"',"+"'"+po1.getSenderCall()+"',"+"'"+po1.getSenderPhone()+"',"+"'"+po1.getRecipientName()+"',"+"'"+po1.getRecipientAddress()+"',"+"'"+po1.getRecipientCompany()+"',"+"'"+po1.getRecipientCall()+"',"+"'"+po1.getRecipientPhone()+"')";
			rm=db.insert(sql);
			return rm;
		}
	    

	}

}
