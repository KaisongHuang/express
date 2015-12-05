package data.managerdata;

import java.rmi.RemoteException;

import Client.network.client.ClientAdapter;
import Client.network.client.TransformObject;
import _enum.Opera;
import _enum.ResultMessage;
import data.managerdataservice.ManagerDataService;
import po.DistanceAndFee;
import po.ManagerPO;
import po.SalaryPO;

public class ManagerData implements ManagerDataService {
	   TransformObject send;
	    TransformObject acp;
	public ManagerPO find(String id,Opera op) throws RemoteException {
		send=new TransformObject(op,id);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		
		return (ManagerPO) acp.getOb();
	}

	public ResultMessage insert(ManagerPO po,Opera op) throws RemoteException {
		send=new TransformObject(op,po);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return null;
	}

	public ResultMessage delete(ManagerPO po,Opera op) throws RemoteException {
		send=new TransformObject(op,po);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return null;
	}

	
	public ResultMessage update(ManagerPO po,Opera op) throws RemoteException {
		if(po instanceof SalaryPO){
		     send=new TransformObject(Opera.Manager_insert,po);
		}else if(po instanceof DistanceAndFee){
			  send=new TransformObject(Opera.Manager_insert,po);
			
		}else{
			send=new TransformObject(op,po);
		}
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return null;
	}

	public ManagerPO find(String id) throws RemoteException {
		// TODO 自动生成的方法存根
		return null;
	}

	public ResultMessage insert(ManagerPO po) throws RemoteException {
		// TODO 自动生成的方法存根
		return null;
	}

	public ResultMessage delete(ManagerPO po) throws RemoteException {
		// TODO 自动生成的方法存根
		return null;
	}

	public ResultMessage update(ManagerPO po) throws RemoteException {
		// TODO 自动生成的方法存根
		return null;
	}

	public ResultMessage update(Object ob) throws RemoteException {
		
		return null;
	}

}
