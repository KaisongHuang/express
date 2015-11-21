package senderTest;

import java.rmi.RemoteException;

import data.senderdataservice.SenderDataService;
import serverPO.HistoryPO;
import serverPO.SenderPO;
import vo.HistoryVO;

public class SenderDataService_Stub implements SenderDataService {

	public HistoryPO find(int id) throws RemoteException {
		// TODO Auto-generated method stub
		return new HistoryPO(null, null);
	}

}
