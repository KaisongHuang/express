package logic.managerbl;

public class InstitutionVO {
	
	String organizationID;
	String name;
	
	public InstitutionVO(String oi, String n){
		
		this.organizationID=oi;
		this.name=n;
		
	}

	public String getOrganizationID() {
		return organizationID;
	}

	public void setOrganizationID(String organizationID) {
		this.organizationID = organizationID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
