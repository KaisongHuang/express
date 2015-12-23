package logic.centrebl;

import java.rmi.RemoteException;

import po.CentreArrivalPO;
import po.CentrePackPO;
import po.CentreTransforPO;
import _enum.ResultMessage;
import data.centredata.CentreData;
import logic.centreblservice.CentreBlService;
import vo.CentreArrivalVO;
import vo.CentreTransforVO;
import vo.CentrePackVO;

public class Centre implements CentreBlService {

	CentreData cd;

	public ResultMessage manageTranfor(CentreTransforVO vo) {
		// TODO Auto-generated method stub
		ResultMessage rm=null;
		CentreTransforPO po = new CentreTransforPO(vo.getTransferStyle(), vo.getDateOfGetin(), vo.getCentreTransferID(),
				vo.getBanHao(), vo.getStart(), vo.getArrival(),	vo.getHuoGuiHao(), vo.getJianZhuangYuan(),
				vo.getList(), vo.getFee(),vo.getIsCheck(),0);
		try{
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

}
