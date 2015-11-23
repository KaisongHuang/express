package StartServer;

import po.CarPO;
import server.data.sellingareadata.SellingAreaData;
import server.database.MySQLDataBase;
import dataservice.sellingareadataservice.SellingAreaDataService;

public class StartServer {
	  SellingAreaDataService s=new SellingAreaData();
	  MySQLDataBase db=new MySQLDataBase();
	  
      public static void main(String[] args){
    	  System.out.println("ok");
    	 new StartServer().test(); 
      }
      
      public void test(){
    	  System.out.println("test ok");
    	  s.insert(db,new CarPO(1000000000,1000000001,1000000002,1000000003,"154",10),"Car");
      }
}
