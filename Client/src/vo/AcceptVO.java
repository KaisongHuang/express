package vo;

public class AcceptVO {
    int BarCode;
    String date;
    int number;
    int start;
    int state;
    public AcceptVO(int BarCode,String date,int number,int start,int state){
   	 this.BarCode=BarCode;
   	 this.date=date;
   	 this.number=number;
   	 this.start=start;
   	 this.state=start;
    }
	public AcceptVO() {
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
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}  
	
	
}
