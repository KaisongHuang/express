package server.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import _enum.ResultMessage;

public class Test {

	public static void main(String[] args){
		new Test().init();
	}
	public void init(){
		MySQLDataBase db=new MySQLDataBase();
		ResultSet rs=db.find("select * from Employee where id='1000000001';");
		try {
			
			while(rs.next())
			System.out.println(rs.getString(2));
			System.out.println("ok");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
//		db.insert("insert into employee values('141250047','hucgh',20,'Admin',1.0,'1');");
	}
}
