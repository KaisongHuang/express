package test.warehouseTest;

import vo.CentreArrivalVO;
import vo.CentreTransforVO;
import vo.InStorageVO;
import vo.OutStorageVO;
import vo.SenderVO;

import java.util.ArrayList;

import _enum.ResultMessage;
import logic.warehouseblservice.WarehouseBlService;

public class WarehouseBlService_Stub implements WarehouseBlService{

	public ResultMessage importGoods(InStorageVO vo) {
		// TODO Auto-generated method stub
		return ResultMessage.Error;
	}

	public ResultMessage exportGoods(OutStorageVO vo) {
		// TODO Auto-generated method stub
		return ResultMessage.Error;
	}
	
	public ResultMessage initWarehouse(InStorageVO vo) {
		// TODO Auto-generated method stub
		return ResultMessage.Error;
	}

	public ResultMessage setAlarm(double rate) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage checkAlarm() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Object> checkWarehouse(String begin, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<InStorageVO> summarizeWarehouse() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage adjustGoods(String id, String qu, int pai, int jia, int wei) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Object> showAdjustGoods() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage clearWarehouse() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<CentreArrivalVO> getImport() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<CentreTransforVO> getExport() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSenderDestination(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage update(Object ob) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
