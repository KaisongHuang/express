package test.sellingareaTest;
import vo.AcceptVO;
import vo.CarPackVO;
import vo.CarVO;
import vo.DeliverVO;
import vo.DriverVO;
import vo.ReceiptVO;
import _enum.Operation;
import _enum.ResultMessage;
import logic.sellingareablservice.*;
public class SellingareaBlService_Stub implements SellingareaBlService{

	public ResultMessage manageCarPack(CarPackVO vo) {
		
		return ResultMessage.Error;
	}

	public ResultMessage createReceiving(AcceptVO vo) {
		
		return ResultMessage.Fail;
	}

	public ResultMessage createDelivery(DeliverVO vo) {
		
		return ResultMessage.Success;
	}

	public ResultMessage createDebitnote(ReceiptVO vo) {
		
		return ResultMessage.Success;
	}

	public ResultMessage manageCarinfo(CarVO vo, Operation op) {
		
		return ResultMessage.Fail;
	}

	public ResultMessage manageDriverinfo(DriverVO vo, Operation op) {
		
		return ResultMessage.Error;
	}

	public CarVO findCar(String id) {
		// TODO Auto-generated method stub
		return new CarVO();
	}

	public DriverVO findDriver(String id) {
		// TODO Auto-generated method stub
		return new DriverVO();
	}

	public double getFee(String city1, String city2, String type, int count) {
		// TODO Auto-generated method stub
		return 0;
	}

}
