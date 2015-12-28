package vo;

public class DeliverVO {
	private String BarCode;
	private String date;
	private String number;
	private int isCheck;
	private Check c;
	public DeliverVO(String BarCode, String date, String number, int isCheck) {
		this.BarCode = BarCode;
		this.date = date;
		this.number = number;
		this.isCheck = isCheck;
		c=new Check();
	}

	public int checkCode(){
		return c.checkID(BarCode, 10);
	}
	public int checkDate(){
		return c.checkDate(date);
	}
	public int checkNumber(){
		return c.checkID(number, 10);
	}
	
	public int checkIsNull(){
		if(BarCode.length()==0||date.length()==0||number.length()==0)
			return 0;
		return 1;
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
