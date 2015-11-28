package po;

import java.util.ArrayList;

public class ReceiptPO extends SellingareaPO {

	private String number;
	private double money;
	private int isCheck;
	private String date;
	private String sellingArea;
	private ArrayList<String> id;

	public ReceiptPO(double money, String date, String sellingArea, String number,ArrayList<String> id, int isCheck) {
		this.number = number;
		this.money = money;
		this.date = date;
		this.isCheck = isCheck;
		this.sellingArea = sellingArea;
		this.id=id;
	}

	public ArrayList<String> getId() {
		return id;
	}

	public void setId(ArrayList<String> id) {
		this.id = id;
	}

	public int getIsChenk() {
		return isCheck;
	}

	public void setIsChenk(int isChenk) {
		this.isCheck = isChenk;
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

	public int getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}

	public void setSellingArea(String sellingArea) {
		this.sellingArea = sellingArea;
	}

	public String getSellingArea() {
		return sellingArea;
	}

}
