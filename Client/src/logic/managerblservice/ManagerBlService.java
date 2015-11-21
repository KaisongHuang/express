package logic.managerblservice;

import java.util.ArrayList;

import _enum.ResultMessage;

public interface ManagerBlService {
	
	public ResultMessage manageMember(Object vo);
	public ResultMessage checkDocument(Object vo);
	public ResultMessage checkStatistics(Object vo);
    public ArrayList<String> checkLogging(Object vo);

}
