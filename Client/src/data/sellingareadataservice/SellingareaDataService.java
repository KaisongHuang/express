package data.sellingareadataservice;

import java.rmi.RemoteException;




import _enum.ResultMessage;
import po.SellingareaPO;

public interface SellingareaDataService {
	public SellingareaPO find(int id) throws RemoteException;
	public ResultMessage insert(SellingareaPO po) throws RemoteException;
	public ResultMessage delete(SellingareaPO po) throws RemoteException;
	public ResultMessage update(SellingareaPO po) throws RemoteException;
}
