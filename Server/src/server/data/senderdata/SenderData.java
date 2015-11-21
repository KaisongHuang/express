package server.data.senderdata;

import java.rmi.RemoteException;




import java.sql.ResultSet;

import dataservice.senderdataservice.SenderDataService;
import server.database.MySQLDataBase;
import serverPO.HistoryPO;



public class SenderData implements SenderDataService{

	public HistoryPO find(MySQLDataBase db,int id,String tableName) {
        String sql="select * from "+tableName+" where id="+id;
        ResultSet rs=db.find(sql);
        
		return null;
	}



}
