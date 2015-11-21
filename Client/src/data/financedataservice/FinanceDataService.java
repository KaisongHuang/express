package data.financedataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

<<<<<<< HEAD
import serverPO.FinancePO;
=======
import po.AccountPO;
import po.FinancePO;
>>>>>>> refs/remotes/origin/master
import _enum.ResultMessage;

public interface FinanceDataService {
	public FinancePO find(int id) throws RemoteException;
	public ResultMessage insert(FinancePO po) throws RemoteException;
	public ResultMessage delete(FinancePO po) throws RemoteException;
	public ResultMessage update(FinancePO po) throws RemoteException;
	public ArrayList<AccountPO> find() throws RemoteException;
}
