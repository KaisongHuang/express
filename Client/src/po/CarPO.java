package po;
/*车辆代号、发动机号、车辆号、底盘号、购买时间、服役时间*/
public class CarPO extends SellingareaPO{
     int number;
     int EngineNumber;
     int CarNumber;
     int ChassisNumber;
     String purchase;
     int ServiceTime;
    
     public CarPO( int number,int EngineNumber,int CarNumber,int ChassisNumber,String purchase,int ServiceTime){
    	 this.number=number;
    	 this.EngineNumber=EngineNumber;
    	 this.CarNumber=CarNumber;
    	 this.ChassisNumber=ChassisNumber;
    	 this.purchase=purchase;
    	 this.ServiceTime=ServiceTime;
     }
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getEngineNumber() {
		return EngineNumber;
	}
	public void setEngineNumber(int engineNumber) {
		EngineNumber = engineNumber;
	}
	public int getCarNumber() {
		return CarNumber;
	}
	public void setCarNumber(int carNumber) {
		CarNumber = carNumber;
	}
	public int getChassisNumber() {
		return ChassisNumber;
	}
	public void setChassisNumber(int chassisNumber) {
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
