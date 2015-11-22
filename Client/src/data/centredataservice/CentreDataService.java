package data.centredataservice;

import java.rmi.RemoteException;

import _enum.ResultMessage;
import po.CentrePO;


public interface CentreDataService {
	
	
	public ResultMessage insert(CentrePO po) throws RemoteException;
	public ResultMessage delete(CentrePO po) throws RemoteException;
	public ResultMessage update(CentrePO po) throws RemoteException;

}
