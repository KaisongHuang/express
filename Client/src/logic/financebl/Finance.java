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

	@SuppressWarnings("null")
	public ArrayList<Object> getTotal(String begin, String end) {
		// TODO Auto-generated method stub
		ArrayList<Object> arr = null;
		this.count = 0;
		for (int i = 0; i < fd.findPay().size(); i++) {
			if (fd.findPay().get(i).getDate().compareTo(begin) >= 0
					&& fd.findPay().get(i).getDate().compareTo(end) <= 0) {
				arr.add(fd.findPay().get(i));
				this.count++;
			}
		}
		for (int i = 0; i < fd.findReceipt().size(); i++) {
			if (fd.findReceipt().get(i).getDate().compareTo(begin) >= 0
					&& fd.findReceipt().get(i).getDate().compareTo(end) <= 0)
				arr.add(fd.findReceipt().get(i));
		}
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

	public AccountVO findAccount(String bankAccount) {
		// TODO Auto-generated method stub
		AccountPO po;
		AccountVO vo;
		try {
			for (int i = 0; i < fd.findAccount().size(); i++) {
				if (fd.findAccount().get(i).getBankAccount().contains(bankAccount)) {
					po = fd.findAccount().get(i);
					vo = new AccountVO(po.getBankAccount(), po.getBalance());
					return vo;
				}
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("null")
	public ArrayList<ReceiptPO> checkReceipt(String date, String sellingArea) {
		// TODO Auto-generated method stub
		ArrayList<ReceiptPO> arr = null;
		for (int i = 0; i < fd.findReceipt().size(); i++) {
			if (fd.findReceipt().get(i).getDate().equals(date)
					&& fd.findReceipt().get(i).getSellingArea().equals(sellingArea))
				;
			arr.add(fd.findReceipt().get(i));
		}
		return arr;
	}

	public ResultMessage initAccount(String Account, double Money) {
		// TODO Auto-generated method stub
		/*********** needs to be modified when adding listener *********/
		ResultMessage rm;
		AccountPO po = new AccountPO(Account, Money);
		try {
			rm = fd.insert(po);
			return rm;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int getCount() {
		return count;
	}

}
