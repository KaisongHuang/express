package server.data.financedata;

import java.sql.ResultSet;
import java.util.ArrayList;

import po.AccountPO;
import po.PayPO;
import po.ReceiptPO;
import server.database.MySQLDataBase;
import _enum.ResultMessage;
import dataservice.financedataservice.FinanceDataService;

public class FinanceData implements FinanceDataService{

	public ResultMessage insert(MySQLDataBase db, Object po, String tableName) {
		String sql="insert into "+tableName+" values(";
		if(tableName.equals("Account")){
			AccountPO po1=(AccountPO) po;
			sql=sql+po1.getBankAccount()+","+po1.getBalance()+")";
			
		}else if(tableName.equals("Pay")){
			PayPO po1=(PayPO) po;
			sql=sql+"'"+po1.getDate()+"',"+po1.getPayer()+",'"+po1.getPayAccount()+"','"+po1.getEntry()+"',"+po1.getComments()+","+po1.getCost()+","+po1.getIsCheck()+")";
			
		}
		ResultMessage rm=db.insert(sql);
		return rm;
	}

	public ArrayList<AccountPO> getAccount(MySQLDataBase db, String tableName) {
		String sql="select * from "+tableName;
		ResultSet rs=db.find(sql);
		return null;
	}

	public ArrayList<ReceiptPO> getReceipt(MySQLDataBase db, String tableName){
		String sql="select * from "+tableName;
		ResultSet rs=db.find(sql);
		return null;
	}
	public ResultMessage delete(MySQLDataBase db, Object po, String tableName) {
		String sql="delete from "+tableName+" where ";
		AccountPO po1=(AccountPO) po;
		sql=sql+"bankAccount="+po1.getBankAccount();
		ResultMessage rm=db.delete(sql);
		
		return rm;
	}

}
