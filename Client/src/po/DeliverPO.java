package po;

import po.SellingareaPO;

public class DeliverPO extends SellingareaPO {

	String BarCode;
	String date;
	String number;
	int isCheck;

	public DeliverPO(String BarCode, String date, String number, int isCheck) {
		this.BarCode = BarCode;
		this.date = date;
		this.number = number;
		this.isCheck = isCheck;
	}

	public int getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}

	public String getBarCode() {
		return BarCode;
	}

	public void setBarCode(String barCode) {
		BarCode = barCode;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
