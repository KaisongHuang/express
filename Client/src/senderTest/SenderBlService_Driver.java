package senderTest;

import logic.senderblservice.SenderBlService;

import vo.SenderVO;

public class SenderBlService_Driver {
	
	public void drive(SenderBlService sender){
		
		SenderVO result = sender.search(0);
		if(result==null){
			System.out.println("Not Found!");
		}
		
		
	}

}
