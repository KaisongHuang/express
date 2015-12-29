package vo;

public class DriverVO {
	private String number;
	private String name;
	private String birthday;
	private  String ID;
	private  String phone;
	private String CarCompany;
	private  String sex;
	private String LicenceTime;
    private Check c;
    public DriverVO(String number,String name,String birthday,String ID,String phone,String CarCompany,String sex,String LicenceTime){
    	this.number=number;
    	this.name=name;
    	this.birthday=birthday;
    	this.ID=ID;
    	this.phone=phone;
    	this.CarCompany=CarCompany;
    	this.sex=sex;
    	this.LicenceTime=LicenceTime;
    	c=new Check();
    }

    public int checkNumber(){
    	return c.checkID(number,10);
    }
    public int checkBirthday(){
    	return c.checkDate(birthday);
    }
    public int checkID(){
    	int a=ID.length();
    	if(a==18)
    		return 1;
    	else
    		return 0;
    }
    public int checkPhone(){
        if(phone.startsWith("1")&&phone.length()==11)
        	return 1;
        return 0;
    }

    public int checkIsNull(){
    	if(number.length()==0||name.length()==0||birthday.length()==0||ID.length()==0||phone.length()==0||CarCompany.length()==0||
    			sex.length()==0||LicenceTime.length()==0)
    		return 0;
    	return 1;
    }
	public DriverVO() {
		// TODO �Զ���ɵĹ��캯����
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCarCompany() {
		return CarCompany;
	}

	public void setCarCompany(String carCompany) {
		CarCompany = carCompany;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getLicenceTime() {
		return LicenceTime;
	}

	public void setLicenceTime(String licenceTime) {
		LicenceTime = licenceTime;
	}

}
