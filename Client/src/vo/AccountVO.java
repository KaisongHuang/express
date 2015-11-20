package vo;

public class AccountVO {
	String bankAccount;
	double balance;
	public AccountVO(String bankAccount,double balance){
		this.bankAccount=bankAccount;
		this.balance=balance;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
