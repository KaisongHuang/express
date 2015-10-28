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

}
