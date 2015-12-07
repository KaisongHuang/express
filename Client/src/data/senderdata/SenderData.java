package data.senderdata;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;




import Client.network.client.ClientAdapter;
import Client.network.client.TransformObject;
import _enum.Opera;
import _enum.ResultMessage;
import po.HistoryPO;
import po.SenderPO;
import data.senderdataservice.SenderDataService;
import dataservice.senderdataservice.SenderDataBaseService;

public class SenderData implements SenderDataService{
	SenderDataBaseService sd;
	public SenderData(){
			try {
				sd=(SenderDataBaseService) Naming.lookup("rmi://127.0.0.1:8000/SenderDataService");
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
	public HistoryPO find(String id) throws RemoteException {
		return sd.find(id);

	}

	

}
