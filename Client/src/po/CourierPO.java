package po;

import java.io.Serializable;

public class CourierPO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int number;
	String name;
	String date;

	public CourierPO(int num, String na, String da) {
		number = num;
		name = na;
		date = da;
	}
	

	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
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
