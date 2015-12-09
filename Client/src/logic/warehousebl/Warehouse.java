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
		try {
			return wd.setAlarm(rate);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ResultMessage checkAlarm() {

		try {
			return wd.checkAlarm();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<Object> checkWarehouse(String begin, String end) {
		// TODO Auto-generated method stub
		ArrayList<Object> arr = new ArrayList<Object>();
		ArrayList<InStoragePO> list = new ArrayList<InStoragePO>();
		ArrayList<OutStoragePO> list1 = new ArrayList<OutStoragePO>();

		try {
			list = wd.findIn(begin, end);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			list1 = wd.findOut(begin, end);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 计算该时间区间内的库存数量
		inNum = list.size();
		outNum = list1.size();
		total = inNum - outNum;

		for (int i = 0; i < list.size(); i++)
			arr.add(list.get(i));

		for (int i = 0; i < list1.size(); i++)
			arr.add(list1.get(i));

		return arr;
	}

	public ArrayList<InStoragePO> summarizeWarehouse() {
		Calendar time = Calendar.getInstance();
		int year = time.get(Calendar.YEAR);
		int month = time.get(Calendar.MONTH) + 1;
		int day = time.get(Calendar.DATE);

		String date = "";
		if (month >= 1 && month <= 9)
			date = "" + year + "0" + month + day;
		else
			date = "" + year + month + day;

		System.out.println("summarizeWarehouse()" + date);
		ArrayList<InStoragePO> list = new ArrayList<InStoragePO>();
		try {
			list = wd.summarize(date);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<Object> showAdjustGoods() {
		ArrayList<Object> ob = new ArrayList<Object>();
		ArrayList<InStoragePO> pre = new ArrayList<InStoragePO>();
		ArrayList<InStoragePO> post = new ArrayList<InStoragePO>();
		try {
			pre = wd.adjust();
		} catch (RemoteException e1) {
			e1.printStackTrace();
		}
		try {
			post = wd.findFreeSpace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < pre.size(); i++) {
			ob.add(pre.get(i));
			ob.add(post.get(i));
		}

		return ob;
	}

}
