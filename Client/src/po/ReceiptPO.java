package po;

public class ReceiptPO extends SellingareaPO {

	String number;
	double money;
	int isCheck;
	String date;
	String sellingArea;

	public ReceiptPO(double money, String date, String sellingArea, String number, int isCheck) {
		this.number = number;
		this.money = money;
		this.date = date;
		this.isCheck = isCheck;
		this.sellingArea = sellingArea;
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
