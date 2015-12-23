package vo;

import java.util.ArrayList;

public class CarPackVO {
	private String date;
	private String sellingArea;
	private String number;
	private String start;
	private String destination;
	private String carID;
	private String supervisor;
	private String supercargo;
	private ArrayList<String> list = new ArrayList<String>();
	private double fee;
	private int isCheck;
	private Check c;

	public CarPackVO(String date, String sellingArea, String number, String start, String destination, String carID,
			String supervisor, String supercargo, ArrayList<String> list, double fee, int isCheck) {
		this.date = date;
		this.sellingArea = sellingArea;
		this.start = start;
		this.number = number;
		this.destination = destination;
		this.carID = carID;
		this.supervisor = supervisor;
		this.supercargo = supercargo;
		this.list = list;
		this.fee = fee;
		this.isCheck = isCheck;
		c = new Check();
	}

	public String getSellingArea() {
		return sellingArea;
	}

	public String getCarID() {
		return carID;
	}

	public int checkIsNull() {
		if (date.length() == 0 || number.length() == 0 || start.length() == 0 || destination.length() == 0
				|| supervisor.length() == 0 || supercargo.length() == 0 || list.size() == 0)
			return 0;
		return 1;
	}

	public int checkDate() {
		return c.checkDate(date);
	}

	public int checkNumber() {
		return c.checkID(number, 19);
	}

	public int checkSupervisor() {
		return c.checkID(supervisor, 10);
	}

	public int checkSupercargo() {
		return c.checkID(supercargo, 10);

	}

	public int checkList() {
		for (int i = 0; i < list.size(); i++) {
			if (c.checkID(list.get(i), 10) == 0)
				return 0;
		}
		return 1;
	}

	public int checkFee() {
		if (fee <= 0)
			return 0;
		return 1;
	}

	public int getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}

	public CarPackVO() {
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

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public String getSupercargo() {
		return supercargo;
	}

	public void setSupercargo(String supercargo) {
		this.supercargo = supercargo;
	}

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

}
