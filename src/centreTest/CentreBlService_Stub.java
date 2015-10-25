package centreTest;

import _enum.ResultMessage;
import logic.centreblservice.CentreBlService;
import vo.CentreArrivalVO;
import vo.CentreTransforVO;
import vo.DeliveryVO;
import vo.PackVO;

public class CentreBlService_Stub implements CentreBlService {
	
	public ResultMessage manageTranfor(CentreTransforVO vo){
		
		return ResultMessage.Error;	
		
	}
	
	public ResultMessage createReceive(CentreArrivalVO vo){
		
		return ResultMessage.Fail;
		
	}
	
	public ResultMessage createPack(PackVO vo){
		
		return ResultMessage.Success;
		
	}
	
	public ResultMessage createDelivery(DeliveryVO vo){
		
		return ResultMessage.Error;
		
	}	

}
