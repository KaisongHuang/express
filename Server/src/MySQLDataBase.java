import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import Server_enum.ResultMessage;


public class MySQLDataBase {
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
    	  Connection con=null;
    	  try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
    	  try {
			con=DriverManager.getConnection(dbURL,userName,password);
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
    	  return con;
      }
      
      public  ResultMessage insert(Connection con,String tableName,Object ob){
    	  String sql=getInsertSql(tableName,ob);
    	  Statement st;
    	  try{
    		  st=(Statement) con.createStatement();
    		  int count= ((java.sql.Statement) st).executeUpdate(sql);
    		  System.out.println("��"+tableName+"�в���"+count+"�����ݳɹ�");
    	  }catch(SQLException ex){
    		  return ResultMessage.Fail;
    	  }
    	  return ResultMessage.Success;
      }
      
      
      public static Object find(Connection con,String tableName,Object ob){
    	  String sql=getSelectSql(tableName,ob);
    	  Statement st;
    	  try{
    		  st=(Statement) con.createStatement();
    		  ResultSet rs=((java.sql.Statement) st).executeQuery(sql);
    		  
    	  }catch(SQLException ex){
    		  return null;
    	  }
    	  return null;
      }
      
      public  ResultMessage delete(Connection con,String tableName,Object ob){
    	  String sql=getDeleteSql(tableName,ob);
    	  Statement st;
    	  try{
    		  st=(Statement) con.createStatement();
    		  ((java.sql.Statement) st).executeQuery(sql);
    		  System.out.println("�ɹ�ɾ��");
    	  }catch(SQLException ex){
    		  return ResultMessage.Fail;
    	  }
    	  return ResultMessage.Success;
    	  
      }
      
      public  ResultMessage update(Connection con,String tableName,Object ob){
    	  String sql=getUpdateSql(tableName,ob);
    	  Statement st;
    	  try{
    		  st=(Statement) con.createStatement();
    		  ((java.sql.Statement) st).executeQuery(sql);
    	  }catch(SQLException ex){
    		  return ResultMessage.Fail;
    	  }
    	  return ResultMessage.Success;
    	  
      }
      public static String getSelectSql(String tableName,Object ob){
    	  return null;
      }
      
      public static String getUpdateSql(String tableNmae,Object ob){
    	  return null;
      }
      
      public static String getDeleteSql(String tableName,Object ob){
    	  return null;
      }
      public static String getInsertSql(String tableName,Object ob){
    	  
    	  return null;
    	  
      }
}
