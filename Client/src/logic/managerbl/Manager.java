package logic.managerbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import _enum.Opera;
import _enum.ResultMessage;
import data.centredata.CentreData;
import data.financedata.FinanceData;
import data.managerdata.ManagerData;
import data.sellingareadata.SellingAreaData;
import data.warehousedata.WarehouseData;
import logic.managerblservice.ManagerBlService;
import po.AcceptPO;
import po.CarPO;
import po.CarPackPO;
import po.CentreArrivalPO;
import po.CentrePackPO;
import po.CentreTransforPO;
import po.DeliverPO;
import po.EmployeePO;
import po.InStoragePO;
import po.InstitutionPO;
import po.ManagerPO;
import po.OutStoragePO;
import po.PayPO;
import po.ReceiptPO;
import po.SalaryPO;
import vo.*;

public class Manager implements ManagerBlService {
	
	ManagerData md = new ManagerData();
//	SellingAreaData sad = new SellingAreaData();
//	CentreData cd = new CentreData();
//	WarehouseData wd = new WarehouseData();
//	FinanceData fd = new FinanceData();
	

	public Object find(String id,Opera op){		
		EmployeePO ep;
		InstitutionPO po;
		try{
			if(op==Opera.Employee_find){
			     ep = (EmployeePO) md.find(id,op);
			     return new EmployeeVO(id, ep.getEmployeeName(), ep.getEmployeeAging(),ep.getEmployeePosition(),
					  ep.getTimeOfWorking(), ep.getBelongToWho());
			}else{
			     po=(InstitutionPO) md.find(id,op);
			     return new InstitutionPO(po.getName(),po.getOrganizationID());
			}
			
		}catch(RemoteException e){
			
			e.printStackTrace();
			
		}
		
		return null;
		
	}


	public ResultMessage manageMember(Object tempvo,Opera op) {
		// TODO Auto-generated method stub
		ResultMessage rm;
		
		if (tempvo instanceof EmployeeVO){
			EmployeeVO vo = (EmployeeVO) tempvo;
			EmployeePO po = new EmployeePO(vo.getEmployeeID(),vo.getEmployeeName(), vo.getEmployeeAging(),vo.getEmployeePosition(),
					vo.getTimeOfWorking(), vo.getBelongToWho());			
			try {
				if(op==Opera.Employee_insert)
				    rm=md.insert(po,op);
				if(op==Opera.Employee_delete)
				    rm=md.delete(po,op);
				else
				    rm=md.update(po,op);	
				return rm;
			} catch (RemoteException e) {
				// TODO �Զ���ɵ� catch ��
				e.printStackTrace();
			}
		}else if(tempvo instanceof InstitutionVO){
			InstitutionVO vo = (InstitutionVO) tempvo;
			InstitutionPO po = new InstitutionPO(vo.getOrganizationID(),vo.getName());
			try {
			if(op==Opera.Institution_insert)
			    rm=md.insert(po,op);
			if(op==Opera.Institution_delete)
			    rm=md.delete(po,op);
			else
			    rm=md.update(po,op);	
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
			
				CarPackPO po1 = new CarPackPO(vo1.getDate(),vo1.getNumber(),vo1.getStart(),vo1.getDestination(),
						vo1.getSupervisor(),vo1.getSupercargo(),vo1.getList(),vo1.getFee(),vo1.getIsCheck());
	
				try {
					rm=md.update(po1);
					return rm;
				} catch (RemoteException e) {
					// TODO �Զ���ɵ� catch ��
					e.printStackTrace();
				}
			
		}else if(vo instanceof ReceiptVO){
			ReceiptVO vo4 = (ReceiptVO) vo;
		
				ReceiptPO po4 = new ReceiptPO(vo4.getMoney(),vo4.getDate(),vo4.getSellingArea(),vo4.getNumber(),vo4.getId(),vo4.getIsCheck());
			
				try {
					rm=md.update(po4);
					return rm;
				} catch (RemoteException e) {
					// TODO �Զ���ɵ� catch ��
					e.printStackTrace();
				
			}
		}else if(vo instanceof AcceptVO){
			AcceptVO vo5 = (AcceptVO) vo;
		
				AcceptPO po5 = new AcceptPO(vo5.getBarCode(),vo5.getDate(),vo5.getNumber(),vo5.getStart(),vo5.getState(),
						vo5.getIsCheck());
				
				try {
					rm=md.update(po5);
					return rm;
				} catch (RemoteException e) {
					// TODO �Զ���ɵ� catch ��
					e.printStackTrace();
				}
			
		}else if(vo instanceof DeliverVO){
			DeliverVO vo6 = (DeliverVO) vo;
			
				DeliverPO po6 = new DeliverPO(vo6.getBarCode(),vo6.getDate(),vo6.getNumber(),vo6.getIsCheck());
				
				try {
					rm=md.update(po6);
					return rm;
				} catch (RemoteException e) {
					// TODO �Զ���ɵ� catch ��
					e.printStackTrace();
				}
			
		}else if(vo instanceof CentreArrivalVO){
			CentreArrivalVO vo7 = (CentreArrivalVO) vo;
			
				CentreArrivalPO po7 = new CentreArrivalPO(vo7.getCentreID(),vo7.getGetDate(),vo7.getTransferID(),
						vo7.getStart(),vo7.getExpressState(),vo7.getIsCheck());
			
				try {
					rm=md.update(po7);
					return rm;
				} catch (RemoteException e) {
					// TODO �Զ���ɵ� catch ��
					e.printStackTrace();
				}
			
		}else if(vo instanceof CentreTransforVO){
			CentreTransforVO vo8 = (CentreTransforVO) vo;
		
				CentreTransforPO po8 = new CentreTransforPO(vo8.getTransferStyle(), vo8.getDataOfGetin(), vo8.getCentreTransferID(),
						vo8.getBanHao(), vo8.getStart(), vo8.getArrival(),	vo8.getHuoGuiHao(), vo8.getJianZhuangYuan(), 
						vo8.getList(), vo8.getFee(),vo8.getIsCheck());
			
				try {
					rm=md.update(po8);
					return rm;
				} catch (RemoteException e) {
					// TODO �Զ���ɵ� catch ��
					e.printStackTrace();
				}
			
		}else if(vo instanceof PackVO){
			PackVO vo9 = (PackVO) vo;
		
				CentrePackPO po9 = new CentrePackPO(vo9.getDataOfGetin(),vo9.getCentreTransferID(),vo9.getArrival(),vo9.getCarID(),
						vo9.getJianZhuangYuan(),vo9.getYaYunYuan(),vo9.getList(),vo9.getFee(),vo9.getIsCheck());
				vo9.setIsCheck(1);
				try {
					rm=md.update(po9);
					return rm;
				} catch (RemoteException e) {
					// TODO �Զ���ɵ� catch ��
					e.printStackTrace();
				}
			
		}else if(vo instanceof InStorageVO){
			InStorageVO vo10 = (InStorageVO) vo;
			
				InStoragePO po10 = new InStoragePO(vo10.getId(),vo10.getIndate(),vo10.getDestination(),vo10.getWarehouseID(),vo10.getPos_qu(),
						vo10.getPos_jia(),vo10.getPos_jia(),vo10.getPos_wei(),vo10.getIsCheck());
			
				try {
					rm=md.update(po10);
					return rm;
				} catch (RemoteException e) {
					// TODO �Զ���ɵ� catch ��
					e.printStackTrace();
				}
			
		}else if(vo instanceof OutStorageVO){
			OutStorageVO vo11 = (OutStorageVO) vo;
			
				OutStoragePO po11 = new OutStoragePO(vo11.getId(),vo11.getDestination(),vo11.getOutdate(),vo11.getWarehouseID(),
						vo11.getTransportation(),vo11.getTrans_id(),vo11.getIsCheck());
				
				try {
					rm=md.update(po11);
					return rm;
				} catch (RemoteException e) {
					// TODO �Զ���ɵ� catch ��
					e.printStackTrace();
				}
			
		}else if(vo instanceof PayVO){
			PayVO vo13 = (PayVO) vo;
		
				PayPO po13 = new PayPO(vo13.getDate(),vo13.getPayer(),vo13.getPayAccount(),vo13.getEntry(),
						vo13.getComments(),vo13.getCost(),vo13.getIsCheck());
				
				try {
					rm=md.update(po13);
					return rm;
				} catch (RemoteException e) {
					// TODO �Զ���ɵ� catch ��
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