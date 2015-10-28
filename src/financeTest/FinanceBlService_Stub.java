package financeTest;

import vo.AccountVO;
import vo.FinanceVO;
import vo.PayVO;
import _enum.Operation;
import _enum.ResultMessage;
import logic.financeblservice.FinanceBlService;

public class FinanceBlService_Stub implements FinanceBlService{

	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ResultMessage createCost(PayVO vo) {
		// TODO Auto-generated method stub
		return ResultMessage.Success;
	}

	public FinanceVO getTotal(String begin, String end) {
		// TODO Auto-generated method stub
		return new FinanceVO();
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
		// TODO 自动生成的方法存根
		return null;
	}

}
