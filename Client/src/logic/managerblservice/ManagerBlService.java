package logic.managerblservice;

import java.util.ArrayList;

import _enum.Opera;
import _enum.ResultMessage;
import vo.AcceptVO;
import vo.CarPackVO;
import vo.CentreArrivalVO;
import vo.CentreTransforVO;
import vo.DeliverVO;
import vo.DistanceAndFeeVO;
import vo.InStorageVO;
import vo.OutStorageVO;
import vo.CentrePackVO;
import vo.PayVO;
import vo.ReceiptVO;
import vo.SalaryVO;

public interface ManagerBlService {

	public Object find(String id, Opera op);

	public ResultMessage manageMember(Object vo, Opera op);
	
	public ResultMessage checkDocument(Object vo);

	public ResultMessage checkStatistics(Object vo);
	
	public ResultMessage updateSalary(SalaryVO vo);
	
	public ResultMessage updateCity(DistanceAndFeeVO vo);
	
	public ResultMessage insertCity(DistanceAndFeeVO vo);
	
	public ResultMessage deleteCity(DistanceAndFeeVO vo);
	
	public ArrayList<DistanceAndFeeVO> findCity();
	
	public ArrayList<SalaryVO> getSalary();

	public ArrayList<String> checkLogging(Object vo);

	public ArrayList<CarPackVO> checkPack();

	public ArrayList<ReceiptVO> checkReceipt();

	public ArrayList<AcceptVO> checkAccept();

	public ArrayList<DeliverVO> checkDeliver();

	public ArrayList<CentreArrivalVO> checkArrival();

	public ArrayList<CentreTransforVO> checkTrans();

	public ArrayList<CentrePackVO> checkCentrePack();

	public ArrayList<InStorageVO> checkImport();

	public ArrayList<OutStorageVO> checkExport();

	public ArrayList<PayVO> checkPay();
	public ArrayList<String> Dialy();
}
