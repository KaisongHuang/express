package data.centredata;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import Client.network.client.ClientAdapter;
import Client.network.client.TransformObject;
import _enum.Opera;
import _enum.ResultMessage;
import data.centredataservice.CentreDataService;
import dataservice.centredataservice.CentreDataBaseService;
import po.CentreArrivalPO;
import po.CentrePO;

public class CentreData implements CentreDataService {
	CentreDataBaseService cd;
	ResultMessage rm;
	public CentreData(){
		try {
			cd=(CentreDataBaseService) Naming.lookup("rmi://127.0.0.1:8000/CentreDataService");
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

	public ResultMessage insert(CentrePO po) throws RemoteException {
		rm=cd.insert(po);
		return rm;
	}



	
}
