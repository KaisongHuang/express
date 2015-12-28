package vo;

public class SalaryVO {

	private String employeeName;
	private String salaryMethod;
	private Check c;
	public SalaryVO(String en, String sm) {
		this.employeeName = en;
		this.salaryMethod = sm;
		c=new Check();
	}

	public int checkName(){
		return c.checkID(employeeName, 10);
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
