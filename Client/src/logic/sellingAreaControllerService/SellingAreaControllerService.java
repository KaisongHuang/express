package logic.sellingAreaControllerService;

import vo.AcceptVO;
import vo.CarPackVO;
import vo.CarVO;
import vo.DeliverVO;
import vo.DriverVO;
import vo.ReceiptVO;
import _enum.Operation;
import _enum.ResultMessage;

public interface SellingAreaControllerService {
	public ResultMessage manageCarPack(CarPackVO vo);
	public ResultMessage createReceiving(AcceptVO vo);
	public ResultMessage createDelivery(DeliverVO vo);
	public ResultMessage createDebitnote(ReceiptVO vo);
	public ResultMessage manageCarinfo(CarVO vo,Operation op);
	public CarVO findCar(String id);
	public ResultMessage manageDriverinfo(DriverVO vo,Operation op);
	public DriverVO findDriver(String id);
}
