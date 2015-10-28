package po;

public class ReceiptPO extends SellingareaPO{
      int number;
      int money;
      String date;
      public ReceiptPO(int money,String date, int number){
    	  this.number=number;
    	  this.money=money;
    	  this.date=date;
      }
}
