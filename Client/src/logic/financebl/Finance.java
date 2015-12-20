package logic.financebl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import _enum.Operation;
import _enum.ResultMessage;
import data.admindata.AdminData;
import data.financedata.FinanceData;
import logic.financeblservice.FinanceBlService;
import po.AccountPO;
import po.PayPO;
import po.ReceiptPO;
import vo.AccountVO;
import vo.PayVO;
import vo.ReceiptVO;

public class Finance implements FinanceBlService {
	FinanceData fd = new FinanceData();
	AdminData ad = new AdminData();
	private int count;

	public ResultMessage createCost(PayVO vo) {
		// TODO Auto-generated method stub
		ResultMessage rm = null;
		PayPO po = new PayPO(vo.getDate(), vo.getPayer(), vo.getPayAccount(), vo.getEntry(), vo.getComments(),
				vo.getCost(), vo.getIsCheck());
		try {
			rm = fd.insert(po);
		} catch (RemoteException e) {
			e.printStackTrace();
			rm = ResultMessage.FunctionError;
		}
		return rm;
	}

	public ArrayList<Object> getTotal(String begin, String end) {
		// TODO Auto-generated method stub
		ArrayList<Object> arr = new ArrayList<Object>();
		ArrayList<PayPO> pay = new ArrayList<PayPO>();
		ArrayList<ReceiptPO> receipt = new ArrayList<ReceiptPO>();
		try {
			pay = fd.findPay(begin, end);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			receipt = fd.findReceipt(begin, end);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.count = pay.size();

		for (int i = 0; i < pay.size(); i++)
			arr.add(new PayVO(pay.get(i).getDate(), pay.get(i).getPayer(), pay.get(i).getPayAccount(),
					pay.get(i).getEntry(), pay.get(i).getComments(), pay.get(i).getCost(), pay.get(i).getIsCheck()));

		for (int i = 0; i < receipt.size(); i++)
			arr.add(new ReceiptVO(receipt.get(i).getMoney(), receipt.get(i).getDate(), receipt.get(i).getSellingArea(),
					receipt.get(i).getNumber(), receipt.get(i).getId(), receipt.get(i).getIsCheck()));

		return arr;
	}

	public ResultMessage manageAccount(AccountVO vo, Operation op) {
		// TODO Auto-generated method stub
		ResultMessage rm = null;
		AccountPO po = new AccountPO(vo.getBankAccount(), vo.getBalance());
		if (op == Operation.insert) {
			try {
				rm = fd.insert(po);
			} catch (RemoteException e) {
				e.printStackTrace();
				rm = ResultMessage.FunctionError;
			}
		} else if (op == Operation.delete) {
			try {
				rm = fd.delete(po);
			} catch (RemoteException e) {
				e.printStackTrace();
				rm = ResultMessage.FunctionError;
			}
		} else if (op == Operation.update) {
			try {
				rm = fd.update(po);
			} catch (RemoteException e) {
				e.printStackTrace();
				rm = ResultMessage.FunctionError;
			}
		} 
		return rm;
	}

	public ArrayList<AccountVO> findAccount(String bankAccount) {
		// TODO Auto-generated method stub
		ArrayList<AccountVO> vo = new ArrayList<AccountVO>();
		ArrayList<AccountPO> total = new ArrayList<AccountPO>();
		try {
			total = fd.findAccount();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < total.size(); i++) {
			if (total.get(i).getBankAccount().contains(bankAccount))
				vo.add(new AccountVO(total.get(i).getBankAccount(), total.get(i).getBalance()));
		}

		return vo;
	}

	public ArrayList<ReceiptVO> checkReceipt(String date, String sellingArea) {
		// TODO Auto-generated method stub
		ArrayList<ReceiptPO> arr = new ArrayList<ReceiptPO>();
		ArrayList<ReceiptVO> vo = new ArrayList<ReceiptVO>();
		try {
			arr = fd.checkReceipt(date, sellingArea);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < arr.size(); i++) {
			vo.add(new ReceiptVO(arr.get(i).getMoney(), arr.get(i).getDate(), arr.get(i).getSellingArea(),
					arr.get(i).getNumber(), arr.get(i).getId(), arr.get(i).getIsCheck()));
		}

		return vo;
	}

	public ResultMessage initAccount(AccountVO vo) {
		// TODO Auto-generated method stub
		/*********** needs to be modified when adding listener *********/
		ResultMessage rm = null;
		AccountPO po = new AccountPO(vo.getBankAccount(), vo.getBalance());
		try {
			rm = fd.insert(po);

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			rm = ResultMessage.FunctionError;
		}
		return rm;
	}

	public ArrayList<AccountVO> checkInitInfo() {
		ArrayList<AccountPO> po = new ArrayList<AccountPO>();
		ArrayList<AccountVO> vo = new ArrayList<AccountVO>();
		try {
			po = fd.findInitInfo();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < po.size(); i++) {
			vo.add(new AccountVO(po.get(i).getBankAccount(), po.get(i).getBalance()));
		}
		return vo;
	}

	public int getCount() {
		return count;
	}

	public ResultMessage clearAccount() {
		// TODO Auto-generated method stub
		ResultMessage rm = null;
		try {
			rm = fd.clear();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			rm = ResultMessage.FunctionError;
		}
		return rm;
	}

}
