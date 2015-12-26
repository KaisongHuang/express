package logic.warehouseblservice;

import vo.CentreArrivalVO;
import vo.CentreTransforVO;
import vo.InStorageVO;
import vo.OutStorageVO;
import vo.SenderVO;

import java.util.ArrayList;

import _enum.ResultMessage;

public interface WarehouseBlService {
	public ResultMessage update(Object ob);

	public ResultMessage importGoods(InStorageVO vo);

	public ResultMessage exportGoods(OutStorageVO vo);

	public ResultMessage setAlarm(double rate);

	public ResultMessage checkAlarm();

	public ArrayList<Object> checkWarehouse(String begin, String end);

	public ArrayList<InStorageVO> summarizeWarehouse();

	public ArrayList<Object> showAdjustGoods();

	public ResultMessage initWarehouse(InStorageVO vo);

	public ResultMessage clearWarehouse();

	public ArrayList<CentreArrivalVO> getImport();

	public ArrayList<CentreTransforVO> getExport();

	public String getSenderDestination(String id);
}
