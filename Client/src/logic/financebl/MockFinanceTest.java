package logic.financebl;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import _enum.ResultMessage;
import vo.AccountVO;
import vo.FinanceVO;

public class MockFinanceTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		double balance = new MockFinance().getBalance();

		AccountVO find = new MockFinance().find(null);
		ArrayList<Object> getTotal = new MockFinance().getTotal(null, null);
		FinanceVO checkReceipt = new MockFinance().checkReceipt(null, null);

		ResultMessage createCost = new MockFinance().createCost(null);
		ResultMessage initAccount = new MockFinance().initAccount(null, 0);
		ResultMessage manageAccount = new MockFinance().manageAccount(null, null);

		assertEquals(true, balance == 0.0);
		assertEquals(find, null);
		assertEquals(getTotal, null);
		assertEquals(checkReceipt, null);
		assertEquals(createCost, ResultMessage.Success);
		assertEquals(initAccount, ResultMessage.Success);
		assertEquals(manageAccount, ResultMessage.Success);
	}

}
