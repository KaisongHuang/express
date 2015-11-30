package data.senderdata;

import java.rmi.RemoteException;




import Client.network.client.ClientAdapter;
import Client.network.client.TransformObject;
import _enum.Opera;
import _enum.ResultMessage;
import po.HistoryPO;
import po.SenderPO;
import data.senderdataservice.SenderDataService;

public class SenderData implements SenderDataService{
	TransformObject send;
    TransformObject acp;
	public HistoryPO find(String id) throws RemoteException {
		send=new TransformObject(Opera.History_find,new Integer(id));
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return (HistoryPO) acp.getOb();

	}

	

}
