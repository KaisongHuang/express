package logic.warehouseblservice;

import vo.InStorageVO;
import vo.OutStorageVO;

import java.util.ArrayList;

import _enum.ResultMessage;

public interface WarehouseBlService {
	public ResultMessage importGoods(InStorageVO vo);

	public ResultMessage exportGoods(OutStorageVO vo);
	
	public ResultMessage adjustGoods(String id,String qu,int pai,int jia,int wei);

	public ResultMessage setAlarm(double rate);
	
	public ResultMessage checkAlarm();

	public ArrayList<Object> checkWarehouse(String begin, String end);

	public ArrayList<Object> summarizeWarehouse();

	public ResultMessage initWarehouse(InStorageVO vo);
}
