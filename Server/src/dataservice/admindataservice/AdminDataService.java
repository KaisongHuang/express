package dataservice.admindataservice;

import _enum.ResultMessage;
import po.AdminPO;
import server.database.MySQLDataBase;

public interface AdminDataService {
     public AdminPO find(MySQLDataBase db,String id,String tableName);
     public ResultMessage update(MySQLDataBase db,Object po,String tableName);
     public ResultMessage insert(MySQLDataBase db,Object po,String tableName);
     public ResultMessage delete(MySQLDataBase db,String id,String tableName);
}
