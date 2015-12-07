package server.data.financedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.util.ArrayList;

import po.AccountPO;
import po.PayPO;
import po.ReceiptPO;
import server.database.MySQLDataBase;
import _enum.ResultMessage;
import dataservice.financedataservice.FinanceDataBaseService;

public class FinanceData extends UnicastRemoteObject implements FinanceDataBaseService{
	MySQLDataBase db;
	public FinanceData(MySQLDataBase db) throws RemoteException{
           super();
           this.db=db;
	}
	
	public ResultMessage insert(Object po) throws RemoteException{
		String sql=null;
		if(po instanceof AccountPO){
			AccountPO po1=(AccountPO) po;
			sql="insert into Account values("+po1.getBankAccount()+","+po1.getBalance()+")";
			
		}else if(po instanceof PayPO){
			PayPO po1=(PayPO) po;
			sql="insert into Pay values("+"'"+po1.getDate()+"',"+po1.getPayer()+",'"+po1.getPayAccount()+"','"+po1.getEntry()+"',"+po1.getComments()+","+po1.getCost()+","+po1.getIsCheck()+")";
			
		}
		ResultMessage rm=db.insert(sql);
		return rm;
	}

	public ArrayList<AccountPO> getAccount() throws RemoteException{
		String sql="select * from Account";
		ResultSet rs=db.find(sql);
		return null;
	}

	public ArrayList<ReceiptPO> getReceipt()throws RemoteException{
		String sql="select * from Receipt";
		ResultSet rs=db.find(sql);
		return null;
	}
	public ResultMessage delete( Object po) throws RemoteException{
		String sql="delete from Account where ";
		AccountPO po1=(AccountPO) po;
		sql=sql+"bankAccount="+po1.getBankAccount();
		ResultMessage rm=db.delete(sql);
		
		return rm;
	}

	public ArrayList<AccountPO> getInit() throws RemoteException {
		
		return null;
	}

	public ArrayList<PayPO> getPay() throws RemoteException {
		
		return null;
	}

}
