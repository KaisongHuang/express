package po;

import java.io.Serializable;
import java.util.ArrayList;

import po.CentrePO;

public class CentrePackPO extends CentrePO  implements Serializable{

	private String dataOfGetin;
	private String centreTransferID;
	private String arrival;
	private String carID;
	private String jianZhuangYuan;
	private String yaYunYuan;
	private ArrayList<String> list = new ArrayList<String>();
	private double fee;
	private int isCheck;

	public CentrePackPO(String dog, String cti, String arrival, String ci, String jzy, String yyy,
			ArrayList<String> list, double fee, int isCheck) {

		this.dataOfGetin = dog;
		this.carID = ci;
		this.centreTransferID = cti;
		this.arrival = arrival;
		this.jianZhuangYuan = jzy;
		this.yaYunYuan = yyy;
		this.list = list;
		this.fee = fee;
		this.isCheck = isCheck;
	}

	public int getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}

	public String getDataOfGetin() {
		return dataOfGetin;
	}

	public void setDataOfGetin(String dataOfGetin) {
		this.dataOfGetin = dataOfGetin;
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
