package logic.managerbl;

public class InstitutionVO {
	
	int organizationID;
	double distance;
	double price;
	String name;
	
	public InstitutionVO(int oi, double d, double p, String n){
		
		this.organizationID=oi;
		this.distance=d;
		this.price=p;
		this.name=n;
		
	}

	public int getOrganizationID() {
		return organizationID;
	}

	public void setOrganizationID(int organizationID) {
		this.organizationID = organizationID;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
