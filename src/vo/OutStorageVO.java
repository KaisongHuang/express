package vo;

public class OutStorageVO extends WarehouseVO{
	String outdate;
	String transportation;
	int trans_id;
	public OutStorageVO(int id, String destination,String outdate,String transportation,int trans_id) {
		super(id, destination);
		// TODO Auto-generated constructor stub
		this.outdate=outdate;
		this.transportation=transportation;
		this.trans_id=trans_id;
	}

}
