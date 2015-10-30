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
}
