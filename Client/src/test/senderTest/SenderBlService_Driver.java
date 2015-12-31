package test.senderTest;

import logic.senderblservice.SenderBlService;
import vo.HistoryVO;

public class SenderBlService_Driver {
	
	public void drive(SenderBlService sender){
		
		HistoryVO result = sender.search(null);
		if(result==null){
			System.out.println("Not Found!");
		}
		
		
	}

}
