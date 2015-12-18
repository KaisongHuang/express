package logic.courierbl;

import java.rmi.RemoteException;

import _enum.ResultMessage;
import data.courierdata.CourierData;
import data.courierdataservice.CourierDataService;
import data.senderdata.SenderData;
import data.senderdataservice.SenderDataService;
import logic.courierblservice.CourierBlService;
import po.CourierPO;
import po.DistanceAndFee;
import po.SenderPO;
import vo.CourierVO;
import vo.SenderVO;

public class Courier implements CourierBlService {

	CourierDataService cd = new CourierData();
	SenderDataService sd = new SenderData();

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
				rm=ResultMessage.FunctionError;
			}
			return rm;



	}

	public double getPrice(String type,String city1,String city2,double packing) {
	    double[] d=new double[2];
	    double fee=0;
	    try {
			d=cd.getDistanceAndFee(city1, city2);
		} catch (RemoteException e) {

			e.printStackTrace();
			return -1;
		}
	    if(type.equals("经快")){
	    	fee=d[0]/1000*d[1]+packing;
	    }else if(type.equals("普快")){
	    	fee=d[0]/1000*d[1]*18/23+packing;
	    }else {
	    	fee=d[0]/1000*d[1]*18/25+packing;
	    }
		return  fee;
	}

	public double getTime(String start,String end) {
		try {
			return cd.getTime(start, end);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return 0;


	}

	public ResultMessage ConsigneeinfoInput(CourierVO vo) {
		// TODO Auto-generated method stub

		ResultMessage rm=null;
		CourierPO po = new CourierPO(vo.getNumber(),vo.getName(),vo.getDate());
		try {
			rm=cd.insert(po);
		} catch (RemoteException e) {
			// TODO �Զ���ɵ� catch ��
			e.printStackTrace();
			rm=ResultMessage.FunctionError;
		}

		return rm;
	}



}
