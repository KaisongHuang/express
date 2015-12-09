package data.financedataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.AccountPO;
import po.FinancePO;
import po.PayPO;
import po.ReceiptPO;
import _enum.ResultMessage;

public interface FinanceDataService {


	public ResultMessage insert(FinancePO po) throws RemoteException;

	public ResultMessage delete(FinancePO po) throws RemoteException;

	public ResultMessage update(FinancePO po) throws RemoteException;

	public ArrayList<AccountPO> findAccount() throws RemoteException;
	
	public ArrayList<AccountPO> findInitInfo() throws RemoteException;

	public ResultMessage clear() throws RemoteException;
	
	public ArrayList<PayPO> findPay() throws RemoteException;

	public ArrayList<ReceiptPO> findReceipt(String date ,String SellingAreaID) throws RemoteException;
}
