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
	String ip = "127.0.0.1";
	int port;
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
			Naming.rebind("rmi://" + ip + ":8000"  + "/AdminDataService", ad);
			Naming.rebind("rmi://" + ip + ":8000"  + "/CentreDataService", cd);
			Naming.rebind("rmi://"+ip+":8000"+"/LoginDataService", ld);
			Naming.rebind("rmi://" + ip + ":8000"  + "/CourierDataService", courier);
			Naming.rebind("rmi://" + ip + ":8000"  + "/FinanceDataService", finance);
			Naming.rebind("rmi://" + ip + ":8000"  + "/ManagerDataService", manager);
			Naming.rebind("rmi://" + ip + ":8000"  + "/SellingAreaDataService", sellingarea);
			Naming.rebind("rmi://" + ip + ":8000"  + "/SenderDataService", sender);
			Naming.rebind("rmi://" + ip + ":8000"  + "/WareHouseDataService", WareHouse);
			System.out.println("AdminDataService Start");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void CourierStart(){
		
	}
}
