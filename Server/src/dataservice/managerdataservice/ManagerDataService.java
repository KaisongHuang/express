package dataservice.managerdataservice;

import po.ManagerPO;
import server.database.MySQLDataBase;

import java.rmi.Remote;
import java.rmi.RemoteException;

import _enum.ResultMessage;

public interface ManagerDataService extends Remote{
	 public ResultMessage insert(Object po) throws RemoteException;
	 public ManagerPO findEmployee(String id) throws RemoteException;
	 public ManagerPO findInstitution(String id) throws RemoteException;
	 public Object find() throws RemoteException;
	 public ResultMessage update(Object po) throws RemoteException;
	 public ResultMessage delete(Object po) throws RemoteException;
}
