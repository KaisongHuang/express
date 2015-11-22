package dataservice.sellingareadataservice;

import _enum.ResultMessage;
import po.SellingareaPO;
import server.database.MySQLDataBase;


public interface SellingAreaDataService {
       public SellingareaPO find(MySQLDataBase db,int id,String tableName);
       public ResultMessage update(MySQLDataBase db,Object po,String tableName);
       public ResultMessage delete(MySQLDataBase db,Object po,String tableName);
       public ResultMessage insert(MySQLDataBase db,Object po,String tableName);
       
}
