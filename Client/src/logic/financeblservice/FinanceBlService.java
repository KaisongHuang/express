package logic.financeblservice;

import vo.AccountVO;
import vo.PayVO;
import vo.ReceiptVO;

import java.util.ArrayList;

import _enum.Operation;
import _enum.ResultMessage;

public interface FinanceBlService {

	public ResultMessage createCost(PayVO vo);

	public ArrayList<Object> getTotal(String begin, String end);
	
	public ResultMessage clearAccount();

	public ResultMessage initAccount(AccountVO vo);

	public ResultMessage manageAccount(AccountVO vo, Operation op);

	public ArrayList<AccountVO> findAccount(String bankAccount);

	public ArrayList<ReceiptVO> checkReceipt(String date, String sellingArea);
	
	public ArrayList<AccountVO> checkInitInfo();
	
	public ArrayList<ReceiptVO> getReceipt();
	
	public ArrayList<PayVO> getPay();
}

