package vo;

public class InstitutionVO {

	String organizationID;
	String name;
    
	public InstitutionVO(String oi, String n) {

		this.organizationID = oi;

		this.name = n;

	}

	public int checkID(){
		 if(organizationID.length()!=6)
    		 return 0;
    	 try{
    		 Integer.parseInt(organizationID);
    	 }catch(NumberFormatException e){
    		 return 0;
    	 }
    	 return 1;
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
