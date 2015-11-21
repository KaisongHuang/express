package serverPO;

import java.util.ArrayList;

import po.CentrePO;

public class CentreTransforPO extends CentrePO {

	String transforStyle;
	String dataOfGetin;
	int centreTransforID;
	int banHao;
	String start;
	String arrival;
	int huoGuiHao;
	int jianZhuangYuan;
	ArrayList<Integer> list = new ArrayList<Integer>();
	double fee;
    int isCheck;
	public CentreTransforPO(String ts, String dog, int cti, int bh,
			String start, String arrival, int hgh, int jzy,
			ArrayList<Integer> list, double fee,int isCheck) {
		this.transforStyle = ts;
		this.dataOfGetin = dog;
		this.centreTransforID = cti;
		this.banHao = bh;
		this.start = start;
		this.arrival = arrival;
		this.huoGuiHao = hgh;
		this.jianZhuangYuan = jzy;
		this.list = list;
		this.fee = fee;
		this.isCheck=isCheck;
	}

	public String getTransferStyle() {
		return transforStyle;
	}

	public void setTransferStyle(String transferStyle) {
		this.transforStyle = transferStyle;
	}

	public String getDataOfGetin() {
		return dataOfGetin;
	}

	public void setDataOfGetin(String dataOfGetin) {
		this.dataOfGetin = dataOfGetin;
	}

	public int getCentreTransferID() {
		return centreTransforID;
	}

	public void setCentreTransferID(int centreTransferID) {
		this.centreTransforID = centreTransferID;
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

	public int getJianZhuangYuan() {
		return jianZhuangYuan;
	}

	public void setJianZhuangYuan(int jianZhuangYuan) {
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
