package adminTest;



import _enum.Operation;
import _enum.ResultMessage;
import logic.adminblservice.AdminBlService;
import vo.AdminVO;

public class AdminBlService_Driver {
	
	public void drive(AdminBlService admin){
		
		AdminVO result=admin.find(0);
		if(result==null){
			System.out.println("Not Found!");
		}
		
		ResultMessage res=admin.manageCount(new AdminVO(0, null, null, null), Operation.update);
		
		if(res==ResultMessage.Error){
			System.out.println("ERROR!");
		}
		
	}

}
