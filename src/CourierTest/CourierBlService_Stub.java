package CourierTest;
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
		
		return "2天3小时";
	}

	public ResultMessage ConsigneeinfoInput(CourierVO vo) {
		// TODO 自动生成的方法存根
		return ResultMessage.Success;
	}
    
	

}
