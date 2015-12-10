package server.data.admindata;

import java.sql.ResultSet;

import _enum.ResultMessage;
import server.database.MySQLDataBase;

public class Test {
    MySQLDataBase db;
	public static void main(String[] args){
		new Test().test();
	}
	public void test(){
		db=new MySQLDataBase();
		//String sql="insert into Employee values('1000010000','huang',20,'Sender',2,'025000');";
		String sql="delete from Employee where employeeID='141250049';";
		db.delete(sql);
		
	}
}
