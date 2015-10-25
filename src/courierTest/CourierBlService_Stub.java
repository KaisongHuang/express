package courierTest;
import po.CourierPO;
import po.SenderPO;
import vo.CourierVO;
import vo.SenderVO;
import _enum.ResultMessage;
import logic.courierblservice.CourierBlService;
public class CourierBlService_Stub implements CourierBlService{
   
	public ResultMessage OrderInput(SenderVO vo) {
		
		return ResultMessage.Success;
	}

	public double getPrice(double fee, double packing) {
		
		return 100;
	}

	public String getTime(int distance) {
		
		return "2��3Сʱ";
	}

	public ResultMessage ConsigneeinfoInput(CourierVO vo) {
		// TODO �Զ���ɵķ������
		return ResultMessage.Success;
	}
    
	

}
