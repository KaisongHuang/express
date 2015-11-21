package po;

<<<<<<< HEAD
public class ReceiptPO extends SellingareaPO {
	
=======
import serverPO.SellingareaPO;

public class ReceiptPO extends SellingareaPO{
      public int getIsChenk() {
		return isChenk;
	}
	public void setIsChenk(int isChenk) {
		this.isChenk = isChenk;
	}
>>>>>>> master
	int number;
	int money;
	int isCheck;
	String date;
	String sellingArea;

	public ReceiptPO(int money, String date, String sellingArea, int number, int isCheck) {
		this.number = number;
		this.money = money;
		this.date = date;
		this.isCheck = isCheck;
		this.sellingArea=sellingArea;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public int getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}
	
	public void setSellingArea(String sellingArea){
		this.sellingArea=sellingArea;
	}
	
	public String getSellingArea(){
		return sellingArea;
	}


}
