package CentreTest;

import _enum.ResultMessage;
import logic.centreblservice.CentreBlService;
import po.DeliverPO;
import vo.CentreArrivalVO;
import vo.CentreTransforVO;
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
	
	public ResultMessage createDelivery(DeliverPO vo){
		
		return ResultMessage.Error;
		
	}	

}
