package dataservice.warehousedataservice;

import java.util.ArrayList;

import po.InStoragePO;
import po.OutStoragePO;
import server.database.MySQLDataBase;
import _enum.ResultMessage;

public interface WareHouseDataService {
      public ResultMessage insert(MySQLDataBase db,Object po,String tableName);
      public ArrayList<InStoragePO> findIn(MySQLDataBase db,String date,String tableName);
      public ArrayList<OutStoragePO> findOut(MySQLDataBase db,String date,String tableName);
}
