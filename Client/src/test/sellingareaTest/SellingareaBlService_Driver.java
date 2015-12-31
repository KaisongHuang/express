package test.sellingareaTest;

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
    		  System.out.println("锟斤拷锟斤拷锟斤拷锟较拷锟斤拷锟�");
    	  result=sellingarea.createReceiving(new AcceptVO());
    	  if(result==ResultMessage.Fail)
    		  System.out.println("锟斤拷息锟较达拷失锟斤拷");
    	  result=sellingarea.createDelivery(new DeliverVO());
    	  if(result==ResultMessage.Success)
    		  System.out.println("锟斤拷息锟较达拷锟缴癸拷");
    	  result=sellingarea.createDebitnote(new ReceiptVO());
    	  if(result==ResultMessage.Success)
    		  System.out.println("锟斤拷息锟较达拷锟缴癸拷");
    	  result=sellingarea.manageCarinfo(new CarVO(), Operation.delete);
    	  if(result==ResultMessage.Fail)
    		  System.out.println("锟斤拷息锟较达拷失锟斤拷");
    	  result=sellingarea.manageDriverinfo(new DriverVO(), Operation.delete);
    	  if(result==ResultMessage.Error)
    		  System.out.println("锟斤拷锟斤拷锟斤拷锟较拷锟斤拷锟�");
    	  
    	  CarVO resCar=sellingarea.findCar(null);
    	  if(resCar==null)
    		  System.out.println("Not Found!");
    	  
    	  DriverVO resDriver=sellingarea.findDriver(null);
    	  if(resDriver==null)
    		  System.out.println("Not Found!");
      }
}
