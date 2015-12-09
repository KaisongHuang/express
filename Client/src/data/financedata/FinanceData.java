package data.financedata;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import _enum.ResultMessage;
import data.financedataservice.FinanceDataService;
import dataservice.financedataservice.FinanceDataBaseService;
import po.AccountPO;
import po.FinancePO;
import po.PayPO;
import po.ReceiptPO;

public class FinanceData implements FinanceDataService {
	FinanceDataBaseService fd;
	ResultMessage rm;
	
	public FinanceData(){
		try {
			fd=(FinanceDataBaseService) Naming.lookup("rmi://127.0.0.1:8000/LoginDataService");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public FinancePO find(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage insert(FinancePO po) throws RemoteException {
		rm=fd.insert(po);
		return rm;
	}

	public ResultMessage delete(FinancePO po) throws RemoteException {
		rm=fd.delete(po);
		return rm;
	}

	public ResultMessage update(FinancePO po) throws RemoteException {
		return null;
	}

	public ArrayList<AccountPO> findAccount() throws RemoteException {
		return fd.getAccount();
	}

	public ArrayList<PayPO> findPay() throws RemoteException{
		return fd.getPay();
	}

	public ArrayList<ReceiptPO> findReceipt(String date,String SellingAreaID) throws RemoteException{
		return fd.getReceipt(date,SellingAreaID);
	}

	public ArrayList<AccountPO> findInitInfo() throws RemoteException {
		return fd.getInit();
	}

	public ResultMessage clear() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
}
