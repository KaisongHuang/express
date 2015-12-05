package StartServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import dataservice.admindataservice.AdminDataService;
import dataservice.centredataservice.CentreDataService;
import server.data.admindata.AdminData;
import server.data.centredata.CentreData;
import server.database.MySQLDataBase;

public class Server {
	String ip = "127.0.0.1";
	
	MySQLDataBase db;

	public static void main(String[] args) {
          new Server().init();
	}

	public void init() {
		db = new MySQLDataBase();
		AdminStart();
		CentreStart();
	}

	public void AdminStart() {
		try {
			AdminDataService ad = new AdminData(db);
			LocateRegistry.createRegistry(8000);
			Naming.rebind("rmi://" + ip + ":8000"  + "/PersonService", ad);
			System.out.println("AdminDataService Start");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void CentreStart(){
		try{
			CentreDataService cd=new CentreData(db);
			LocateRegistry.createRegistry(8001);
			Naming.rebind("rmi://" + ip + ":8001"  + "/PersonService", cd);
			System.out.println(" CentreDataService Start");
		}catch(Exception e){
			
		}
	}
	
	public void CourierStart(){
		
	}
}
