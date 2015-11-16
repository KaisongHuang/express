package logic.financebl;

import _enum.Operation;
import _enum.ResultMessage;
import vo.AccountVO;
import vo.FinanceVO;
import vo.PayVO;

public class MockFinance extends Finance {
	public double getBalance() {
		return 0;
	}

	public ResultMessage createCost(PayVO vo) {
		return ResultMessage.Success;
	}

	public FinanceVO checkReceipt(String date, String sellingArea) {
		return null;
	}

	public FinanceVO getTotal(String begin, String end) {
		return null;
	}

	public ResultMessage initAccount(String Account, int Money) {
		return ResultMessage.Success;
	}

	public ResultMessage manageAccount(AccountVO vo, Operation op) {
		return ResultMessage.Success;
	}

	public AccountVO find(String bankAccount) {
		return null;
	}

}
