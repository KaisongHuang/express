package logic.sellingareabl;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import _enum.ResultMessage;
import vo.CarPackVO;

public class MockSellingAreaTest {

	@Test
	public void test() {
	    SellingArea sellingArea=new SellingArea();
		ArrayList<String> list=new ArrayList();
		list.add("1000000000");
		list.add("1000000001");
		CarPackVO vo = new CarPackVO("20151220","0250000000000000001","1","2","0250000001","0250000002",list,12.0,0);
//	    assertEquals(ResultMessage.Correct,sellingArea.createDebitnote(null));
//	    assertEquals(ResultMessage.Correct,sellingArea.createDelivery(null));
//	    assertEquals(ResultMessage.Correct,sellingArea.createReceiving(null));
	    assertEquals(ResultMessage.Correct,sellingArea.manageCarPack(vo));

//	    assertEquals(ResultMessage.Correct,sellingArea.manageCarinfo(null,null));
//	    assertEquals(null,sellingArea.findCar(1000000000));
//	    assertEquals(ResultMessage.Correct,sellingArea.manageDriverinfo(null,null));
//	    assertEquals(null,sellingArea.findDriver(1000000000));

	}

}
