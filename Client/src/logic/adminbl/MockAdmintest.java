package logic.adminbl;

import static org.junit.Assert.*;


import org.junit.Test;

import _enum.ResultMessage;

public class MockAdmintest {

	@Test
	public void test() {
		
		MockAdmin Admin1 = new MockAdmin();
		MockAdmin Admin2 = new MockAdmin();
		
		assertEquals(ResultMessage.Correct,Admin1.manageCount(null, null));
		assertEquals(null,Admin2.find(0));
	}

}
