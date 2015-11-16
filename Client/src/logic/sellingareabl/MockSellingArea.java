package logic.sellingareabl;

import vo.AcceptVO;
import vo.CarPackVO;
import vo.CarVO;
import vo.DeliverVO;
import vo.DriverVO;
import vo.ReceiptVO;
import _enum.Operation;
import _enum.ResultMessage;


public class MockSellingArea extends SellingArea{

	public ResultMessage manageCarPack(CarPackVO vo) {
		
		return ResultMessage.Correct;
	}

	public ResultMessage createReceiving(AcceptVO vo) {
		// TODO �Զ����ɵķ������
		return ResultMessage.Correct;
	}

	public ResultMessage createDelivery(DeliverVO vo) {
		// TODO �Զ����ɵķ������
		return ResultMessage.Correct;
	}

	public ResultMessage createDebitnote(ReceiptVO vo) {
		// TODO �Զ����ɵķ������
		return ResultMessage.Correct;
	}

	public ResultMessage manageCarinfo(CarVO vo, Operation op) {
		// TODO �Զ����ɵķ������
		return ResultMessage.Correct;
	}

	public CarVO findCar(int id) {
		// TODO �Զ����ɵķ������
		return null;
	}

	public ResultMessage manageDriverinfo(DriverVO vo, Operation op) {
		// TODO �Զ����ɵķ������
		return ResultMessage.Correct;
	}

	public DriverVO findDriver(int id) {
		// TODO �Զ����ɵķ������
		return null;
	}

}
