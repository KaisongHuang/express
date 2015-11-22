package server.data.warehousedata;

import java.sql.ResultSet;
import java.util.ArrayList;

import po.InStoragePO;
import po.OutStoragePO;
import server.database.MySQLDataBase;
import _enum.ResultMessage;
import dataservice.warehousedataservice.WareHouseDataService;

public class WareHouseData implements WareHouseDataService{

	public ResultMessage insert(MySQLDataBase db, Object po, String tableName) {
		String sql="insert into "+tableName+" values(";
		if(tableName.equals("InStorage")){
			InStoragePO po1=(InStoragePO) po;
			sql=sql+po1.getId()+",'"+po1.getIndate()+"','"+po1.getDestination()+
					"',"+po1.getPos_qu()+","+po1.getPos_pai()+","+po1.getPos_jia()+
					","+po1.getPos_wei()+","+po1.getIsCheck()+")";
		}else{
			OutStoragePO po1=(OutStoragePO) po;
			sql=sql+po1.getId()+",'"+po1.getDestination()+"','"+po1.getOutdate()+"','"+po1.getTransportation()+
					"',"+po1.getTrans_id()+","+po1.getIsCheck()+")";
		}
		ResultMessage rm=db.insert(sql);
		return rm;
	}

	public ArrayList<InStoragePO> findIn(MySQLDataBase db,String date, String tableName) {
		String sql="select * from "+tableName+" where indate="+date;
		ResultSet rs=db.find(sql);
		return null;
	}

	public ArrayList<OutStoragePO> findOut(MySQLDataBase db, String date,
			String tableName) {
		String sql="select * from "+tableName+" where outdate="+date;
		ResultSet rs=db.find(sql);
		return null;
	
	}
      
}
