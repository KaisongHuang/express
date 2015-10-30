package logic.financeblservice;

import vo.AccountVO;
import vo.FinanceVO;
import vo.PayVO;
import _enum.Operation;
import _enum.ResultMessage;

public interface FinanceBlService {
	public double getBalance();

	public ResultMessage createCost(PayVO vo);

	public FinanceVO getTotal(String begin, String end);

	public ResultMessage manageAccount(AccountVO vo, Operation op);
	public AccountVO find (String bankAccount);
}
