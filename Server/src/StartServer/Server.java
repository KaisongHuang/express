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
		DataStart();
		
	}

	public void DataStart() {
		try {
			AdminDataService ad = new AdminData(db);
			CentreDataService cd=new CentreData(db);
			LocateRegistry.createRegistry(8000);
			Naming.rebind("rmi://" + ip + ":8000"  + "/PersonService", ad);
			Naming.rebind("rmi://" + ip + ":8000"  + "/PersonService", cd);
			System.out.println("AdminDataService Start");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void CourierStart(){
		
	}
}
