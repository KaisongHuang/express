package data.managerdataservice;

import java.rmi.RemoteException;

import _enum.ResultMessage;
import po.ManagerPO;

public interface ManagerDataService {
	
	public ManagerPO find(String id) throws RemoteException;
	public ResultMessage insert(ManagerPO po) throws RemoteException;
	public ResultMessage delete(ManagerPO po) throws RemoteException;
	public ResultMessage update(ManagerPO po) throws RemoteException;
    public ResultMessage update(Object ob)throws RemoteException;
}
