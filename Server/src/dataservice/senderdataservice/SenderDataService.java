package dataservice.senderdataservice;

import server.database.MySQLDataBase;
import serverPO.HistoryPO;


public interface SenderDataService {
      public HistoryPO find(MySQLDataBase db,int id,String tableName);
    	  
      
}
