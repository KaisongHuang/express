package data.courierdata;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import RMI.RMIHelper;
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
			cd=RMIHelper.getCourierService();
			sd=RMIHelper.getSenderService();
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

	public double[] getDistanceAndFee(String city1, String city2) throws RemoteException {
		
		return cd.getDistanceAndFee(city1,city2);
	}

	public double getTime(String start, String end) throws RemoteException {
		return cd.getTime(start,end);
		
	}
	

}
