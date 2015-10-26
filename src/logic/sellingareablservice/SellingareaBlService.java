package logic.sellingareablservice;

import _enum.Operation;
import _enum.ResultMessage;
import po.AcceptPO;
import po.CarPO;
import po.CarPackPO;
import po.DeliverPO;
import po.DriverPO;
import po.ReceiptPO;
import vo.AcceptVO;
import vo.CarPackVO;
import vo.CarVO;
import vo.DeliverVO;
import vo.DriverVO;
import vo.ReceiptVO;

public interface SellingareaBlService {
	
	
	public ResultMessage manageCarPack(CarPackVO vo);
	public ResultMessage createReceiving(AcceptVO vo);
	public ResultMessage createDelivery(DeliverVO vo);
	public ResultMessage createDebitnote(ReceiptVO vo);
	public ResultMessage manageCarinfo(CarVO vo,Operation op);
	public CarVO findCar(int id);
	public ResultMessage manageDriverinfo(DriverVO vo,Operation op);
	public DriverVO findDriver(int id);
}
