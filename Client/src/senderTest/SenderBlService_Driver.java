package senderTest;

import logic.senderblservice.SenderBlService;
import vo.HistoryVO;
import vo.SenderVO;

public class SenderBlService_Driver {
	
	public void drive(SenderBlService sender){
		
		HistoryVO result = sender.search(0);
		if(result==null){
			System.out.println("Not Found!");
		}
		
		
	}

}
