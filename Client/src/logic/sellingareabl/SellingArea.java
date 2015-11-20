package logic.sellingareabl;

import java.lang.invoke.VolatileCallSite;
import java.rmi.RemoteException;

import po.CarPO;
import po.CarPackPO;
import po.DeliverPO;
import po.DriverPO;
import po.ReceiptPO;
import serverPo.AcceptPO;
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

public class SellingArea implements SellingareaBlService{
    SellingAreaData sd=new SellingAreaData();
	public ResultMessage manageCarPack(CarPackVO vo) {
		ResultMessage rs;
		CarPackPO po=new CarPackPO(vo.getDate(),vo.getNumber(),vo.getStart(),vo.getDestination(),vo.getSupervisor(),vo.getSupercargo(),
				vo.getList(),vo.getFee());
		try {
			rs=sd.insert(po);
			return rs;
		} catch (RemoteException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return null;
	}

	public ResultMessage createReceiving(AcceptVO vo) {
		ResultMessage rs;
		AcceptPO po=new AcceptPO(vo.getBarCode(),vo.getDate(),vo.getNumber(),vo.getStart(),vo.getStart());
		try {
			rs=sd.insert(po);
			return rs;
		} catch (RemoteException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return null;
	}

	public ResultMessage createDelivery(DeliverVO vo) {
		ResultMessage rs;
		DeliverPO po=new DeliverPO(vo.getBarCode(),vo.getDate(),vo.getNumber());
		try {
			rs=sd.insert(po);
			return rs;
		} catch (RemoteException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		return null;
	}

	public ResultMessage createDebitnote(ReceiptVO vo) {
		ResultMessage rs;
		ReceiptPO po=new ReceiptPO(vo.getMoney(),vo.getDate(),vo.getNumber());
		try {
			rs=sd.insert(po);
			return rs;
		} catch (RemoteException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		return null;
	}

	public ResultMessage manageCarinfo(CarVO vo, Operation op) {
		ResultMessage rs;
		CarPO po=new CarPO(vo.getNumber(),vo.getEngineNumber(),vo.getCarNumber(),vo.getChassisNumber(),vo.getPurchase(),vo.getServiceTime());
		if(op==Operation.insert){
			try {
				rs=sd.insert(po);
				return rs;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}else if(op==Operation.update){
			try {
				rs=sd.update(po);
				return rs;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}else{
			try {
				rs=sd.delete(po);
				return rs;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}
	
		
		
		return null;
	}

	public CarVO findCar(int id) {
		CarPO po;
		CarVO vo;
		try {
			po=(CarPO) sd.find(id);
			vo=new CarVO(po.getNumber(),po.getEngineNumber(),po.getCarNumber(),po.getChassisNumber(),po.getPurchase(),po.getServiceTime());
			return vo;
		} catch (RemoteException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return null;
	}

	public ResultMessage manageDriverinfo(DriverVO vo, Operation op) {
		ResultMessage rs;
		DriverPO po=new DriverPO(vo.getNumber(),vo.getName(),vo.getBirthday(),vo.getID(),vo.getPhone(),vo.getCarCompany(),vo.getSex(),vo.getLicenceTime());
		if(op==Operation.insert){
			try {
				rs=sd.insert(po);
				return rs;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}else if(op==Operation.update){
			try {
				rs=sd.update(po);
				return rs;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}else{
			try {
				rs=sd.delete(po);
				return rs;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}
		
		return null;
	}

	public DriverVO findDriver(int id) {
		DriverPO po;
		try {
			po = (DriverPO) sd.find(id);
			DriverVO vo=new DriverVO(po.getNumber(),po.getName(),po.getBirthday(),po.getID(),po.getPhone(),po.getCarCompany(),po.getSex(),po.getLicenceTime());
			return null;
		} catch (RemoteException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return null;
	}

}
