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
		//String sql="insert into AdminNew values('1000010000','huang',20,'Sender',2,'025000');";
		//String sql="delete from Employee where employeeID='141250049';";
		//String sql="update Admin set id=1000000001 where id=1000000000;";
		String sql="insert into Admin values('1000000001','胡文','1000000001','管理员');";
		db.insert(sql);
		
	}
}
