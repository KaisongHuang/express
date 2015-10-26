package ManagerTest;

import _enum.ResultMessage;
import logic.managerblservice.ManagerBlService;

public class ManagerBlService_Stub implements ManagerBlService {
	
	public ResultMessage manageMember(){
		
		return ResultMessage.Error;
		
	}
	
	public ResultMessage checkDocument(){
		
		return ResultMessage.Error;
		
	}
	
	public ResultMessage checkStatistics(){
		
		return ResultMessage.Error;
		
	}

}
