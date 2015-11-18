package vo;

public class DeliverVO {
    int BarCode;
    String date;
    int number;
    public DeliverVO(int BarCode,String date,int number){
   	 this.BarCode=BarCode;
   	 this.date=date;
   	 this.number=number;
    }
	public DeliverVO() {
		// TODO 自动生成的构造函数存根
	}
	public int getBarCode() {
		return BarCode;
	}
	public void setBarCode(int barCode) {
		BarCode = barCode;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
