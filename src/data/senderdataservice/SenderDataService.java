package data.senderdataservice;

import java.rmi.RemoteException;

import po.SenderPO;

public interface SenderDataService {
	
	public SenderPO find(int id) throws RemoteException;

}
