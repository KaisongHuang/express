package po;

import java.io.Serializable;
import java.util.ArrayList;

public class DistanceAndFee extends ManagerPO implements Serializable {
	ArrayList<String> city1;
	ArrayList<String> city2;
	double distance;
	double fee;

	public DistanceAndFee(ArrayList<String> city1, ArrayList<String> city2, double distance, double fee) {
		this.city1 = city1;
		this.city2 = city2;
		this.distance = distance;
		this.fee = fee;
	}

	public ArrayList<String> getCity1() {
		return city1;
	}

	public void setCity1(ArrayList<String> city1) {
		this.city1 = city1;
	}

	public ArrayList<String> getCity2() {
		return city2;
	}

	public void setCity2(ArrayList<String> city2) {
		this.city2 = city2;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public double getDistance() {
		return distance;
	}

}
