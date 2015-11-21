package server.data.senderdata;

import java.rmi.RemoteException;




import java.sql.ResultSet;

import po.HistoryPO;
import dataservice.senderdataservice.SenderDataService;
import server.database.MySQLDataBase;




public class SenderData implements SenderDataService{

	public HistoryPO find(MySQLDataBase db,int id,String tableName) {
        String sql="select * from "+tableName+" where id="+id;
        ResultSet rs=db.find(sql);
        
		return null;
	}



}
