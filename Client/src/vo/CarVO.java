package vo;

public class CarVO {
	private String number;
	private String EngineNumber;
	private String CarNumber;
	private String ChassisNumber;
	private String purchase;
	private int ServiceTime;
	private Check c;
	public CarVO(String number, String EngineNumber, String CarNumber, String ChassisNumber, String purchase,
			int ServiceTime) {
		this.number = number;
		this.EngineNumber = EngineNumber;
		this.CarNumber = CarNumber;
		this.ChassisNumber = ChassisNumber;
		this.purchase = purchase;
		this.ServiceTime = ServiceTime;
		c=new Check();
	}

	public int checkIsNull(){
		if(number.length()==0||EngineNumber.length()==0||CarNumber.length()==0||ChassisNumber.length()==0||purchase.length()==0)
			return 0;
		return 1;
	}
	
	public int checkNumber(){
		return c.checkID(number, 10);
	}
	public int checkEngine(){
		return c.checkID(EngineNumber, 10);
	}
	public int checkCarNumber(){
		return c.checkID(CarNumber, 10);
	}
    public int checkPurchase(){
    	return 1;
    }
    public int checkService(){
    	if(ServiceTime>30||ServiceTime<0)
    		return 0;
    	return 1;
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
