package server.data.managerdata;

import java.sql.ResultSet;

import po.EmployeePO;
import po.InstitutionPO;
import po.ManagerPO;
import server.database.MySQLDataBase;
import _enum.ResultMessage;
import dataservice.managerdataservice.ManagerDataService;



public class ManagerData implements ManagerDataService{

	public ResultMessage insert(MySQLDataBase db, Object po, String tableName) {
		
		String sql="insert into "+tableName+" values(";
		ResultMessage rm;
		if(tableName.equals("Employee")){
			EmployeePO po1=(EmployeePO) po;
			sql=sql+"'"+po1.getEmployeeID()+"','"+po1.getEmployeeName()+"',"+po1.getEmployeeAging()+",'"+po1.getEmployeePosition()+"',"+po1.getTimeOfWorking()+",'"+po1.getBelongToWho()+"')";
			rm=db.insert(sql);
		}else{
			InstitutionPO po1=(InstitutionPO) po;
			sql=sql+"'"+po1.getOrganizationID()+"','"+po1.getName()+"')";
			rm=db.delete(sql);
		}
		return rm;
	}

	public ManagerPO find(MySQLDataBase db, String id, String tableName) {
		String sql="select * from "+tableName+" where ";
		ResultSet rs;
		if(tableName.equals("Employee")){

			sql=sql+"employeeID="+id;
			rs=db.find(sql);
		}else{
		
			sql=sql+"organizationID="+id;
			rs=db.find(sql);
		}
		return null;
	
	}

	public Object find(MySQLDataBase db, String tableName) {
	
		return null;
	}

	public ResultMessage update(MySQLDataBase db, Object po, String tableName) {
		
		return null;
	}

	public ResultMessage delete(MySQLDataBase db, Object po, String tableName) {
		String sql="delete from "+tableName+" where ";
		ResultMessage rm;
		if(tableName.equals("Employee")){
			EmployeePO po1=(EmployeePO) po;
			sql=sql+"employeeID="+po1.getEmployeeID();
			rm=db.delete(sql);
		}else{
			InstitutionPO po1=(InstitutionPO) po;
			sql=sql+"organizationID="+po1.getOrganizationID();
			rm=db.delete(sql);
		}
		return rm;
	}

}
