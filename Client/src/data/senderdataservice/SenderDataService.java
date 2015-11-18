package data.senderdataservice;

import java.rmi.RemoteException;

import po.HistoryPO;
import po.SenderPO;

public interface SenderDataService {
	
	public HistoryPO find(int id) throws RemoteException;

}
