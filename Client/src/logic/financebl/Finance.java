package logic.financebl;

import _enum.Operation;
import _enum.ResultMessage;
import logic.financeblservice.FinanceBlService;
import vo.AccountVO;
import vo.FinanceVO;
import vo.PayVO;

public class Finance implements FinanceBlService{

	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ResultMessage createCost(PayVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	public FinanceVO getTotal(String begin, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage manageAccount(AccountVO vo, Operation op) {
		// TODO Auto-generated method stub
		return null;
	}

	public AccountVO find(String bankAccount) {
		// TODO Auto-generated method stub
		return null;
	}

}
