package logic.loginbl;

import java.rmi.RemoteException;

import data.datafactory.DataFactory;
import data.logindata.LoginData;
import data.logindataservice.LoginDataService;
import logic.loginblService.LoginBlService;
import po.AdminPO;
import po.EmployeePO;
import vo.AdminVO;
import vo.EmployeeVO;

public class Login implements LoginBlService{
    AdminPO po;
    LoginDataService loginData;
    public Login(){
    	loginData=DataFactory.getLoginDataService();
    }
	public EmployeeVO login(AdminVO vo) {
		
		po=new AdminPO(vo.getId(),vo.getName(),vo.getPassword(),vo.getRole());
		EmployeePO ep=null;
		EmployeeVO ev=null;
		try {
			ep=loginData.login(po);
            if(ep!=null)
			  ev=new EmployeeVO(ep.getEmployeeID(),ep.getEmployeeName(),ep.getEmployeeAging(),ep.getEmployeePosition(),ep.getTimeOfWorking(),ep.getBelongToWho());
            else
            	return null;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return ev;
	}

}
