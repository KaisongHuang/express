package po;

import po.SellingareaPO;

public class AcceptPO extends SellingareaPO{
     String BarCode;
     String date;
     String number;
     String start;
     String state;
     int isCheck;
     public AcceptPO(String BarCode,String date,String number,String start,String state,int isCheck){
    	 this.BarCode=BarCode;
    	 this.date=date;
    	 this.number=number;
    	 this.start=start;
    	 this.state=state;
    	 this.isCheck=isCheck;
     }
	public int getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}
	public String getBarCode() {
		return BarCode;
	}
	public void setBarCode(String barCode) {
		BarCode = barCode;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
     
}
