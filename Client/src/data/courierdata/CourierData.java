package data.courierdata;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import _enum.ResultMessage;
import data.courierdataservice.CourierDataService;
import dataservice.courierdataservice.CourierDataBaseService;
import dataservice.senderdataservice.SenderDataBaseService;
import po.CourierPO;
import po.HistoryPO;
import po.SenderPO;

public class CourierData implements CourierDataService {
    CourierDataBaseService cd;
    SenderDataBaseService sd;
	public CourierData(){
		try {
			cd=(CourierDataBaseService) Naming.lookup("rmi://127.0.0.1:8000/CourierDataService");
			sd=(SenderDataBaseService) Naming.lookup("rmi://127.0.0.1:8000/SenderDataService");
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
	public HistoryPO find(String id) throws RemoteException {
		HistoryPO h=sd.find(id);
		return h;
	}

	public ResultMessage insert(CourierPO po) throws RemoteException {
		ResultMessage rm=cd.insert(po);
		return rm;
	}



	public ResultMessage OrderInput(SenderPO po) throws RemoteException {
		ResultMessage rm=cd.insert(po);
		return rm;
	}

	public double getPrice(double fee, double packing) throws RemoteException {
		
		return 0;
	}

	public String getTime(int distance) throws RemoteException {
		return null;
		
	}

	

}
