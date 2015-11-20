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

	public String getDataOfGetin() {
		return dataOfGetin;
	}

	public void setDataOfGetin(String dataOfGetin) {
		this.dataOfGetin = dataOfGetin;
	}

	public int getCentreTransferID() {
		return centreTransferID;
	}

	public void setCentreTransferID(int centreTransferID) {
		this.centreTransferID = centreTransferID;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public String getJianZhuangYuan() {
		return jianZhuangYuan;
	}

	public void setJianZhuangYuan(String jianZhuangYuan) {
		this.jianZhuangYuan = jianZhuangYuan;
	}

	public String getYaYunYuan() {
		return yaYunYuan;
	}

	public void setYaYunYuan(String yaYunYuan) {
		this.yaYunYuan = yaYunYuan;
	}

	public ArrayList<Integer> getList() {
		return list;
	}

	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	
	


}
