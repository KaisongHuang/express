package data.senderdataservice;

import java.rmi.RemoteException;


import po.HistoryPO;


public interface SenderDataService {
	
	public HistoryPO find(String id) throws RemoteException;


}
