package data.logindata;

import java.rmi.Naming;
import java.rmi.RemoteException;

import RMI.RMIHelper;
import data.logindataservice.LoginDataService;
import dataservice.logindataservice.LoginDataBaseService;
import po.AdminPO;
import po.EmployeePO;

public class LoginData implements LoginDataService {
	LoginDataBaseService p;

	public LoginData() {
		try {
			p = RMIHelper.getLoginService();
			System.out.println("成功连接服务器");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public EmployeePO login(AdminPO po) {
		EmployeePO e = null;
		try {
			e = p.login(po);
			System.out.println("LoginData ok");
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
	}

}
