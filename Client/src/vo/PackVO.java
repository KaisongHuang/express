package vo;

import java.util.ArrayList;

public class PackVO {
	
	String dataOfGetin;
	int centreTransferID;
	String arrival;
	int carID;
	String jianZhuangYuan;
	String yaYunYuan;
	ArrayList<Integer> list=new ArrayList<Integer>();
	double fee;
	
	public PackVO(String dog,int cti,String arrival,int ci, String jzy,String yyy,ArrayList<Integer> list,double fee){
		
		this.dataOfGetin=dog;
		this.carID=ci;
		this.centreTransferID=cti;
		this.arrival=arrival;
		this.jianZhuangYuan=jzy;
		this.yaYunYuan=yyy;
		this.list=list;
		this.fee=fee;
		
	}
	

	public String getDOG() {
		// TODO Auto-generated method stub
		return dataOfGetin;
	}

	public int getCTI() {
		// TODO Auto-generated method stub
		return centreTransferID;
	}


	public String getArrival() {
		// TODO Auto-generated method stub
		return arrival;
	}
	
	public int getCI() {
		// TODO Auto-generated method stub
		return carID;
	}


	public String getJZY() {
		// TODO Auto-generated method stub
		return jianZhuangYuan;
	}
	
	public String getYYY() {
		// TODO Auto-generated method stub
		return yaYunYuan;
	}

	public ArrayList<Integer> getList() {
		// TODO Auto-generated method stub
		return list;
	}

	public double getFee() {
		// TODO Auto-generated method stub
		return fee;
	}
	


}
