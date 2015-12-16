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
	public double[] getDistanceAndFee(String city1, String city2) throws RemoteException;
	public double getTime(String start, String end) throws RemoteException ;
}
