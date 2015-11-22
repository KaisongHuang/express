package data.financedata;

import java.rmi.RemoteException;
import java.util.ArrayList;

import Client.network.client.TransformObject;
import _enum.ResultMessage;
import data.financedataservice.FinanceDataService;
import po.AccountPO;
import po.FinancePO;
import po.PayPO;
import po.ReceiptPO;


public class FinanceData implements FinanceDataService {
	 TransformObject send;
	 TransformObject acp;
	public FinancePO find(int id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage insert(FinancePO po) throws RemoteException {
		
		return null;
	}

	public ResultMessage delete(FinancePO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage update(FinancePO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ArrayList<AccountPO> find() throws RemoteException{		
		return null;
	}
	public ArrayList<PayPO> findPay(){
		return null;
	}
	
	public ArrayList<ReceiptPO> findReceipt(){
		return null;
	}
}
