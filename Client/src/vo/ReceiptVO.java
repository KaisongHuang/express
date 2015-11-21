package vo;

public class ReceiptVO {
    int number;
    int money;
    String date;
    int isCheck;
    public ReceiptVO(int money,String date, int number,int isCheck){
  	  this.number=number;
  	  this.money=money;
  	  this.date=date;
  	  this.isCheck=isCheck;
    }
	public int getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}
	public ReceiptVO() {
		
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
