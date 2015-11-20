package logic.managerbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import _enum.ResultMessage;
import data.centredata.CentreData;
import data.financedata.FinanceData;
import data.managerdata.ManagerData;
import data.sellingareadata.SellingAreaData;
import data.warehousedata.WarehouseData;
import logic.managerblservice.ManagerBlService;
import po.*;
import vo.*;

public class Manager implements ManagerBlService {
	
	ManagerData md = new ManagerData();
	SellingAreaData sad = new SellingAreaData();
	CentreData cd = new CentreData();
	WarehouseData wd = new WarehouseData();
	FinanceData fd = new FinanceData();
	

	public EmployeeVO find(int id){		
		EmployeePO ep;
		
		try{			
			ep = (EmployeePO) md.find(id);
			return new EmployeeVO(id, ep.getEmployeeName(), ep.getEmployeeAging(),ep.getEmployeePosition(),
					ep.getTimeOfWorking(), ep.getBelongToWho());			
		}catch(RemoteException e){
			
			e.printStackTrace();
			
		}
		
		return null;
		
	}


	public ResultMessage manageMember(Object tempvo) {
		// TODO Auto-generated method stub
		ResultMessage rm;
		
		if (tempvo instanceof EmployeeVO){
			EmployeeVO vo = (EmployeeVO) tempvo;
			EmployeePO po = new EmployeePO(vo.getEmployeeID(),vo.getEmployeeName(), vo.getEmployeeAging(),vo.getEmployeePosition(),
					vo.getTimeOfWorking(), vo.getBelongToWho());			
			try {
				rm=md.insert(po);
				return rm;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}else if(tempvo instanceof InstitutionVO){
			InstitutionVO vo = (InstitutionVO) tempvo;
			InstitutionPO po = new InstitutionPO(vo.getOrganizationID(),vo.getDistance(),vo.getPrice(),vo.getName());
			try {
				rm=md.insert(po);
				return rm;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
		
		return null;
	}
	
	public ResultMessage checkDocument(Object vo) {
		// TODO Auto-generated method stub
		ResultMessage rm;
		
		
		if(vo instanceof CarPackVO){
			CarPackVO vo1 = (CarPackVO) vo;
			CarPackPO po1 = new CarPackPO(vo1.getDate(),vo1.getNumber(),vo1.getStart(),vo1.getDestination(),
			vo1.getSupervisor(),vo1.getSupercargo(),vo1.getList(),vo1.getFee());
			try {
				rm=sad.update(po1);
				return rm;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}else if(vo instanceof CarVO){
			CarVO vo2 = (CarVO) vo;
			CarPO po2 = new CarPO(vo2.getNumber(),vo2.getEngineNumber(),vo2.getCarNumber(),vo2.getChassisNumber(),
					vo2.getPurchase(),vo2.getServiceTime());
			try {
				rm=sad.update(po2);
				return rm;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}else if(vo instanceof DriverVO){
			DriverVO vo3 = (DriverVO) vo;
			DriverPO po3 = new DriverPO(vo3.getNumber(),vo3.getName(),vo3.getBirthday(),vo3.getID(),vo3.getPhone(),
					vo3.getCarCompany(),vo3.getSex(),vo3.getLicenceTime());
			try {
				rm=sad.update(po3);
				return rm;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}else if(vo instanceof ReceiptVO){
			ReceiptVO vo4 = (ReceiptVO) vo;
			ReceiptPO po4 = new ReceiptPO(vo4.getMoney(),vo4.getDate(),vo4.getNumber());
			try {
				rm=sad.update(po4);
				return rm;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}else if(vo instanceof AcceptVO){
			AcceptVO vo5 = (AcceptVO) vo;
			AcceptPO po5 = new AcceptPO(vo5.getBarCode(),vo5.getDate(),vo5.getNumber(),vo5.getStart(),vo5.getState());
			try {
				rm=sad.update(po5);
				return rm;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}else if(vo instanceof DeliverVO){
			DeliverVO vo6 = (DeliverVO) vo;
			DeliverPO po6 = new DeliverPO(vo6.getBarCode(),vo6.getDate(),vo6.getNumber());
			try {
				rm=sad.update(po6);
				return rm;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}else if(vo instanceof CentreArrivalVO){
			CentreArrivalVO vo7 = (CentreArrivalVO) vo;
			CentreArrivalPO po7 = new CentreArrivalPO(vo7.getCentreID(),vo7.getGetDate(),vo7.getTransferID(),
					vo7.getStart(),vo7.getExpressState());
			try {
				rm=cd.update(po7);
				return rm;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}else if(vo instanceof CentreTransforVO){
			CentreTransforVO vo8 = (CentreTransforVO) vo;
			CentreTransforPO po8 = new CentreTransforPO(vo8.getTransferStyle(), vo8.getDataOfGetin(), vo8.getCentreTransferID(),
					vo8.getBanHao(), vo8.getStart(), vo8.getArrival(),	vo8.getHuoGuiHao(), vo8.getJianZhuangYuan(), 
					vo8.getList(), vo8.getFee());
			try {
				rm=cd.update(po8);
				return rm;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}else if(vo instanceof PackVO){
			PackVO vo9 = (PackVO) vo;
			CentrePackPO po9 = new CentrePackPO(vo9.getDataOfGetin(),vo9.getCentreTransferID(),vo9.getArrival(),vo9.getCarID(),
					vo9.getJianZhuangYuan(),vo9.getYaYunYuan(),vo9.getList(),vo9.getFee());
			try {
				rm=cd.update(po9);
				return rm;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}else if(vo instanceof InStorageVO){
			InStorageVO vo10 = (InStorageVO) vo;
			InStoragePO po10 = new InStoragePO(vo10.getId(),vo10.getIndate(),vo10.getDestination(),vo10.getPos_qu(),
					vo10.getPos_jia(),vo10.getPos_jia(),vo10.getPos_wei());
			try {
				rm=wd.update(po10);
				return rm;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}else if(vo instanceof OutStorageVO){
			OutStorageVO vo11 = (OutStorageVO) vo;
			OutStoragePO po11 = new OutStoragePO(vo11.getId(),vo11.getDestination(),vo11.getOutdate(),
					vo11.getTransportation(),vo11.getTrans_id());
			try {
				rm=wd.update(po11);
				return rm;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}else if(vo instanceof AccountVO){
			AccountVO vo12 = (AccountVO) vo;
			AccountPO po12 = new AccountPO(vo12.getBankAccount(),vo12.getBalance());
			try {
				rm=fd.update(po12);
				return rm;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}else if(vo instanceof PayVO){
			PayVO vo13 = (PayVO) vo;
			PayPO po13 = new PayPO(vo13.getDate(),vo13.getPayer(),vo13.getPayAccount(),vo13.getEntry(),
					vo13.getComments(),vo13.getCost());
			try {
				rm=fd.update(po13);
				return rm;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
		return null;
	}

	public ResultMessage checkStatistics(Object tempvo) {
		// TODO Auto-generated method stub
		ResultMessage rm;
		
		if(tempvo instanceof SalaryVO){
			SalaryVO vo = (SalaryVO) tempvo;
			SalaryPO po = new SalaryPO(vo.getEmployeeName(),vo.getSalaryMethod());
			try {
				rm=md.update(po);
				return rm;
			} catch (RemoteException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
		return null;
	}


	public ArrayList<String> checkLogging() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
