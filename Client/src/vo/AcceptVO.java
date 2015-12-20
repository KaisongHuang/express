package vo;

public class AcceptVO {
	String BarCode;
	String date;
	String number;
	String start;
	String state;
	int isCheck;
    Check c;
	public AcceptVO(String BarCode, String date, String number, String start, String state, int isCheck) {
		this.BarCode = BarCode;
		this.date = date;
		this.number = number;
		this.start = start;
		this.state = state;
		this.isCheck = isCheck;
		c=new Check();
	}

	public int checkIsNull(){
		if(BarCode.length()==0||date.length()==0||number.length()==0||start.length()==0||state.length()==0)
			return 0;
		return 1;
		
	}
	public int checkBarCode(){
		return c.checkID(BarCode,10);
		
	}
	public int checkData(){
		return c.checkDate(date);
	}
	
	public int checkNumber(){
		return 1;
	}
	public int getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}

	public AcceptVO() {
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

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
