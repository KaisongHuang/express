package serverPO;

import java.util.ArrayList;

public class CentrePackPO extends CentrePO {

	String dataOfGetin;
	int centreTransferID;
	String arrival;
	int carID;
	String jianZhuangYuan;
	String yaYunYuan;
	ArrayList<Integer> list=new ArrayList<Integer>();
	double fee;
	
	public CentrePackPO(String dog,int cti,String arrival,int ci, String jzy,String yyy,ArrayList<Integer> list,double fee){
		
		this.dataOfGetin=dog;
		this.carID=ci;
		this.centreTransferID=cti;
		this.arrival=arrival;
		this.jianZhuangYuan=jzy;
		this.yaYunYuan=yyy;
		this.list=list;
		this.fee=fee;
		
	}
	
	
}
