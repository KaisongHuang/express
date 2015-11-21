package data.senderdata;

import java.rmi.RemoteException;

<<<<<<< HEAD
import serverPO.HistoryPO;
=======
import _enum.ResultMessage;
import po.HistoryPO;
import po.SenderPO;
>>>>>>> refs/remotes/origin/master
import data.senderdataservice.SenderDataService;

public class SenderData implements SenderDataService{

	public HistoryPO find(int id) throws RemoteException {
		
		return null;
	}

	public ResultMessage insert(SenderPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
