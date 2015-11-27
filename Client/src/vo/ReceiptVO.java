package vo;

import java.util.ArrayList;

public class ReceiptVO {
    String number;
    double money;
    String date;
    String sellingArea;
    ArrayList<String> id;
    int isCheck;
    public ReceiptVO(double money,String date, String sellingArea, String number,ArrayList<String> id,int isCheck){
  	  this.number=number;
  	  this.money=money;
  	  this.date=date;
  	  this.isCheck=isCheck;
  	  this.sellingArea=sellingArea;
  	  this.id=id;
    }
	public ArrayList<String> getId() {
		return id;
	}
	public void setId(ArrayList<String> id) {
		this.id = id;
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
