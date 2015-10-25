package vo;

public class SenderVO {
    String SenderName,SenderAddress,SenderCompany,SenderCall,SenderPhone;
    String RecipientName,RecipientAddress,RecipientCompany,RecipientCall,RecipientPhone;
    int pcs,weight,volume,commodity;
    int[] size=new int[3];
    int bagging,total,BarCode,type;
    public SenderVO(String SenderName,String SenderAddress,String SenderCompany,String SenderCall,String SenderPhone,
    String RecipientName,String RecipientAddress,String RecipientCompany,String RecipientCall,String RecipientPhone,
    int pcs,int weight,int volume,int commodity,
    int[] size,int bagging,int total,int BarCode,int type){
  	  this.SenderName=SenderName;
  	  this.SenderAddress=SenderAddress;
  	  this.SenderCompany=SenderCompany;
  	  this.SenderCall=SenderCall;
  	  this.SenderPhone=SenderPhone;
  	  this.RecipientName=RecipientName;
  	  this.RecipientAddress=RecipientAddress;
  	  this.RecipientCompany=RecipientCompany;
  	  this.RecipientCall=RecipientCall;
  	  this.RecipientPhone=RecipientPhone;
  	  this.pcs=pcs;
  	  this.weight=weight;
  	  this.volume=volume;
  	  this.commodity=commodity;
  	  this.size=size;
  	  this.bagging=bagging;
  	  this.total=total;
  	  this.BarCode=BarCode;
  	  this.type=type;
  	  }
	public SenderVO() {
		// TODO 自动生成的构造函数存根
	}
 }
