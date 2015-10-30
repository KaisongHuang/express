package vo;

import java.util.ArrayList;

public class CarPackVO {
      String date;
      int number;
      String start;
      String destination;
      int supervisor;
      int supercargo;
      ArrayList<Integer> list=new ArrayList<Integer>();
      int fee;
      public CarPackVO(String date,int number,String start,String destination,int supervisor,int supercargo,ArrayList<Integer> list,int fee){
    	  this.date=date;
    	  this.start=start;
    	  this.number=number;
    	  this.destination=destination;
    	  this.supervisor=supervisor;
    	  this.supercargo=supercargo;
    	  this.list=list;
    	  this.supercargo=supercargo;
    	  this.fee=fee;
      }
	public CarPackVO() {
		// TODO �Զ���ɵĹ��캯����
	}
}
