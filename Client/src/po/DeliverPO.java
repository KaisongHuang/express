package po;
/*托运订单条形码、到达日期、派件员编号 */
public class DeliverPO extends SellingareaPO{
     int BarCode;
     String date;
     int number;
     public DeliverPO(int BarCode,String date,int number){
    	 this.BarCode=BarCode;
    	 this.date=date;
    	 this.number=number;
     }
}
