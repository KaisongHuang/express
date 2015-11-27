package data.admindata;

import java.rmi.RemoteException;

import Client.network.client.ClientAdapter;
import Client.network.client.TransformObject;
import _enum.Opera;
import _enum.ResultMessage;
import data.admindataservice.AdminDataService;
import po.AdminPO;

public class AdminData implements AdminDataService {
    TransformObject send;
    TransformObject acp;
	public AdminPO find(String id) throws RemoteException {
		send=new TransformObject(Opera.Admin_find,id);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return (AdminPO) acp.getOb();
	}

	public ResultMessage insert(AdminPO po) throws RemoteException {
		send=new TransformObject(Opera.Admin_insert,po);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return (ResultMessage) acp.getOb();
		
	}

	public ResultMessage delete(AdminPO po) throws RemoteException {
		send=new TransformObject(Opera.Admin_delete,po);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return (ResultMessage) acp.getOb();
	}

	public ResultMessage update(AdminPO po) throws RemoteException {
		//还没有写完
		
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return (ResultMessage) acp.getOb();
	}

	
}
