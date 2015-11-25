package logic.centrebl;

import _enum.ResultMessage;
import vo.CentreArrivalVO;
import vo.CentreTransforVO;
import vo.DeliverVO;
import vo.PackVO;

public class MockCentre extends Centre {
	
//	CentreArrivalVO centrearrivalVO;
//	CentreTransforVO centretransforVO;
//	PackVO packVO;
//	DeliveryVO deliveryVO;	
	
	public ResultMessage manageTransfor(CentreTransforVO vo){	
		
		return ResultMessage.Correct;
		
	}
	
	public ResultMessage createReceive(CentreArrivalVO vo){
		
		return ResultMessage.Correct;
		
	}
	
	public ResultMessage createPack(PackVO vo){
		
		return ResultMessage.Correct;
		
	}
	
	public ResultMessage createDelivery(DeliverVO vo){
		
		return ResultMessage.Fail;
		
	}
	
	public void endCentre(){		
		
		
	}

}
