package SellingareaTest;

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
    		  System.out.println("输入的信息错误");
    	  result=sellingarea.createReceiving(new AcceptVO());
    	  if(result==ResultMessage.Fail)
    		  System.out.println("信息上传失败");
    	  result=sellingarea.createDelivery(new DeliverVO());
    	  if(result==ResultMessage.Success)
    		  System.out.println("信息上传成功");
    	  result=sellingarea.createDebitnote(new ReceiptVO());
    	  if(result==ResultMessage.Success)
    		  System.out.println("信息上传成功");
    	  result=sellingarea.manageCarinfo(new CarVO(), Operation.delete);
    	  if(result==ResultMessage.Fail)
    		  System.out.println("信息上传失败");
    	  result=sellingarea.manageDriverinfo(new DriverVO(), Operation.find);
    	  if(result==ResultMessage.Error)
    		  System.out.println("输入的信息错误");
      }
}
