package logic.warehousebl;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import _enum.ResultMessage;
import vo.InStorageVO;
import vo.OutStorageVO;

public class MockWarehouseTest {

	@Test
	public void test() {
		ResultMessage warehouse1 = new MockWarehouse()
				.importGoods(new InStorageVO(0, null, null,null, 0, 0, 0, 0, 0));
		ResultMessage warehouse2 = new MockWarehouse().exportGoods(new OutStorageVO(0, null, null,null, null, 0, 0));
		ResultMessage warehouse3 = new MockWarehouse().setAlarm(50);
		ResultMessage warehouse4 = new MockWarehouse().checkAlarm();
		ResultMessage warehouse5 = new MockWarehouse().adjustGoods(1000000000, null, null, null, null);
		ArrayList<Object> warehouse6 = new MockWarehouse().checkWarehouse("20150101", "20150103");
		ResultMessage warehouse7 = new MockWarehouse().summarizeWarehouse("12:10");
		ResultMessage warehouse8 = new MockWarehouse().exportSnapshot();
		ResultMessage warehouse9 = new MockWarehouse()
				.initWarehouse(new InStorageVO(0, null, null,null, 0, 0, 0, 0, 0));

		assertEquals(warehouse1, ResultMessage.Success);
		assertEquals(warehouse2, ResultMessage.Success);
		assertEquals(warehouse3, ResultMessage.Success);
		assertEquals(warehouse4, ResultMessage.Success);
		assertEquals(warehouse5, ResultMessage.Success);
		assertEquals(warehouse6, ResultMessage.Success);
		assertEquals(warehouse7, ResultMessage.Success);
		assertEquals(warehouse8, ResultMessage.Success);
		assertEquals(warehouse9, ResultMessage.Success);

	}

}
