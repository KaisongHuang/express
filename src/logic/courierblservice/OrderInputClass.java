package logic.courierblservice;

import _enum.ResultMessage;
import data.courierdata.Insert;
import po.SenderPO;
import vo.CourierVO;
import vo.SenderVO;

public class OrderInputClass implements CourierBlService {

	public ResultMessage OrderInput(SenderVO vo) {
		// TODO Auto-generated method stub
		
		new Insert().write(new SenderPO(vo.getSenderName(),vo.getSenderAddress(),vo.getSenderCompany(),vo.getSenderCall(),vo.getSenderPhone(),vo.getRecipientName(),vo.getRecipientAddress(),vo.getRecipientCompany(),vo.getRecipientCall(),vo.getRecipientPhone(),vo.getPcs(),vo.getWeight(),vo.getVolume(),vo.getCommodity(),vo.getSize(),vo.getBagging(),10,vo.getBarCode(),vo.getType()));
		
		return null;
	}

	public double getPrice(double fee, double packing) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getTime(int distance) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage ConsigneeinfoInput(CourierVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
