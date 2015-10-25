package financeTest;

import vo.CountVO;
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
		return null;
	}

	public ResultMessage managerCount(CountVO vo, Operation op) {
		// TODO Auto-generated method stub
		return ResultMessage.Success;
	}

}
