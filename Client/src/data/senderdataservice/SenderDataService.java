package data.senderdataservice;

import java.rmi.RemoteException;


import _enum.ResultMessage;
import po.HistoryPO;
import po.SenderPO;


public interface SenderDataService {
	
	public HistoryPO find(int id) throws RemoteException;
	public ResultMessage insert(SenderPO po) throws RemoteException;

}
