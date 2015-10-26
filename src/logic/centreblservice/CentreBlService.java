package logic.centreblservice;

import _enum.ResultMessage;
import vo.CentreArrivalVO;
import vo.CentreTransforVO;
import vo.DeliveryVO;
import vo.PackVO;

public interface CentreBlService {
	
	
	public ResultMessage manageTranfor(CentreTransforVO vo);
	public ResultMessage createReceive(CentreArrivalVO vo);
	public ResultMessage createPack(PackVO vo);
	public ResultMessage createDelivery(DeliveryVO vo);	

}
