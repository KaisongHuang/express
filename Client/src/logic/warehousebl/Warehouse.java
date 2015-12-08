package logic.warehousebl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import _enum.ResultMessage;
import data.warehousedata.WarehouseData;
import logic.warehouseblservice.WarehouseBlService;
import po.InStoragePO;
import po.OutStoragePO;
import vo.InStorageVO;
import vo.OutStorageVO;

public class Warehouse implements WarehouseBlService {
	WarehouseData wd = new WarehouseData();
	private int inNum;
	private int outNum;
	private int total;

	public int getInNum() {
		return inNum;
	}

	public int getOutNum() {
		return outNum;
	}

	public int getTotal() {
		return total;
	}

	public ResultMessage importGoods(InStorageVO vo) {
		// TODO Auto-generated method stub
		ResultMessage rm;
		InStoragePO po = new InStoragePO(vo.getId(), vo.getIndate(), vo.getDestination(), vo.getWarehouseID(),
				vo.getPos_qu(), vo.getPos_pai(), vo.getPos_jia(), vo.getPos_wei(), vo.getIsCheck());
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
		OutStoragePO po = new OutStoragePO(vo.getId(), vo.getDestination(), vo.getOutdate(), vo.getWarehouseID(),
				vo.getTransportation(), vo.getTrans_id(), vo.getIsCheck());
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
		InStoragePO po = new InStoragePO(vo.getId(), vo.getIndate(), vo.getDestination(), vo.getWarehouseID(),
				vo.getPos_qu(), vo.getPos_pai(), vo.getPos_jia(), vo.getPos_wei(), vo.getIsCheck());
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
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("null")
	public ArrayList<Object> checkWarehouse(String begin, String end) {
		// TODO Auto-generated method stub
		ArrayList<Object> arr = null;
		ArrayList<InStoragePO> list = wd.findInStorage();
		ArrayList<OutStoragePO> list1 = wd.findOutStorage();
		this.inNum = 0;
		this.outNum = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getIndate().compareTo(begin) >= 0 && list.get(i).getIndate().compareTo(end) <= 0) {
				arr.add(list.get(i));
				this.inNum++;
			}
		}
		for (int i = 0; i < wd.findOutStorage().size(); i++) {
			if (list1.get(i).getOutdate().compareTo(begin) >= 0 && list1.get(i).getOutdate().compareTo(end) <= 0) {
				arr.add(list1.get(i));
				this.outNum++;
			}
		}
		this.total = this.inNum - this.outNum;
		return arr;
	}

	@SuppressWarnings("null")
	public ArrayList<InStoragePO> summarizeWarehouse() {
		// 待修改
		Calendar time = Calendar.getInstance();
		int year = time.get(Calendar.YEAR);
		int month = time.get(Calendar.MONTH) + 1;
		int date = time.get(Calendar.DATE);
		String date1 = "" + year + month + date;
		System.out.println("summarizeWarehouse()" + date1);
		ArrayList<InStoragePO> list=new ArrayList<InStoragePO>();
		try {
			list = wd.findIn(date1);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<Object> showAdjustGoods() {
		ArrayList<Object> ob = new ArrayList<Object>();
		ArrayList<InStoragePO> pre = wd.adjustInStorage();
		ArrayList<InStoragePO> post = wd.findFreeSpace();
		
		for (int i = 0; i < pre.size(); i++) {
			ob.add(pre.get(i));
			ob.add(post.get(i));
		}
		
		return ob;
	}

}
