package po;
/*���˶��������롢�������ڡ��ɼ�Ա��� */
public class DeliverPO extends SellingareaPO{
     int BarCode;
     String date;
     int number;
     public DeliverPO(int BarCode,String date,int number){
    	 this.BarCode=BarCode;
    	 this.date=date;
    	 this.number=number;
     }
}
