package po;

import java.io.Serializable;

import po.ManagerPO;

public class SalaryPO extends ManagerPO  implements Serializable{

	private String employeeName;
	private String salaryMethod;
    private double money;
	public SalaryPO(String en, String sm,double m) {
		this.employeeName = en;
		this.salaryMethod = sm;
		money=m;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getMoney(){
		return money;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getSalaryMethod() {
		return salaryMethod;
	}

	public void setSalaryMethod(String salaryMethod) {
		this.salaryMethod = salaryMethod;
	}

}
