package po;

import java.io.Serializable;

import po.WarehousePO;

public class OutStoragePO extends WarehousePO  implements Serializable{
	private String id;
	private String destination;
	private String WarehouseID;
	private String outdate;
	private String transportation;
	private String trans_id;
	private int isCheck;

	public int getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}

	public OutStoragePO(String id, String destination, String outdate, String WarehouseID, String transportation,
			String trans_id, int isCheck) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.destination = destination;
		this.WarehouseID = WarehouseID;
		this.outdate = outdate;
		this.transportation = transportation;
		this.trans_id = trans_id;
		this.isCheck = isCheck;

	}

	public String getId(){
		return id;
	}
	
	public String getDestination(){
		return destination;
	}
	
	public String getWarehouseID(){
		return WarehouseID;
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

}
