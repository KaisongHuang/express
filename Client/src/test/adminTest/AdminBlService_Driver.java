package test.adminTest;



import _enum.Operation;
import _enum.ResultMessage;
import logic.adminblservice.AdminBlService;
import vo.AdminVO;

public class AdminBlService_Driver {
	
	public void drive(AdminBlService admin){
		
		AdminVO result=admin.find(null);
		if(result==null){
			System.out.println("Not Found!");
		}
		
		ResultMessage res=admin.manageCount(new AdminVO(null, null, null, null), Operation.update);
		
		if(res==ResultMessage.Error){
			System.out.println("ERROR!");
		}
		
	}

}
