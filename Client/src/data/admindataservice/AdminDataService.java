package data.admindataservice;

import java.rmi.RemoteException;

import po.AdminPO;
import _enum.ResultMessage;


public interface AdminDataService {
	
	public AdminPO find(String id) throws RemoteException;
	public ResultMessage insert(AdminPO po) throws RemoteException;
	public ResultMessage delete(AdminPO po) throws RemoteException;
	public ResultMessage update(AdminPO po) throws RemoteException;

}
