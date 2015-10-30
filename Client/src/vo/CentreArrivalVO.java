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

}
