package vo;

import java.util.ArrayList;

public class PackVO {
	
	String dateOfGetin;
	String centreTransferID;
	String arrival;
	String carID;
	String jianZhuangYuan;
	String yaYunYuan;
	ArrayList<String> list=new ArrayList<String>();
	double fee;
	int isCheck;
	
	public PackVO(String dog,String cti,String arrival,String ci, String jzy,String yyy,ArrayList<String> list,double fee,int isCheck){
		
		this.dateOfGetin=dog;
		this.carID=ci;
		this.centreTransferID=cti;
		this.arrival=arrival;
		this.jianZhuangYuan=jzy;
		this.yaYunYuan=yyy;
		this.list=list;
		this.fee=fee;
		this.isCheck=isCheck;
		
	}

	public int getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}

	public String getDataOfGetin() {
		return dateOfGetin;
	}

	public void setDataOfGetin(String dataOfGetin) {
		this.dateOfGetin = dataOfGetin;
	}

	public String getCentreTransferID() {
		return centreTransferID;
	}

	public void setCentreTransferID(String centreTransferID) {
		this.centreTransferID = centreTransferID;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getCarID() {
		return carID;
	}

	public void setCarID(String carID) {
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

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	
	


}
