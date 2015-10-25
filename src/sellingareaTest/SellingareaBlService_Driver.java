package sellingareaTest;

import vo.AcceptVO;
import vo.CarPackVO;
import vo.CarVO;
import vo.DeliverVO;
import vo.DriverVO;
import vo.ReceiptVO;
import _enum.Operation;
import _enum.ResultMessage;
import logic.sellingareablservice.SellingareaBlService;

public class SellingareaBlService_Driver {
      public void drive(SellingareaBlService sellingarea){
    	  ResultMessage result=sellingarea.manageCarPack(new CarPackVO() );
    	  if(result==ResultMessage.Error)
    		  System.out.println("�������Ϣ����");
    	  result=sellingarea.createReceiving(new AcceptVO());
    	  if(result==ResultMessage.Fail)
    		  System.out.println("��Ϣ�ϴ�ʧ��");
    	  result=sellingarea.createDelivery(new DeliverVO());
    	  if(result==ResultMessage.Success)
    		  System.out.println("��Ϣ�ϴ��ɹ�");
    	  result=sellingarea.createDebitnote(new ReceiptVO());
    	  if(result==ResultMessage.Success)
    		  System.out.println("��Ϣ�ϴ��ɹ�");
    	  result=sellingarea.manageCarinfo(new CarVO(), Operation.delete);
    	  if(result==ResultMessage.Fail)
    		  System.out.println("��Ϣ�ϴ�ʧ��");
    	  result=sellingarea.manageDriverinfo(new DriverVO(), Operation.find);
    	  if(result==ResultMessage.Error)
    		  System.out.println("�������Ϣ����");
      }
}
