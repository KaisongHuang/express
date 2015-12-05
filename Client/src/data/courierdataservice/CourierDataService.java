package data.courierdataservice;

import java.rmi.RemoteException;

import _enum.ResultMessage;
import po.CourierPO;
import po.HistoryPO;
import po.SenderPO;

public interface CourierDataService {
	public HistoryPO find(String id) throws RemoteException;
	public ResultMessage insert(CourierPO po) throws RemoteException;
	public ResultMessage OrderInput(SenderPO po) throws RemoteException;
	public double getPrice(double fee, double packing) throws RemoteException;
	public String getTime(int distance) throws RemoteException ;
}
