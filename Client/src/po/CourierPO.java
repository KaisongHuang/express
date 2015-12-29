package po;

import java.io.Serializable;

public class CourierPO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String number;
	private String name;
	private String date;

	public CourierPO(String num, String na, String da) {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
