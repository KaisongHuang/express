package adminTest;

import java.rmi.RemoteException;

import _enum.ResultMessage;
import data.admindataservice.AdminDataService;
import po.AdminPO;

public class AdminDataService_Stub implements AdminDataService {

	public AdminPO find(int id) throws RemoteException {
		// TODO Auto-generated method stub
		return new AdminPO(null, null, null, null);
	}

	public ResultMessage insert(AdminPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return ResultMessage.Error;
	}

	public ResultMessage delete(AdminPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return ResultMessage.Error;
	}

	public ResultMessage update(AdminPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return ResultMessage.Error;
	}

}
