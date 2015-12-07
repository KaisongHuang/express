package data.managerdataservice;

import java.rmi.RemoteException;

import _enum.ResultMessage;
import po.EmployeePO;
import po.InstitutionPO;
import po.ManagerPO;

public interface ManagerDataService {
	
	public EmployeePO findEmployee(String id) throws RemoteException;
	public InstitutionPO findInStitution(String id) throws RemoteException;
	public ResultMessage insert(ManagerPO po) throws RemoteException;
	public ResultMessage delete(ManagerPO po) throws RemoteException;
	public ResultMessage update(ManagerPO po) throws RemoteException;
    public ResultMessage update(Object ob)throws RemoteException;
}
