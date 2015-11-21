package logic.financeblservice;

import vo.AccountVO;
import vo.PayVO;

import java.util.ArrayList;

import _enum.Operation;
import _enum.ResultMessage;

public interface FinanceBlService {
	public double getBalance();

	public ResultMessage createCost(PayVO vo);

	public ArrayList<Object> getTotal(String begin, String end);

	public ResultMessage manageAccount(AccountVO vo, Operation op);
	public AccountVO find (String bankAccount);
}
