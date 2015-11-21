package data.warehousedata;

import java.rmi.RemoteException;
import java.util.ArrayList;

import _enum.ResultMessage;
import data.warehousedataservice.WarehouseDataService;
<<<<<<< HEAD
import serverPO.WarehousePO;
=======
import po.InStoragePO;
import po.OutStoragePO;
import po.WarehousePO;
>>>>>>> refs/remotes/origin/master

public class WarehouseData implements WarehouseDataService {

	public WarehousePO find(int id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage insert(WarehousePO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage delete(WarehousePO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage update(WarehousePO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ArrayList<InStoragePO> findInStorage(){
		return null;
	}
	
	public ArrayList<OutStoragePO> findOutStorage(){
		return null;
	}

}
