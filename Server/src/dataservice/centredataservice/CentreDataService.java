package dataservice.centredataservice;

import server.database.MySQLDataBase;
import _enum.ResultMessage;

public interface CentreDataService {
       public ResultMessage insert(MySQLDataBase db,Object po,String tableName);
}
