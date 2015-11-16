package logic.senderbl;

import static org.junit.Assert.*;

import org.junit.Test;

import vo.HistoryVO;
import vo.SenderVO;

public class MockSenderTest {

	
	public void test() {
		MockSender sender=new MockSender();
		
		assertEquals(new HistoryVO(),sender.search(1000000000));
	}

}
