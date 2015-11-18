package po;
/*托运订单条形码、到达日期、派件员编号 */
public class DeliverPO extends SellingareaPO{
     int BarCode;
     String date;
     int number;
     public DeliverPO(int BarCode,String date,int number){
    	 this.BarCode=BarCode;
    	 this.date=date;
    	 this.number=number;
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
