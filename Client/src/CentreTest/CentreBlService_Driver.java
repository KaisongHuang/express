package CentreTest;

import _enum.ResultMessage;
import logic.centreblservice.CentreBlService;
import vo.CentreArrivalVO;
import vo.CentreTransforVO;
import vo.PackVO;

public class CentreBlService_Driver {
	
	public void drive(CentreBlService centre){
		
		ResultMessage result;
		
		
		result=centre.createPack(new PackVO());
		if(result==ResultMessage.Error){
			System.out.println("ERROR!");
		}
		
		result=centre.createReceive(new CentreArrivalVO(0, null, 0, null, null));
		if(result==ResultMessage.Error){
			System.out.println("ERROR!");
		}
		
		result=centre.manageTranfor(new CentreTransforVO(null, null, 0, 0, null, null, 0, null, null, 0));
		if(result==ResultMessage.Error){
			System.out.println("ERROR!");
		}
		
		
	}

}
