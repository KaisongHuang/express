package vo;

public class SalaryVO {
	
	String employeeName;
	String salaryMethod;
	
	public SalaryVO(String en,String sm){
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
