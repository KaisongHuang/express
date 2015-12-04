package StartServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import dataservice.admindataservice.AdminDataService;
import server.data.admindata.AdminData;
import server.database.MySQLDataBase;

public class Server {
	String ip = "127.0.0.1";
	int port = 8000;
	MySQLDataBase db;

	public static void main(String[] args) {

	}

	public void init() {
		db = new MySQLDataBase();
		AdminStart();
	}

	public void AdminStart() {
		try {
			AdminDataService ad = new AdminData(db);
			LocateRegistry.createRegistry(port);
			Naming.rebind("rmi://" + ip + ":" + port + "/PersonService", ad);
			System.out.println("Service Start");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
