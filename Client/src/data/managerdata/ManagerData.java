package data.managerdata;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import RMI.RMIHelper;
import _enum.ResultMessage;
import data.managerdataservice.ManagerDataService;
import dataservice.managerdataservice.ManagerDataBaseService;
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
import po.WarehousePO;

public class ManagerData implements ManagerDataService {
	ManagerDataBaseService md;

	public ManagerData() {
		try {
			md = RMIHelper.getManagerService();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public EmployeePO findEmployee(String id) throws RemoteException {

		return md.findEmployee(id);
	}

	public InstitutionPO findInStitution(String id) throws RemoteException {
		return md.findInstitution(id);
	}

	public WarehousePO findWarehouse(String id) throws RemoteException{
		return null;
	}
	public ResultMessage insert(ManagerPO po) throws RemoteException {

		return md.insert(po);
	}

	public ResultMessage delete(ManagerPO po) throws RemoteException {

		return md.delete(po);
	}

	public ResultMessage update(ManagerPO po) throws RemoteException {
		return md.update(po);

	}

	public ResultMessage update(Object ob) throws RemoteException {

		return md.update(ob);
	}
	public ArrayList<SalaryPO> getSalary() throws RemoteException{
		return md.getSalary();
	}

	/**
	 * 新增以下接口
	 */
	public ArrayList<CarPackPO> findPack() throws RemoteException {
		// TODO Auto-generated method stub
		return md.getCarPack();
	}

	public ArrayList<ReceiptPO> findReceipt() throws RemoteException {
		// TODO Auto-generated method stub
		return md.getReceipt();
	}

	public ArrayList<AcceptPO> findAccept() throws RemoteException {
		// TODO Auto-generated method stub
		return md.getAccept();
	}

	public ArrayList<DeliverPO> findDeliver() throws RemoteException {
		// TODO Auto-generated method stub
		return md.getDeliver();
	}

	public ArrayList<CentreArrivalPO> findArrival() throws RemoteException {
		// TODO Auto-generated method stub
		return md.getCentreArrival();
	}

	public ArrayList<CentreTransforPO> findTrans() throws RemoteException {
		// TODO Auto-generated method stub
		return md.getCentreTransfor();
	}

	public ArrayList<CentrePackPO> findCentrePack() throws RemoteException {
		// TODO Auto-generated method stub
		return md.getCentrePack();
	}

	public ArrayList<InStoragePO> findImport() throws RemoteException {
		// TODO Auto-generated method stub
		return md.getInStorage();
	}

	public ArrayList<OutStoragePO> findExport() throws RemoteException {
		// TODO Auto-generated method stub
		return md.getOutStorage();
	}

	public ArrayList<PayPO> findPay() throws RemoteException {
		// TODO Auto-generated method stub
		return md.getPay();
	}

	public ArrayList<DistanceAndFee> getCity() throws RemoteException {
		
		return md.getCity();
	}

}
