package financeTest;

import vo.AccountVO;
import vo.PayVO;
import vo.ReceiptVO;

import java.util.ArrayList;

import _enum.Operation;
import _enum.ResultMessage;
import logic.financeblservice.FinanceBlService;

public class FinanceBlService_Stub implements FinanceBlService {
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

	public ResultMessage initAccount(AccountVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage clearAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<AccountVO> findAccount(String bankAccount) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<ReceiptVO> checkReceipt(String date, String sellingArea) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<AccountVO> checkInitInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
