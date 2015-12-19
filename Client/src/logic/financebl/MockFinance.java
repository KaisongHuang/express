package logic.financebl;

import java.util.ArrayList;

import _enum.Operation;
import _enum.ResultMessage;
import vo.AccountVO;
import vo.PayVO;
import vo.ReceiptVO;

public class MockFinance extends Finance {
	public double getBalance() {
		return 0;
	}

	public ResultMessage createCost(PayVO vo) {
		return ResultMessage.Success;
	}

	public ArrayList<ReceiptVO> checkReceipt(String date, String sellingArea) {
		return null;
	}

	public ArrayList<Object> getTotal(String begin, String end) {
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
