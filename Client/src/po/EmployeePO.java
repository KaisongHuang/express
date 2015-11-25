package po;

import po.ManagerPO;

public class EmployeePO extends ManagerPO {

	String employeeID;
	String employeeName;
	String employeePosition;
	String belongToWho;
	int employeeAging;
	double timeOfWorking;

	public EmployeePO(String ei, String en, int ea, String ep, double tow, String btw) {
		this.employeeAging = ea;
		this.employeeID = ei;
		this.employeeName = en;
		this.employeePosition = ep;
		this.timeOfWorking = tow;
		this.belongToWho = btw;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAging() {
		return employeeAging;
	}

	public void setEmployeeAging(int employeeAging) {
		this.employeeAging = employeeAging;
	}

	public String getEmployeePosition() {
		return employeePosition;
	}

	public void setEmployeePosition(String employeePosition) {
		this.employeePosition = employeePosition;
	}

	public double getTimeOfWorking() {
		return timeOfWorking;
	}

	public void setTimeOfWorking(double timeOfWorking) {
		this.timeOfWorking = timeOfWorking;
	}

	public String getBelongToWho() {
		return belongToWho;
	}

	public void setBelongToWho(String belongToWho) {
		this.belongToWho = belongToWho;
	}

}
