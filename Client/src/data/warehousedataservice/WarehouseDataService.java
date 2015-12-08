package data.warehousedataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.CentreArrivalPO;
import po.CentreTransforPO;
import po.InStoragePO;
import po.OutStoragePO;
import po.WarehousePO;
import _enum.ResultMessage;

public interface WarehouseDataService {
	public ArrayList<InStoragePO> summarize(String date) throws RemoteException;

	public ArrayList<InStoragePO> findIn(String begin, String end) throws RemoteException;

	public ArrayList<OutStoragePO> findOut(String begin, String end) throws RemoteException;

	public ResultMessage insert(WarehousePO po) throws RemoteException;

	/**
	 * 仓库初始化时使用
	 * 
	 * @param po
	 * @return
	 * @throws RemoteException
	 */
	public ResultMessage clear() throws RemoteException;

	public ResultMessage update(WarehousePO po) throws RemoteException;

	public ArrayList<CentreArrivalPO> getArrival() throws RemoteException;

	public ResultMessage setAlarm(double d) throws RemoteException;

	public ArrayList<CentreTransforPO> getTransfor() throws RemoteException;

	public ResultMessage checkAlarm() throws RemoteException;
	
	public ArrayList<InStoragePO> adjust() throws RemoteException;
	
	public ArrayList<int[]> findFreeSpace() throws RemoteException;
}
