package dataservice.sellingareadataservice;

import Server_enum.ResultMessage;
import server.database.MySQLDataBase;
import serverPO.SellingareaPO;

public interface SellingAreaDataService {
       public SellingareaPO find(MySQLDataBase db,int id,String tableName);
       public ResultMessage update(MySQLDataBase db,Object po,String tableName);
       public ResultMessage delete(MySQLDataBase db,Object po,String tableName);
       public ResultMessage insert(MySQLDataBase db,Object po,String tableName);
       
}
