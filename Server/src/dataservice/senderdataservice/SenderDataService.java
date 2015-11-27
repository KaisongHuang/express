package dataservice.senderdataservice;

import po.HistoryPO;
import server.database.MySQLDataBase;



public interface SenderDataService {
      public HistoryPO find(MySQLDataBase db,String id,String tableName);
    	  
      
}
