package server.data.senderdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;

import po.HistoryPO;
import dataservice.senderdataservice.SenderDataBaseService;
import server.database.MySQLDataBase;




public class SenderData extends UnicastRemoteObject implements SenderDataBaseService{
	MySQLDataBase db;
	public SenderData(MySQLDataBase db) throws RemoteException{
		super();
		this.db=db;
	}
	public HistoryPO find(String id) throws RemoteException{
        String sql="select * from HistoryPO where id="+id;
        ResultSet rs=db.find(sql);
        
		return null;
	}



}
