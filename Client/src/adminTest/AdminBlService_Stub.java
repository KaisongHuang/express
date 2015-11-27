package adminTest;

import _enum.Operation;
import _enum.ResultMessage;
import logic.adminblservice.AdminBlService;
import vo.AdminVO;

public class AdminBlService_Stub implements AdminBlService {

	public ResultMessage manageCount(AdminVO vo, Operation op) {
		// TODO Auto-generated method stub
		return ResultMessage.Error;
	}

	public AdminVO find(int id) {
		// TODO Auto-generated method stub
		return new AdminVO(null, null, null, null);
	}

}
