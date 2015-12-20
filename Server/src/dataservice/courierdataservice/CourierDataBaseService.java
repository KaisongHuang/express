package dataservice.courierdataservice;

import server.database.MySQLDataBase;

import java.rmi.Remote;
import java.rmi.RemoteException;

import _enum.ResultMessage;

public interface CourierDataBaseService extends Remote{
       public ResultMessage insert( Object po)throws RemoteException;
       public double[] getDistanceAndFee(String city1, String city2) throws RemoteException;
       public double getTime(String start,String end) throws RemoteException;
}
