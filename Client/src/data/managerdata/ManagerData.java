package data.managerdata;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import RMI.RMIHelper;
import _enum.ResultMessage;
import data.managerdataservice.ManagerDataService;
import dataservice.managerdataservice.ManagerDataBaseService;
import po.EmployeePO;
import po.InstitutionPO;
import po.ManagerPO;
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

}
