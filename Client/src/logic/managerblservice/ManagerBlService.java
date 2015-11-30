package logic.managerblservice;

import java.util.ArrayList;

import _enum.Opera;
import _enum.ResultMessage;

public interface ManagerBlService {
	
	public Object find(String id,Opera op);
	public ResultMessage manageMember(Object vo,Opera op);
	public ResultMessage checkDocument(Object vo);
	public ResultMessage checkStatistics(Object vo);
    public ArrayList<String> checkLogging(Object vo);
}
