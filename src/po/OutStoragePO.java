package po;

public class OutStoragePO extends WarehousePO {
	String outdate;
	String transportation;
	int trans_id;
	public OutStoragePO(int id, String destination,String outdate,String transportation,int trans_id) {
		super(id, destination);
		// TODO Auto-generated constructor stub
		this.outdate=outdate;
		this.transportation=transportation;
		this.trans_id=trans_id;
	}

}
