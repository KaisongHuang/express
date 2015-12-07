package dataservice.warehousedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.InStoragePO;
import po.OutStoragePO;
import server.database.MySQLDataBase;
import _enum.ResultMessage;

public interface WareHouseDataBaseService extends Remote{
      public ResultMessage insert(Object po)throws RemoteException;
      public ArrayList<InStoragePO> findIn(String date)throws RemoteException;
      public ArrayList<OutStoragePO> findOut(String date)throws RemoteException;
}
