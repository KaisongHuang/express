package logic.senderbl;

import static org.junit.Assert.*;

import vo.HistoryVO;

public class MockSenderTest {

	
	public void test() {
		MockSender sender=new MockSender();
		
		assertEquals(new HistoryVO(null, null, null, null),sender.search(1000000000));
	}

}
