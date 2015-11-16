package logic.courierbl;

import static org.junit.Assert.*;

import org.junit.Test;

import _enum.ResultMessage;

public class MockCourierTest {

	
	
	@Test
	public void test() {
		ResultMessage Courier1 = new MockCourier().OrderInput(null);
		double Courier2 = new MockCourier().MockgetPrice(0,0);
		String Courier3 = new MockCourier().MockgetTime(0);
		ResultMessage Courier4 = new MockCourier().ConsigneeinfoInput(null);
		assertEquals(ResultMessage.Correct,Courier1);
		assertEquals(0.0==Courier2,true);
		assertEquals(null,Courier3);
		assertEquals(ResultMessage.Correct,Courier4);
	}

}
