package po;

public class PayPO extends FinancePO{
	String date;
	double cost;
	String payer;
	String payAccount;
	String entry;
	String comments;
	
	public PayPO(String date,String payer,String payAccount,String entry,String comments,double cost){
		this.date=date;
		this.payer=payer;
		this.payAccount=payAccount;
		this.cost=cost;
		this.entry=entry;
		this.comments=comments;
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

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
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

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
