package logic.financeblservice;

import vo.CountVO;
import vo.FinanceVO;
import vo.PayVO;
import _enum.Operation;
import _enum.ResultMessage;

public interface FinanceBlService {
	public double getBalance();

	public ResultMessage createCost(PayVO vo);

	public FinanceVO getTotal(String begin, String end);

	public ResultMessage managerCount(CountVO vo, Operation op);
}
