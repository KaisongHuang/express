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

	public ResultMessage adjustGoods(int id,int qu,int pai,int jia,int wei) {
//		ResultMessage rm;
//		
//		try {
//			rm = wd.insert(po);
//			return rm;
//		} catch (RemoteException e) {
//			e.printStackTrace();
//		}
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
		return wd.setAlarm(rate);
	}

	public ResultMessage checkAlarm() {
		
		try {
			return wd.checkAlarm();
		} catch (RemoteException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("null")
	public ArrayList<Object> checkWarehouse(String begin, String end) {
		// TODO Auto-generated method stub
		ArrayList<Object> arr = null;
		ArrayList<InStoragePO> list=wd.findInStorage();
		ArrayList<OutStoragePO> list1=wd.findOutStorage();
		for (int i = 0; i <list.size(); i++) {
			if(list.get(i).getIndate().compareTo(begin)>=0&&list.get(i).getIndate().compareTo(end)<=0)
				arr.add(list.get(i));
		}
		for (int i = 0; i < wd.findOutStorage().size(); i++) {
			if(list1.get(i).getOutdate().compareTo(begin)>=0&&list1.get(i).getOutdate().compareTo(end)<=0)
				arr.add(list1.get(i));
		}
		return arr;
	}

	@SuppressWarnings("null")
	public ArrayList<Object> summarizeWarehouse() {
		// 待修改
		Calendar time = Calendar.getInstance();
		int year = time.get(Calendar.YEAR); 
		int month = time.get(Calendar.MONTH)+1; 
		int date = time.get(Calendar.DATE); 
		String date1=""+year+month+date;
		ArrayList<Object> arr = null;
		ArrayList<InStoragePO>  list=wd.findInStorage();
		ArrayList<OutStoragePO>  list1=wd.findOutStorage();
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getIndate().compareTo(date1)==0&&list.get(i).getIndate().compareTo(date1)==0)
				arr.add(list.get(i));
		}
		for (int i = 0; i < list.size(); i++) {
			if( list1.get(i).getOutdate().compareTo(date1)==0&&list1.get(i).getOutdate().compareTo(date1)==0)
				arr.add(list1.get(i));
		}
		return arr;
	}

}
