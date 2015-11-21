package vo;

public class DeliverVO {
    int BarCode;
    String date;
    int number;
    int isCheck;
    public DeliverVO(int BarCode,String date,int number,int isCheck){
   	 this.BarCode=BarCode;
   	 this.date=date;
   	 this.number=number;
   	 this.isCheck=isCheck;
    }
	public int getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}
	public DeliverVO() {
		// TODO �Զ���ɵĹ��캯����
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
