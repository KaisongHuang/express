package po;

import po.ManagerPO;

public class SalaryPO extends ManagerPO {

	String employeeName;
	String salaryMethod;
	
	public SalaryPO(String en,String sm){
		this.employeeName=en;
		this.salaryMethod=sm;
	}

	public String getEmployeeName() {
		return employeeName;
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
