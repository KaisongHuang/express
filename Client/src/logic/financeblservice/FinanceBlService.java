package logic.financeblservice;

import vo.AccountVO;
import vo.PayVO;

import java.util.ArrayList;

import _enum.Operation;
import _enum.ResultMessage;
import po.AccountPO;
import po.ReceiptPO;

public interface FinanceBlService {

	public ResultMessage createCost(PayVO vo);

	public ArrayList<Object> getTotal(String begin, String end);

	public ResultMessage initAccount(String Account, double Money);

	public ResultMessage manageAccount(AccountVO vo, Operation op);

	public AccountVO findAccount(String bankAccount);

	public ArrayList<ReceiptPO> checkReceipt(String date, String sellingArea);
	
	public ArrayList<AccountPO> checkInitInfo();
}
