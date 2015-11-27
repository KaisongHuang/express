package data.financedata;

import java.rmi.RemoteException;
import java.util.ArrayList;

import Client.network.client.ClientAdapter;
import Client.network.client.TransformObject;
import _enum.Opera;
import _enum.ResultMessage;
import data.financedataservice.FinanceDataService;
import po.AccountPO;
import po.FinancePO;
import po.PayPO;
import po.ReceiptPO;


public class FinanceData implements FinanceDataService {
	 TransformObject send;
	 TransformObject acp;
	public FinancePO find(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage insert(FinancePO po) throws RemoteException {
		if(po instanceof AccountPO){
			send=new TransformObject(Opera.Account_insert,po);
			ClientAdapter.write(send);
		}else{
			send=new TransformObject(Opera.Pay_insert,po);
			ClientAdapter.write(send);
		}
		acp=(TransformObject) ClientAdapter.readData();
		return (ResultMessage) acp.getOb();
	}

	public ResultMessage delete(FinancePO po) throws RemoteException {
		send=new TransformObject(Opera.Account_delete,po);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return (ResultMessage) acp.getOb();
	}

	public ResultMessage update(FinancePO po) throws RemoteException {
		send=new TransformObject(Opera.Account_update,po);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return (ResultMessage) acp.getOb();
	}
	
	public ArrayList<AccountPO> find() throws RemoteException{		
		send=new TransformObject(Opera.Account_find,null);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return (ArrayList<AccountPO>) acp.getOb();
	}
	public ArrayList<PayPO> findPay(){
		send=new TransformObject (Opera.Pay_find,null);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		
		return (ArrayList<PayPO>) acp.getOb();
	}
	
	public ArrayList<ReceiptPO> findReceipt(){
		send=new TransformObject(Opera.Receipt_find,null);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		
		return (ArrayList<ReceiptPO>) acp.getOb();
	}
}
