package ManagerTest;

import java.util.ArrayList;

import _enum.ResultMessage;
import logic.managerblservice.ManagerBlService;
import vo.EmployeeVO;

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

	public ArrayList<String> checkLogging() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage manageMember(EmployeeVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
