package data.warehousedataservice;

import java.rmi.RemoteException;

import po.WarehousePO;
import _enum.ResultMessage;

public interface WarehouseDataService {
	
	public ResultMessage insert(WarehousePO po) throws RemoteException;
	public ResultMessage delete(WarehousePO po) throws RemoteException;
	public ResultMessage update(WarehousePO po) throws RemoteException;
}
