package data.warehousedata;

import java.rmi.RemoteException;
import java.util.ArrayList;

import Client.network.client.ClientAdapter;
import Client.network.client.TransformObject;
import _enum.Opera;
import _enum.ResultMessage;
import data.warehousedataservice.WarehouseDataService;
import po.InStoragePO;
import po.OutStoragePO;
import po.WarehousePO;


public class WarehouseData implements WarehouseDataService {
	TransformObject send;
    TransformObject acp;
	

	public ResultMessage insert(WarehousePO po) throws RemoteException {
		send=new TransformObject(Opera.Warehouse_insert,po);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return (ResultMessage) acp.getOb();
		
	}

	public ResultMessage delete(WarehousePO po) throws RemoteException {
		
		return null;
	}

	public ResultMessage update(WarehousePO po) throws RemoteException {
		
		return null;
	}
	
	public ArrayList<InStoragePO> findInStorage(){
		
		return null;
	}
	
	public ArrayList<OutStoragePO> findOutStorage(){
		return null;
	}

	public ResultMessage checkAlarm() throws RemoteException {
		send=new TransformObject(Opera.checkAlarm,null);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return (ResultMessage) acp.getOb();
	}
	
	public ResultMessage setAlarm(double d){
		send=new TransformObject(Opera.setAlarm,d);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return (ResultMessage) acp.getOb();
	}

	

}
