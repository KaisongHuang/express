package data.warehousedata;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import RMI.RMIHelper;
import _enum.EmployeeMes;
import _enum.ResultMessage;
import data.warehousedataservice.WarehouseDataService;
import dataservice.warehousedataservice.WareHouseDataBaseService;
import po.CentreArrivalPO;
import po.CentreTransforPO;
import po.InStoragePO;
import po.OutStoragePO;
import po.SenderPO;
import po.WarehousePO;

public class WarehouseData implements WarehouseDataService {
	WareHouseDataBaseService wd;
	String WarehouseID = EmployeeMes.belongToWho;
	ResultMessage rm = null;

	public WarehouseData() {
		try {
			wd = RMIHelper.getWareHouseService();
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

	public ArrayList<InStoragePO> findIn(String begin, String end) throws RemoteException {
		return wd.findIn(begin, end, WarehouseID);
	}

	public ArrayList<OutStoragePO> findOut(String begin, String end) throws RemoteException {
		return wd.findOut(begin, end, WarehouseID);
	}

	public ArrayList<InStoragePO> summarize(String date) throws RemoteException {

		return wd.summarize(date, EmployeeMes.belongToWho);
	}

	public ResultMessage insert(Object po) throws RemoteException {
//		InStoragePO po1 = (InStoragePO) po;
//		System.out.println(po1.getPos_qu());
		rm = wd.insert(po);
		System.out.println(rm);
		return rm;
	}

	public ResultMessage clear() throws RemoteException {

		return wd.clear();
	}

	public ResultMessage update(Object po) throws RemoteException {

		InStoragePO po1 = (InStoragePO) po;

		return wd.update(po1);
	}

	public ArrayList<CentreArrivalPO> getArrival() throws RemoteException {
		// TODO Auto-generated method stub
		return wd.getArrival();
	}

	public ResultMessage setAlarm(double d) throws RemoteException {
		// TODO Auto-generated method stub
		return wd.setAlarm(d, WarehouseID);
	}

	public ArrayList<CentreTransforPO> getTransfor() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println(WarehouseID);
		return wd.getTransfor(WarehouseID);
	}

	public ResultMessage checkAlarm() throws RemoteException {
		// TODO Auto-generated method stub
		return wd.checkAlarm(WarehouseID);
	}

	public ArrayList<InStoragePO> adjust() throws RemoteException {
		// TODO Auto-generated method stub
		return wd.adjust(WarehouseID);
	}

	public ArrayList<int[]> findFreeSpace() throws RemoteException {
		// TODO Auto-generated method stub
		return wd.findFreeSpace(WarehouseID);
	}

	public String getDestination(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return wd.findDestination(id);
	}

}
