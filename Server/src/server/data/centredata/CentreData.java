package server.data.centredata;

import po.CentreArrivalPO;
import po.CentrePackPO;
import po.CentreTransforPO;
import server.database.MySQLDataBase;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import _enum.ResultMessage;
import dataservice.centredataservice.CentreDataBaseService;

public class CentreData extends UnicastRemoteObject implements CentreDataBaseService{
	MySQLDataBase db;
	
	public CentreData(MySQLDataBase db) throws RemoteException{
		super();
		this.db=db;
	}

	public ResultMessage insert( Object po) throws RemoteException{
		ResultMessage rm=null;
		String sql=null;
		if(po instanceof CentreArrivalPO){
			CentreArrivalPO po1=(CentreArrivalPO) po;
			sql="insert into CentreArrival values("+po1.getCentreID()+",'"+po1.getGetDate()+"',"+po1.getTransferID()+",'"+po1.getStart()+"','"+po1.getExpressState()+"',"+po1.getIsCheck()+"',"+po1.getIsInstorage()+")";
		    rm=db.insert(sql);
		}else if(po instanceof CentreTransforPO){
			CentreTransforPO po1=(CentreTransforPO) po;
			for(int i=0;i<po1.getList().size();i++){
			sql="insert into CentreTransfor values("+"'"+po1.getTransferStyle()+"','"+po1.getDataOfGetin()+"',"+po1.getCentreTransferID()+
					","+po1.getBanHao()+",'"+po1.getStart()+"','"+po1.getArrival()+"',"+po1.getHuoGuiHao()+
					","+po1.getJianZhuangYuan()+","+po1.getList().get(i)+","+po1.getFee()+","+po1.getIsCheck()+","+po1.getIsOutStorage()+")";
		    rm=db.insert(sql);
			}
		}else{
			CentrePackPO po1=(CentrePackPO) po;
			for(int i=0;i<po1.getList().size();i++){
			sql="insert into CentrePackPO values("+"'"+po1.getDataOfGetin()+"',"+po1.getCentreTransferID()+",'"+po1.getArrival()+
					"',"+po1.getCarID()+","+po1.getJianZhuangYuan()+","+po1.getYaYunYuan()+
					","+po1.getList().get(i)+","+po1.getFee()+","+po1.getIsCheck()+")";
			rm=db.insert(sql);
			}
		}
		return rm;
	}

}
