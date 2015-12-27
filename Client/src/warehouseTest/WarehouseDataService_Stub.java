package warehouseTest;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.CentreArrivalPO;
import po.CentreTransforPO;
import po.InStoragePO;
import po.OutStoragePO;
import po.SenderPO;
import po.WarehousePO;
import _enum.ResultMessage;
import data.warehousedataservice.WarehouseDataService;

public class WarehouseDataService_Stub implements WarehouseDataService {

	public WarehousePO find(int id) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("find Succeed!");
		return new WarehousePO();
	}

	public ResultMessage insert(WarehousePO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("insert Succeed!");
		return ResultMessage.Success;
	}

	public ResultMessage delete(WarehousePO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("delete Succeed!");
		return ResultMessage.Success;
	}

	public ResultMessage update(WarehousePO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("update Succeed!");
		return ResultMessage.Success;
	}

	public ArrayList<InStoragePO> findIn(String date) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<OutStoragePO> findOut(String date) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage clear() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<CentreArrivalPO> getArrival() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage setAlarm(double d) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<CentreTransforPO> getTransfor() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<InStoragePO> summarize(String date) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<InStoragePO> findIn(String begin, String end) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<OutStoragePO> findOut(String begin, String end) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage checkAlarm() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<InStoragePO> adjust() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<int[]> findFreeSpace() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public SenderPO getSender(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDestination(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage insert(Object po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage update(Object ob) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
