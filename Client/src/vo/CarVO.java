package vo;

public class CarVO {
    int number;
    int EngineNumber;
    int CarNumber;
    int ChassisNumber;
    String purchase;
    int ServiceTime;
    public CarVO( int number,int EngineNumber,int CarNumber,int ChassisNumber,String purchase,int ServiceTime){
   	 this.number=number;
   	 this.EngineNumber=EngineNumber;
   	 this.CarNumber=CarNumber;
   	 this.ChassisNumber=ChassisNumber;
   	 this.purchase=purchase;
   	 this.ServiceTime=ServiceTime;
    }
	public CarVO() {
		// TODO 自动生成的构造函数存根
	}
}
