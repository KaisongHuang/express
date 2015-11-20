package vo;

import java.util.ArrayList;

public class CentreTransforVO {
	
	String transferStyle;
	String dataOfGetin;
	int centreTransferID;
	int banHao;
	String start;
	String arrival;
    int huoGuiHao;
    String jianZhuangYuan;
    ArrayList<Integer> list=new ArrayList<Integer>();
    double fee;
    
    public CentreTransforVO(String ts,String dog,int cti,int bh,String start,String arrival,int hgh,String jzy,ArrayList<Integer> list,double fee){
    	this.transferStyle=ts;
    	this.dataOfGetin=dog;
    	this.centreTransferID=cti;
    	this.banHao=bh;
    	this.start=start;
    	this.arrival=arrival;
    	this.huoGuiHao=hgh;
    	this.jianZhuangYuan=jzy;
    	this.list=list;
    	this.fee=fee;
    }

	public String getTS() {
		// TODO Auto-generated method stub
		return transferStyle;
	}

	public String getDOG() {
		// TODO Auto-generated method stub
		return dataOfGetin;
	}

	public int getCTI() {
		// TODO Auto-generated method stub
		return centreTransferID;
	}

	public int getBH() {
		// TODO Auto-generated method stub
		return banHao;
	}

	public String getStart() {
		// TODO Auto-generated method stub
		return start;
	}

	public String getArrival() {
		// TODO Auto-generated method stub
		return arrival;
	}

	public int getHGH() {
		// TODO Auto-generated method stub
		return huoGuiHao;
	}

	public String getJZY() {
		// TODO Auto-generated method stub
		return jianZhuangYuan;
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
