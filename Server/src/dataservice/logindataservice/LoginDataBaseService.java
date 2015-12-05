package dataservice.logindataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.AdminPO;
import po.EmployeePO;

public interface LoginDataBaseService extends Remote{
       public EmployeePO login(AdminPO po)throws RemoteException;
}
