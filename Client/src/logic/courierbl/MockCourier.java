package logic.courierbl;

import _enum.ResultMessage;
import vo.CourierVO;
import vo.SenderVO;

public class MockCourier extends Courier {
	
	public ResultMessage OrderInput(SenderVO vo){
		return ResultMessage.Correct;
	}
	public double MockgetPrice(double f,double p){
		return (Double) null;
		
	}
	public String MockgetTime(long distance){
		return null;
		
	}
	public ResultMessage ConsigneeinfoInput(CourierVO vo){
		return ResultMessage.Correct;
		
	}

}
	
	
	

