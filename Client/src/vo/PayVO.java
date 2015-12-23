package vo;

public class PayVO {
	private String date;
	private double cost;
	private String payer;
	private String payAccount;
	private String entry;
	private String comments;
	private int isCheck;
	private Check c;

	public PayVO(String date, String payer, String payAccount, String entry, String comments, double cost,
			int isCheck) {
		this.date = date;
		this.payer = payer;
		this.payAccount = payAccount;
		this.cost = cost;
		this.entry = entry;
		this.comments = comments;
		this.isCheck = isCheck;
		c = new Check();
	}

	public int checkDate() {
		return c.checkDate(date);
	}

	public int checkCost() {
		if (cost <= 0)
			return 0;
		return 1;
	}

	public int checkPayer() {
		return c.checkID(payer, 10);
	}

	public int checkAccount() {
		return c.checkID(payAccount, 19);
	}

	public int checkIsNull() {
		if (date.length() == 0 || payer.length() == 0 || payAccount.length() == 0 || entry.length() == 0
				|| comments.length() == 0)
			return 0;
		return 1;
	}

	public PayVO() {
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

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
