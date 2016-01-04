package server.data.centredata;

import po.CentreArrivalPO;
import po.CentrePackPO;
import po.CentreTransforPO;
import server.database.MySQLDataBase;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import DailyRecord.DailyRecord;
import History.History;
import _enum.ResultMessage;
import dataservice.centredataservice.CentreDataBaseService;

public class CentreData extends UnicastRemoteObject implements CentreDataBaseService{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	MySQLDataBase db;
	History his;
	DailyRecord record;
	public CentreData(MySQLDataBase db) throws RemoteException{
		super();
		this.db=db;
		his=new History(db);
		record=new DailyRecord();
	}

	public ResultMessage insert( Object po) throws RemoteException{
		ResultMessage rm=null;
		String sql=null;
		if(po instanceof CentreArrivalPO){
			CentreArrivalPO po1=(CentreArrivalPO) po;
			sql="insert into CentreArrival values('"+po1.getID()+"','"+po1.getGetDate()+"','"+po1.getTransferID()+"','"+po1.getStart()+"','"+po1.getExpressState()+"',"+po1.getIsCheck()+",0)";
		    rm=db.insert(sql);
		    his.Centre(po1.getID(),po1.getTransferID().substring(0,6), po1.getExpressState());
		}else if(po instanceof CentreTransforPO){
			CentreTransforPO po1=(CentreTransforPO) po;

			sql="insert into CentreTransfor values("+"'"+po1.getTransferStyle()+"','"+po1.getDataOfGetin()+"','"+po1.getCentreTransferID()+
					"',"+po1.getBanHao()+",'"+po1.getStart()+"','"+po1.getArrival()+"',"+po1.getHuoGuiHao()+
					","+po1.getJianZhuangYuan()+","+po1.getList()+","+po1.getFee()+","+po1.getIsCheck()+",0)";
		    rm=db.insert(sql);
		    his.Centre(po1.getList().get(0), null, null);
			record.insert("中转中心业务员新建中转中心中转单");

		}else{
			CentrePackPO po1=(CentrePackPO) po;
			for(int i=0;i<po1.getList().size();i++){
			sql="insert into CentrePack values("+"'"+po1.getDataOfGetin()+"','"+po1.getCentreTransferID()+"','"+po1.getArrival()+
					"',"+po1.getCarID()+","+po1.getJianZhuangYuan()+","+po1.getYaYunYuan()+
					","+po1.getList().get(i)+","+po1.getFee()+","+po1.getIsCheck()+")";
			rm=db.insert(sql);
		   }
//			else {
//			CentrePackPO po1 = (CentrePackPO) po;
//			for (int i = 0; i < po1.getList().size(); i++) {
//				sql = "insert into CentrePack values(" + "'" + po1.getDataOfGetin() + "'," + po1.getCentreTransferID()
//						+ ",'" + po1.getArrival() + "'," + po1.getCarID() + "," + po1.getJianZhuangYuan() + ","
//						+ po1.getYaYunYuan() + "," + po1.getList().get(i) + "," + po1.getFee() + "," + po1.getIsCheck()
//						+ ")";
//				rm = db.insert(sql);
//			}
			record.insert("中转中心业务员新建中转中心装车单");
		}
		return rm;
	}

}
