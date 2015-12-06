package server.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import _enum.ResultMessage;




public class MySQLDataBase {
    
	   Connection con;
	   Statement st;
	  public MySQLDataBase(){
		  con=getMySQL_Con(null, null, null, "express", "root",null);
		  try {
			st=(Statement) con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	  }
      public  Connection getMySQL_Con(String driverClassName,String serverHost,String serverPort,String dbName,String userName,
    		  String password){
    	  if(driverClassName==null)
    		  driverClassName="com.mysql.jdbc.Driver";
    	  if(serverHost==null){
    		  serverHost="127.0.0.1";
    		  
    	  }
    	  if(serverPort==null){
    		  serverPort="3306";
    	  }
    	  String dbURL="jdbc:mysql://"+serverHost+":"+serverPort+"/"+dbName;
    	  return getConnection(driverClassName,dbURL,userName,password);
      }
      
      public  Connection getConnection(String driverClassName,String dbURL,String userName,String password){
    	  
    	  try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			// TODO �Զ���ɵ� catch ��
			e.printStackTrace();
		}
    	  try {
			con=DriverManager.getConnection(dbURL,userName,password);
		} catch (SQLException e) {
			// TODO �Զ���ɵ� catch ��
			
			e.printStackTrace();
		}
    	  
    	  return con;
      }
      
      public  ResultMessage insert(String sql){
    	  try {
    		  
			  int c=((java.sql.Statement) st).executeUpdate(sql);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return ResultMessage.Fail;
		}
    	  return ResultMessage.Success;
      }
      
      
      public  ResultSet find(String sql){
    	  
    	  try {
    		  
			  ResultSet rs=((java.sql.Statement) st).executeQuery(sql);
			 
System.out.println("database ok");
			  return rs;
		} catch (SQLException e) {
			
			e.printStackTrace();		
		}

    	  return null;
      }
      
      public  ResultMessage delete(String sql){
    	  try {
    	
			  int c=((java.sql.Statement) st).executeUpdate(sql);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return ResultMessage.Fail;
		}
    	  return ResultMessage.Success;
    	  
      }
      
      public  ResultMessage update(String sql){
    	  try {
    		
			  int c=((java.sql.Statement) st).executeUpdate(sql);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return ResultMessage.Fail;
		}
    	  return ResultMessage.Success;
    	  
      }
}    