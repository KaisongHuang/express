package vo;

public class ReceiptVO {
    String number;
    double money;
    String date;
    String sellingArea;
    String ID;
    int isCheck;
    public ReceiptVO(double money,String date, String sellingArea, String number,String ID,int isCheck){
  	  this.number=number;
  	  this.money=money;
  	  this.date=date;
  	  this.isCheck=isCheck;
  	  this.sellingArea=sellingArea;
  	  this.ID=ID;
    }
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public int getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}
	public ReceiptVO() {
		
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public void setSellingArea(String sellingArea){
		this.sellingArea=sellingArea;
	}
	
	public String getSellingArea(){
		return sellingArea;
	}
	
}
