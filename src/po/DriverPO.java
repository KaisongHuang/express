package po;
/*˾����š��������������ڡ����֤�š��ֻ���������λ���Ա���ʻ֤����*/
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
