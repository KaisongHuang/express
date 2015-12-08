package server.data.admindata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;

import po.AdminPO;
import server.database.MySQLDataBase;
import _enum.ResultMessage;
import dataservice.admindataservice.AdminDataBaseService;

public class AdminData extends UnicastRemoteObject implements AdminDataBaseService{
    MySQLDataBase db;
	public AdminData(MySQLDataBase db) throws RemoteException{
		super();
		this.db=db;
	}
	public AdminPO find( String id) throws RemoteException{
	    
		String sql="select * from Admin where id='"+id+"';";
		ResultSet rs=db.find(sql);
		String i=null;
		String n=null;
		String p=null;
		String r=null;
		try {
			while(rs.next()){
				i=rs.getString(1);
				n=rs.getString(2);
				p=rs.getString(3);
				r=rs.getString(4);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new AdminPO(i,n,p,r);
	}

	public ResultMessage update(Object po) throws RemoteException{
		AdminPO po1=(AdminPO) po;
		String sql="update Admin set id='"+po1.getId()+"',name='"+po1.getName()+"',password='"+po1.getPassword()+"',role='"+po1.getRole()+"';";
		ResultMessage rm=db.update(sql);
		return rm;
	}

	public ResultMessage insert(Object po) throws RemoteException{
		AdminPO po1=(AdminPO) po;
		String sql="insert into Admin values('"+po1.getId()+"','"+po1.getName()+"','"+po1.getPassword()+"','"+po1.getRole()+"');";
		ResultMessage rm=db.insert(sql);
		return rm;
	}

	public ResultMessage delete(String id) throws RemoteException{
		String sql="delete from Admin where id='"+id+"';";
		ResultMessage rm=db.delete(sql);
		return rm;
	}

	

}
