package data.financedataservice;

import java.rmi.RemoteException;

import serverPO.FinancePO;
import _enum.ResultMessage;

public interface FinanceDataService {
	public FinancePO find(int id) throws RemoteException;
	public ResultMessage insert(FinancePO po) throws RemoteException;
	public ResultMessage delete(FinancePO po) throws RemoteException;
	public ResultMessage update(FinancePO po) throws RemoteException;
}
