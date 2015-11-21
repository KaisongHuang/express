package financeTest;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.AccountPO;
import po.FinancePO;
import _enum.ResultMessage;
import data.financedataservice.FinanceDataService;

public class FinanceDataService_Stub implements FinanceDataService{

	public FinancePO find(int id) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("find Succeed");
		return new FinancePO();
	}

	public ResultMessage insert(FinancePO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("insert succeed");
		return ResultMessage.Success;
	}

	public ResultMessage delete(FinancePO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("delete succeed");
		return ResultMessage.Success;
	}

	public ResultMessage update(FinancePO po) throws RemoteException {
		System.out.println("update succeed");
		return ResultMessage.Success;
	}

	public ArrayList<AccountPO> find() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("find Succeed");
		return null;
	}

}
