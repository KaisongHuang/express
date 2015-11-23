package data.warehousedata;

import java.rmi.RemoteException;
import java.util.ArrayList;

import Client.network.client.ClientAdapter;
import Client.network.client.TransformObject;
import _enum.EmployeeMes;
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
		send=new TransformObject(Opera.Warehouse_update,po);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return (ResultMessage) acp.getOb();
		
	}
	
	public ArrayList<InStoragePO> findInStorage(){
		send=new TransformObject(Opera.InStorage_find,null);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return (ArrayList<InStoragePO>) acp.getOb();
	
	}
	
	public ArrayList<OutStoragePO> findOutStorage(){
		send=new TransformObject(Opera.OutStorage_find,null);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return (ArrayList<OutStoragePO>) acp.getOb();
	}

	public ResultMessage checkAlarm() throws RemoteException {
		send=new TransformObject(Opera.checkAlarm,new WarehousePO(0,EmployeeMes.belongToWho));
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return (ResultMessage) acp.getOb();
	}
	
	public ResultMessage setAlarm(double d){
		send=new TransformObject(Opera.setAlarm,new WarehousePO(d,EmployeeMes.belongToWho));
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return (ResultMessage) acp.getOb();
	}

	

}
