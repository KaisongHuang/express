package logic.centrebl;

import static org.junit.Assert.*;

import org.junit.Test;

import _enum.ResultMessage;

public class MockCentreTest {
	

	@Test
	public void test() {
		ResultMessage centre1=new MockCentre().manageTransfor(null);
		ResultMessage centre2=new MockCentre().createReceive(null);
		ResultMessage centre3=new MockCentre().createPack(null);
		ResultMessage centre4=new MockCentre().createDelivery(null);
		
		assertEquals(centre1,ResultMessage.Correct);
		assertEquals(centre2,ResultMessage.Correct);
		assertEquals(centre3,ResultMessage.Correct);
		assertEquals(centre4,ResultMessage.Fail);
	}

}
