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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
      
      
}
