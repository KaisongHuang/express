package po;

import java.io.Serializable;

public class SenderPO implements Serializable  {
      /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String SenderName,SenderAddress,SenderCompany,SenderCall,SenderPhone;
      String RecipientName,RecipientAddress,RecipientCompany,RecipientCall,RecipientPhone;
      int pcs,weight,volume,commodity;
      String size="";
      String bagging;
      double total;
      int BarCode;
      String type;
      public SenderPO(String SenderName,String SenderAddress,String SenderCompany,String SenderCall,String SenderPhone,
      String RecipientName,String RecipientAddress,String RecipientCompany,String RecipientCall,String RecipientPhone,
      int pcs,int weight,int volume,int commodity,
      String size,String bagging,double total,int BarCode,String type){
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
      
      
      
}
