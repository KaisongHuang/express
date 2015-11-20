package serverPo;

public class AccountPO extends FinancePO{
	String bankAccount;
	double balance;
	public AccountPO(String bankAccount,double balance){
		this.bankAccount=bankAccount;
		this.balance=balance;
	}
}
