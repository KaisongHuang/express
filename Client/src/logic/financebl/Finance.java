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

public class Finance implements FinanceBlService {
	FinanceData fd = new FinanceData();
	AdminData ad = new AdminData();
	private int count;

	public ResultMessage createCost(PayVO vo) {
		// TODO Auto-generated method stub
		ResultMessage rm;
		PayPO po = new PayPO(vo.getDate(), vo.getPayer(), vo.getPayAccount(), vo.getEntry(), vo.getComments(),
				vo.getCost(), vo.getIsCheck());
		try {
			rm = fd.insert(po);
			return rm;
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
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
			arr.add(pay.get(i));

		for (int i = 0; i < receipt.size(); i++)
			arr.add(receipt.get(i));

		return arr;
	}

	public ResultMessage manageAccount(AccountVO vo, Operation op) {
		// TODO Auto-generated method stub
		ResultMessage rm;
		AccountPO po = new AccountPO(vo.getBankAccount(), vo.getBalance());
		if (op == Operation.insert) {
			try {
				rm = fd.insert(po);
				return rm;
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		} else if (op == Operation.delete) {
			try {
				rm = fd.delete(po);
				return rm;
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		} else if (op == Operation.update) {
			try {
				rm = fd.update(po);
				return rm;
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		} else {
			// try {
			//// rm = fd.find(id);
			// return rm;
			// } catch (RemoteException e) {
			// e.printStackTrace();
			// }
		}
		return null;
	}

	public ArrayList<AccountPO> findAccount(String bankAccount) {
		// TODO Auto-generated method stub
		ArrayList<AccountPO> po = new ArrayList<AccountPO>();
		ArrayList<AccountPO> total = new ArrayList<AccountPO>();
		try {
			total = fd.findAccount();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < total.size(); i++) {
			if(total.get(i).getBankAccount().contains(bankAccount))
				po.add(total.get(i));
		}

		return po;
	}

	public ArrayList<ReceiptPO> checkReceipt(String date, String sellingArea) {
		// TODO Auto-generated method stub
		ArrayList<ReceiptPO> arr = new ArrayList<ReceiptPO>();
		try {
			arr = fd.checkReceipt(date, sellingArea);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arr;
	}

	public ResultMessage initAccount(AccountVO vo) {
		// TODO Auto-generated method stub
		/*********** needs to be modified when adding listener *********/
		ResultMessage rm;
		AccountPO po = new AccountPO(vo.getBankAccount(), vo.getBalance());
		try {
			rm = fd.insert(po);
			return rm;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<AccountPO> checkInitInfo() {
		ArrayList<AccountPO> po = new ArrayList<AccountPO>();
		try {
			po = fd.findInitInfo();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return po;
	}

	public int getCount() {
		return count;
	}

}
