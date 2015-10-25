package CentreTest;

import java.rmi.RemoteException;

import _enum.ResultMessage;
import data.centredataservice.CentreDataService;
import po.CentrePO;

public class CentreDataService_Stub implements CentreDataService {
	
	public CentrePO find(int id) throws RemoteException {
		
		System.out.println("Find!");
		
		return new CentrePO();
		
	}
	
	public ResultMessage insert(CentrePO po) throws RemoteException {
		
		return ResultMessage.Error;
		
	}
	
	public ResultMessage delete(CentrePO po) throws RemoteException {
		
		return ResultMessage.Error;
		
	}
	
	public ResultMessage update(CentrePO po) throws RemoteException {
		
		return ResultMessage.Error;
		
	}
	
	

}
