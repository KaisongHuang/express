package logic.logicfactory;

import logic.adminbl.Admin;
import logic.centrebl.Centre;
import logic.courierbl.Courier;
import logic.financebl.Finance;
import logic.loginbl.Login;
import logic.managerbl.Manager;
import logic.sellingareabl.SellingArea;
import logic.senderbl.Sender;
import logic.warehousebl.Warehouse;

public class LogicFactory {

	public static Admin getAdminService(){
		return new Admin();
	}
	
	public static Centre getCentreService(){
		return new Centre();
	}
	public static Courier getCourierService(){
		return new Courier();
	}
	public static Finance getFinanceService(){
		return new Finance();
	}
	public static Manager getManagerService(){
		return new Manager();
	}
	public static SellingArea getSellingAreaService(){
		return new SellingArea();
	}
	public static Sender getSenderService(){
		return new Sender();
	}
	public static Warehouse getWarehouseService(){
		return new Warehouse();
	}
	public static Login getLoginService(){
		return new Login();
	}
}
