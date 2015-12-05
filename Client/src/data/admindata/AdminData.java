package data.admindata;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import Client.network.client.ClientAdapter;
import Client.network.client.TransformObject;
import _enum.Opera;
import _enum.ResultMessage;
import data.admindataservice.AdminDataService;
import dataservice.admindataservice.AdminDataBaseService;
import po.AdminPO;

public class AdminData implements AdminDataService {
    AdminDataBaseService ad;
	public AdminData(){
		try {
			ad=(AdminDataBaseService) Naming.lookup("rmi://127.0.0.1:8000/AdminDataService");
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
    
    
	public AdminPO find(String id) throws RemoteException {
		AdminPO p=ad.find(id);
		return p;
	}

	public ResultMessage insert(AdminPO po) throws RemoteException {
		ResultMessage rm=ad.insert(po);
		return rm;
		
	}

	public ResultMessage delete(AdminPO po) throws RemoteException {
		ResultMessage rm=ad.delete(po.getId());
		return rm;
	}

	public ResultMessage update(AdminPO po) throws RemoteException {
		//还没有写完
		ResultMessage rm=ad.update(po);
		return rm;
	}

	
}
