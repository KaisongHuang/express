package po;

public class WarehousePO {
	int id;
	String destination;
	double rate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public void setAlarmRate(double rate){
		this.rate=rate;
	}
	
	public double getAlarmRate(){
		return rate;
	}
	
}
