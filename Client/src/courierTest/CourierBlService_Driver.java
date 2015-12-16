package courierTest;

import _enum.ResultMessage;
import vo.CourierVO;
import vo.SenderVO;
import logic.courierblservice.CourierBlService;

public class CourierBlService_Driver {
	public void drive(CourierBlService courierBlService) {
		System.out.println(courierBlService.getPrice("特快","南京","北京",12.0));
		System.out.println(courierBlService.getTime("南京","北京"));
		ResultMessage result;
		result = courierBlService.OrderInput(new SenderVO(), null);
		if (result == ResultMessage.Success)
			System.out.println("Success!");
		result = courierBlService.ConsigneeinfoInput(new CourierVO(null, null, null));
		if (result == ResultMessage.Success)
			System.out.println("Success!");
	}
}
