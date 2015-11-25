package po;

public class WarehousePO {

	double rate;
	String WarehouseID;

	public WarehousePO(double rate, String WarehouseID) {

		this.rate = rate;
		this.WarehouseID = WarehouseID;
	}

	public WarehousePO() {

	}

	public void setAlarmRate(double rate) {
		this.rate = rate;
	}

	public double getAlarmRate() {
		return rate;
	}

}
