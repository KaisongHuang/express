package vo;

public class CentreArrivalVO {
	
	int centreID;
	String getDate;
	int transferID;
	String start;
	String expressState;
	int isCheck;
	
	public CentreArrivalVO(int ci, String gd, int ti, String start, String es, int isCheck){
		
		this.centreID=ci;
		this.getDate=gd;
		this.transferID=ti;
		this.start=start;
		this.expressState=es;
		this.isCheck=isCheck;
		
	}

	public int getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}

	public int getCentreID() {
		return centreID;
	}

	public void setCentreID(int centreID) {
		this.centreID = centreID;
	}

	public String getGetDate() {
		return getDate;
	}

	public void setGetDate(String getDate) {
		this.getDate = getDate;
	}

	public int getTransferID() {
		return transferID;
	}

	public void setTransferID(int transferID) {
		this.transferID = transferID;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getExpressState() {
		return expressState;
	}

	public void setExpressState(String expressState) {
		this.expressState = expressState;
	}


}
