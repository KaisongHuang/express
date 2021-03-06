package vo;

public class AdminVO {
	
	private String id;
	private String name;
	private String password;
	private String role;
	private Check c;
	public AdminVO(String id,String name,String password,String role){
		
		this.id=id;
		this.name=name;
		this.password=password;
		this.role=role;
		c=new Check();
		
	}
	public int checkId(){
		return c.checkID(id, 10);
		
	}
	
	public int checkIsNull(){
	   if(id.length()==0||name.length()==0||password.length()==0||role.length()==0)
		   return 0;
	   return 1;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	

}
