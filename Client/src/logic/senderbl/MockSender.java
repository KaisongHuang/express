package logic.senderbl;

import vo.HistoryVO;
import vo.SenderVO;

public class MockSender extends Sender{
	HistoryVO historyVO;
	
	public MockSender(){
		
	}
	public HistoryVO search(int id) {
		historyVO=new HistoryVO();
		return historyVO;
	}
}
