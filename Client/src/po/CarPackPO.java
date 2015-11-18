package po;

import java.util.ArrayList;

public class CarPackPO extends SellingareaPO {
	String date;
	int number;

	String start;
	String destination;
	int supervisor;
	int supercargo;
	ArrayList<Integer> list = new ArrayList<Integer>();
	int fee;

	public CarPackPO(String date, int number, String start, String destination,
			int supervisor, int supercargo, ArrayList<Integer> list, int fee) {
		this.date = date;
		this.start = start;
		this.number = number;
		this.destination = destination;
		this.supervisor = supervisor;
		this.supercargo = supercargo;
		this.list = list;
		this.supercargo = supercargo;
		this.fee = fee;
	}
	
	 public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
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
		public int getSupervisor() {
			return supervisor;
		}
		public void setSupervisor(int supervisor) {
			this.supervisor = supervisor;
		}
		public int getSupercargo() {
			return supercargo;
		}
		public void setSupercargo(int supercargo) {
			this.supercargo = supercargo;
		}
		public ArrayList<Integer> getList() {
			return list;
		}
		public void setList(ArrayList<Integer> list) {
			this.list = list;
		}
		public int getFee() {
			return fee;
		}
		public void setFee(int fee) {
			this.fee = fee;
		}
}
