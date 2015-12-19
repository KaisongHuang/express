package po;

import java.io.Serializable;

import po.ManagerPO;

public class InstitutionPO extends ManagerPO  implements Serializable{

	String organizationID;
	String name;

	public InstitutionPO(String oi, String n) {

		this.organizationID = oi;

		this.name = n;

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
