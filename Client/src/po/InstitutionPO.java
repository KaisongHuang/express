package po;

import po.ManagerPO;

public class InstitutionPO extends ManagerPO {

	int organizationID;
	String name;
	
	public InstitutionPO(int oi, String n){
		
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
