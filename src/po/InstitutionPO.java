package po;

public class InstitutionPO extends ManagerPO {

	int organizationID;
	double distance;
	double price;
	String name;
	
	public InstitutionPO(int oi, double d, double p, String n){
		
		this.organizationID=oi;
		this.distance=d;
		this.price=p;
		this.name=n;
		
	}
	
}
