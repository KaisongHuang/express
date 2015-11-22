package data.sellingareadata;

import java.rmi.RemoteException;

import po.SellingareaPO;
import Client.network.client.ClientAdapter;
import Client.network.client.TransformObject;
import _enum.Opera;
import _enum.ResultMessage;
import data.sellingareadataservice.SellingareaDataService;

public class SellingAreaData implements SellingareaDataService{
	TransformObject send;
    TransformObject acp;
	public SellingareaPO find(int id,Opera op) throws RemoteException {
		send=new TransformObject(op,new Integer(id));
		ClientAdapter.write(send);
		acp=(TransformObject) ClientAdapter.readData();
		return (SellingareaPO) acp.getOb();
	}

	public ResultMessage insert(SellingareaPO po) throws RemoteException {
	    send=new TransformObject(Opera.Sellingarea_insert,po);
	    ClientAdapter.write(send);
	    acp=(TransformObject) ClientAdapter.readData();
		return (ResultMessage) acp.getOb();
	}

	public ResultMessage delete(SellingareaPO po) throws RemoteException {
		send=new TransformObject(Opera.Sellingarea_delete,po);
	    ClientAdapter.write(send);
	    acp=(TransformObject) ClientAdapter.readData();
		return (ResultMessage) acp.getOb();
	}

	public ResultMessage update(SellingareaPO po) throws RemoteException {
		send=new TransformObject(Opera.Sellingarea_update,po);
	    ClientAdapter.write(send);
	    acp=(TransformObject) ClientAdapter.readData();
		return (ResultMessage) acp.getOb();
	
	}

}
