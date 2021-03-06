package po;

import java.io.Serializable;

import po.FinancePO;

public class PayPO extends FinancePO  implements Serializable{

	private String date;
	private double cost;
	private String payer;
	private String payAccount;
	private String entry;
	private String comments;
	private int isCheck;

	public PayPO(String date, String payer, String payAccount, String entry, String comments, double cost, int isCheck) {
		this.date = date;
		this.payer = payer;
		this.payAccount = payAccount;
		this.cost = cost;
		this.entry = entry;
		this.comments = comments;
		this.isCheck = isCheck;
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
