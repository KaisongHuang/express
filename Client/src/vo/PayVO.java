package vo;

public class PayVO {
	String date;
	double cost;
	int payer;
	String payAccount;
	String entry;
	int comments;
	int isCheck;
	
	public PayVO(String date,int payer,String payAccount,String entry,int comments,double cost,int isCheck){
		this.date=date;
		this.payer=payer;
		this.payAccount=payAccount;
		this.cost=cost;
		this.entry=entry;
		this.comments=comments;
		this.isCheck=isCheck;
	}

	public int getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getPayAccount() {
		return payAccount;
	}

	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}

	public int getPayer() {
		return payer;
	}

	public void setPayer(int payer) {
		this.payer = payer;
	}

	public int getComments() {
		return comments;
	}

	public void setComments(int comments) {
		this.comments = comments;
	}

}
