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
      int isCheck;
      public CarPackVO(String date,int number,String start,String destination,int supervisor,int supercargo,
    		  ArrayList<Integer> list,int fee,int isCheck){
    	  this.date=date;
    	  this.start=start;
    	  this.number=number;
    	  this.destination=destination;
    	  this.supervisor=supervisor;
    	  this.supercargo=supercargo;
    	  this.list=list;
    	  this.supercargo=supercargo;
    	  this.fee=fee;
    	  this.isCheck=isCheck;
      }
	public int getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}
	public CarPackVO() {
		// TODO 锟皆讹拷锟斤拷傻墓锟斤拷旌拷锟斤拷锟�
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
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(int supervisor) {
		this.supervisor = supervisor;
	}
	public int getSupercargo() {
		return supercargo;
	}
	public void setSupercargo(int supercargo) {
		this.supercargo = supercargo;
	}
	public ArrayList<Integer> getList() {
		return list;
	}
	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
}
