package senderTest;

import java.rmi.RemoteException;

import data.senderdataservice.SenderDataService;
import po.SenderPO;

public class SenderDataService_Stub implements SenderDataService {

	public SenderPO find(int id) throws RemoteException {
		// TODO Auto-generated method stub
		return new SenderPO(null, null, null, null, null, null, null, null, null, null, id, id, id, id, null, null, id, id, null);
	}

}
