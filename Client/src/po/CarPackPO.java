package po;

import java.io.Serializable;
import java.util.ArrayList;

import po.SellingareaPO;

public class CarPackPO extends SellingareaPO implements Serializable {
	private String date;
	private String sellingArea;
	private String number;
	private String start;
	private String destination;
	private String carID;
	private String supervisor;
	private String supercargo;
	ArrayList<String> list = new ArrayList<String>();
	double fee;
	int isCheck;

	public CarPackPO(String date, String sellingArea, String number, String start, String destination, String carID,
			String supervisor, String supercargo, ArrayList<String> list, double fee, int isCheck) {
		this.date = date;
		this.sellingArea=sellingArea;
		this.start = start;
		this.number = number;
		this.destination = destination;
		this.carID=carID;
		this.supervisor = supervisor;
		this.supercargo = supercargo;
		this.list = list;
		this.fee = fee;
		this.isCheck = isCheck;
	}

	public String getSellingArea() {
		return sellingArea;
	}

	public String getCarID() {
		return carID;
	}

	public int getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
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
