package CentreTest;

import _enum.ResultMessage;
import logic.centreblservice.CentreBlService;
import vo.CentreArrivalVO;
import vo.CentreTransforVO;
import vo.CentrePackVO;

public class CentreBlService_Driver {
	
	public void drive(CentreBlService centre){
		
		ResultMessage result;
		
		
		result=centre.createPack(new CentrePackVO(null, null, null, null, null, null, null, 0, 0));
		if(result==ResultMessage.Error){
			System.out.println("ERROR!");
		}
		
		result=centre.createReceive(new CentreArrivalVO(null, null, null, null, null, 0));
		if(result==ResultMessage.Error){
			System.out.println("ERROR!");
		}
		
		result=centre.manageTranfor(new CentreTransforVO(null, null, null, null, null, null, null, null, null, 0, 0));
		if(result==ResultMessage.Error){
			System.out.println("ERROR!");
		}
		
		
	}

}
