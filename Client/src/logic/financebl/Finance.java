package logic.financebl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import _enum.Operation;
import _enum.ResultMessage;
import data.financedata.FinanceData;
import logic.financeblservice.FinanceBlService;
import serverPO.AccountPO;
import serverPO.PayPO;
import vo.AccountVO;
import vo.PayVO;

public class Finance implements FinanceBlService {
	FinanceData fd = new FinanceData();

	public double getBalance() {
		// TODO Auto-generated method stub
		
		return 0;
	}

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
		for (int i = 0; i < fd.findPay().size(); i++) {
			if (fd.findPay().get(i).getDate().compareTo(begin) >= 0
					&& fd.findPay().get(i).getDate().compareTo(end) <= 0)
				arr.add(fd.findPay().get(i));
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

	public AccountVO find(String bankAccount) {
		// TODO Auto-generated method stub
		AccountPO po;
		AccountVO vo;
		try {
			for (int i = 0; i < fd.find().size(); i++) {
				if (fd.find().get(i).getBankAccount().contains(bankAccount)) {
					po = fd.find().get(i);
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

}
