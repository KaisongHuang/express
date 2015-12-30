package test.senderTest;

import java.rmi.RemoteException;

import _enum.ResultMessage;
import data.senderdataservice.SenderDataService;
import po.HistoryPO;
import po.SenderPO;

public class SenderDataService_Stub implements SenderDataService {

	public HistoryPO find(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return new HistoryPO(null, null, null, null);
	}

	public ResultMessage insert(SenderPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
