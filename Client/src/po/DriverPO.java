package po;
/*司机编号、姓名、出生日期、身份证号、手机、车辆单位、性别、行驶证期限*/
public class DriverPO extends SellingareaPO{
    int number;
    String name;
    String birthday;
    int ID;
    String phone;
    String CarCompany;
    String sex;
    String LicenceTime;
    
    public DriverPO(int number,String name,String birthday,int ID,String phone,String CarCompany,String sex,String LicenceTime){
    	this.number=number;
    	this.name=name;
    	this.birthday=birthday;
    	this.ID=ID;
    	this.phone=phone;
    	this.CarCompany=CarCompany;
    	this.sex=sex;
    	this.LicenceTime=LicenceTime;
    }
  
}
