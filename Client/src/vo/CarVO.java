package vo;

public class CarVO {
	String number;
	String EngineNumber;
	String CarNumber;
	String ChassisNumber;
	String purchase;
	int ServiceTime;

	public CarVO(String number, String EngineNumber, String CarNumber, String ChassisNumber, String purchase,
			int ServiceTime) {
		this.number = number;
		this.EngineNumber = EngineNumber;
		this.CarNumber = CarNumber;
		this.ChassisNumber = ChassisNumber;
		this.purchase = purchase;
		this.ServiceTime = ServiceTime;
	}

	public CarVO() {
		// TODO �Զ���ɵĹ��캯����
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEngineNumber() {
		return EngineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		EngineNumber = engineNumber;
	}

	public String getCarNumber() {
		return CarNumber;
	}

	public void setCarNumber(String carNumber) {
		CarNumber = carNumber;
	}

	public String getChassisNumber() {
		return ChassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		ChassisNumber = chassisNumber;
	}

	public String getPurchase() {
		return purchase;
	}

	public void setPurchase(String purchase) {
		this.purchase = purchase;
	}

	public int getServiceTime() {
		return ServiceTime;
	}

	public void setServiceTime(int serviceTime) {
		ServiceTime = serviceTime;
	}

}
