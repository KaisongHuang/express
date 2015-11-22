package dataservice.courierdataservice;

import server.database.MySQLDataBase;
import _enum.ResultMessage;

public interface CourierDataService {
       public ResultMessage insert(MySQLDataBase db, Object po,String tableName);
}
