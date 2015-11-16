package logic.managerbl;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import _enum.ResultMessage;
import vo.EmployeeVO;

public class MockManagerTest {

	@Test
	public void test() {

		ResultMessage manager1=new MockManager().checkDocument();
		ResultMessage manager2=new MockManager().checkStatistics();
		ResultMessage manager3=new MockManager().managerMember();
		EmployeeVO manager4=new MockManager().find(1000000000);
		ArrayList<String> manager5=new MockManager().checkLogging();
		
		assertEquals(manager1,ResultMessage.Correct);
		assertEquals(manager2,ResultMessage.Exit);
		assertEquals(manager3,ResultMessage.Error);
		assertEquals(manager4,null);
		assertEquals(manager5,null);

		
	}

}
