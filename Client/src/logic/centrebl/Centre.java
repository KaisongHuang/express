package logic.centrebl;

import java.rmi.RemoteException;

import _enum.ResultMessage;
import data.centredata.CentreData;
import logic.centreblservice.CentreBlService;
import po.CentreArrivalPO;
import po.CentrePackPO;
import po.CentreTransforPO;
import vo.CentreArrivalVO;
import vo.CentreTransforVO;
import vo.PackVO;

public class Centre implements CentreBlService {

	CentreData cd;

	public ResultMessage manageTranfor(CentreTransforVO vo) {
		// TODO Auto-generated method stub
		ResultMessage rm;
		CentreTransforPO po = new CentreTransforPO(vo.getTransferStyle(), vo.getDataOfGetin(), vo.getCentreTransferID(),
<<<<<<< HEAD
				vo.getBanHao(), vo.getStart(), vo.getArrival(), vo.getHuoGuiHao(), vo.getJianZhuangYuan(), vo.getList(),
				vo.getFee());
		try {
			rm = cd.insert(po);
			return rm;
		} catch (RemoteException e) {
=======
				vo.getBanHao(), vo.getStart(), vo.getArrival(),	vo.getHuoGuiHao(), vo.getJianZhuangYuan(), 
				vo.getList(), vo.getFee(),vo.getIsCheck());
		try{
			rm=cd.insert(po);
			return rm;
		}catch (RemoteException e) {
>>>>>>> master
			// TODO �Զ���ɵ� catch ��
			e.printStackTrace();
		}
		return null;
	}

	public ResultMessage createReceive(CentreArrivalVO vo) {
		// TODO Auto-generated method stub
		ResultMessage rm;
<<<<<<< HEAD
		CentreArrivalPO po = new CentreArrivalPO(vo.getCentreID(), vo.getGetDate(), vo.getTransferID(), vo.getStart(),
				vo.getExpressState());
=======
		CentreArrivalPO po = new CentreArrivalPO(vo.getCentreID(),vo.getGetDate(),vo.getTransferID(),vo.getStart(),
				vo.getExpressState(),vo.getIsCheck());
>>>>>>> master
		try {
			rm = cd.insert(po);
			return rm;
		} catch (RemoteException e) {
			// TODO �Զ���ɵ� catch ��
			e.printStackTrace();
		}
		return null;
	}

	public ResultMessage createPack(PackVO vo) {
		// TODO Auto-generated method stub
		ResultMessage rm;
<<<<<<< HEAD
		CentrePackPO po = new CentrePackPO(vo.getDataOfGetin(), vo.getCentreTransferID(), vo.getArrival(),
				vo.getCarID(), vo.getJianZhuangYuan(), vo.getYaYunYuan(), vo.getList(), vo.getFee());
=======
		CentrePackPO po = new CentrePackPO(vo.getDataOfGetin(),vo.getCentreTransferID(),vo.getArrival(),vo.getCarID(),
				vo.getJianZhuangYuan(),vo.getYaYunYuan(),vo.getList(),vo.getFee(),vo.getIsCheck());
>>>>>>> master
		try {
			rm = cd.insert(po);
			return rm;
		} catch (RemoteException e) {
			// TODO �Զ���ɵ� catch ��
			e.printStackTrace();
		}
		return null;
	}

}
