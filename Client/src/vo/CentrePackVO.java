package vo;

import java.util.ArrayList;

public class CentrePackVO {

	private String dateOfGetin;
	private String centreTransferID;
	private String arrival;
	private String carID;
	private String jianZhuangYuan;
	private String yaYunYuan;
	private ArrayList<String> list = new ArrayList<String>();
	private double fee;
	private int isCheck;
	private Check c;

	public CentrePackVO(String dog, String cti, String arrival, String ci, String jzy, String yyy,
			ArrayList<String> list, double fee, int isCheck) {

		this.dateOfGetin = dog;
		this.carID = ci;
		this.centreTransferID = cti;
		this.arrival = arrival;
		this.jianZhuangYuan = jzy;
		this.yaYunYuan = yyy;
		this.list = list;
		this.fee = fee;
		this.isCheck = isCheck;
		c = new Check();
	}

	public int checkDate() {
		return c.checkDate(dateOfGetin);
	}

	public int checkcentreID() {
		return c.checkID(centreTransferID, 21);
	}

	public int checkCarID() {
		return c.checkID(carID, 10);
	}

	public int checkJian() {
		return c.checkID(jianZhuangYuan, 10);
	}

	public int checkYa() {
		return c.checkID(jianZhuangYuan, 10);
	}

	public int checkList() {
		for (int i = 0; i < list.size(); i++)
			if (c.checkID(list.get(i), 10) == 0)
				return 0;
		return 1;
	}

	public int checkIsNull() {
		if (dateOfGetin.length() == 0 || carID.length() == 0 || centreTransferID.length() == 0 || arrival.length() == 0
				|| jianZhuangYuan.length() == 0 || yaYunYuan.length() == 0 || list.size() == 0)
			return 0;
		return 1;

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
