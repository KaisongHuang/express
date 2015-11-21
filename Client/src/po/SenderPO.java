package po;

import java.io.Serializable;

public class SenderPO implements Serializable {
      /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String SenderName,SenderAddress,SenderCompany,SenderCall,SenderPhone;
      String RecipientName,RecipientAddress,RecipientCompany,RecipientCall,RecipientPhone;
      int pcs,weight,volume;
      String commodity;
      String size="";
      String bagging;
      double total;
      int BarCode;
      String type;
      public SenderPO(String SenderName,String SenderAddress,String SenderCompany,String SenderCall,String SenderPhone,
      String RecipientName,String RecipientAddress,String RecipientCompany,String RecipientCall,String RecipientPhone,
      int pcs,int weight,int volume,String commodity,
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
	public String getSenderName() {
		return SenderName;
	}
	public void setSenderName(String senderName) {
		SenderName = senderName;
	}
	public String getSenderAddress() {
		return SenderAddress;
	}
	public void setSenderAddress(String senderAddress) {
		SenderAddress = senderAddress;
	}
	public String getSenderCompany() {
		return SenderCompany;
	}
	public void setSenderCompany(String senderCompany) {
		SenderCompany = senderCompany;
	}
	public String getSenderCall() {
		return SenderCall;
	}
	public void setSenderCall(String senderCall) {
		SenderCall = senderCall;
	}
	public String getSenderPhone() {
		return SenderPhone;
	}
	public void setSenderPhone(String senderPhone) {
		SenderPhone = senderPhone;
	}
	public String getRecipientName() {
		return RecipientName;
	}
	public void setRecipientName(String recipientName) {
		RecipientName = recipientName;
	}
	public String getRecipientAddress() {
		return RecipientAddress;
	}
	public void setRecipientAddress(String recipientAddress) {
		RecipientAddress = recipientAddress;
	}
	public String getRecipientCompany() {
		return RecipientCompany;
	}
	public void setRecipientCompany(String recipientCompany) {
		RecipientCompany = recipientCompany;
	}
	public String getRecipientCall() {
		return RecipientCall;
	}
	public void setRecipientCall(String recipientCall) {
		RecipientCall = recipientCall;
	}
	public String getRecipientPhone() {
		return RecipientPhone;
	}
	public void setRecipientPhone(String recipientPhone) {
		RecipientPhone = recipientPhone;
	}
	public int getPcs() {
		return pcs;
	}
	public void setPcs(int pcs) {
		this.pcs = pcs;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getCommodity() {
		return commodity;
	}
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getBagging() {
		return bagging;
	}
	public void setBagging(String bagging) {
		this.bagging = bagging;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getBarCode() {
		return BarCode;
	}
	public void setBarCode(int barCode) {
		BarCode = barCode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
      
      
      
}
