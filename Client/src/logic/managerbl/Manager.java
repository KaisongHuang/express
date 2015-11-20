package logic.managerbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import _enum.ResultMessage;
import data.managerdata.ManagerData;
import logic.managerblservice.ManagerBlService;
import po.EmployeePO;
import vo.EmployeeVO;

public class Manager implements ManagerBlService {
	
	ManagerData md = new ManagerData();
	

	public EmployeeVO find(int id){
		
		EmployeePO ep;
		
		try{
			
			ep = (EmployeePO) md.find(id);
			return new EmployeeVO(id, ep.getEN(), ep.getEA(), ep.getEP(), ep.getTOW(), ep.getBTW());
			
		}catch(RemoteException e){
			
			e.printStackTrace();
			
		}
		
		return null;
		
	}


	public ResultMessage manageMember(EmployeeVO vo) {
		// TODO Auto-generated method stub
		ResultMessage rm;
		
		EmployeePO po = new EmployeePO(vo.getEI(), vo.getEN(), vo.getEA(), vo.getEP(), vo.getTOW(), vo.getBTW());
		
		try {
			rm=md.insert(po);
			return rm;
		} catch (RemoteException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		return null;
	}


	public ResultMessage checkDocument() {
		// TODO Auto-generated method stub
		ResultMessage rm;
		
		return null;
	}


	public ResultMessage checkStatistics() {
		// TODO Auto-generated method stub
		return null;
	}


	public ArrayList<String> checkLogging() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
