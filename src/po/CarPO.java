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
}
