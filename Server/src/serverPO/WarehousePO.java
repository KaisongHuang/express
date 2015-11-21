package serverPO;

public class WarehousePO {
	int id;
	String destination;

	public WarehousePO(int id, String destination) {
		this.id = id;
		this.destination = destination;
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
