package financeTest;

import vo.AccountVO;
import vo.FinanceVO;
import vo.PayVO;

import java.util.ArrayList;

import _enum.Operation;
import _enum.ResultMessage;
import logic.financeblservice.FinanceBlService;
import po.ReceiptPO;

public class FinanceBlService_Stub implements FinanceBlService{
	public ResultMessage createCost(PayVO vo) {
		// TODO Auto-generated method stub
		return ResultMessage.Success;
	}

	public ArrayList<Object> getTotal(String begin, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage managerAccount(AccountVO vo, Operation op) {
		// TODO Auto-generated method stub
		return ResultMessage.Success;
	}

	public AccountVO find(String bankAccount) {
		// TODO Auto-generated method stub
		return new AccountVO(null, 0);
	}

	public ResultMessage manageAccount(AccountVO vo, Operation op) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage initAccount(String Account, double Money) {
		// TODO Auto-generated method stub
		return null;
	}

	public AccountVO findAccount(String bankAccount) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<ReceiptPO> checkReceipt(String date, String sellingArea) {
		// TODO Auto-generated method stub
		return null;
	}

}
