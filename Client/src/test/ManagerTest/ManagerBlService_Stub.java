package test.ManagerTest;

import java.util.ArrayList;

import _enum.Opera;
import _enum.ResultMessage;
import logic.managerblservice.ManagerBlService;
import vo.AcceptVO;
import vo.AccountVO;
import vo.CarPackVO;
import vo.CarVO;
import vo.CentreArrivalVO;
import vo.CentreTransforVO;
import vo.DeliverVO;
import vo.DistanceAndFeeVO;
import vo.DriverVO;
import vo.EmployeeVO;
import vo.InStorageVO;
import vo.InstitutionVO;
import vo.OutStorageVO;
import vo.CentrePackVO;
import vo.PayVO;
import vo.ReceiptVO;
import vo.SalaryVO;

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
			DeliverVO vo6, CentreArrivalVO vo7, CentreTransforVO vo8, CentrePackVO vo9, InStorageVO vo10, OutStorageVO vo11,
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

	public EmployeeVO findEmployee(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public InstitutionVO findInstitution(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object find(String id, Opera op) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage manageMember(Object vo, Opera op) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<CarPackVO> checkPack() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<ReceiptVO> checkReceipt() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<AcceptVO> checkAccept() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<DeliverVO> checkDeliver() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<CentreArrivalVO> checkArrival() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<CentreTransforVO> checkTrans() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<CentrePackVO> checkCentrePack() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<InStorageVO> checkImport() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<OutStorageVO> checkExport() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<PayVO> checkPay() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage updateSalary(Object vo) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage updateSalary(SalaryVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<SalaryVO> getSalary() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage updateCity(DistanceAndFeeVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage insertCity(DistanceAndFeeVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage deleteCity(DistanceAndFeeVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<DistanceAndFeeVO> findCity() {
		// TODO Auto-generated method stub
		return null;
	}

}
