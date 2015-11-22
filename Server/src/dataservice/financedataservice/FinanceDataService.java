package dataservice.financedataservice;

import java.util.ArrayList;

import po.AccountPO;
import server.database.MySQLDataBase;
import _enum.ResultMessage;

public interface FinanceDataService {
       public ResultMessage insert(MySQLDataBase db,Object po,String tableName);
       public ArrayList<AccountPO> getAccount(MySQLDataBase db,String tableName);
       public ResultMessage delete(MySQLDataBase db,Object po,String tableName);
     
}
