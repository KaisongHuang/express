package dataservice.managerdataservice;

import po.EmployeePO;
import po.InstitutionPO;
import po.ManagerPO;
import server.database.MySQLDataBase;

import java.rmi.Remote;
import java.rmi.RemoteException;

import _enum.ResultMessage;

public interface ManagerDataBaseService extends Remote{
	 public ResultMessage insert(Object po) throws RemoteException;
	 public EmployeePO findEmployee(String id) throws RemoteException;
	 public InstitutionPO findInstitution(String id) throws RemoteException;
	 public Object find() throws RemoteException;
	 public ResultMessage update(Object po) throws RemoteException;
	 public ResultMessage delete(Object po) throws RemoteException;
	 public ResultMessage update(ManagerPO po)throws RemoteException;
}
