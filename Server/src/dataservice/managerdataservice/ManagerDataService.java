package dataservice.managerdataservice;

import po.ManagerPO;
import server.database.MySQLDataBase;
import _enum.ResultMessage;

public interface ManagerDataService {
	 public ResultMessage insert(MySQLDataBase db,Object po,String tableName);
	 public ManagerPO find(MySQLDataBase db,String id,String tableName);
	 public Object find(MySQLDataBase db,String tableName);
	 public ResultMessage update(MySQLDataBase db,Object po,String tableName);
	 public ResultMessage delete(MySQLDataBase db,Object po,String tableName);
}
