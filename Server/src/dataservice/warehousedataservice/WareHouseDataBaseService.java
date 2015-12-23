package dataservice.warehousedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.CentreArrivalPO;
import po.CentreTransforPO;
import po.InStoragePO;
import po.OutStoragePO;
import po.WarehousePO;
import server.database.MySQLDataBase;
import _enum.ResultMessage;

public interface WareHouseDataBaseService extends Remote{
	public ArrayList<InStoragePO> findIn(String begin,String end,String WarehouseID) throws RemoteException;
	public ArrayList<OutStoragePO> findOut(String begin,String end,String WarehouseID) throws RemoteException;
	public ArrayList<InStoragePO> summarize(String date,String WarehouseID) throws RemoteException;
	public ResultMessage insert(WarehousePO po) throws RemoteException;
	public ResultMessage clear()throws RemoteException ;
	public ResultMessage update(WarehousePO po) throws RemoteException;
	public ArrayList<CentreArrivalPO> getArrival() throws RemoteException;
	public ResultMessage setAlarm(double d,String WarehouseID) throws RemoteException ;
	public ArrayList<CentreTransforPO> getTransfor(String start) throws RemoteException ;
	public ResultMessage checkAlarm(String WarehouseID) throws RemoteException ;
	public ArrayList<InStoragePO> adjust(String WarehouseID) throws RemoteException;
	public ArrayList<int[]> findFreeSpace(String WarehouseID) throws RemoteException;
	public String findDestination(String id) throws RemoteException;
}
