package data.admindataservice;

import java.rmi.RemoteException;

import _enum.ResultMessage;
import po.AdminPO;

public interface AdminDataService {
	
	public AdminPO find(int id) throws RemoteException;
	public ResultMessage insert(AdminPO po) throws RemoteException;
	public ResultMessage delete(AdminPO po) throws RemoteException;
	public ResultMessage update(AdminPO po) throws RemoteException;

}
