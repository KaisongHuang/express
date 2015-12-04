package dataservice.admindataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import _enum.ResultMessage;
import po.AdminPO;
import server.database.MySQLDataBase;

public interface AdminDataService extends Remote{
     public AdminPO find(String id)throws RemoteException;
     public ResultMessage update(Object po)throws RemoteException;
     public ResultMessage insert(Object po)throws RemoteException;
     public ResultMessage delete(String id)throws RemoteException;
}
