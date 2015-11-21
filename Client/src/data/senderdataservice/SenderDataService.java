package data.senderdataservice;

import java.rmi.RemoteException;

import serverPO.HistoryPO;
import serverPO.SenderPO;

public interface SenderDataService {
	
	public HistoryPO find(int id) throws RemoteException;

}
