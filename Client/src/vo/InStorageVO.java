package vo;

public class InStorageVO extends WarehouseVO{
	String indate;
	String pos_qu;
	String pos_pai;
	String pos_jia;
	String pos_wei;
	//ArrayList<ArrivalPO>
	public InStorageVO(int id, String indate, String destination,
			String pos_qu, String pos_pai, String pos_jia, String pos_wei) {
		super(id, destination);
		this.indate = indate;
		this.pos_qu = pos_qu;
		this.pos_pai = pos_pai;
		this.pos_jia = pos_jia;
		this.pos_wei = pos_wei;
		// TODO Auto-generated constructor stub
	}

}
