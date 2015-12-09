package data.logindataservice;

import java.rmi.RemoteException;

import po.AdminPO;
import po.EmployeePO;

public interface LoginDataService {

	public EmployeePO login(AdminPO po) throws RemoteException;
}
