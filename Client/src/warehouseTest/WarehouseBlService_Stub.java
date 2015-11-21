package warehouseTest;

import vo.InStorageVO;
import vo.OutStorageVO;

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

	public ResultMessage setAlarm() {
		// TODO Auto-generated method stub
		return ResultMessage.Error;
	}

	public ResultMessage checkWarehouse(int begin, int end) {
		// TODO Auto-generated method stub
		return ResultMessage.Error;
	}

	public ResultMessage summarizeWarehouse(int end) {
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

	public ArrayList<Object> summarizeWarehouse() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage adjustGoods(int id, String qu, String pai, String jia, String wei) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
