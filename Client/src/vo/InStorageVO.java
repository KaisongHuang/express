package vo;

public class InStorageVO extends WarehouseVO {
	private String indate;
	private String pos_qu;
	private int pos_pai;
	private int pos_jia;
	private int pos_wei;
	private int isCheck;
	// ArrayList<ArrivalPO>

	public InStorageVO() {
	}

	public InStorageVO(String id, String indate, String destination, String WarehouseID, String pos_qu, int pos_pai,
			int pos_jia, int pos_wei, int isCheck) {
		super(id, destination, WarehouseID);
		this.indate = indate;
		this.pos_qu = pos_qu;
		this.pos_pai = pos_pai;
		this.pos_jia = pos_jia;
		this.pos_wei = pos_wei;
		this.isCheck = isCheck;
		// TODO Auto-generated constructor stub
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
	// public String getWarehouseID() {
	// // TODO 自动生成的方法存根
	// return WarehouseID;
	// }
	//

}
