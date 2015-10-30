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
}
