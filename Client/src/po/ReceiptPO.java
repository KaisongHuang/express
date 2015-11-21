package po;

public class ReceiptPO extends SellingareaPO{
      public int getIsChenk() {
		return isChenk;
	}
	public void setIsChenk(int isChenk) {
		this.isChenk = isChenk;
	}
	int number;
      int money;
      String date;
      int isChenk;
      public ReceiptPO(int money,String date, int number,int isCheck){
    	  this.number=number;
    	  this.money=money;
    	  this.date=date;
    	  this.isChenk=isCheck;
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
