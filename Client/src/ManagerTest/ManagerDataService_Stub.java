package ManagerTest;

import java.rmi.RemoteException;
import java.util.ArrayList;

import _enum.ResultMessage;
import data.managerdataservice.ManagerDataService;
import po.AcceptPO;
import po.CarPackPO;
import po.CentreArrivalPO;
import po.CentrePackPO;
import po.CentreTransforPO;
import po.DeliverPO;
import po.EmployeePO;
import po.InStoragePO;
import po.InstitutionPO;
import po.ManagerPO;
import po.OutStoragePO;
import po.PayPO;
import po.ReceiptPO;
import po.SalaryPO;

public class ManagerDataService_Stub implements ManagerDataService {
	
	public ManagerPO find(String id) throws RemoteException {
		
		System.out.println("Find!");
		
		return new ManagerPO();
		
	}
	
	public ResultMessage insert(ManagerPO po) throws RemoteException {
		
		return ResultMessage.Error;
		
	}
	
	public ResultMessage delete(ManagerPO po) throws RemoteException {
		
		return ResultMessage.Error;
		
	}
	
	public ResultMessage update(ManagerPO po) throws RemoteException {
		
		return ResultMessage.Error;
		
	}

	public ResultMessage update(Object ob) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public EmployeePO findEmployee(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public InstitutionPO findInStitution(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<CarPackPO> findPack() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<ReceiptPO> findReceipt() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<AcceptPO> findAccept() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<DeliverPO> findDeliver() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<CentreArrivalPO> findArrival() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<CentreTransforPO> findTrans() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<CentrePackPO> findCentrePack() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<InStoragePO> findImport() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<OutStoragePO> findExport() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<PayPO> findPay() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<SalaryPO> getSalary() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
