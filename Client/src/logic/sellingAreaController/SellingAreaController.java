package logic.sellingAreaController;

import vo.AcceptVO;
import vo.CarPackVO;
import vo.CarVO;
import vo.DeliverVO;
import vo.DriverVO;
import vo.ReceiptVO;
import _enum.Operation;
import _enum.ResultMessage;
import logic.sellingAreaControllerService.SellingAreaControllerService;
import logic.sellingareabl.SellingArea;

public class SellingAreaController implements SellingAreaControllerService{
      SellingArea sa=new SellingArea();

	public ResultMessage manageCarPack(CarPackVO vo) {
		
		return sa.manageCarPack(vo);
	}

	public ResultMessage createReceiving(AcceptVO vo) {
		// TODO �Զ����ɵķ������
		return sa.createReceiving(vo);
	}

	public ResultMessage createDelivery(DeliverVO vo) {
		// TODO �Զ����ɵķ������
		return sa.createDelivery(vo);
	}

	public ResultMessage createDebitnote(ReceiptVO vo) {
		// TODO �Զ����ɵķ������
		return sa.createDebitnote(vo);
	}

	public ResultMessage manageCarinfo(CarVO vo, Operation op) {
		// TODO �Զ����ɵķ������
		return sa.manageCarinfo(vo, op);
	}

	public CarVO findCar(int id) {
		// TODO �Զ����ɵķ������
		return sa.findCar(id);
	}

	public ResultMessage manageDriverinfo(DriverVO vo, Operation op) {
		// TODO �Զ����ɵķ������
		return sa.manageDriverinfo(vo, op);
	}

	public DriverVO findDriver(int id) {
		// TODO �Զ����ɵķ������
		return sa.findDriver(id);
	}
      
}
