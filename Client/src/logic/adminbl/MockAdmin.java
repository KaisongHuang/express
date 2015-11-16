package logic.adminbl;

import _enum.Operation;
import _enum.ResultMessage;
import vo.AdminVO;

public class MockAdmin extends Admin{
	public ResultMessage manageCount(AdminVO vo,Operation op){
		return ResultMessage.Correct;
	}
	public AdminVO find(int id){
		return null;
		
	}
}
