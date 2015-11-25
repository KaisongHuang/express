package warehouseTest;

import vo.InStorageVO;
import vo.OutStorageVO;
import _enum.ResultMessage;
import logic.warehouseblservice.WarehouseBlService;

public class WarehouseBlService_Driver {
	public void drive(WarehouseBlService warehouse) {
		ResultMessage result;
		result = warehouse.importGoods(new InStorageVO(null, null, null, null, null, 0, 0, 0, 0));
		if (result == ResultMessage.Error)
			System.out.println("ERROR!");

		result = warehouse.exportGoods(new OutStorageVO(null, null, null, null, null, null, 0));
		if (result == ResultMessage.Error)
			System.out.println("ERROR!");

		result = warehouse.setAlarm(98);
		if (result == ResultMessage.Error)
			System.out.println("ERROR!");
		
		result = warehouse.checkAlarm();
		if (result == ResultMessage.Error)
			System.out.println("ERROR!");

//		result = warehouse.checkWarehouse("0","0");
//		if (result == ResultMessage.Error)
//			System.out.println("ERROR!");

//		result = warehouse.summarizeWarehouse();
//		if (result == ResultMessage.Error)
//			System.out.println("ERROR!");

		result = warehouse.initWarehouse(new InStorageVO(null, null, null, null, null, 0, 0, 0, 0));
		if (result == ResultMessage.Error)
			System.out.println("ERROR!");
	}
}
