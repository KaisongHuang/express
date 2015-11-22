package data.centredata;

import java.rmi.RemoteException;

import Client.network.client.ClientAdapter;
import Client.network.client.TransformObject;
import _enum.Opera;
import _enum.ResultMessage;
import data.centredataservice.CentreDataService;
import po.CentrePO;

public class CentreData implements CentreDataService {
	TransformObject send;
    TransformObject acp;

	public ResultMessage insert(CentrePO po) throws RemoteException {
		send=new TransformObject(Opera.Centre_insert,po);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return (ResultMessage) acp.getOb();
	}

	public ResultMessage delete(CentrePO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage update(CentrePO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
