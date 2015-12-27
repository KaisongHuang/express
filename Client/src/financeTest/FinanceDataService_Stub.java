package financeTest;

import java.rmi.RemoteException;
import java.util.ArrayList;


import po.AccountPO;
import po.FinancePO;
import po.PayPO;
import po.ReceiptPO;
import _enum.ResultMessage;
import data.financedataservice.FinanceDataService;

public class FinanceDataService_Stub implements FinanceDataService{

	public FinancePO find(String id) throws RemoteException {
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


	public ArrayList<AccountPO> findAccount() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("find Succeed");
		return null;
	}

	public ArrayList<AccountPO> findInitInfo() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("find Succeed");
		return null;
	}

	public ResultMessage clear() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<ReceiptPO> findReceipt(String date, String SellingAreaID) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<PayPO> findPay(String begin, String end) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<ReceiptPO> checkReceipt(String date, String SellingAreaID) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage InitInsert(AccountPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage update(AccountPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
