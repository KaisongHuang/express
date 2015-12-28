package vo;

public class WarehouseVO {
	private double rate;
	private String WarehouseID;
	private int carpai,carjia,carwei,trainpai,trainjia,trainwei,airpai,airjia,airwei,pai,jia,wei;
    public WarehouseVO(){
    	
    }
	public WarehouseVO( String WarehouseID,int carpai,int carjia,int carwei,int trainpai,int trainjia,int trainwei,int airpai,int qirjia,int airwei,int pai,int jia,int wei,double rate) {
         this.carpai=carpai;
         this.carjia=carjia;
         this.carwei=carwei;
         this.trainpai=trainpai;
         this.trainjia=trainjia;
         this.trainwei=trainwei;
         this.airpai=airpai;
         this.airjia=airjia;
         this.airwei=airwei;
         this.pai=pai;
         this.jia=jia;
         this.wei=wei;
		this.rate = rate;
		this.WarehouseID = WarehouseID;
	}

	
	public int checkID(){
		if(WarehouseID.length()!=6)
   		 return 0;
   	 try{
   		 Integer.parseInt(WarehouseID);
   	 }catch(NumberFormatException e){
   		 return 0;
   	 }
   	 return 1;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public void setWarehouseID(String warehouseID) {
		WarehouseID = warehouseID;
	}

	public void setCarpai(int carpai) {
		this.carpai = carpai;
	}

	public void setCarjia(int carjia) {
		this.carjia = carjia;
	}

	public void setCarwei(int carwei) {
		this.carwei = carwei;
	}

	public void setTrainpai(int trainpai) {
		this.trainpai = trainpai;
	}

	public void setTrainjia(int trainjia) {
		this.trainjia = trainjia;
	}

	public void setTrainwei(int trainwei) {
		this.trainwei = trainwei;
	}

	public void setAirpai(int airpai) {
		this.airpai = airpai;
	}

	public void setAirjia(int airjia) {
		this.airjia = airjia;
	}

	public void setAirwei(int airwei) {
		this.airwei = airwei;
	}

	public void setPai(int pai) {
		this.pai = pai;
	}

	public void setJia(int jia) {
		this.jia = jia;
	}

	public void setWei(int wei) {
		this.wei = wei;
	}

	public void setAlarmRate(double rate) {
		this.rate = rate;
	}

	public double getAlarmRate() {
		return rate;
	}

}
