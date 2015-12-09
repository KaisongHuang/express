package data.sellingareadataservice;

import java.rmi.RemoteException;

import _enum.ResultMessage;
import po.CarPO;
import po.DriverPO;
import po.SellingareaPO;

public interface SellingareaDataService {
	public CarPO findCar(String id) throws RemoteException;

	public DriverPO findDriver(String id) throws RemoteException;

	public ResultMessage insert(SellingareaPO po) throws RemoteException;

	public ResultMessage delete(SellingareaPO po) throws RemoteException;

	public ResultMessage update(SellingareaPO po) throws RemoteException;
}
