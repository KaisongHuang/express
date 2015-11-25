package vo;

public class OutStorageVO extends WarehouseVO {
	String outdate;
	String transportation;
	String trans_id;
	int isCheck;

	public OutStorageVO(String id, String destination, String outdate, String WarehouseID, String transportation,
			String trans_id, int isCheck) {
		super(id, destination, WarehouseID);
		this.outdate = outdate;
		this.transportation = transportation;
		this.trans_id = trans_id;
		this.isCheck = isCheck;
	}

	public OutStorageVO() {
	}

	public int getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}

	public String getOutdate() {
		return outdate;
	}

	public void setOutdate(String outdate) {
		this.outdate = outdate;
	}

	public String getTransportation() {
		return transportation;
	}

	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}

	public String getTrans_id() {
		return trans_id;
	}

	public void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
	}

	public String getWarehouseID() {
		return WarehouseID;
	}

}
