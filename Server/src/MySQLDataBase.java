import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import po.AcceptPO;
import Server_enum.ResultMessage;


public class MySQLDataBase {
      PreparedStatement[][] ps=new PreparedStatement[20][4];
	 
	
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
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
    	  try {
			con=DriverManager.getConnection(dbURL,userName,password);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
    	  initPS(con);
    	  return con;
      }
      public void initPS(Connection con){
    	  try {
			ps[0][0]=con.prepareStatement("insert into Accept(BarCode,date,number,start,state) values(?,?,?,?,?)");
			ps[1][0]=con.prepareStatement("insert into Account(bankAccount,balance) values(?,?)");
			ps[2][0]=con.prepareStatement("insert into Admin(id,name,password,role) values(?,?,?,?)");
			ps[3][0]=con.prepareStatement("insert into CarPack(date,number,start,destination,supervisor,supercargo,list,fee) values(?,?,?,?,?,?,?,?)");
			ps[4][0]=con.prepareStatement("insert into Car(number,EngineNumber,CarNumber,ChassisNumber,purchase,ServiceTime) values(?,?,?,?,?,?)");
			ps[5][0]=con.prepareStatement("insert into CentreArrival(ci,gd,ti,start,es) values(?,?,?,?,?)");
			ps[6][0]=con.prepareStatement("insert into CentrePack(dog,cti,arrival,ci,jzy,yyy,list,fee) values(?,?,?,?,?)");
			
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
      }
      public  ResultMessage insert(Connection con,String tableName,Object ob){
    	  String sql=getInsertSql(tableName,ob);
    	  Statement st;
    	  try{
    		  st=(Statement) con.createStatement();
    		  int count= ((java.sql.Statement) st).executeUpdate(sql);
    		  System.out.println("向"+tableName+"中插入"+count+"条数据成功");
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
    		  System.out.println("成功删除");
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
    	  String sql="select * from "+tableName+" where ";
    			 
    	  return null;
      }
      
      public static String getUpdateSql(String tableName,Object ob){
    	  String sql;
    	  if(ob instanceof AcceptPO){
    		  sql="update "+tableName+" set BarCode=?,date=?,number=?,start=?,state=?";
    	  }
    	  return null;
      }
      
      public static String getDeleteSql(String tableName,Object ob){
    	  return null;
      }
      public static String getInsertSql(String tableName,Object ob){
    	  
    	
    		  
    	  return null;
    	  
      }
}
