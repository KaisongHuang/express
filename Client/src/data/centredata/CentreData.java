package data.centredata;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import RMI.RMIHelper;
import _enum.ResultMessage;
import data.centredataservice.CentreDataService;
import dataservice.centredataservice.CentreDataBaseService;
import po.CentrePO;

public class CentreData implements CentreDataService {
	CentreDataBaseService cd;
	ResultMessage rm;
	public CentreData(){
		try {
			cd=RMIHelper.getCentreService();
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
