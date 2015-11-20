package vo;

public class CentreArrivalVO {
	
	int centreID;
	String getDate;
	int transferID;
	String start;
	String expressState;
	
	public CentreArrivalVO(int ci, String gd, int ti, String start, String es){
		
		this.centreID=ci;
		this.getDate=gd;
		this.transferID=ti;
		this.start=start;
		this.expressState=es;
		
	}

	public int getCI() {
		// TODO Auto-generated method stub
		return centreID;
	}

	public String getGD() {
		// TODO Auto-generated method stub
		return getDate;
	}

	public int getTI() {
		// TODO Auto-generated method stub
		return transferID;
	}

	public String getStart() {
		// TODO Auto-generated method stub
		return start;
	}

	public String getES() {
		// TODO Auto-generated method stub
		return expressState;
	}

}
