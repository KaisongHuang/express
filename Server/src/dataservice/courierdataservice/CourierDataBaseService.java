package dataservice.courierdataservice;

import server.database.MySQLDataBase;

import java.rmi.Remote;
import java.rmi.RemoteException;

import _enum.ResultMessage;

public interface CourierDataBaseService extends Remote{
       public ResultMessage insert( Object po)throws RemoteException;
}
