package managerTest;

import _enum.ResultMessage;
import logic.managerblservice.ManagerBlService;

public class ManagerBlService_Driver {
	
	public void drive(ManagerBlService manager){
		
        ResultMessage result;
		
		result=manager.checkDocument();
		if(result==ResultMessage.Error){
			System.out.println("ERROR!");
		}
		
		result=manager.checkStatistics();
		if(result==ResultMessage.Error){
			System.out.println("ERROR!");
		}
		
		result=manager.manageMember();
		if(result==ResultMessage.Error){
			System.out.println("ERROR!");
		}
	}

}
