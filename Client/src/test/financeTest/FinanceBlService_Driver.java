package test.financeTest;

import vo.AccountVO;
import vo.PayVO;

import java.util.ArrayList;

import _enum.Operation;
import _enum.ResultMessage;
import logic.financeblservice.FinanceBlService;

public class FinanceBlService_Driver {
	public void drive(FinanceBlService finance) {

		System.out.println(finance.getTotal("20150101", "20150103"));

		ResultMessage result;
		Operation op = Operation.delete;
		result = finance.createCost(new PayVO(null, null, null, null, null, 0, 0));
		if (result == ResultMessage.Success)
			System.out.println("Success!");

		result = finance.manageAccount(new AccountVO(null, 0), op);
		if (result == ResultMessage.Success)
			System.out.println("Success!");
		
		ArrayList<AccountVO> res=finance.findAccount(null);
		if(res==null)
			System.out.println("Not Found!");
		
		
	}
}
