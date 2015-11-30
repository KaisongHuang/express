package logic.managerblservice;

import java.util.ArrayList;

import _enum.ResultMessage;
import logic.managerbl.InstitutionVO;
import vo.EmployeeVO;

public interface ManagerBlService {
	
	public EmployeeVO findEmployee(String id);
	public ResultMessage manageMember(Object vo);
	public ResultMessage checkDocument(Object vo);
	public ResultMessage checkStatistics(Object vo);
    public ArrayList<String> checkLogging(Object vo);
    public InstitutionVO findInstitution(String id);
}
