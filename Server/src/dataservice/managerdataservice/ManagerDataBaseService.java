package dataservice.managerdataservice;

import po.AcceptPO;
import po.CarPackPO;
import po.CentreArrivalPO;
import po.CentrePackPO;
import po.CentreTransforPO;
import po.DeliverPO;
import po.DistanceAndFee;
import po.EmployeePO;
import po.InStoragePO;
import po.InstitutionPO;
import po.ManagerPO;
import po.OutStoragePO;
import po.PayPO;
import po.ReceiptPO;
import po.SalaryPO;
import server.database.MySQLDataBase;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import _enum.ResultMessage;

public interface ManagerDataBaseService extends Remote{
	 public ResultMessage insert(Object po) throws RemoteException;
	 public EmployeePO findEmployee(String id) throws RemoteException;
	 public InstitutionPO findInstitution(String id) throws RemoteException;
	 public Object find() throws RemoteException;
	 public ResultMessage update(Object po) throws RemoteException;
	 public ResultMessage delete(Object po) throws RemoteException;
	 public ResultMessage update(ManagerPO po)throws RemoteException;
	 public ArrayList<CarPackPO> getCarPack() throws RemoteException;
	 public ArrayList<ReceiptPO> getReceipt() throws RemoteException;
	 public ArrayList<AcceptPO> getAccept() throws RemoteException;
	 public ArrayList<DeliverPO> getDeliver() throws RemoteException;
	 public ArrayList<CentreArrivalPO> getCentreArrival() throws RemoteException;
	 public ArrayList<CentrePackPO> getCentrePack() throws RemoteException;
	 public ArrayList<CentreTransforPO> getCentreTransfor() throws RemoteException;
	 public ArrayList<InStoragePO> getInStorage() throws RemoteException;
	 public ArrayList<OutStoragePO> getOutStorage() throws RemoteException;
	 public ArrayList<PayPO> getPay() throws RemoteException;
	 public ArrayList<SalaryPO> getSalary() throws RemoteException;
	 public ArrayList<DistanceAndFee> getDistanceAndFee() throws RemoteException;
	
}
