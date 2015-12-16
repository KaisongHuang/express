package server.data.financedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		ArrayList<AccountPO> list=new ArrayList<AccountPO>();
		try {
			while(rs.next()){
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<ReceiptPO> getReceipt(String date,String SellingAreaID)throws RemoteException{
		ArrayList<ReceiptPO> list=new ArrayList<ReceiptPO>();
		
		String sql="select * from Receipt where date='"+date+"' and sellingarea='"+SellingAreaID+"';";
		ResultSet rs=db.find(sql);
		String number1=null;
		String number2=null;
		try {
			while(rs.next()){
				ArrayList<String> l=new ArrayList<String>();
				number1=rs.getString(3);
				if(number1.equals(number2)){
				
				}else{
					list.add(new  ReceiptPO(rs.getDouble(1),rs.getString(2),rs.getString(6),rs.getString(3),l,rs.getInt(4)));
				}
				number2=rs.getString(3);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public ResultMessage delete( Object po) throws RemoteException{
		String sql="delete from Account where ";
		AccountPO po1=(AccountPO) po;
		sql=sql+"bankAccount="+po1.getBankAccount();
		ResultMessage rm=db.delete(sql);
		
		return rm;
	}

	public ArrayList<AccountPO> getInit() throws RemoteException {
		ArrayList<AccountPO> list=new ArrayList<AccountPO>();
		String sql="select * from Account where isInit=0;";
	    ResultSet rs=db.find(sql);
	    try {
			while(rs.next()){
				list.add(new AccountPO(rs.getString(1),rs.getDouble(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<PayPO> getPay() throws RemoteException {
		ArrayList<PayPO> list=new ArrayList<PayPO>();
		String sql="select * from Pay";
		ResultSet rs=db.find(sql);
		try {
			while(rs.next()){
				list.add(new PayPO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDouble(6),rs.getInt(7)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<PayPO> findPay(String begin, String end) throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList<PayPO> list=new ArrayList<PayPO>();
		String sql="select * from Pay";
		ResultSet rs=db.find(sql);
		try {
			while(rs.next()){
				/**
				 * 加判断
				 */
				list.add(new PayPO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDouble(6),rs.getInt(7)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<ReceiptPO> findReceipt(String begin, String end) throws RemoteException {
		// TODO Auto-generated method stub
//		ArrayList<ReceiptPO> list=new ArrayList<ReceiptPO>();
//		String sql="select * from Receipt";
//		ResultSet rs=db.find(sql);
//		try {
//			while(rs.next()){
//				list.add(new ReceiptPO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDouble(6),rs.getInt(7)));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return null;
	}

}
