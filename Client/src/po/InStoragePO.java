package po;

import java.io.Serializable;

import po.WarehousePO;

public class InStoragePO extends WarehousePO  implements Serializable{

	private String id;
	private String indate;
	private String destination;
	private String WarehouseID;
	private String pos_qu;
	private int pos_pai;
	private int pos_jia;
	private int pos_wei;
	private int isCheck;
    private int isInStorage;
	public InStoragePO(String id, String indate, String destination, String WarehouseID, String pos_qu, int pos_pai,
			int pos_jia, int pos_wei, int isCheck,int isInStorage) {
		this.id = id;
		this.indate = indate;
		this.destination = destination;
		this.WarehouseID = WarehouseID;
		this.pos_qu = pos_qu;
		this.pos_pai = pos_pai;
		this.pos_jia = pos_jia;
		this.pos_wei = pos_wei;
		this.isCheck = isCheck;
        this.isInStorage=isInStorage;
	}

	public int getIsInStorage(){
		return isInStorage;
	}
	public int getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}

	public String getIndate() {
		return indate;
	}

	public void setIndate(String indate) {
		this.indate = indate;
	}

	public String getPos_qu() {
		return pos_qu;
	}

	public void setPos_qu(String pos_qu) {
		this.pos_qu = pos_qu;
	}

	public int getPos_pai() {
		return pos_pai;
	}

	public void setPos_pai(int pos_pai) {
		this.pos_pai = pos_pai;
	}

	public int getPos_jia() {
		return pos_jia;
	}

	public void setPos_jia(int pos_jia) {
		this.pos_jia = pos_jia;
	}

	public int getPos_wei() {
		return pos_wei;
	}

	public void setPos_wei(int pos_wei) {
		this.pos_wei = pos_wei;
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
