package po;

public class InStoragePO extends WarehousePO {
	String indate;
	String pos_qu;
	String pos_pai;
	String pos_jia;
	String pos_wei;
    int isCheck;
	public InStoragePO(int id, String indate, String destination,
			String pos_qu, String pos_pai, String pos_jia, String pos_wei,int isCheck) {
		super(id, destination);
		this.indate = indate;
		this.pos_qu = pos_qu;
		this.pos_pai = pos_pai;
		this.pos_jia = pos_jia;
		this.pos_wei = pos_wei;
		this.isCheck=isCheck;
		// TODO Auto-generated constructor stub
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

	public String getPos_pai() {
		return pos_pai;
	}

	public void setPos_pai(String pos_pai) {
		this.pos_pai = pos_pai;
	}

	public String getPos_jia() {
		return pos_jia;
	}

	public void setPos_jia(String pos_jia) {
		this.pos_jia = pos_jia;
	}

	public String getPos_wei() {
		return pos_wei;
	}

	public void setPos_wei(String pos_wei) {
		this.pos_wei = pos_wei;
	}
	
	

}
