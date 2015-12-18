package vo;

public class SenderVO {

	String SenderName, SenderAddress, SenderCompany, SenderCall, SenderPhone,SenderCity;
	String RecipientName, RecipientAddress, RecipientCompany, RecipientCall, RecipientPhone,RecipientCity;
	int pcs, weight, volume;
	String commodity;
	String size = "";
	String bagging;
	String BarCode;
	String type;
    Check c;
	public SenderVO(String SenderName, String SenderAddress, String SenderCompany, String SenderCall,
			String SenderPhone, String RecipientName, String RecipientAddress, String RecipientCompany,
			String RecipientCall, String RecipientPhone, int pcs, int weight, int volume, String commodity, String size,
			String bagging, String BarCode, String type) {
		this.SenderName = SenderName;
		this.SenderAddress = SenderAddress;
		this.SenderCompany = SenderCompany;
		this.SenderCall = SenderCall;
		this.SenderPhone = SenderPhone;
		this.RecipientName = RecipientName;
		this.RecipientAddress = RecipientAddress;
		this.RecipientCompany = RecipientCompany;
		this.RecipientCall = RecipientCall;
		this.RecipientPhone = RecipientPhone;
		this.pcs = pcs;
		this.weight = weight;
		this.volume = volume;
		this.commodity = commodity;
		this.size = size;
		this.bagging = bagging;
		this.BarCode = BarCode;
		this.type = type;
		c=new Check();
	}


	public int checkIsNull(){
		if(SenderName.length()==0||SenderAddress.length()==0||SenderAddress.length()==0||(SenderCall.length()==0&&SenderPhone.length()==0)||
				RecipientName.length()==0||RecipientAddress.length()==0||RecipientCompany.length()==0||(RecipientCall.length()==0&&RecipientPhone.length()==0)||
				commodity.length()==0||size.length()==0||bagging.length()==0||type.length()==0)
			return 0;
		return 1;
	}
    public int checkSenderPhone(){
    	if(SenderPhone.startsWith("1")&&SenderPhone.length()==11)
    		return 1;
    	return 0;
    }
    public int checkRecipientPhone(){
    	if(RecipientPhone.startsWith("1")&&RecipientPhone.length()==11)
    		return 1;
    	return 0;
    }
	public SenderVO() {
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

	public void setPcs(int pcs) {
		this.pcs = pcs;
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

	public String getBarCode() {
		return BarCode;
	}

	public void setBarCode(String barCode) {
		BarCode = barCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void setSenderCity(String senderCity){
		SenderCity=senderCity;
	}
	
	public void setRecipientCity(String recipientCity){
		RecipientCity=recipientCity;
	}

	public String getSenderCity() {
		return SenderCity;
	}

	public String getRecipientCity() {
		return RecipientCity;
	}
}
