package logic.sellingareabl;

import vo.AcceptVO;
import vo.CarPackVO;
import vo.CarVO;
import vo.DeliverVO;
import vo.DriverVO;
import vo.ReceiptVO;
import _enum.Operation;
import _enum.ResultMessage;
import logic.sellingareablservice.SellingareaBlService;

public class SellingArea implements SellingareaBlService{

	public ResultMessage manageCarPack(CarPackVO vo) {
		// TODO �Զ����ɵķ������
		return null;
	}

	public ResultMessage createReceiving(AcceptVO vo) {
		// TODO �Զ����ɵķ������
		return null;
	}

	public ResultMessage createDelivery(DeliverVO vo) {
		// TODO �Զ����ɵķ������
		return null;
	}

	public ResultMessage createDebitnote(ReceiptVO vo) {
		// TODO �Զ����ɵķ������
		return null;
	}

	public ResultMessage manageCarinfo(CarVO vo, Operation op) {
		// TODO �Զ����ɵķ������
		return null;
	}

	public CarVO findCar(int id) {
		// TODO �Զ����ɵķ������
		return null;
	}

	public ResultMessage manageDriverinfo(DriverVO vo, Operation op) {
		// TODO �Զ����ɵķ������
		return null;
	}

	public DriverVO findDriver(int id) {
		// TODO �Զ����ɵķ������
		return null;
	}

}
