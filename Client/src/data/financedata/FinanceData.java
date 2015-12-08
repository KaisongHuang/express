package data.financedata;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Client.network.client.ClientAdapter;
import Client.network.client.TransformObject;
import _enum.Opera;
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

	@SuppressWarnings("unchecked")
	public ArrayList<AccountPO> findAccount() throws RemoteException {
		return fd.getAccount();
	}

	@SuppressWarnings("unchecked")
	public ArrayList<PayPO> findPay() throws RemoteException{
		return fd.getPay();
	}

	@SuppressWarnings("unchecked")
	public ArrayList<ReceiptPO> findReceipt() throws RemoteException{
		return fd.getReceipt();
	}

	@SuppressWarnings("unchecked")
	public ArrayList<AccountPO> findInitInfo() throws RemoteException {
		return fd.getInit();
	}

	public ResultMessage clear() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
}
