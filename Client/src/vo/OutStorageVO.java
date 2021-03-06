package vo;

public class OutStorageVO {
	private String id;
	private String destination;
	private String WarehouseID;
	private String outdate;
	private String transportation;
	private String trans_id;
	private int isCheck;
	private Check c;
	public OutStorageVO() {
	}
	
	public OutStorageVO(String id, String destination, String outdate, String WarehouseID, String transportation,
			String trans_id, int isCheck) {
		this.id=id;
		this.destination=destination;
		this.WarehouseID=WarehouseID;
		this.outdate = outdate;
		this.transportation = transportation;
		this.trans_id = trans_id;
		this.isCheck = isCheck;
		c=new Check();
	}
	public int checkID(){
		return c.checkID(id, 10);
	}
	public int checkDate(){
		return c.checkDate(outdate);
	}
    public int checkWarehouseID(){
    	return c.checkID(WarehouseID, 6);
    }
    public int checkTransID(){
    	return c.checkID(trans_id, 21);
    }
    public int checkIsNUll(){
    	if(id.length()==0||destination.length()==0||outdate.length()==0||WarehouseID.length()==0||trans_id.length()==0)
    		return 0;
    	return 1;
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

	public void setWarehouseID(String warehouseID) {
		WarehouseID = warehouseID;
	}

	public String getWarehouseID(){
		return WarehouseID;
	}
	public void setId(String exportID) {
		id=exportID;
		
	}
	public void setDestination(String Destination) {
		destination=Destination;
		
	}
}
