package po;
/*�������š��������š������š����̺š�����ʱ�䡢����ʱ��*/
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
