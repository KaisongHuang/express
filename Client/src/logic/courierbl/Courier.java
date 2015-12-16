package logic.courierbl;

import java.rmi.RemoteException;

import _enum.ResultMessage;
import data.courierdata.CourierData;
import data.senderdata.SenderData;
import logic.courierblservice.CourierBlService;
import po.CourierPO;
import po.DistanceAndFee;
import po.SenderPO;
import vo.CourierVO;
import vo.SenderVO;

public class Courier implements CourierBlService {

	CourierData cd = new CourierData();
	SenderData sd = new SenderData();

	public ResultMessage OrderInput(SenderVO vo,DistanceAndFee daf) {
		// TODO Auto-generated method stub
		ResultMessage rm = null;
		double packing = 0.0;
		if(vo.getBagging().equalsIgnoreCase("纸箱")){
			packing = 5.0;
		}else if(vo.getBagging().equalsIgnoreCase("木箱")){
			packing = 10.0;
		}else if(vo.getBagging().equals("快递袋")){
			packing = 2.0;
		}

		SenderPO po = new SenderPO(vo.getSenderName(),vo.getSenderAddress(),vo.getSenderCompany(),vo.getSenderCall(),vo.getSenderPhone(),
				vo.getRecipientName(),vo.getRecipientAddress(),vo.getRecipientCompany(),vo.getRecipientCall(),vo.getRecipientPhone(),
				vo.getPcs(),vo.getWeight(),vo.getVolume(),vo.getCommodity(),vo.getSize(),vo.getBagging(),this.getPrice(vo.getType(), vo.getSenderCity(), vo.getRecipientCity(),packing),
				vo.getBarCode(),vo.getType());

			try {
				rm= cd.OrderInput(po);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rm;



	}

	public ResultMessage ConsigneeinfoInput(CourierVO vo) {
		// TODO Auto-generated method stub

		ResultMessage rm;
		CourierPO po = new CourierPO(vo.getNumber(),vo.getName(),vo.getDate());
		try {
			rm=cd.insert(po);
			return rm;
		} catch (RemoteException e) {
			// TODO �Զ���ɵ� catch ��
			e.printStackTrace();
		}

		return null;
	}

	public double getPrice(String type, String city1, String city2, double packing) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getTime(String start, String end) {
		// TODO Auto-generated method stub
		return 0;
	}

}
