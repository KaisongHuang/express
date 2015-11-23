package vo;

public class WarehouseVO {
	int id;
	String destination;
    String WarehouseID;
	public WarehouseVO() {
	}

	public WarehouseVO(int id, String destination,String WarehouseID) {
		this.id = id;
		this.destination = destination;
		this.WarehouseID=WarehouseID;
	}

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

}
