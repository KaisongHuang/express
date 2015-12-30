package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import dataservice.admindataservice.AdminDataBaseService;
import dataservice.centredataservice.CentreDataBaseService;
import dataservice.courierdataservice.CourierDataBaseService;
import dataservice.financedataservice.FinanceDataBaseService;
import dataservice.logindataservice.LoginDataBaseService;
import dataservice.managerdataservice.ManagerDataBaseService;
import dataservice.sellingareadataservice.SellingAreaDataBaseService;
import dataservice.senderdataservice.SenderDataBaseService;
import dataservice.warehousedataservice.WareHouseDataBaseService;

public class RMIHelper {
    private static String ip="192.168.191.4";
    private static int port=3333;
	private static AdminDataBaseService ad;
	private static CentreDataBaseService cd;

	private static CourierDataBaseService cod;
	private static SenderDataBaseService sd;
	private static FinanceDataBaseService fd;
	private static LoginDataBaseService ld;
	private static SellingAreaDataBaseService sa;
	private static ManagerDataBaseService md;
	private static WareHouseDataBaseService wd;
	public static AdminDataBaseService getAdminService() throws MalformedURLException, RemoteException, NotBoundException{
		return ad=(AdminDataBaseService) Naming.lookup("rmi://"+ip+":"+port+"/AdminDataService");
	}
	public static CentreDataBaseService getCentreService() throws MalformedURLException, RemoteException, NotBoundException{
		return cd=(CentreDataBaseService) Naming.lookup("rmi://"+ip+":"+port+"/CentreDataService");
	}

	public  static CourierDataBaseService getCourierService() throws MalformedURLException, RemoteException, NotBoundException{
         return cod=(CourierDataBaseService) Naming.lookup("rmi://"+ip+":"+port+"/CourierDataService");
	}

	public static SenderDataBaseService getSenderService() throws MalformedURLException, RemoteException, NotBoundException{
		return sd=(SenderDataBaseService) Naming.lookup("rmi://"+ip+":"+port+"/SenderDataService");
	}

	public static FinanceDataBaseService getFinanceService() throws MalformedURLException, RemoteException, NotBoundException{
		return fd=(FinanceDataBaseService) Naming.lookup("rmi://"+ip+":"+port+"/FinanceDataService");
	}

	public static LoginDataBaseService getLoginService() throws MalformedURLException, RemoteException, NotBoundException{
		return ld=(LoginDataBaseService) Naming.lookup("rmi://"+ip+":"+port+"/LoginDataService");
	}

	public static ManagerDataBaseService getManagerService() throws MalformedURLException, RemoteException, NotBoundException{
		return md=(ManagerDataBaseService) Naming.lookup("rmi://"+ip+":"+port+"/ManagerDataService");
	}
	public static SellingAreaDataBaseService getSellingService() throws MalformedURLException, RemoteException, NotBoundException{
		return sa=(SellingAreaDataBaseService) Naming.lookup("rmi://"+ip+":"+port+"/SellingAreaDataService");
	}

	public static WareHouseDataBaseService getWareHouseService() throws MalformedURLException, RemoteException, NotBoundException{
		return wd=(WareHouseDataBaseService) Naming.lookup("rmi://"+ip+":"+port+"/WareHouseDataService");
	}
}
