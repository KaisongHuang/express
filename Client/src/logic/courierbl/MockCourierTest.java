package logic.courierbl;

import static org.junit.Assert.*;

import org.junit.Test;

import _enum.ResultMessage;

public class MockCourierTest {

	
	@Test
	public void test() {
		MockCourier Courier1 = new MockCourier();
		MockCourier Courier2 = new MockCourier();
		MockCourier Courier3 = new MockCourier();
		MockCourier Courier4 = new MockCourier();
		assertEquals(ResultMessage.Correct,Courier1.OrderInput(null));
		assertEquals(null,Courier2.MockgetPrice(0,0));
		assertEquals(null,Courier3.MockgetTime(0));
		assertEquals(ResultMessage.Correct,Courier4. ConsigneeinfoInput(null));
	}

}
