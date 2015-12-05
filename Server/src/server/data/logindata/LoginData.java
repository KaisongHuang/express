package server.data.logindata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;

import dataservice.logindataservice.LoginDataBaseService;
import po.AdminPO;
import po.EmployeePO;
import server.database.MySQLDataBase;

public class LoginData extends UnicastRemoteObject implements LoginDataBaseService{
    MySQLDataBase db;
	public LoginData(MySQLDataBase db) throws RemoteException{
		super();
		this.db=db;
	}
	public EmployeePO login(AdminPO po) throws RemoteException{

		String sql="select * from Admin where id='"+po.getId()+"' and password='"+po.getPassword()+"';";
		ResultSet rs=db.find(sql);
		try {
			
				String sql2="select * from Employee where EmployeeID='"+po.getId()+"';";
				ResultSet rs1=db.find(sql2);
				rs1.first();
			    return new EmployeePO(rs1.getString(0),rs1.getString(1),rs1.getInt(2),rs1.getString(3),rs1.getDouble(4),rs.getString(5));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}

}
