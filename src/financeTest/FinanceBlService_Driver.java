package financeTest;

import vo.CountVO;
import vo.PayVO;
import _enum.Operation;
import _enum.ResultMessage;
import logic.financeblservice.FinanceBlService;

public class FinanceBlService_Driver {
	public void drive(FinanceBlService finance) {
		System.out.println(finance.getBalance());

		System.out.println(finance.getTotal("20150101", "20150103"));

		ResultMessage result;
		Operation op = Operation.delete;
		result = finance.createCost(new PayVO());
		if (result == ResultMessage.Success)
			System.out.println("Success!");

		result = finance.managerCount(new CountVO(), op);
		if (result == ResultMessage.Success)
			System.out.println("Success!");
	}
}
