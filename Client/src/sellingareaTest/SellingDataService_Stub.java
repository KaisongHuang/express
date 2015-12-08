package sellingareaTest;

import java.rmi.RemoteException;

import po.CarPO;
import po.DriverPO;
import po.SellingareaPO;
import _enum.Opera;
import _enum.ResultMessage;
import data.sellingareadataservice.SellingareaDataService;

public class SellingDataService_Stub implements SellingareaDataService {

	public SellingareaPO find(String id) throws RemoteException {
		System.out.println("find Succeed!");
		return new SellingareaPO();
	}

	public ResultMessage insert(SellingareaPO po) throws RemoteException {
		System.out.println("insert Succeed!");
		return ResultMessage.Success;
	}

	public ResultMessage delete(SellingareaPO po) throws RemoteException {
		System.out.println("delete Succeed!");
		return ResultMessage.Success;
	}

	public ResultMessage update(SellingareaPO po) throws RemoteException {
		System.out.println("update Succeed!");
		return ResultMessage.Success;
	}

	public SellingareaPO find(String id, Opera op) throws RemoteException {
		return null;
	}

	public CarPO findCar(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public DriverPO findDriver(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
