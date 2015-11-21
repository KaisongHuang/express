package logic.warehousebl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;

import _enum.ResultMessage;
import data.warehousedata.WarehouseData;
import logic.warehouseblservice.WarehouseBlService;
import po.InStoragePO;
import po.OutStoragePO;
import po.WarehousePO;
import vo.InStorageVO;
import vo.OutStorageVO;

public class Warehouse implements WarehouseBlService {
	WarehouseData wd = new WarehouseData();

	public ResultMessage importGoods(InStorageVO vo) {
		// TODO Auto-generated method stub
		ResultMessage rm;
		InStoragePO po = new InStoragePO(vo.getId(), vo.getIndate(), vo.getDestination(), vo.getPos_qu(),
				vo.getPos_pai(), vo.getPos_jia(), vo.getPos_wei(), vo.getIsCheck());
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
		OutStoragePO po = new OutStoragePO(vo.getId(), vo.getDestination(), vo.getOutdate(), vo.getTransportation(),
				vo.getTrans_id(), vo.getIsCheck());
		try {
			rm = wd.insert(po);
			return rm;
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ResultMessage initWarehouse(InStorageVO vo) {
		// TODO Auto-generated method stub
		/*********** needs to be modified when adding listener *********/
		ResultMessage rm;
		InStoragePO po = new InStoragePO(vo.getId(), vo.getIndate(), vo.getDestination(), vo.getPos_qu(),
				vo.getPos_pai(), vo.getPos_jia(), vo.getPos_wei(), vo.getIsCheck());
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
		WarehousePO po = new WarehousePO();
		po.setAlarmRate(rate);
		return null;
	}

	public ResultMessage checkAlarm() {
		// TODO Auto-generated method stub

		return null;
	}

	@SuppressWarnings("null")
	public ArrayList<Object> checkWarehouse(String begin, String end) {
		// TODO Auto-generated method stub
		ArrayList<Object> arr = null;
		for (int i = 0; i < wd.findInStorage().size(); i++) {
			if(wd.findInStorage().get(i).getIndate().compareTo(begin)>=0&&wd.findInStorage().get(i).getIndate().compareTo(end)<=0)
				arr.add(wd.findInStorage().get(i));
		}
		for (int i = 0; i < wd.findOutStorage().size(); i++) {
			if(wd.findOutStorage().get(i).getOutdate().compareTo(begin)>=0&&wd.findOutStorage().get(i).getOutdate().compareTo(end)<=0)
				arr.add(wd.findOutStorage().get(i));
		}
		return arr;
	}

	@SuppressWarnings("null")
	public ArrayList<Object> summarizeWarehouse() {
		// TODO Auto-generated method stub
		Calendar time = Calendar.getInstance();
		int year = time.get(Calendar.YEAR); 
		int month = time.get(Calendar.MONTH)+1; 
		int date = time.get(Calendar.DATE); 
		String date1=""+year+month+date;
		ArrayList<Object> arr = null;
		for (int i = 0; i < wd.findInStorage().size(); i++) {
			if(wd.findInStorage().get(i).getIndate().compareTo(date1)==0&&wd.findInStorage().get(i).getIndate().compareTo(date1)==0)
				arr.add(wd.findInStorage().get(i));
		}
		for (int i = 0; i < wd.findOutStorage().size(); i++) {
			if(wd.findOutStorage().get(i).getOutdate().compareTo(date1)==0&&wd.findOutStorage().get(i).getOutdate().compareTo(date1)==0)
				arr.add(wd.findOutStorage().get(i));
		}
		return arr;
	}

}
