package vo;

public class AccountVO {
	String bankAccount;
	double balance;
	Check c;
	public AccountVO(String bankAccount,double balance){
		this.bankAccount=bankAccount;
		this.balance=balance;
		c=new Check();
	}
	public AccountVO() {
		// TODO Auto-generated constructor stub
	}
	public int checkIsNull(){
		if(bankAccount.length()==0)
			return 0;
		return 1;
		
	}
	public int checkAccount(){
		return c.checkID(bankAccount, 19);
	}
	public int checkBalance(){
		if(balance<0)
			return 0;
		return 1;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
}
