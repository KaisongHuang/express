package po;

import java.io.Serializable;

public class WarehousePO  implements Serializable{

	private double rate;
	private String WarehouseID;
	private int carpai,carjia,carwei,trainpai,trainjia,trainwei,airpai,airjia,airwei,pai,jia,wei;
	public WarehousePO( String WarehouseID,int carpai,int carjia,int carwei,int trainpai,int trainjia,int trainwei,int airpai,int qirjia,int airwei,int pai,int jia,int wei,double rate) {
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

	public WarehousePO() {

	}

	public double getRate() {
		return rate;
	}

	public String getWarehouseID() {
		return WarehouseID;
	}

	public int getCarpai() {
		return carpai;
	}

	public int getCarjia() {
		return carjia;
	}

	public int getCarwei() {
		return carwei;
	}

	public int getTrainpai() {
		return trainpai;
	}

	public int getTrainjia() {
		return trainjia;
	}

	public int getTrainwei() {
		return trainwei;
	}

	public int getAirpai() {
		return airpai;
	}

	public int getAirjia() {
		return airjia;
	}

	public int getAirwei() {
		return airwei;
	}

	public int getPai() {
		return pai;
	}

	public int getJia() {
		return jia;
	}

	public int getWei() {
		return wei;
	}


}
