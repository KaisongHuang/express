package logic.managerblservice;

import _enum.ResultMessage;

public interface ManagerBlService {
	
	public ResultMessage manageMember();
	public ResultMessage checkDocument();
	public ResultMessage checkStatistics();

}
