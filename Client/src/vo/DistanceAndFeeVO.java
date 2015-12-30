package vo;

public class DistanceAndFeeVO {
	private String city1;
	private String city2;
	private double distance;
	private double fee;

	public DistanceAndFeeVO(String city1, String city2, double distance, double fee) {
		this.city1 = city1;
		this.city2 = city2;
		this.distance = distance;
		this.fee = fee;
	}

	public String getCity1() {
		return city1;
	}

	public String getCity2() {
		return city2;
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
