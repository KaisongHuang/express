package vo;

public class CourierVO {
	String number;
	String name;
	String date;

	public CourierVO(String num, String na, String da) {
		number = num;
		name = na;
		date = da;
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
