package po;

public class OutStoragePO extends WarehousePO {
	String outdate;
	String transportation;
	int trans_id;
	int isCheck;
	public int getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}
	public OutStoragePO(int id, String destination,String outdate,String transportation,int trans_id,int isCheck) {
		super(id, destination);
		// TODO Auto-generated constructor stub
		this.outdate=outdate;
		this.transportation=transportation;
		this.trans_id=trans_id;
		this.isCheck=isCheck;
		
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
	public int getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(int trans_id) {
		this.trans_id = trans_id;
	}
	
	

}
