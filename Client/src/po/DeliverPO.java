package po;

import serverPO.SellingareaPO;

/*���˶��������롢�������ڡ��ɼ�Ա��� */
public class DeliverPO extends SellingareaPO{
     public int getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}
	int BarCode;
     String date;
     int number;
     int isCheck;
     public DeliverPO(int BarCode,String date,int number,int isCheck){
    	 this.BarCode=BarCode;
    	 this.date=date;
    	 this.number=number;
    	 this.isCheck=isCheck;
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
