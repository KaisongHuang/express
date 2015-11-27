package courierTest;
import java.rmi.RemoteException;

import po.CourierPO;
import _enum.ResultMessage;
import data.courierdataservice.*;
public class CourierDataService_Stub implements CourierDataService{

	public CourierPO find(String id) throws RemoteException {
		System.out.println("find Succeed");
		return new CourierPO(null, null, null);
	}

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

}
