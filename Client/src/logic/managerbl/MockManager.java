package logic.managerbl;

import java.util.ArrayList;

import _enum.ResultMessage;
import vo.EmployeeVO;

public class MockManager extends Manager {
	
	EmployeeVO employeevo;
	
	public EmployeeVO find(int id){
		
		return null;
		
	}
	
	public ResultMessage managerMember(){
		
		return ResultMessage.Error;
		
	}
	
	public ResultMessage checkDocument(){
		
		return ResultMessage.Correct;
		
	}
	
	public ResultMessage checkStatistics(){
		
		return ResultMessage.Exit;
		
	}
	
	public ArrayList<String> checkLogging(){
		
		return null;
		
	}
	
	public void endManager(){
		
	}

}
