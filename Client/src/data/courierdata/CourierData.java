package data.courierdata;

import java.rmi.RemoteException;

import Client.network.client.ClientAdapter;
import Client.network.client.TransformObject;
import _enum.Opera;
import _enum.ResultMessage;
import data.courierdataservice.CourierDataService;
import po.CourierPO;
import po.SenderPO;
import vo.CourierVO;
import vo.SenderVO;

public class CourierData implements CourierDataService {
    TransformObject send;
    TransformObject acp;
	public CourierPO find(int id) throws RemoteException {
		
		return null;
	}

	public ResultMessage insert(CourierPO po) throws RemoteException {
		send=new TransformObject(Opera.Courier_insert,po);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return (ResultMessage) acp.getOb();
	}

	public ResultMessage delete(CourierPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage update(CourierPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage OrderInput(SenderPO po) {
		
		send=new TransformObject(Opera.Sender_insert,po);
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return (ResultMessage) acp.getOb();
	}

	public double getPrice(double fee, double packing) {
		
		return 0;
	}

	public String getTime(int distance) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
