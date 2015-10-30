package logic.adminblservice;

import _enum.Operation;
import _enum.ResultMessage;
import vo.AdminVO;

public interface AdminBlService {
	
	public AdminVO find(int id);
	public ResultMessage manageCount(AdminVO vo,Operation op);

}
