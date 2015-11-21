package logic.warehousebl;

import java.rmi.RemoteException;

import _enum.ResultMessage;
import data.warehousedata.WarehouseData;
import logic.warehouseblservice.WarehouseBlService;
import serverPO.InStoragePO;
import serverPO.OutStoragePO;
import vo.InStorageVO;
import vo.OutStorageVO;

public class Warehouse implements WarehouseBlService {
	WarehouseData wd = new WarehouseData();

	public ResultMessage importGoods(InStorageVO vo) {
		// TODO Auto-generated method stub
		ResultMessage rm;
		InStoragePO po=new InStoragePO(vo.getId(), vo.getIndate(), vo.getDestination(), vo.getPos_qu(), vo.getPos_pai(), vo.getPos_jia(), vo.getPos_wei(), vo.getIsCheck());
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
		OutStoragePO po=new OutStoragePO(vo.getId(), vo.getDestination(), vo.getOutdate(), vo.getTransportation(), vo.getTrans_id(), vo.getIsCheck());
		try {
			rm = wd.insert(po);
			return rm;
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ResultMessage setAlarm(double rate) {
		// TODO Auto-generated method stub
		
		return null;
	}

	public ResultMessage checkAlarm() {
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
