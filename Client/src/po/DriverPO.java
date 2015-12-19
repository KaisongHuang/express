package po;

import java.io.Serializable;

import po.SellingareaPO;

public class DriverPO extends SellingareaPO  implements Serializable{ 
    String number;
    String name;
    String birthday;
    String ID;
    String phone;
    String CarCompany;
    String sex;
    String LicenceTime;
    
    public DriverPO(String number,String name,String birthday,String ID,String phone,String CarCompany,String sex,String LicenceTime){
    	this.number=number;
    	this.name=name;
    	this.birthday=birthday;
    	this.ID=ID;
    	this.phone=phone;
    	this.CarCompany=CarCompany;
    	this.sex=sex;
    	this.LicenceTime=LicenceTime;
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
