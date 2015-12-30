package test.CentreTest;

import _enum.ResultMessage;
import logic.centreblservice.CentreBlService;
import po.DeliverPO;
import vo.CentreArrivalVO;
import vo.CentreTransforVO;
import vo.CentrePackVO;

public class CentreBlService_Stub implements CentreBlService {
	
	public ResultMessage manageTranfor(CentreTransforVO vo){
		
		return ResultMessage.Error;	
		
	}
	
	public ResultMessage createReceive(CentreArrivalVO vo){
		
		return ResultMessage.Fail;
		
	}
	
	public ResultMessage createPack(CentrePackVO vo){
		
		return ResultMessage.Success;
		
	}
	
	public ResultMessage createDelivery(DeliverPO vo){
		
		return ResultMessage.Error;
		
	}	

}
