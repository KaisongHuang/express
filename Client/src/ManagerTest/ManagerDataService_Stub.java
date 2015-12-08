package ManagerTest;

import java.rmi.RemoteException;

import _enum.ResultMessage;
import data.managerdataservice.ManagerDataService;
import po.EmployeePO;
import po.InstitutionPO;
import po.ManagerPO;

public class ManagerDataService_Stub implements ManagerDataService {
	
	public ManagerPO find(String id) throws RemoteException {
		
		System.out.println("Find!");
		
		return new ManagerPO();
		
	}
	
	public ResultMessage insert(ManagerPO po) throws RemoteException {
		
		return ResultMessage.Error;
		
	}
	
	public ResultMessage delete(ManagerPO po) throws RemoteException {
		
		return ResultMessage.Error;
		
	}
	
	public ResultMessage update(ManagerPO po) throws RemoteException {
		
		return ResultMessage.Error;
		
	}

	public ResultMessage update(Object ob) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public EmployeePO findEmployee(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public InstitutionPO findInStitution(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
