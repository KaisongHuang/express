package vo;

public class DeliverVO {
	String BarCode;
	String date;
	String number;
	int isCheck;

	public DeliverVO(String BarCode, String date, String number, int isCheck) {
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

	public DeliverVO() {
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
