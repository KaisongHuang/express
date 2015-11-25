package vo;

public class CentreArrivalVO {

	String centreID;
	String getDate;
	String transferID;
	String start;
	String expressState;
	int isCheck;

	public CentreArrivalVO(String ci, String gd, String ti, String start, String es, int isCheck) {

		this.centreID = ci;
		this.getDate = gd;
		this.transferID = ti;
		this.start = start;
		this.expressState = es;
		this.isCheck = isCheck;

	}

	public int getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}

	public String getCentreID() {
		return centreID;
	}

	public void setCentreID(String centreID) {
		this.centreID = centreID;
	}

	public String getGetDate() {
		return getDate;
	}

	public void setGetDate(String getDate) {
		this.getDate = getDate;
	}

	public String getTransferID() {
		return transferID;
	}

	public void setTransferID(String transferID) {
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
