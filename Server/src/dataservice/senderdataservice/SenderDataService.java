package dataservice.senderdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.HistoryPO;
import server.database.MySQLDataBase;



public interface SenderDataService extends Remote{
      public HistoryPO find(String id)throws RemoteException;
    	  
      
}
