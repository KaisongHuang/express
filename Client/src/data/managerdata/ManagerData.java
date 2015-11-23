package data.managerdata;

import java.rmi.RemoteException;

import Client.network.client.ClientAdapter;
import Client.network.client.TransformObject;
import _enum.Opera;
import _enum.ResultMessage;
import data.managerdataservice.ManagerDataService;
import po.ManagerPO;

public class ManagerData implements ManagerDataService {
	   TransformObject send;
	    TransformObject acp;
	public ManagerPO find(String id,Opera op) throws RemoteException {
		send=new TransformObject(op,id);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		
		return (ManagerPO) acp.getOb();
	}

	public ResultMessage insert(ManagerPO po) throws RemoteException {

		return null;
	}

	public ResultMessage delete(ManagerPO po) throws RemoteException {
	
		return null;
	}

	public ResultMessage update(ManagerPO po) throws RemoteException {
	
		return null;
	}

	public ManagerPO find(int id) throws RemoteException {
		// TODO 自动生成的方法存根
		return null;
	}

}
