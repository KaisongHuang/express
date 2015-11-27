package logic.sellingareabl;

import java.rmi.RemoteException;

import po.AcceptPO;
import po.CarPO;
import po.CarPackPO;
import po.DeliverPO;
import po.DriverPO;
import po.ReceiptPO;
import data.sellingareadata.SellingAreaData;
import vo.AcceptVO;
import vo.CarPackVO;
import vo.CarVO;
import vo.DeliverVO;
import vo.DriverVO;
import vo.ReceiptVO;
import _enum.Opera;
import _enum.Operation;
import _enum.ResultMessage;
import logic.sellingareablservice.SellingareaBlService;

public class SellingArea implements SellingareaBlService {
	SellingAreaData sd = new SellingAreaData();

	public ResultMessage manageCarPack(CarPackVO vo) {
		ResultMessage rs;

		CarPackPO po=new CarPackPO(vo.getDate(),vo.getNumber(),vo.getStart(),vo.getDestination(),vo.getSupervisor(),vo.getSupercargo(),
				vo.getList(),vo.getFee(),vo.getIsCheck());

		try {
			rs = sd.insert(po);
			return rs;
		} catch (RemoteException e) {
			// TODO �Զ���ɵ� catch ��
			e.printStackTrace();
		}
		return null;
	}

	public ResultMessage createReceiving(AcceptVO vo) {
		ResultMessage rs;
		AcceptPO po=new AcceptPO(vo.getBarCode(),vo.getDate(),vo.getNumber(),vo.getStart(),vo.getStart(),vo.getIsCheck());
		try {
			rs = sd.insert(po);
			return rs;
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ResultMessage createDelivery(DeliverVO vo) {
		ResultMessage rs;
		DeliverPO po=new DeliverPO(vo.getBarCode(),vo.getDate(),vo.getNumber(),vo.getIsCheck());
		try {
			rs = sd.insert(po);
			return rs;
		} catch (RemoteException e) {
			// TODO �Զ���ɵ� catch ��
			e.printStackTrace();
		}

		return null;
	}

	public ResultMessage createDebitnote(ReceiptVO vo) {
		ResultMessage rs;
		ReceiptPO po=new ReceiptPO(vo.getMoney(),vo.getDate(),vo.getSellingArea(), vo.getNumber(),vo.getID(),vo.getIsCheck());
		try {
			rs = sd.insert(po);
			return rs;
		} catch (RemoteException e) {
			// TODO �Զ���ɵ� catch ��
			e.printStackTrace();
		}

		return null;
	}

	public ResultMessage manageCarinfo(CarVO vo, Operation op) {
		ResultMessage rs;
		CarPO po = new CarPO(vo.getNumber(), vo.getEngineNumber(), vo.getCarNumber(), vo.getChassisNumber(),
				vo.getPurchase(), vo.getServiceTime());
		if (op == Operation.insert) {
			try {
				rs = sd.insert(po);
				return rs;
			} catch (RemoteException e) {
				// TODO �Զ���ɵ� catch ��
				e.printStackTrace();
			}

		} else if (op == Operation.update) {
			try {
				rs = sd.update(po);
				return rs;
			} catch (RemoteException e) {
				// TODO �Զ���ɵ� catch ��
				e.printStackTrace();
			}
		} else {
			try {
				rs = sd.delete(po);
				return rs;
			} catch (RemoteException e) {
				// TODO �Զ���ɵ� catch ��
				e.printStackTrace();
			}

		}

		return null;
	}

	public CarVO findCar(int id) {
		CarPO po;
		CarVO vo;
		try {
			po = (CarPO) sd.find(id,Opera.Car_find);
			vo = new CarVO(po.getNumber(), po.getEngineNumber(), po.getCarNumber(), po.getChassisNumber(),
					po.getPurchase(), po.getServiceTime());
			return vo;
		} catch (RemoteException e) {
			// TODO �Զ���ɵ� catch ��
			e.printStackTrace();
		}
		return null;
	}

	public ResultMessage manageDriverinfo(DriverVO vo, Operation op) {
		ResultMessage rs;
		DriverPO po = new DriverPO(vo.getNumber(), vo.getName(), vo.getBirthday(), vo.getID(), vo.getPhone(),
				vo.getCarCompany(), vo.getSex(), vo.getLicenceTime());
		if (op == Operation.insert) {
			try {
				rs = sd.insert(po);
				return rs;
			} catch (RemoteException e) {
				// TODO �Զ���ɵ� catch ��
				e.printStackTrace();
			}

		} else if (op == Operation.update) {
			try {
				rs = sd.update(po);
				return rs;
			} catch (RemoteException e) {
				// TODO �Զ���ɵ� catch ��
				e.printStackTrace();
			}
		} else {
			try {
				rs = sd.delete(po);
				return rs;
			} catch (RemoteException e) {
				// TODO �Զ���ɵ� catch ��
				e.printStackTrace();
			}

		}

		return null;
	}

	public DriverVO findDriver(int id) {
		DriverPO po;
		try {
			po = (DriverPO) sd.find(id,Opera.Driver_insert);
			DriverVO vo = new DriverVO(po.getNumber(), po.getName(), po.getBirthday(), po.getID(), po.getPhone(),
					po.getCarCompany(), po.getSex(), po.getLicenceTime());
			return vo;
		} catch (RemoteException e) {
			// TODO �Զ���ɵ� catch ��
			e.printStackTrace();
		}
		return null;
	}

}
