package vo;

public class PayVO {
	String date;
	double cost;
	String payer;
	String payAccount;
	String entry;
	String comments;
	
	public PayVO(String date,String payer,String payAccount,String entry,String comments,double cost){
		this.date=date;
		this.payer=payer;
		this.payAccount=payAccount;
		this.cost=cost;
		this.entry=entry;
		this.comments=comments;
	}
}
