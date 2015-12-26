package vo;

import java.util.ArrayList;

public class CentreTransforVO {

	private String transferStyle;
	private String dateOfGetin;
	private String centreTransferID;
	private String banHao;
	private String start;
	private String arrival;
	private String huoGuiHao;
	private String jianZhuangYuan;
	private ArrayList<String> list = new ArrayList<String>();
	private double fee;
	private int isCheck;
	private Check c;

	public CentreTransforVO(String ts, String dog, String cti, String bh, String start, String arrival, String hgh,
			String jzy, ArrayList<String> list, double fee, int isCheck) {
		this.transferStyle = ts;
		this.dateOfGetin = dog;
		this.centreTransferID = cti;
		this.banHao = bh;
		this.start = start;
		this.arrival = arrival;
		this.huoGuiHao = hgh;
		this.jianZhuangYuan = jzy;
		this.list = list;
		this.fee = fee;
		this.isCheck = isCheck;
		c = new Check();
	}

	public int checkIsNull() {
		if (transferStyle.length() == 0 || dateOfGetin.length() == 0 || centreTransferID.length() == 0
				|| banHao.length() == 0 || start.length() == 0 || arrival.length() == 0 || huoGuiHao.length() == 0
				|| jianZhuangYuan.length() == 0 || list.size() == 0)
			return 0;
		return 1;
	}

	public int checkDate() {
		return c.checkDate(dateOfGetin);
	}

	public int centreTransferID() {
		return c.checkID(centreTransferID, 21);
	}

	public int checkBanHao() {
		return c.checkID(banHao, 10);
	}

	public int checkJian() {
		return c.checkID(jianZhuangYuan, 10);
	}

	public int checkList() {
		for (int i = 0; i < list.size(); i++) {
			if (c.checkID(list.get(i), 10) == 0)
				return 0;
		}
		return 1;
	}

	

	public int getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}

	public void setJianZhuangYuan(String jianZhuangYuan) {
		this.jianZhuangYuan = jianZhuangYuan;
	}

	public String getTransferStyle() {
		return transferStyle;
	}

	public void setTransferStyle(String transferStyle) {
		this.transferStyle = transferStyle;
	}

	public String getDateOfGetin() {
		return dateOfGetin;
	}

	public void setDateOfGetin(String dataOfGetin) {
		this.dateOfGetin = dataOfGetin;
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

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public double getFee() {
		return fee;
	}

	public String getJianZhuangYuan() {
		return jianZhuangYuan;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

}
