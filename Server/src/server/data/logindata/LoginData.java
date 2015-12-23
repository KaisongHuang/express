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
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MySQLDataBase db;
	public LoginData(MySQLDataBase db) throws RemoteException{
		super();
		this.db=db;
	}
	public EmployeePO login(AdminPO po) throws RemoteException{
System.out.println("远程方法调用成功");
		String sql="select * from Admin where id='"+po.getId()+"' and password='"+po.getPassword()+"';";
		ResultSet rs=db.find(sql);
System.out.println(po.getId());		
		try {
			if(rs.next()){
System.out.println("密码正确");
				String sql2="select * from Employee where id='"+po.getId()+"';";
				ResultSet rs1=db.find(sql2);
				String id = null;
				String name = null;
				int age = 0;
				String position = null;
			    double time = 0;
			    String belong = null;
				while(rs1.next()){
					id=rs1.getString(1);
					name=rs1.getString(2);
					age=rs1.getInt(3);
					position=rs1.getString(4);
					time=rs1.getDouble(5);
					belong=rs1.getString(6);
					System.out.println(id);
				}
				//rs1.last();
				rs.close();
				System.out.println(id);
			if(id==null)
				return null;
             return new EmployeePO(id,name,age,position,time,belong);
                
	       }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}

}
