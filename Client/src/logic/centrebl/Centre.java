package logic.centrebl;

import java.rmi.RemoteException;

import po.CentreArrivalPO;
import po.CentrePackPO;
import po.CentreTransforPO;

import _enum.ResultMessage;
import data.centredata.CentreData;
import data.centredataservice.CentreDataService;
import data.datafactory.DataFactory;
import data.sellingareadata.SellingAreaData;
import data.sellingareadataservice.SellingareaDataService;
import logic.centreblservice.CentreBlService;
import vo.CentreArrivalVO;
import vo.CentreTransforVO;
import vo.CentrePackVO;

public class Centre implements CentreBlService {

	CentreDataService cd;
	SellingAreaData sd ;
    public Centre(){
    	cd=DataFactory.getCentreDataService();
    	sd= DataFactory.getSellingAreaDataService();
    }
	public ResultMessage manageTranfor(CentreTransforVO vo) {
		// TODO Auto-generated method stub
		ResultMessage rm=null;
		CentreTransforPO po = new CentreTransforPO(vo.getTransferStyle(), vo.getDateOfGetin(), vo.getCentreTransferID(),
				vo.getBanHao(), vo.getStart(), vo.getArrival(),	vo.getHuoGuiHao(), vo.getJianZhuangYuan(),
				vo.getList(), vo.getFee(),vo.getIsCheck(),0);
		try{
			System.out.println(po.getCentreTransferID());
			rm=cd.insert(po);

		}catch (RemoteException e) {
			// TODO �Զ���ɵ� catch ��
			rm=ResultMessage.FunctionError;;
		}
		return rm;
	}

	public ResultMessage createReceive(CentreArrivalVO vo) {
		// TODO Auto-generated method stub
		ResultMessage rm=null;
		CentreArrivalPO po = new CentreArrivalPO(vo.getCentreID(),vo.getGetDate(),vo.getTransferID(),vo.getStart(),
				vo.getExpressState(),vo.getIsCheck(),0);
//		CentreArrivalPO po = new CentreArrivalPO("025001","20151223","025000000000000000001","南京","完整",0,0);
		try {
			rm = cd.insert(po);

		} catch (RemoteException e) {
			// TODO �Զ���ɵ� catch ��
			e.printStackTrace();
			rm=ResultMessage.FunctionError;
		}
		return rm;
	}

	public ResultMessage createPack(CentrePackVO vo) {
		// TODO Auto-generated method stub
		ResultMessage rm=null;
		CentrePackPO po = new CentrePackPO(vo.getDataOfGetin(),vo.getCentreTransferID(),vo.getArrival(),vo.getCarID(),
				vo.getJianZhuangYuan(),vo.getYaYunYuan(),vo.getList(),vo.getFee(),vo.getIsCheck());
		try {
			rm = cd.insert(po);

		} catch (RemoteException e) {
			// TODO �Զ���ɵ� catch ��
			e.printStackTrace();
			rm=ResultMessage.FunctionError;
		}
		return rm;
	}
	public double getFee(String city1,String city2,String type,int count){
		double distance=0;
		double fee=0;
		try {
			distance=sd.getDistance(city1, city2);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        if(type.equals("汽车")){
        	fee=distance*20*count/1000.0;
        }else if(type.equals("火车")){
        	fee=distance*40000*count/200000.0;
        }else if(type.equals("飞机")){
        	fee=distance*1000*count/5000.0;
        }
		return fee;

	}

}
