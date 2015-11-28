package courierTest;
import vo.CourierVO;
import vo.SenderVO;
import _enum.ResultMessage;
import logic.courierblservice.CourierBlService;
import po.DistanceAndFee;
public class CourierBlService_Stub implements CourierBlService{
   
	public ResultMessage OrderInput(SenderVO vo) {
		
		return ResultMessage.Success;
	}

	public double getPrice(double fee, double packing) {
		
		return 100;
	}

	public String getTime(double distance) {
		
		return "2��3Сʱ";
	}

	public ResultMessage ConsigneeinfoInput(CourierVO vo) {
		// TODO �Զ���ɵķ������
		return ResultMessage.Success;
	}

	public ResultMessage OrderInput(SenderVO vo, DistanceAndFee daf) {
		// TODO Auto-generated method stub
		return null;
	}
    
	

}
