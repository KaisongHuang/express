package logic.centreblservice;

import _enum.ResultMessage;
import vo.CentreArrivalVO;
import vo.CentreTransforVO;
import vo.CentrePackVO;

public interface CentreBlService {
	
	
	public ResultMessage manageTranfor(CentreTransforVO vo);
	public ResultMessage createReceive(CentreArrivalVO vo);
	public ResultMessage createPack(CentrePackVO vo);

}
