package logic.warehouseblservice;

import vo.InStorageVO;
import vo.OutStorageVO;

import java.util.ArrayList;

import _enum.ResultMessage;
import po.InStoragePO;

public interface WarehouseBlService {
	public ResultMessage importGoods(InStorageVO vo);

	public ResultMessage exportGoods(OutStorageVO vo);

	public ResultMessage setAlarm(double rate);

	public ResultMessage checkAlarm();

	public ArrayList<Object> checkWarehouse(String begin, String end);

	public ArrayList<InStoragePO> summarizeWarehouse();
	
	public ArrayList<Object> showAdjustGoods();

	public ResultMessage initWarehouse(InStorageVO vo);
	
	public ResultMessage clearWarehouse();
	
}
