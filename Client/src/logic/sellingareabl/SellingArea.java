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
import _enum.Operation;
import _enum.ResultMessage;
import logic.sellingareablservice.SellingareaBlService;

public class SellingArea implements SellingareaBlService {
	SellingAreaData sd = new SellingAreaData();

	public ResultMessage manageCarPack(CarPackVO vo) {
		ResultMessage rm=null;

		CarPackPO po = new CarPackPO(vo.getDate(), vo.getNumber(), vo.getStart(), vo.getDestination(),
				vo.getSupervisor(), vo.getSupercargo(), vo.getList(), vo.getFee(), vo.getIsCheck());

		try {
			rm = sd.insert(po);
		} catch (RemoteException e) {
			// TODO �Զ���ɵ� catch ��

			e.printStackTrace();
			rm=ResultMessage.FunctionError;
		}
		return rm;
	}

	public ResultMessage createReceiving(AcceptVO vo) {
		ResultMessage rm=null;
		AcceptPO po = new AcceptPO(vo.getBarCode(), vo.getDate(), vo.getNumber(), vo.getStart(), vo.getStart(),
				vo.getIsCheck());
		try {
			rm = sd.insert(po);
		} catch (RemoteException e) {
			e.printStackTrace();
			rm=ResultMessage.FunctionError;
		}
		return rm;
	}

	public ResultMessage createDelivery(DeliverVO vo) {
		ResultMessage rs;
		DeliverPO po = new DeliverPO(vo.getBarCode(), vo.getDate(), vo.getNumber(), 0);
		try {
			rs = sd.insert(po);
			return rs;
		} catch (RemoteException e) {
			// TODO �Զ���ɵ� catch ��
			e.printStackTrace();
			return ResultMessage.FunctionError;
		}

	}

	public ResultMessage createDebitnote(ReceiptVO vo) {
		ResultMessage rs;
		ReceiptPO po = new ReceiptPO(vo.getMoney(), vo.getDate(), vo.getSellingArea(), vo.getNumber(), vo.getId(), 0);
		try {
			rs = sd.insert(po);
			return rs;
		} catch (RemoteException e) {
			// TODO �Զ���ɵ� catch ��
			e.printStackTrace();
			return ResultMessage.FunctionError;
		}

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
				return ResultMessage.FunctionError;
			}
		} else {
			try {
				rs = sd.delete(po);
				return rs;
			} catch (RemoteException e) {
				// TODO �Զ���ɵ� catch ��
				e.printStackTrace();
				return ResultMessage.FunctionError;
			}

		}
		return null;

	}

	public CarVO findCar(String id) {
		CarPO po;
		CarVO vo;
		try {
			po = sd.findCar(id);
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

	public DriverVO findDriver(String id) {
		DriverPO po;
		try {
			po = sd.findDriver(id);
			DriverVO vo = new DriverVO(po.getNumber(), po.getName(), po.getBirthday(), po.getID(), po.getPhone(),
					po.getCarCompany(), po.getSex(), po.getLicenceTime());
			return vo;
		} catch (RemoteException e) {
			// TODO �Զ���ɵ� catch ��
			e.printStackTrace();
		}
		return null;
	}
	
	public double getFee(String city1,String city2,String type,int count){
		double distance=0;
		double fee=0;
		try {
			distance=sd.getDistance(city1, city2);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        if(type.equals("汽车")){
        	fee=distance*20*count/1000.0;
        }else if(type.equals("火车")){
        	fee=distance*40000*count/200000.0;
        }else if(type.equals("飞机")){
        	fee=distance*1000*count/5000.0;
        }
		return fee;
		
	}

}
