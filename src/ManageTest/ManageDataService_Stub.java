package ManageTest;

import java.rmi.RemoteException;

import _enum.ResultMessage;
import data.managerdataservice.ManageDataService;
import po.ManagerPO;

public class ManageDataService_Stub implements ManageDataService {
	
	public ManagerPO find(int id) throws RemoteException {
		
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

}
