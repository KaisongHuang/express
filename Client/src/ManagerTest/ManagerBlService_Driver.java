package ManagerTest;

import _enum.ResultMessage;
import logic.managerblservice.ManagerBlService;

public class ManagerBlService_Driver {
	
	public void drive(ManagerBlService manager){
		
        ResultMessage result;
		
		result=manager.checkDocument(null);
		if(result==ResultMessage.Error){
			System.out.println("ERROR!");
		}
		
		result=manager.checkStatistics(result);
		if(result==ResultMessage.Error){
			System.out.println("ERROR!");
		}
		
		result=manager.manageMember(null);
		if(result==ResultMessage.Error){
			System.out.println("ERROR!");
		}
	}

}
