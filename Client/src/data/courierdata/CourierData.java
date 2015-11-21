package data.courierdata;

import java.rmi.RemoteException;

import _enum.ResultMessage;
import data.courierdataservice.CourierDataService;
import po.CourierPO;
import vo.CourierVO;
import vo.SenderVO;

public class CourierData implements CourierDataService {

	public CourierPO find(int id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage insert(CourierPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage delete(CourierPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage update(CourierPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage OrderInput(SenderVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	public double getPrice(double fee, double packing) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getTime(int distance) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage ConsigneeinfoInput(CourierVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
