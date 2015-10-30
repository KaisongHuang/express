package vo;

public class ReceiptVO {
    int number;
    int money;
    String date;
    public ReceiptVO(int money,String date, int number){
  	  this.number=number;
  	  this.money=money;
  	  this.date=date;
    }
	public ReceiptVO() {
		// TODO �Զ���ɵĹ��캯����
	}
}
