package server.data.managerdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;

import po.EmployeePO;
import po.InstitutionPO;
import po.ManagerPO;
import server.database.MySQLDataBase;
import _enum.ResultMessage;
import dataservice.managerdataservice.ManagerDataService;



public class ManagerData extends UnicastRemoteObject implements ManagerDataService{
	MySQLDataBase db;
	public ManagerData(MySQLDataBase db) throws RemoteException{
		super();
		this.db=db;
	}
	public ResultMessage insert(Object po) throws RemoteException{
		
		String sql;
		ResultMessage rm;
		if(po instanceof EmployeePO){
			EmployeePO po1=(EmployeePO) po;
			sql="insert into Employee values('"+po1.getEmployeeID()+"','"+po1.getEmployeeName()+"',"+po1.getEmployeeAging()+",'"+po1.getEmployeePosition()+"',"+po1.getTimeOfWorking()+",'"+po1.getBelongToWho()+"')";
			rm=db.insert(sql);
		}else{
			InstitutionPO po1=(InstitutionPO) po;
			sql="insert into Employee values('"+po1.getOrganizationID()+"','"+po1.getName()+"')";
			rm=db.delete(sql);
		}
		return rm;
	}

	public ManagerPO findEmployee(String id) throws RemoteException{
		String sql;
		ResultSet rs;
		sql="select * from Employee where "+"employeeID="+id;
	    rs=db.find(sql);
	    
		return null;
	
	}
	public ManagerPO findInstitution(String id) throws RemoteException{
		String sql;
		ResultSet rs;
		sql="select * from Institution where "+"InstitutionID="+id;
	    rs=db.find(sql);
	    
		return null;
	}
	public Object find() throws RemoteException{
	
		return null;
	}

	public ResultMessage update( Object po) {
		
		return null;
	}

	public ResultMessage delete( Object po) {
		String sql;
		ResultMessage rm;
		if(po instanceof EmployeePO){
			EmployeePO po1=(EmployeePO) po;
			sql="delete from Employee where employeeID="+po1.getEmployeeID();
			rm=db.delete(sql);
		}else{
			InstitutionPO po1=(InstitutionPO) po;
			sql="delete from Institution where organizationID="+po1.getOrganizationID();
			rm=db.delete(sql);
		}
		return rm;
	}

}
