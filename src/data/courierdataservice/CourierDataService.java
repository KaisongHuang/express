package data.courierdataservice;

import java.rmi.RemoteException;

import _enum.ResultMessage;
import po.CourierPO;

public interface CourierDataService {
	public CourierPO find(int id) throws RemoteException;
	public ResultMessage insert(CourierPO po) throws RemoteException;
	public ResultMessage delete(CourierPO po) throws RemoteException;
	public ResultMessage update(CourierPO po) throws RemoteException;
}
