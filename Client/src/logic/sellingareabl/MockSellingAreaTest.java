package logic.sellingareabl;

import static org.junit.Assert.*;

import org.junit.Test;

import _enum.ResultMessage;

public class MockSellingAreaTest {

	@Test
	public void test() {
		MockSellingArea sellingArea=new MockSellingArea();
	    assertEquals(ResultMessage.Correct,sellingArea.createDebitnote(null));
	    assertEquals(ResultMessage.Correct,sellingArea.createDelivery(null));
	    assertEquals(ResultMessage.Correct,sellingArea.createReceiving(null));
	    assertEquals(ResultMessage.Correct,sellingArea.manageCarPack(null));
	   
	    assertEquals(ResultMessage.Correct,sellingArea.manageCarinfo(null,null));
	    assertEquals(null,sellingArea.findCar(1000000000));
	    assertEquals(ResultMessage.Correct,sellingArea.manageDriverinfo(null,null));
	    assertEquals(null,sellingArea.findDriver(1000000000));
	    
	}

}
