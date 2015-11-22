package server.data.centredata;

import po.CentreArrivalPO;
import po.CentrePackPO;
import po.CentreTransforPO;
import server.database.MySQLDataBase;
import _enum.ResultMessage;
import dataservice.centredataservice.CentreDataService;

public class CentreData implements CentreDataService{

	public ResultMessage insert(MySQLDataBase db, Object po, String tableName) {
		ResultMessage rm=null;
		String sql="insert into "+tableName+" values(";
		if(tableName.equals("CentreArrival")){
			CentreArrivalPO po1=(CentreArrivalPO) po;
			sql=sql+po1.getCentreID()+",'"+po1.getGetDate()+"',"+po1.getTransferID()+",'"+po1.getStart()+"','"+po1.getExpressState()+"',"+po1.getIsCheck()+")";
		    rm=db.insert(sql);
		}else if(tableName.equals("CentreTransfor")){
			CentreTransforPO po1=(CentreTransforPO) po;
			for(int i=0;i<po1.getList().size();i++){
			sql=sql+"'"+po1.getTransferStyle()+"','"+po1.getDataOfGetin()+"',"+po1.getCentreTransferID()+
					","+po1.getBanHao()+",'"+po1.getStart()+"','"+po1.getArrival()+"',"+po1.getHuoGuiHao()+
					","+po1.getJianZhuangYuan()+","+po1.getList().get(i)+","+po1.getFee()+","+po1.getIsCheck()+")";
		    rm=db.insert(sql);
			}
		}else{
			CentrePackPO po1=(CentrePackPO) po;
			for(int i=0;i<po1.getList().size();i++){
			sql=sql+"'"+po1.getDataOfGetin()+"',"+po1.getCentreTransferID()+",'"+po1.getArrival()+
					"',"+po1.getCarID()+","+po1.getJianZhuangYuan()+","+po1.getYaYunYuan()+
					","+po1.getList().get(i)+","+po1.getFee()+","+po1.getIsCheck()+")";
			rm=db.insert(sql);
			}
		}
		return rm;
	}

}
