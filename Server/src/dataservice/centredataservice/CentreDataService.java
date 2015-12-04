package dataservice.centredataservice;

import server.database.MySQLDataBase;

import java.rmi.Remote;
import java.rmi.RemoteException;

import _enum.ResultMessage;

public interface CentreDataService extends Remote{
       public ResultMessage insert(Object po)throws RemoteException;
}
