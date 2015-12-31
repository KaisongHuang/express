package data.datafactory;

import data.admindata.AdminData;
import data.centredata.CentreData;
import data.courierdata.CourierData;
import data.datafactoryservice.DataFactoryService;
import data.financedata.FinanceData;
import data.logindata.LoginData;
import data.managerdata.ManagerData;
import data.sellingareadata.SellingAreaData;
import data.senderdata.SenderData;
import data.warehousedata.WarehouseData;

public class DataFactory {

	public static AdminData getAdminDataService(){
		return new AdminData();
	}
	
	public static CentreData getCentreDataService(){
		return new CentreData();
	}
	public static CourierData getCourierDataService(){
		return new CourierData();
	}
	public static FinanceData getFinanceDataService(){
		return new FinanceData();
	}
	
	public static LoginData getLoginDataService(){
		return new LoginData();
	}
	public static ManagerData getManagerDataService(){
		return new ManagerData();
	}
	public static SellingAreaData getSellingAreaDataService(){
		return new SellingAreaData();
	}
	public static SenderData getSenderDataService(){
		return new SenderData();
	}
	public static WarehouseData getWarehosueDataService(){
		return new WarehouseData();
	}
}
