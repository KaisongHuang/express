package server.data.financedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DailyRecord.DailyRecord;
import po.AccountPO;
import po.PayPO;
import po.ReceiptPO;
import server.database.MySQLDataBase;
import _enum.ResultMessage;
import dataservice.financedataservice.FinanceDataBaseService;

public class FinanceData extends UnicastRemoteObject implements FinanceDataBaseService{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	MySQLDataBase db;
	DailyRecord record;
	public FinanceData(MySQLDataBase db) throws RemoteException{
           super();
           this.db=db;
           record=new DailyRecord();
	}

	public ResultMessage InitInsert(AccountPO po) throws RemoteException{
		ResultMessage rm=null;
		String sql="insert into Account values('"+po.getBankAccount()+"',"+po.getBalance()+",0);";
		String sql1="insert into Account values('"+po.getBankAccount()+"',"+po.getBalance()+",1);";
		rm=db.insert(sql);
		rm=db.insert(sql1);
		record.insert("财务期初建账");
	    return rm;
	}

	public ResultMessage insert(Object po) throws RemoteException{
		String sql=null;
		ResultMessage rm=null;
		if(po instanceof AccountPO){
			AccountPO po1=(AccountPO) po;
			sql="insert into Account values('"+po1.getBankAccount()+"',"+po1.getBalance()+",0);";
			rm=db.insert(sql);
			record.insert("财务新建银行账户");
		}else if(po instanceof PayPO){
			PayPO po1=(PayPO) po;
			sql="insert into Pay values('"+po1.getDate()+"','"+po1.getPayer()+"','"+po1.getPayAccount()+"','"+po1.getEntry()+"','"+po1.getComments()+"',"+po1.getCost()+","+po1.getIsCheck()+");";
			String sql1="select * from Account where bankAccount='"+po1.getPayAccount()+"' and isInit=0";
			ResultSet rs=db.find(sql1);
			double balance=0;
			try {
				if(rs.next())
				    balance=rs.getDouble(2)-po1.getCost();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(balance>=0){
				String sql2="update Account set balance="+balance+" where bankAccount='"+po1.getPayAccount()+"';";
				db.update(sql2);
			    rm=db.insert(sql);
			}
			record.insert("财务新建付款单");
		}
		return rm;
	}

	public ArrayList<AccountPO> getAccount() throws RemoteException{
		String sql="select * from Account where isInit=0;";
		ResultSet rs=db.find(sql);
		ArrayList<AccountPO> list=new ArrayList<AccountPO>();
		try {
			while(rs.next()){
				list.add(new AccountPO(rs.getString(1),rs.getDouble(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		record.insert("财务查看银行账户");
		return list;
	}

	public ArrayList<ReceiptPO> getReceipt(String date,String SellingAreaID)throws RemoteException{
		ArrayList<ReceiptPO> list=new ArrayList<ReceiptPO>();
		String sql="select * from Receipt where date='"+date+"' and sellingarea='"+SellingAreaID+"';";
		ResultSet rs=db.find(sql);
		String number1="";
		String number2="";
		int count=0;
		ArrayList<String> l=new ArrayList<String>();
		try {
			while(rs.next()){

				number1=rs.getString(3);
				if(count==0){
					number2=number1;
				}
				count++;
				if(number1.equals(number2)){
				     l.add(rs.getString(5));
				     if(rs.isLast()){
				    	 list.add(new  ReceiptPO(rs.getDouble(1),rs.getString(2),rs.getString(6),rs.getString(3),l,rs.getInt(4)));
				     }
				}else{
					list.add(new  ReceiptPO(rs.getDouble(1),rs.getString(2),rs.getString(6),rs.getString(3),l,rs.getInt(4)));
					l.clear();
					l.add(rs.getString(5));
				}
				number2=rs.getString(3);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		record.insert("财务查看收款单");
		return list;
	}
	public ResultMessage delete( Object po) throws RemoteException{
		String sql="delete from Account where ";
		AccountPO po1=(AccountPO) po;
		sql=sql+"bankAccount='"+po1.getBankAccount()+"' and isInit=0;";
		ResultMessage rm=db.delete(sql);
		record.insert("财务删除账户");
		return rm;
	}

	public ArrayList<AccountPO> getInit() throws RemoteException {
		ArrayList<AccountPO> list=new ArrayList<AccountPO>();
		String sql="select * from Account where isInit=1;";
	    ResultSet rs=db.find(sql);
	    try {
			while(rs.next()){
				list.add(new AccountPO(rs.getString(1),rs.getDouble(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    record.insert("财务查看期初信息");
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
		record.insert("财务查看付款单");
		return list;
	}

	public ArrayList<PayPO> findPay(String begin, String end) throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList<PayPO> list=new ArrayList<PayPO>();
		String sql="select * from Pay";
		ResultSet rs=db.find(sql);
		try {
			while(rs.next()){
				if(Integer.parseInt((begin))<=Integer.parseInt(rs.getString(1))&&Integer.parseInt(end)>=Integer.parseInt(rs.getString(1)))
				     list.add(new PayPO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDouble(6),rs.getInt(7)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		record.insert("财务查看付款单");
		return list;
	}

	public ResultMessage clear() throws RemoteException {
		String sql1="truncate table Account;";
		ResultMessage rm;
		rm=db.delete(sql1);
		record.insert("财务清空账户信息");
		return rm;

	}
	public ArrayList<ReceiptPO> findReceipt(String begin, String end) throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList<ReceiptPO> list=new ArrayList<ReceiptPO>();
		String sql="select * from Receipt;";
		ResultSet rs=db.find(sql);
		String number1="";
		String number2="";
		int count=0;
		ArrayList<String> l=new ArrayList<String>();
		try {
			while(rs.next()){
				 list.add(new  ReceiptPO(rs.getDouble(1),rs.getString(2),rs.getString(6),rs.getString(3),l,rs.getInt(4)));
//				number1=rs.getString(3);
//				if(count==0)
//					number2=number1;
//				count++;
//				if(Integer.parseInt((begin))<=Integer.parseInt(rs.getString(2))&&Integer.parseInt(end)>=Integer.parseInt(rs.getString(2))){
//				     if(number1.equals(number2)){
//				          l.add(rs.getString(5));
//				          if(rs.isLast()){
//						    	 list.add(new  ReceiptPO(rs.getDouble(1),rs.getString(2),rs.getString(6),rs.getString(3),l,rs.getInt(4)));
//						     }
//				     }else{
//					      list.add(new  ReceiptPO(rs.getDouble(1),rs.getString(2),rs.getString(6),rs.getString(3),l,rs.getInt(4)));
//					      list.clear();
//					      l.add(rs.getString(5));
//				     }
//				}
//				number2=rs.getString(3);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		record.insert("财务查看受款单");
		System.out.println(list.size());
		return list;
	}

	public ResultMessage update(AccountPO po) throws RemoteException {
		// TODO Auto-generated method stub
		ResultMessage rm=null;
		String sql = "update Account set balance = '" + po.getBalance() + "' where bankAccount = '" + po.getBankAccount() + "';";
		rm = db.update(sql);
		record.insert("财务更新银行账户信息");
		return rm;
	}

}
