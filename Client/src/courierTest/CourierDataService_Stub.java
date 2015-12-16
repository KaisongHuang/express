package courierTest;
import java.rmi.RemoteException;

import po.CourierPO;
import po.HistoryPO;
import po.SenderPO;
import _enum.ResultMessage;
import data.courierdataservice.*;
public class CourierDataService_Stub implements CourierDataService{


	public ResultMessage insert(CourierPO po) throws RemoteException {
		System.out.println("insert succeed");
		return ResultMessage.Success;
	}

	public ResultMessage delete(CourierPO po) throws RemoteException {
		System.out.println("delete succeed");
		return ResultMessage.Success;
	}

	public ResultMessage update(CourierPO po) throws RemoteException {
		System.out.println("update succeed");
		return ResultMessage.Success;
	}

	public HistoryPO find(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage OrderInput(SenderPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public double getPrice(double fee, double packing) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getTime(int distance) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public double[] getDistanceAndFee(String city1, String city2) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public double getTime(String start, String end) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

}
