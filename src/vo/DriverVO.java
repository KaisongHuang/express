package vo;

public class DriverVO {
    int number;
    String name;
    String birthday;
    int ID;
    String phone;
    String CarCompany;
    String sex;
    String LicenceTime;
    
    public DriverVO(int number,String name,String birthday,int ID,String phone,String CarCompany,String sex,String LicenceTime){
    	this.number=number;
    	this.name=name;
    	this.birthday=birthday;
    	this.ID=ID;
    	this.phone=phone;
    	this.CarCompany=CarCompany;
    	this.sex=sex;
    	this.LicenceTime=LicenceTime;
    }

	public DriverVO() {
		// TODO 自动生成的构造函数存根
	}
  
}
