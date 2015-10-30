package warehouseTest;

import java.rmi.RemoteException;

import po.WarehousePO;
import _enum.ResultMessage;
import data.warehousedataservice.WarehouseDataService;

public class WarehouseDataService_Stub implements WarehouseDataService {

	public WarehousePO find(int id) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("find Succeed!");
		return new WarehousePO(id, null);
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

}
