package data.financedataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;




import po.AccountPO;
import po.FinancePO;
import _enum.ResultMessage;

public interface FinanceDataService {
	public FinancePO find(String id) throws RemoteException;
	public ResultMessage insert(FinancePO po) throws RemoteException;
	public ResultMessage delete(FinancePO po) throws RemoteException;
	public ResultMessage update(FinancePO po) throws RemoteException;
	public ArrayList<AccountPO> find() throws RemoteException;
}
