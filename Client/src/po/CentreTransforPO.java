package po;

import java.util.ArrayList;

public class CentreTransforPO extends CentrePO {

	String transferStyle;
	String dataOfGetin;
	int centreTransferID;
	int banHao;
	String start;
	String arrival;
	int huoGuiHao;
	String jianZhuangYuan;
	ArrayList<Integer> list = new ArrayList<Integer>();
	double fee;

	public CentreTransforPO(String ts, String dog, int cti, int bh,
			String start, String arrival, int hgh, String jzy,
			ArrayList<Integer> list, double fee) {
		this.transferStyle = ts;
		this.dataOfGetin = dog;
		this.centreTransferID = cti;
		this.banHao = bh;
		this.start = start;
		this.arrival = arrival;
		this.huoGuiHao = hgh;
		this.jianZhuangYuan = jzy;
		this.list = list;
		this.fee = fee;
	}

	public String getTransferStyle() {
		return transferStyle;
	}

	public void setTransferStyle(String transferStyle) {
		this.transferStyle = transferStyle;
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

	public int getBanHao() {
		return banHao;
	}

	public void setBanHao(int banHao) {
		this.banHao = banHao;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public int getHuoGuiHao() {
		return huoGuiHao;
	}

	public void setHuoGuiHao(int huoGuiHao) {
		this.huoGuiHao = huoGuiHao;
	}

	public String getJianZhuangYuan() {
		return jianZhuangYuan;
	}

	public void setJianZhuangYuan(String jianZhuangYuan) {
		this.jianZhuangYuan = jianZhuangYuan;
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
