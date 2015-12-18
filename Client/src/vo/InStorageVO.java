package vo;

public class InStorageVO  {
	String id;
	String destination;
	String WarehouseID;
	private String indate;
	private String pos_qu;
	private int pos_pai;
	private int pos_jia;
	private int pos_wei;
	private int isCheck;
	// ArrayList<ArrivalPO>
    private Check c;
	

	public InStorageVO(String id, String indate, String destination, String WarehouseID, String pos_qu, int pos_pai,
			int pos_jia, int pos_wei, int isCheck) {
		this.id=id;
		this.destination=destination;
		this.WarehouseID=WarehouseID;
		this.indate = indate;
		this.pos_qu = pos_qu;
		this.pos_pai = pos_pai;
		this.pos_jia = pos_jia;
		this.pos_wei = pos_wei;
		this.isCheck = isCheck;
		c=new Check();
		// TODO Auto-generated constructor stub
	}

	public InStorageVO() {
		// TODO Auto-generated constructor stub
	}

	public int checkDate(){
		return c.checkDate(indate);
	}
	public int checkPai(){
		if(pos_pai<=0||pos_pai>1000)
			return 0;
		return 1;
	}
	public int checkJia(){
		if(pos_jia<=0||pos_jia>100)
			return 0;
		return 1;
	}
	public int checkWei(){
		if(pos_wei<=0||pos_wei>100)
			return 0;
		return 1;
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

	public String getId() {
		return id;
	}

	public String getDestination() {
		return destination;
	}

	public Check getC() {
		return c;
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
	 
	public void setWarehouseID(String warehouseID) {
		WarehouseID=warehouseID;
	 }
	
	public String getWarehouseID(){
		return WarehouseID;
	}

	public void setId(String ID) {
		id=ID;
		
	}

	public void setDestination(String Destination) {
		 destination=Destination;
		
	}

}
