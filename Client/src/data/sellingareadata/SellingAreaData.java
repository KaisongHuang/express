package data.sellingareadata;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import RMI.RMIHelper;
import po.CarPO;
import po.DriverPO;
import po.SellingareaPO;
import _enum.ResultMessage;
import data.sellingareadataservice.SellingareaDataService;
import dataservice.sellingareadataservice.SellingAreaDataBaseService;

public class SellingAreaData implements SellingareaDataService {
	SellingAreaDataBaseService sa;

	public SellingAreaData() {
		try {
			sa = RMIHelper.getSellingService();
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

	public CarPO findCar(String id) throws RemoteException {
		return (CarPO) sa.findCar(id);
	}

	public DriverPO findDriver(String id) throws RemoteException {
		return (DriverPO) sa.findDriver(id);
	}

	public ResultMessage insert(SellingareaPO po) throws RemoteException {
		return sa.insert(po);
	}

	public ResultMessage delete(SellingareaPO po) throws RemoteException {
		return sa.delete(po);
	}

	public ResultMessage update(SellingareaPO po) throws RemoteException {
		return sa.update(po);

	}
	
	public double getDistance(String city1,String city2) throws RemoteException{
		return sa.getDistance(city1, city2);
	}

}
