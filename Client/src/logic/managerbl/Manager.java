package logic.managerbl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import _enum.Opera;
import _enum.ResultMessage;
import data.datafactory.DataFactory;
import data.managerdata.ManagerData;
import logic.managerblservice.ManagerBlService;
import po.AcceptPO;
import po.CarPackPO;
import po.CentreArrivalPO;
import po.CentrePackPO;
import po.CentreTransforPO;
import po.DeliverPO;
import po.DistanceAndFee;
import po.EmployeePO;
import po.InStoragePO;
import po.InstitutionPO;
import po.OutStoragePO;
import po.PayPO;
import po.ReceiptPO;
import po.SalaryPO;
import vo.*;

public class Manager implements ManagerBlService {

	ManagerData md = new ManagerData();
	// SellingAreaData sad = new SellingAreaData();
	// CentreData cd = new CentreData();
	// WarehouseData wd = new WarehouseData();
	// FinanceData fd = new FinanceData();

	public Manager(){
		md=DataFactory.getManagerDataService();
	}
	public ArrayList<SalaryVO> getSalary() {
		ArrayList<SalaryPO> list = new ArrayList<SalaryPO>();
		ArrayList<SalaryVO> list1 = new ArrayList<SalaryVO>();
		try {
			list = md.getSalary();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < list.size(); i++) {
			list1.add(
					new SalaryVO(list.get(i).getEmployeeName(), list.get(i).getSalaryMethod(), list.get(i).getMoney()));
		}
		return list1;
	}

	public Object find(String id, Opera op) {
		EmployeePO ep;
		InstitutionPO po;
		try {
			if (op == Opera.Employee_find) {
				ep = (EmployeePO) md.findEmployee(id);
				if (ep != null)
					return new EmployeeVO(id, ep.getEmployeeName(), ep.getEmployeeAging(), ep.getEmployeePosition(),
							ep.getTimeOfWorking(), ep.getBelongToWho());
				else
					return null;
			} else {
				po = (InstitutionPO) md.findInStitution(id);
				if (po != null)
					return new InstitutionPO(po.getName(), po.getOrganizationID());
				else
					return null;
			}

		} catch (RemoteException e) {

			e.printStackTrace();

		}

		return null;

	}

	public ResultMessage manageMember(Object tempvo, Opera op) {
		// TODO Auto-generated method stub
		ResultMessage rm = null;

		if (tempvo instanceof EmployeeVO) {
			EmployeeVO vo = (EmployeeVO) tempvo;
			EmployeePO po = new EmployeePO(vo.getEmployeeID(), vo.getEmployeeName(), vo.getEmployeeAging(),
					vo.getEmployeePosition(), vo.getTimeOfWorking(), vo.getBelongToWho());
			try {
				if (op == Opera.Employee_insert)
					rm = md.insert(po);
				if (op == Opera.Employee_delete)
					rm = md.delete(po);
				else
					rm = md.update(po);
			} catch (RemoteException e) {
				e.printStackTrace();
				rm = ResultMessage.FunctionError;
			}
		} else if (tempvo instanceof InstitutionVO) {
			InstitutionVO vo = (InstitutionVO) tempvo;
			InstitutionPO po = new InstitutionPO(vo.getOrganizationID(), vo.getName());
			try {
				if (op == Opera.Institution_insert)
					rm = md.insert(po);
				if (op == Opera.Institution_delete)
					rm = md.delete(po);
				else
					rm = md.update(po);

			} catch (RemoteException e) {
				e.printStackTrace();
				rm = ResultMessage.FunctionError;
			}
		}

		return rm;
	}

	public ResultMessage checkDocument(Object vo) {
		// TODO Auto-generated method stub
		ResultMessage rm = null;

		if (vo instanceof CarPackVO) {
			CarPackVO vo1 = (CarPackVO) vo;

			CarPackPO po1 = new CarPackPO(vo1.getDate(), vo1.getSellingArea(), vo1.getNumber(), vo1.getStart(),
					vo1.getDestination(), vo1.getCarID(), vo1.getSupervisor(), vo1.getSupercargo(), vo1.getList(),
					vo1.getFee(), vo1.getIsCheck());

			try {
				rm = md.update(po1);

			} catch (RemoteException e) {
				e.printStackTrace();
				rm = ResultMessage.FunctionError;
			}

		} else if (vo instanceof ReceiptVO) {
			ReceiptVO vo4 = (ReceiptVO) vo;

			ReceiptPO po4 = new ReceiptPO(vo4.getMoney(), vo4.getDate(), vo4.getSellingArea(), vo4.getNumber(),
					vo4.getId(), vo4.getIsCheck());

			try {
				rm = md.update(po4);

			} catch (RemoteException e) {
				e.printStackTrace();
				rm = ResultMessage.FunctionError;
			}
		} else if (vo instanceof AcceptVO) {
			AcceptVO vo5 = (AcceptVO) vo;

			AcceptPO po5 = new AcceptPO(vo5.getBarCode(), vo5.getDate(), vo5.getNumber(), vo5.getStart(),
					vo5.getState(), vo5.getIsCheck());

			try {
				rm = md.update(po5);

			} catch (RemoteException e) {
				e.printStackTrace();
				rm = ResultMessage.FunctionError;
			}

		} else if (vo instanceof DeliverVO) {
			DeliverVO vo6 = (DeliverVO) vo;

			DeliverPO po6 = new DeliverPO(vo6.getBarCode(), vo6.getDate(), vo6.getNumber(), vo6.getIsCheck());

			try {
				rm = md.update(po6);

			} catch (RemoteException e) {
				e.printStackTrace();
				rm = ResultMessage.FunctionError;
			}

		} else if (vo instanceof CentreArrivalVO) {
			CentreArrivalVO vo7 = (CentreArrivalVO) vo;

			CentreArrivalPO po7 = new CentreArrivalPO(vo7.getCentreID(), vo7.getGetDate(), vo7.getTransferID(),
					vo7.getStart(), vo7.getExpressState(), vo7.getIsCheck(), 0);

			try {
				rm = md.update(po7);
			} catch (RemoteException e) {
				e.printStackTrace();
				rm = ResultMessage.FunctionError;
			}

		} else if (vo instanceof CentreTransforVO) {
			CentreTransforVO vo8 = (CentreTransforVO) vo;

			CentreTransforPO po8 = new CentreTransforPO(vo8.getTransferStyle(), vo8.getDateOfGetin(),
					vo8.getCentreTransferID(), vo8.getBanHao(), vo8.getStart(), vo8.getArrival(), vo8.getHuoGuiHao(),
					vo8.getJianZhuangYuan(), vo8.getList(), vo8.getFee(), vo8.getIsCheck(), 0);

			try {
				rm = md.update(po8);
			} catch (RemoteException e) {
				e.printStackTrace();
				rm = ResultMessage.FunctionError;
			}

		} else if (vo instanceof CentrePackVO) {
			CentrePackVO vo9 = (CentrePackVO) vo;

			CentrePackPO po9 = new CentrePackPO(vo9.getDataOfGetin(), vo9.getCentreTransferID(), vo9.getArrival(),
					vo9.getCarID(), vo9.getJianZhuangYuan(), vo9.getYaYunYuan(), vo9.getList(), vo9.getFee(),
					vo9.getIsCheck());
			vo9.setIsCheck(1);
			try {
				rm = md.update(po9);
			} catch (RemoteException e) {
				e.printStackTrace();
				rm = ResultMessage.FunctionError;
			}

		} else if (vo instanceof InStorageVO) {
			InStorageVO vo10 = (InStorageVO) vo;

			InStoragePO po10 = new InStoragePO(vo10.getId(), vo10.getIndate(), vo10.getDestination(),
					vo10.getWarehouseID(), vo10.getPos_qu(), vo10.getPos_jia(), vo10.getPos_jia(), vo10.getPos_wei(),
					vo10.getIsCheck(), 0);

			try {
				rm = md.update(po10);
			} catch (RemoteException e) {
				e.printStackTrace();
				rm = ResultMessage.FunctionError;
			}

		} else if (vo instanceof OutStorageVO) {
			OutStorageVO vo11 = (OutStorageVO) vo;

			OutStoragePO po11 = new OutStoragePO(vo11.getId(), vo11.getDestination(), vo11.getOutdate(),
					vo11.getWarehouseID(), vo11.getTransportation(), vo11.getTrans_id(), vo11.getIsCheck());

			try {
				rm = md.update(po11);
			} catch (RemoteException e) {
				e.printStackTrace();
				rm = ResultMessage.FunctionError;
			}

		} else if (vo instanceof PayVO) {
			PayVO vo13 = (PayVO) vo;

			PayPO po13 = new PayPO(vo13.getDate(), vo13.getPayer(), vo13.getPayAccount(), vo13.getEntry(),
					vo13.getComments(), vo13.getCost(), vo13.getIsCheck());

			try {
				rm = md.update(po13);

			} catch (RemoteException e) {
				e.printStackTrace();
				rm = ResultMessage.FunctionError;
			}

		}

		return rm;
	}

	public ResultMessage checkStatistics(Object tempvo) {
		// TODO Auto-generated method stub
		ResultMessage rm = null;

		if (tempvo instanceof SalaryVO) {
			SalaryVO vo = (SalaryVO) tempvo;
			SalaryPO po = new SalaryPO(vo.getEmployeeName(), vo.getSalaryMethod(), vo.getMoney());
			try {
				rm = md.update(po);
			} catch (RemoteException e) {
				e.printStackTrace();
				rm = ResultMessage.FunctionError;
			}
		}

		return rm;
	}

	public ArrayList<String> checkLogging(Object vo) {
		// TODO Auto-generated method stub

		return null;
	}

	public ArrayList<CarPackVO> checkPack() {
		// TODO Auto-generated method stub
		ArrayList<CarPackVO> vo = new ArrayList<CarPackVO>();
		ArrayList<CarPackPO> po = new ArrayList<CarPackPO>();

		try {
			po = md.findPack();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < po.size(); i++) {
			vo.add(new CarPackVO(po.get(i).getDate(), po.get(i).getSellingArea(), po.get(i).getNumber(),
					po.get(i).getStart(), po.get(i).getDestination(), po.get(i).getCarID(), po.get(i).getSupervisor(),
					po.get(i).getSupercargo(), po.get(i).getList(), po.get(i).getFee(), po.get(i).getIsCheck()));
		}

		return vo;
	}

	public ArrayList<ReceiptVO> checkReceipt() {
		// TODO Auto-generated method stub
		ArrayList<ReceiptVO> vo = new ArrayList<ReceiptVO>();
		ArrayList<ReceiptPO> po = new ArrayList<ReceiptPO>();

		try {
			po = md.findReceipt();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < po.size(); i++) {
			vo.add(new ReceiptVO(po.get(i).getMoney(), po.get(i).getDate(), po.get(i).getSellingArea(),
					po.get(i).getNumber(), po.get(i).getId(), po.get(i).getIsCheck()));
		}

		return vo;
	}

	public ArrayList<AcceptVO> checkAccept() {
		// TODO Auto-generated method stub
		ArrayList<AcceptVO> vo = new ArrayList<AcceptVO>();
		ArrayList<AcceptPO> po = new ArrayList<AcceptPO>();

		try {
			po = md.findAccept();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < po.size(); i++) {
			vo.add(new AcceptVO(po.get(i).getBarCode(), po.get(i).getDate(), po.get(i).getNumber(),
					po.get(i).getStart(), po.get(i).getState(), po.get(i).getIsCheck()));
		}

		return vo;
	}

	public ArrayList<DeliverVO> checkDeliver() {
		// TODO Auto-generated method stub
		ArrayList<DeliverVO> vo = new ArrayList<DeliverVO>();
		ArrayList<DeliverPO> po = new ArrayList<DeliverPO>();

		try {
			po = md.findDeliver();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < po.size(); i++) {
			vo.add(new DeliverVO(po.get(i).getBarCode(), po.get(i).getDate(), po.get(i).getNumber(),
					po.get(i).getIsCheck()));
		}

		return vo;
	}

	public ArrayList<CentreArrivalVO> checkArrival() {
		// TODO Auto-generated method stub
		ArrayList<CentreArrivalVO> vo = new ArrayList<CentreArrivalVO>();
		ArrayList<CentreArrivalPO> po = new ArrayList<CentreArrivalPO>();

		try {
			po = md.findArrival();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < po.size(); i++) {
			vo.add(new CentreArrivalVO(po.get(i).getID(), po.get(i).getGetDate(), po.get(i).getTransferID(),
					po.get(i).getStart(), po.get(i).getExpressState(), po.get(i).getIsCheck()));
		}

		return vo;
	}

	public ArrayList<CentreTransforVO> checkTrans() {
		// TODO Auto-generated method stub
		ArrayList<CentreTransforVO> vo = new ArrayList<CentreTransforVO>();
		ArrayList<CentreTransforPO> po = new ArrayList<CentreTransforPO>();

		try {
			po = md.findTrans();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < po.size(); i++) {
			vo.add(new CentreTransforVO(po.get(i).getTransferStyle(), po.get(i).getDataOfGetin(),
					po.get(i).getCentreTransferID(), po.get(i).getBanHao(), po.get(i).getStart(),
					po.get(i).getArrival(), po.get(i).getHuoGuiHao(), po.get(i).getJianZhuangYuan(),
					po.get(i).getList(), po.get(i).getFee(), po.get(i).getIsCheck()));
		}

		return vo;
	}

	public ArrayList<CentrePackVO> checkCentrePack() {
		// TODO Auto-generated method stub
		ArrayList<CentrePackVO> vo = new ArrayList<CentrePackVO>();
		ArrayList<CentrePackPO> po = new ArrayList<CentrePackPO>();

		try {
			po = md.findCentrePack();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < po.size(); i++) {
			vo.add(new CentrePackVO(po.get(i).getDataOfGetin(), po.get(i).getCentreTransferID(), po.get(i).getArrival(),
					po.get(i).getCarID(), po.get(i).getJianZhuangYuan(), po.get(i).getYaYunYuan(), po.get(i).getList(),
					po.get(i).getFee(), po.get(i).getIsCheck()));
		}

		return vo;
	}

	public ArrayList<InStorageVO> checkImport() {
		// TODO Auto-generated method stub
		ArrayList<InStorageVO> vo = new ArrayList<InStorageVO>();
		ArrayList<InStoragePO> po = new ArrayList<InStoragePO>();

		try {
			po = md.findImport();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < po.size(); i++) {
			vo.add(new InStorageVO(po.get(i).getId(), po.get(i).getIndate(), po.get(i).getDestination(),
					po.get(i).getWarehouseID(), po.get(i).getPos_qu(), po.get(i).getPos_pai(), po.get(i).getPos_jia(),
					po.get(i).getPos_wei(), po.get(i).getIsCheck()));
		}

		return vo;
	}

	public ArrayList<OutStorageVO> checkExport() {
		// TODO Auto-generated method stub
		ArrayList<OutStorageVO> vo = new ArrayList<OutStorageVO>();
		ArrayList<OutStoragePO> po = new ArrayList<OutStoragePO>();

		try {
			po = md.findExport();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < po.size(); i++) {
			vo.add(new OutStorageVO(po.get(i).getId(), po.get(i).getDestination(), po.get(i).getOutdate(),
					po.get(i).getWarehouseID(), po.get(i).getTransportation(), po.get(i).getTrans_id(),
					po.get(i).getIsCheck()));
		}

		return vo;
	}

	public ArrayList<PayVO> checkPay() {
		// TODO Auto-generated method stub
		ArrayList<PayVO> vo = new ArrayList<PayVO>();
		ArrayList<PayPO> po = new ArrayList<PayPO>();

		try {
			po = md.findPay();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < po.size(); i++) {
			vo.add(new PayVO(po.get(i).getDate(), po.get(i).getPayer(), po.get(i).getPayAccount(), po.get(i).getEntry(),
					po.get(i).getComments(), po.get(i).getCost(), po.get(i).getIsCheck()));
		}

		return vo;
	}

	public ResultMessage updateSalary(SalaryVO vo) {
		// TODO Auto-generated method stub
		ResultMessage rm = null;
		SalaryVO vo1 = (SalaryVO) vo;
		try {
			md.update(new SalaryPO(vo1.getEmployeeName(), vo1.getSalaryMethod(), vo1.getMoney()));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rm;
	}

	public ResultMessage updateCity(DistanceAndFeeVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage insertCity(DistanceAndFeeVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<DistanceAndFeeVO> findCity() {
		// TODO Auto-generated method stub
		ArrayList<DistanceAndFee> po = new ArrayList<DistanceAndFee>();
		ArrayList<DistanceAndFeeVO> vo = new ArrayList<DistanceAndFeeVO>();
		try {
			po = md.getCity();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < po.size(); i++) {
			vo.add(new DistanceAndFeeVO(po.get(i).getCity1(), po.get(i).getCity2(), po.get(i).getDistance(),
					po.get(i).getFee()));
		}

		return vo;
	}

	public ResultMessage deleteCity(DistanceAndFeeVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}