package vo;

public class WarehouseVO {
	String id;
	String destination;
	String WarehouseID;

	public WarehouseVO() {
	}

	public WarehouseVO(String id, String destination, String WarehouseID) {
		this.id = id;
		this.destination = destination;
		this.WarehouseID = WarehouseID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getWarehouseID() {
		return WarehouseID;
	}

	public void setWarehouseID(String warehouseID) {
		WarehouseID = warehouseID;
	}

}
