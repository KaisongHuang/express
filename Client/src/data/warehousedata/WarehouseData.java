package data.warehousedata;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Client.network.client.ClientAdapter;
import Client.network.client.TransformObject;
import _enum.EmployeeMes;
import _enum.Opera;
import _enum.ResultMessage;
import data.warehousedataservice.WarehouseDataService;
import dataservice.warehousedataservice.WareHouseDataBaseService;
import po.CentreArrivalPO;
import po.CentreTransforPO;
import po.InStoragePO;
import po.OutStoragePO;
import po.WarehousePO;


public class WarehouseData implements WarehouseDataService {
	WareHouseDataBaseService wd;
	public WarehouseData(){
		try {
			wd=(WareHouseDataBaseService) Naming.lookup("rmi://127.0.0.1:8000/WareHouseDataService");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ArrayList<InStoragePO> findIn(String date) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public ArrayList<OutStoragePO> findOut(String date) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public ResultMessage insert(WarehousePO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public ResultMessage clear() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public ResultMessage update(WarehousePO po) throws RemoteException {
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
	



}
