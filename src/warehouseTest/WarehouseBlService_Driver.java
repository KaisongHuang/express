package warehouseTest;

import vo.InStorageVO;
import vo.OutStorageVO;
import _enum.ResultMessage;
import logic.warehouseblservice.WarehouseBlService;

public class WarehouseBlService_Driver {
	public void drive(WarehouseBlService warehouse) {
		ResultMessage result;
		result = warehouse.importGoods(new InStorageVO());
		if (result == ResultMessage.Error)
			System.out.println("ERROR!");

		result = warehouse.exportGoods(new OutStorageVO());
		if (result == ResultMessage.Error)
			System.out.println("ERROR!");

		result = warehouse.setAlarm();
		if (result == ResultMessage.Error)
			System.out.println("ERROR!");

		result = warehouse.checkWarehouse(0, 0);
		if (result == ResultMessage.Error)
			System.out.println("ERROR!");

		result = warehouse.summarizeWarehouse(0);
		if (result == ResultMessage.Error)
			System.out.println("ERROR!");

		result = warehouse.initWarehouse(new InStorageVO());
		if (result == ResultMessage.Error)
			System.out.println("ERROR!");
	}
}
