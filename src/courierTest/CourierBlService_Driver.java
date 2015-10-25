package courierTest;

import _enum.ResultMessage;
import vo.CourierVO;
import vo.SenderVO;
import logic.courierblservice.CourierBlService;

public class CourierBlService_Driver {
     public void drive(CourierBlService courierBlService){
    	 System.out.println(courierBlService.getPrice(10, 20));
    	 System.out.println(courierBlService.getTime(1000));
    	 ResultMessage result=courierBlService.OrderInput(new SenderVO());
    	 if(result==ResultMessage.Success)
    		 System.out.println("��������ɹ�");
         result=courierBlService.ConsigneeinfoInput(new CourierVO());
         if(result==ResultMessage.Success)
    		 System.out.println("�ռ���Ϣ����ɹ�");
     }
}