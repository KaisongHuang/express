package logic.managerblservice;

import java.util.ArrayList;

import _enum.ResultMessage;
import vo.EmployeeVO;

public interface ManagerBlService {
	
	public EmployeeVO find(int id);
	public ResultMessage manageMember(Object vo);
	public ResultMessage checkDocument(Object vo);
	public ResultMessage checkStatistics(Object vo);
    public ArrayList<String> checkLogging(Object vo);

}
