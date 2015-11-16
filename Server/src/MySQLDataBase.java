import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLDataBase {
      public static Connection getMySQL_Con(String driverClassName,String serverHost,String serverPort,String dbName,String userName,
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
      
      public static Connection getConnection(String driverClassName,String dbURL,String userName,String password){
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
    	  return con;
      }
}
