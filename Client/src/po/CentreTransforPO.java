package po;

import java.io.Serializable;
import java.util.ArrayList;

import po.CentrePO;

public class CentreTransforPO extends CentrePO  implements Serializable{

	private String transforStyle;
	private String dataOfGetin;
	private String centreTransferID;
	private String banHao;
	private String start;
	private String arrival;
	private String huoGuiHao;
	private String jianZhuangYuan;
	private ArrayList<String> list = new ArrayList<String>();
	private double fee;
	private int isCheck;
	private int isOutStorage;
	public CentreTransforPO(String ts, String dog, String cti, String bh,
			String start, String arrival, String hgh, String jzy,
			ArrayList<String> list, double fee,int isCheck,int isOutStorage) {
		this.transforStyle = ts;
		this.dataOfGetin = dog;
		this.centreTransferID = cti;
		this.banHao = bh;
		this.start = start;
		this.arrival = arrival;
		this.huoGuiHao = hgh;
		this.jianZhuangYuan = jzy;
		this.list = list;
		this.fee = fee;
		this.isCheck=isCheck;
		this.isOutStorage=isOutStorage;
	}
    public int getIsCheck(){
    	return isCheck;
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

	public String getCentreTransferID() {
		return centreTransferID;
	}

	public void setCentreTransferID(String centreTransferID) {
		this.centreTransferID = centreTransferID;
	}

	public String getBanHao() {
		return banHao;
	}

	public void setBanHao(String banHao) {
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

	public String getHuoGuiHao() {
		return huoGuiHao;
	}

	public void setHuoGuiHao(String huoGuiHao) {
		this.huoGuiHao = huoGuiHao;
	}

	public String getJianZhuangYuan() {
		return jianZhuangYuan;
	}

	public void setJianZhuangYuan(String jianZhuangYuan) {
		this.jianZhuangYuan = jianZhuangYuan;
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
	
	public int getIsOutStorage(){
		return isOutStorage;
	}
	

}
