package logic.managerblservice;

import java.util.ArrayList;

import _enum.ResultMessage;
import vo.EmployeeVO;

public interface ManagerBlService {
	
	public ResultMessage manageMember(EmployeeVO vo);
	public ResultMessage checkDocument();
	public ResultMessage checkStatistics();
    public ArrayList<String> checkLogging();

}
