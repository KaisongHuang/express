package logic.warehouseblservice;

import vo.InStorageVO;
import vo.OutStorageVO;
import _enum.ResultMessage;

public interface WarehouseBlService {
	public ResultMessage importGoods(InStorageVO vo);

	public ResultMessage exportGoods(OutStorageVO vo);

	public ResultMessage setAlarm(double rate);
	
	public ResultMessage checkAlarm();

	public ResultMessage checkWarehouse(int begin, int end);

	public ResultMessage summarizeWarehouse(int end);

	public ResultMessage initWarehouse(InStorageVO vo);
}
