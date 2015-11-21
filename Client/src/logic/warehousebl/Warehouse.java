package logic.warehousebl;

import java.rmi.RemoteException;

import _enum.ResultMessage;
import data.warehousedata.WarehouseData;
import logic.warehouseblservice.WarehouseBlService;
import po.InStoragePO;
import po.OutStoragePO;
import po.PayPO;
import vo.InStorageVO;
import vo.OutStorageVO;

public class Warehouse implements WarehouseBlService {
	WarehouseData wd = new WarehouseData();

	public ResultMessage importGoods(InStorageVO vo) {
		// TODO Auto-generated method stub
		ResultMessage rm;
		InStoragePO po=new InStoragePO(0, null, null, null, null, null, null, 0);
		try {
			rm = wd.insert(po);
			return rm;
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ResultMessage exportGoods(OutStorageVO vo) {
		// TODO Auto-generated method stub
		ResultMessage rm;
		OutStoragePO po=new OutStoragePO(0, null, null, null, 0, 0);
		try {
			rm = wd.insert(po);
			return rm;
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ResultMessage setAlarm() {
		// TODO Auto-generated method stub
		
		return null;
	}

	public ResultMessage checkWarehouse(int begin, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage summarizeWarehouse(int end) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage initWarehouse(InStorageVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
