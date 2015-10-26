package po;

public class CentreArrivalPO extends CentrePO {

	int centreID;
	String getDate;
	int transferID;
	String start;
	String expressState;

	public CentreArrivalPO(int ci, String gd, int ti, String start, String es) {

		this.centreID = ci;
		this.getDate = gd;
		this.transferID = ti;
		this.start = start;
		this.expressState = es;

	}

}
