package server.data.admindata;

import java.sql.ResultSet;

import po.AdminPO;
import server.database.MySQLDataBase;
import _enum.ResultMessage;
import dataservice.admindataservice.AdminDataService;

public class AdminData implements AdminDataService{

	public AdminPO find(MySQLDataBase db, String id, String tableName) {
	    
		String sql="select * from "+tableName+" where id="+id;
		ResultSet rs=db.find(sql);
		return null;
	}

	public ResultMessage update(MySQLDataBase db, Object po, String tableName) {
		AdminPO po1=(AdminPO) po;
		String sql="update "+tableName+" set id="+po1.getId()+","+"name="+po1.getName()+","+"password="+po1.getPassword()+","+"role="+po1.getRole();
		ResultMessage rm=db.update(sql);
		return rm;
	}

	public ResultMessage insert(MySQLDataBase db, Object po, String tableName) {
		AdminPO po1=(AdminPO) po;
		String sql="insert into "+tableName+" values("+po1.getId()+",'"+po1.getName()+"',"+po1.getPassword()+"',"+po1.getRole()+"')";
		ResultMessage rm=db.insert(sql);
		return rm;
	}

	public ResultMessage delete(MySQLDataBase db, String id, String tableName) {
		String sql="delete from "+tableName+" where id="+id;
		ResultMessage rm=db.delete(sql);
		return rm;
	}

	

}
