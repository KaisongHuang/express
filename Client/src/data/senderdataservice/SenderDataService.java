package data.senderdataservice;

import java.rmi.RemoteException;

<<<<<<< HEAD
import serverPO.HistoryPO;
import serverPO.SenderPO;
=======
import _enum.ResultMessage;
import po.HistoryPO;
import po.SenderPO;
>>>>>>> refs/remotes/origin/master

public interface SenderDataService {
	
	public HistoryPO find(int id) throws RemoteException;
	public ResultMessage insert(SenderPO po) throws RemoteException;

}
