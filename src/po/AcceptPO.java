package po;
/*订单条形码、到达日期、中转单编号、出发地、货物到达状态（损坏、完整、丢失）*/
public class AcceptPO extends SellingareaPO{
     int BarCode;
     String date;
     int number;
     int start;
     int state;
     public AcceptPO(int BarCode,String date,int number,int start,int state){
    	 this.BarCode=BarCode;
    	 this.date=date;
    	 this.number=number;
    	 this.start=start;
    	 this.state=start;
     }    
}
