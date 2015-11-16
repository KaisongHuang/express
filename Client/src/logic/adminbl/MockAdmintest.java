package logic.adminbl;

import static org.junit.Assert.*;

import org.junit.Test;

import _enum.ResultMessage;
import vo.AdminVO;

public class MockAdmintest {

	@Test
	public void test() {
		
		ResultMessage Admin1 = new MockAdmin().manageCount(null, null );
		AdminVO Admin2 = new MockAdmin().find(0);
		
		assertEquals(Admin1,ResultMessage.Correct);
		
		assertEquals(Admin2,null);
	}

}
