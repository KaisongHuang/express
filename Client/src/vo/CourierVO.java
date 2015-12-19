package vo;

public class CourierVO {
	String number;
	String name;
	String date;
    Check c;
	public CourierVO(String num, String na, String da) {
		number = num;
		name = na;
		date = da;
		c=new Check();
	}

	public int checkIsNull(){
		if(number.length()==0||name.length()==0||date.length()==0)
			return 0;
		return 1;
	}
	public int checkNumber(){
		return c.checkID(number, 10);
	}
	public int checkDate(){
		return c.checkDate(date);
	}
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
