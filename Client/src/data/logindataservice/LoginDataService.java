package data.logindataservice;

import po.EmployeePO;
import vo.AdminVO;

public interface LoginDataService {

	public EmployeePO login(AdminVO vo);
}
