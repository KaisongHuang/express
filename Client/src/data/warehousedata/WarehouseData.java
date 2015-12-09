package data.warehousedata;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import _enum.EmployeeMes;
import _enum.ResultMessage;
import data.warehousedataservice.WarehouseDataService;
import dataservice.warehousedataservice.WareHouseDataBaseService;
import po.CentreArrivalPO;
import po.CentreTransforPO;
import po.InStoragePO;
import po.OutStoragePO;
import po.WarehousePO;

public class WarehouseData implements WarehouseDataService {
	WareHouseDataBaseService wd;
	String WarehouseID = EmployeeMes.belongToWho;

	public WarehouseData() {
		try {
			wd = (WareHouseDataBaseService) Naming.lookup("rmi://127.0.0.1:8000/WareHouseDataService");
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

	public ResultMessage insert(WarehousePO po) throws RemoteException {

		return wd.insert(po);
	}

	public ResultMessage clear() throws RemoteException {

		return wd.clear();
	}

	public ResultMessage update(WarehousePO po) throws RemoteException {

		return wd.update(po);
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

}
