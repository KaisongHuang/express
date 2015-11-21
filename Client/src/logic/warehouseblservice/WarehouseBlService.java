package logic.warehouseblservice;

import vo.InStorageVO;
import vo.OutStorageVO;

import java.util.ArrayList;

import _enum.ResultMessage;

public interface WarehouseBlService {
	public ResultMessage importGoods(InStorageVO vo);

	public ResultMessage exportGoods(OutStorageVO vo);

	public ResultMessage setAlarm(double rate);
	
	public ResultMessage checkAlarm();

	public ArrayList<Object> checkWarehouse(String begin, String end);

	public ResultMessage summarizeWarehouse();

	public ResultMessage initWarehouse(InStorageVO vo);
}
