package data.managerdataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import _enum.ResultMessage;
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

public interface ManagerDataService {
	public ArrayList<DistanceAndFee> getCity()throws RemoteException;
	public EmployeePO findEmployee(String id) throws RemoteException;

	public InstitutionPO findInStitution(String id) throws RemoteException;

	public ResultMessage insert(ManagerPO po) throws RemoteException;

	public ResultMessage delete(ManagerPO po) throws RemoteException;

	public ResultMessage update(ManagerPO po) throws RemoteException;

	public ResultMessage update(Object ob) throws RemoteException;
	
	public ArrayList<SalaryPO> getSalary()throws RemoteException;
	/**
	 * 新增以下接口
	 * 
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<CarPackPO> findPack() throws RemoteException;

	public ArrayList<ReceiptPO> findReceipt() throws RemoteException;

	public ArrayList<AcceptPO> findAccept() throws RemoteException;

	public ArrayList<DeliverPO> findDeliver() throws RemoteException;

	public ArrayList<CentreArrivalPO> findArrival() throws RemoteException;

	public ArrayList<CentreTransforPO> findTrans() throws RemoteException;

	public ArrayList<CentrePackPO> findCentrePack() throws RemoteException;

	public ArrayList<InStoragePO> findImport() throws RemoteException;

	public ArrayList<OutStoragePO> findExport() throws RemoteException;

	public ArrayList<PayPO> findPay() throws RemoteException;
	
	public ArrayList<String> Dialy()throws RemoteException;
}
