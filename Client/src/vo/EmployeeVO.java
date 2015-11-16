package vo;

public class EmployeeVO {
	
	int employeeID;
	String employeeName;
	int employeeAging;
	String employeePosition;
	double timeOfWorking;
	String belongToWho;
	
	public EmployeeVO(int ei,String en,int ea,String ep,double tow,String btw){
		this.employeeAging=ea;
		this.employeeID=ei;
		this.employeeName=en;
		this.employeePosition=ep;
		this.timeOfWorking=tow;
		this.belongToWho=btw;
	}
		
	

}
