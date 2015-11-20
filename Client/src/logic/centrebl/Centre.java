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
		CentreTransforPO po = new CentreTransforPO(vo.getTS(), vo.getDOG(), vo.getCTI(), vo.getBH(), vo.getStart(), vo.getArrival(), vo.getHGH(), vo.getJZY(), vo.getList(), vo.getFee());
		try{
			rm=cd.insert(po);
			return rm;
		}catch (RemoteException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return null;
	}

	public ResultMessage createReceive(CentreArrivalVO vo) {
		// TODO Auto-generated method stub
		ResultMessage rm;
		CentreArrivalPO po = new CentreArrivalPO(vo.getCI(),vo.getGD(),vo.getTI(),vo.getStart(),vo.getES());
		try {
			rm=cd.insert(po);
			return rm;
		} catch (RemoteException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return null;
	}

	public ResultMessage createPack(PackVO vo) {
		// TODO Auto-generated method stub
		ResultMessage rm;
		CentrePackPO po = new CentrePackPO(vo.getDOG(),vo.getCTI(),vo.getArrival(),vo.getCI(),vo.getJZY(),vo.getYYY(),vo.getList(),vo.getFee());
		try {
			rm=cd.insert(po);
			return rm;
		} catch (RemoteException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return null;
	}



}
