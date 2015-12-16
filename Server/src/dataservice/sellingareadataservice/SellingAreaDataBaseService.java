package dataservice.sellingareadataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import _enum.ResultMessage;
import po.SellingareaPO;
import server.database.MySQLDataBase;


public interface SellingAreaDataBaseService extends Remote{
       public SellingareaPO findCar(String id)throws RemoteException;
       public SellingareaPO findDriver(String id)throws RemoteException;
       public ResultMessage update(Object po)throws RemoteException;
       public ResultMessage delete(Object po)throws RemoteException;
       public ResultMessage insert(Object po)throws RemoteException;
       public double getDistance(String city1,String city2) throws RemoteException;
       
}
