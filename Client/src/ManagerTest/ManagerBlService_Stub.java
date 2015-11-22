package ManagerTest;

import java.util.ArrayList;

import _enum.ResultMessage;
import logic.managerblservice.ManagerBlService;
import vo.AcceptVO;
import vo.AccountVO;
import vo.CarPackVO;
import vo.CarVO;
import vo.CentreArrivalVO;
import vo.CentreTransforVO;
import vo.DeliverVO;
import vo.DriverVO;
import vo.EmployeeVO;
import vo.InStorageVO;
import vo.OutStorageVO;
import vo.PackVO;
import vo.PayVO;
import vo.ReceiptVO;

public class ManagerBlService_Stub implements ManagerBlService {
	
	public ResultMessage manageMember(){
		
		return ResultMessage.Error;
		
	}
	
	public ResultMessage checkDocument(){
		
		return ResultMessage.Error;
		
	}
	
	public ResultMessage checkStatistics(){
		
		return ResultMessage.Error;
		
	}

	public ArrayList<String> checkLogging() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage manageMember(EmployeeVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage checkDocument(CarPackVO vo1, CarVO vo2, DriverVO vo3, ReceiptVO vo4, AcceptVO vo5,
			DeliverVO vo6, CentreArrivalVO vo7, CentreTransforVO vo8, PackVO vo9, InStorageVO vo10, OutStorageVO vo11,
			AccountVO vo12, PayVO vo13) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage checkDocument(Object vo) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage manageMember(Object vo) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage checkStatistics(Object vo) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<String> checkLogging(Object vo) {
		// TODO Auto-generated method stub
		return null;
	}

	public EmployeeVO find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
