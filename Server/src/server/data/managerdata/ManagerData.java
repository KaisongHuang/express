package server.data.managerdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.util.ArrayList;

import po.DistanceAndFee;
import po.EmployeePO;
import po.InstitutionPO;
import po.ManagerPO;
import server.database.MySQLDataBase;
import _enum.ResultMessage;
import dataservice.managerdataservice.ManagerDataBaseService;



public class ManagerData extends UnicastRemoteObject implements ManagerDataBaseService{
	MySQLDataBase db;
	public ManagerData(MySQLDataBase db) throws RemoteException{
		super();
		this.db=db;
	}
	public ResultMessage insert(Object po) throws RemoteException{
		
		String sql;
		ResultMessage rm=null;
		if(po instanceof EmployeePO){
			EmployeePO po1=(EmployeePO) po;
			sql="insert into Employee values('"+po1.getEmployeeID()+"','"+po1.getEmployeeName()+"',"+po1.getEmployeeAging()+",'"+po1.getEmployeePosition()+"',"+po1.getTimeOfWorking()+",'"+po1.getBelongToWho()+"')";
			rm=db.insert(sql);
		}else if(po instanceof InstitutionPO){
			InstitutionPO po1=(InstitutionPO) po;
			sql="insert into Institution values('"+po1.getOrganizationID()+"','"+po1.getName()+"')";
			rm=db.delete(sql);
		}else {
			DistanceAndFee po1=(DistanceAndFee) po;
			ArrayList<String> list1=po1.getCity1();
			ArrayList<String> list2=po1.getCity2();
			for(int i=0;i<list1.size();i++){
				sql="insert into DistanceAndFee values('"+list1.get(i)+"','"+list2.get(i)+","+po1.getFee()+","+po1.getDistance()+");";
			}
		}
		return rm;
	}

	public EmployeePO findEmployee(String id) throws RemoteException{
		String sql;
		ResultSet rs;
		sql="select * from Employee where "+"employeeID="+id;
	    rs=db.find(sql);
	    
		return null;
	
	}
	public InstitutionPO findInstitution(String id) throws RemoteException{
		String sql;
		ResultSet rs;
		sql="select * from Institution where "+"InstitutionID="+id;
	    rs=db.find(sql);
	    
		return null;
	}
	public Object find() throws RemoteException{
	
		return null;
	}

	public ResultMessage update( Object po) throws RemoteException{
		
		return null;
	}

	public ResultMessage update(ManagerPO po)throws RemoteException{
		return null;
	}
	public ResultMessage delete( Object po) throws RemoteException{
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
