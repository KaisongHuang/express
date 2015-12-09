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
	
	public ResultMessage clearAccount();

	public ResultMessage initAccount(AccountVO vo);

	public ResultMessage manageAccount(AccountVO vo, Operation op);

	public ArrayList<AccountPO> findAccount(String bankAccount);

	public ArrayList<ReceiptPO> checkReceipt(String date, String sellingArea);
	
	public ArrayList<AccountPO> checkInitInfo();
}
