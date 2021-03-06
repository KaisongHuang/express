package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.AccountPO;
import po.PayPO;
import po.ReceiptPO;
import server.database.MySQLDataBase;
import _enum.ResultMessage;

public interface FinanceDataBaseService extends Remote{
       public ResultMessage insert(Object po)throws RemoteException;
       public ResultMessage InitInsert(AccountPO po) throws RemoteException;
       public ArrayList<AccountPO> getAccount()throws RemoteException;
       public ArrayList<ReceiptPO> getReceipt(String date,String SellingArea)throws RemoteException;
       public ResultMessage delete(Object po)throws RemoteException;
       public ArrayList<AccountPO> getInit()throws RemoteException;
       public ArrayList<PayPO> findPay(String begin,String end)throws RemoteException;
       public ArrayList<ReceiptPO> findReceipt(String begin,String end)throws RemoteException;
       public ResultMessage clear() throws RemoteException;
       public ResultMessage update(AccountPO po) throws RemoteException;
       
}
