package logic.warehousebl;

import java.util.ArrayList;

import _enum.ResultMessage;
import vo.InStorageVO;
import vo.OutStorageVO;

public class MockWarehouse extends Warehouse {

	public ResultMessage importGoods(InStorageVO vo) {
		return ResultMessage.Success;
	}

	public ResultMessage exportGoods(OutStorageVO vo) {
		return ResultMessage.Success;
	}

	public ResultMessage setAlarm(double rate) {
		return ResultMessage.Success;
	}

	public ResultMessage checkAlarm() {
		System.out.println("Alarm!!!");
		return ResultMessage.Success;
	}

	public ResultMessage adjustGoods(int id, String qu, String pai, String jia, String wei) {
		return ResultMessage.Success;
	}

	public ArrayList<Object> checkWarehouse(String begin, String end) {
		return null;
	}

	public ResultMessage summarizeWarehouse(String end) {
		return ResultMessage.Success;
	}

	public ResultMessage exportSnapshot() {
		return ResultMessage.Success;
	}

	public ResultMessage initWarehouse(InStorageVO vo) {
		return ResultMessage.Success;
	}

}
