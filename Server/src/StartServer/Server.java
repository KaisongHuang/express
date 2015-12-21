package StartServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import dataservice.admindataservice.AdminDataBaseService;
import dataservice.centredataservice.CentreDataBaseService;
import dataservice.courierdataservice.CourierDataBaseService;
import dataservice.financedataservice.FinanceDataBaseService;
import dataservice.logindataservice.LoginDataBaseService;
import dataservice.managerdataservice.ManagerDataBaseService;
import dataservice.sellingareadataservice.SellingAreaDataBaseService;
import dataservice.senderdataservice.SenderDataBaseService;
import dataservice.warehousedataservice.WareHouseDataBaseService;
import server.data.admindata.AdminData;
import server.data.centredata.CentreData;
import server.data.courierdata.CourierData;
import server.data.financedata.FinanceData;
import server.data.logindata.LoginData;
import server.data.managerdata.ManagerData;
import server.data.sellingareadata.SellingAreaData;
import server.data.senderdata.SenderData;
import server.data.warehousedata.WareHouseData;
import server.database.MySQLDataBase;

public class Server {
	String ip = "172.25.135.248";
	int port=8000;
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
			AdminDataBaseService ad = new AdminData(db);
			CentreDataBaseService cd=new CentreData(db);
			LoginDataBaseService ld=new LoginData(db);
			CourierDataBaseService courier=new CourierData(db);
			FinanceDataBaseService finance=new FinanceData(db);
			ManagerDataBaseService manager=new ManagerData(db);
			SellingAreaDataBaseService sellingarea=new SellingAreaData(db);
			SenderDataBaseService sender=new SenderData(db);
			WareHouseDataBaseService WareHouse=new WareHouseData(db);
			LocateRegistry.createRegistry(8000);
			Naming.rebind("rmi://" + ip + ":"+port + "/AdminDataService", ad);
			Naming.rebind("rmi://" + ip + ":"+port  + "/CentreDataService", cd);
			Naming.rebind("rmi://"+ip+":"+port+"/LoginDataService", ld);
			Naming.rebind("rmi://" + ip + ":"+port  + "/CourierDataService", courier);
			Naming.rebind("rmi://" + ip + ":"+port  + "/FinanceDataService", finance);
			Naming.rebind("rmi://" + ip + ":"+port  + "/ManagerDataService", manager);
			Naming.rebind("rmi://" + ip + ":"+port  + "/SellingAreaDataService", sellingarea);
			Naming.rebind("rmi://" + ip + ":"+port + "/SenderDataService", sender);
			Naming.rebind("rmi://" + ip + ":"+port + "/WareHouseDataService", WareHouse);
			System.out.println("AdminDataService Start");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void CourierStart(){
		
	}
}
