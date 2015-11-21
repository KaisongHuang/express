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
import po.AcceptPO;
import po.CarPackPO;
import po.CentreArrivalPO;
import po.CentrePackPO;
import po.CentreTransforPO;
import po.DeliverPO;
import po.EmployeePO;
import po.InStoragePO;
import po.InstitutionPO;
import po.OutStoragePO;
import po.PayPO;
import po.ReceiptPO;
import po.SalaryPO;
import serverPO.*;
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
				// TODO �Զ���ɵ� catch ��
				e.printStackTrace();
			}
		}else if(tempvo instanceof InstitutionVO){
			InstitutionVO vo = (InstitutionVO) tempvo;
			InstitutionPO po = new InstitutionPO(vo.getOrganizationID(),vo.getDistance(),vo.getPrice(),vo.getName());
			try {
				rm=md.insert(po);
				return rm;
			} catch (RemoteException e) {
				// TODO �Զ���ɵ� catch ��
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
			if(vo1.getIsCheck()==0){
				CarPackPO po1 = new CarPackPO(vo1.getDate(),vo1.getNumber(),vo1.getStart(),vo1.getDestination(),
						vo1.getSupervisor(),vo1.getSupercargo(),vo1.getList(),vo1.getFee(),vo1.getIsCheck());
				vo1.setIsCheck(1);
				try {
					rm=sad.update(po1);
					return rm;
				} catch (RemoteException e) {
					// TODO �Զ���ɵ� catch ��
					e.printStackTrace();
				}
			}
		}else if(vo instanceof ReceiptVO){
			ReceiptVO vo4 = (ReceiptVO) vo;
			if(vo4.getIsCheck()==0){
				ReceiptPO po4 = new ReceiptPO(vo4.getMoney(),vo4.getDate(),vo4.getNumber(),vo4.getIsCheck());
				vo4.setIsCheck(1);
				try {
					rm=sad.update(po4);
					return rm;
				} catch (RemoteException e) {
					// TODO �Զ���ɵ� catch ��
					e.printStackTrace();
				}
			}
		}else if(vo instanceof AcceptVO){
			AcceptVO vo5 = (AcceptVO) vo;
			if(vo5.getIsCheck()==0){
				AcceptPO po5 = new AcceptPO(vo5.getBarCode(),vo5.getDate(),vo5.getNumber(),vo5.getStart(),vo5.getState(),
						vo5.getIsCheck());
				vo5.setIsCheck(1);
				try {
					rm=sad.update(po5);
					return rm;
				} catch (RemoteException e) {
					// TODO �Զ���ɵ� catch ��
					e.printStackTrace();
				}
			}
		}else if(vo instanceof DeliverVO){
			DeliverVO vo6 = (DeliverVO) vo;
			if(vo6.getIsCheck()==0){
				DeliverPO po6 = new DeliverPO(vo6.getBarCode(),vo6.getDate(),vo6.getNumber(),vo6.getIsCheck());
				vo6.setIsCheck(1);
				try {
					rm=sad.update(po6);
					return rm;
				} catch (RemoteException e) {
					// TODO �Զ���ɵ� catch ��
					e.printStackTrace();
				}
			}
		}else if(vo instanceof CentreArrivalVO){
			CentreArrivalVO vo7 = (CentreArrivalVO) vo;
			if(vo7.getIsCheck()==0){
				CentreArrivalPO po7 = new CentreArrivalPO(vo7.getCentreID(),vo7.getGetDate(),vo7.getTransferID(),
						vo7.getStart(),vo7.getExpressState(),vo7.getIsCheck());
				vo7.setIsCheck(1);
				try {
					rm=cd.update(po7);
					return rm;
				} catch (RemoteException e) {
					// TODO �Զ���ɵ� catch ��
					e.printStackTrace();
				}
			}
		}else if(vo instanceof CentreTransforVO){
			CentreTransforVO vo8 = (CentreTransforVO) vo;
			if(vo8.getIsCheck()==0){
				CentreTransforPO po8 = new CentreTransforPO(vo8.getTransferStyle(), vo8.getDataOfGetin(), vo8.getCentreTransferID(),
						vo8.getBanHao(), vo8.getStart(), vo8.getArrival(),	vo8.getHuoGuiHao(), vo8.getJianZhuangYuan(), 
						vo8.getList(), vo8.getFee(),vo8.getIsCheck());
				vo8.setIsCheck(1);
				try {
					rm=cd.update(po8);
					return rm;
				} catch (RemoteException e) {
					// TODO �Զ���ɵ� catch ��
					e.printStackTrace();
				}
			}
		}else if(vo instanceof PackVO){
			PackVO vo9 = (PackVO) vo;
			if(vo9.getIsCheck()==0){
				CentrePackPO po9 = new CentrePackPO(vo9.getDataOfGetin(),vo9.getCentreTransferID(),vo9.getArrival(),vo9.getCarID(),
						vo9.getJianZhuangYuan(),vo9.getYaYunYuan(),vo9.getList(),vo9.getFee(),vo9.getIsCheck());
				vo9.setIsCheck(1);
				try {
					rm=cd.update(po9);
					return rm;
				} catch (RemoteException e) {
					// TODO �Զ���ɵ� catch ��
					e.printStackTrace();
				}
			}
		}else if(vo instanceof InStorageVO){
			InStorageVO vo10 = (InStorageVO) vo;
			if(vo10.getIsCheck()==0){
				InStoragePO po10 = new InStoragePO(vo10.getId(),vo10.getIndate(),vo10.getDestination(),vo10.getPos_qu(),
						vo10.getPos_jia(),vo10.getPos_jia(),vo10.getPos_wei(),vo10.getIsCheck());
				vo10.setIsCheck(1);
				try {
					rm=wd.update(po10);
					return rm;
				} catch (RemoteException e) {
					// TODO �Զ���ɵ� catch ��
					e.printStackTrace();
				}
			}
		}else if(vo instanceof OutStorageVO){
			OutStorageVO vo11 = (OutStorageVO) vo;
			if(vo11.getIsCheck()==0){
				OutStoragePO po11 = new OutStoragePO(vo11.getId(),vo11.getDestination(),vo11.getOutdate(),
						vo11.getTransportation(),vo11.getTrans_id(),vo11.getIsCheck());
				vo11.setIsCheck(1);
				try {
					rm=wd.update(po11);
					return rm;
				} catch (RemoteException e) {
					// TODO �Զ���ɵ� catch ��
					e.printStackTrace();
				}
			}
		}else if(vo instanceof PayVO){
			PayVO vo13 = (PayVO) vo;
			if(vo13.getIsCheck()==0){
				PayPO po13 = new PayPO(vo13.getDate(),vo13.getPayer(),vo13.getPayAccount(),vo13.getEntry(),
						vo13.getComments(),vo13.getCost(),vo13.getIsCheck());
				vo13.setIsCheck(1);
				try {
					rm=fd.update(po13);
					return rm;
				} catch (RemoteException e) {
					// TODO �Զ���ɵ� catch ��
					e.printStackTrace();
				}
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
				// TODO �Զ���ɵ� catch ��
				e.printStackTrace();
			}
		}
		
		return null;
	}


	public ArrayList<String> checkLogging(Object vo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
