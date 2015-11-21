package logic.managerbl;

public class InstitutionVO {
	
	int organizationID;
	String name;
	
	public InstitutionVO(int oi, String n){
		
		this.organizationID=oi;
		this.name=n;
		
	}

	public int getOrganizationID() {
		return organizationID;
	}

	public void setOrganizationID(int organizationID) {
		this.organizationID = organizationID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
