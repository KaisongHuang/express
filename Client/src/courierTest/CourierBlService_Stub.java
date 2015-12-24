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
		
		return "00:00:00";
	}

	public ResultMessage ConsigneeinfoInput(CourierVO vo) {
		return ResultMessage.Success;
	}

	public ResultMessage OrderInput(SenderVO vo, DistanceAndFee daf) {
		// TODO Auto-generated method stub
		return null;
	}

	public double getPrice(String type, String city1, String city2, double packing) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getTime(String start, String end) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getMoney() {
		// TODO Auto-generated method stub
		return 0;
	}
    
	

}
