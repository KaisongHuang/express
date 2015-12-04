package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.AccountPO;
import po.ReceiptPO;
import server.database.MySQLDataBase;
import _enum.ResultMessage;

public interface FinanceDataService extends Remote{
       public ResultMessage insert(Object po)throws RemoteException;
       public ArrayList<AccountPO> getAccount()throws RemoteException;
       public ArrayList<ReceiptPO> getReceipt()throws RemoteException;
       public ResultMessage delete(Object po)throws RemoteException;
     
}
