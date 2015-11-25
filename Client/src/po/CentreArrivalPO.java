package po;

import po.CentrePO;

public class CentreArrivalPO extends CentrePO {

	String centreID;
	String getDate;
	String transferID;
	String start;
	String expressState;
	int isCheck;

	public CentreArrivalPO(String ci, String gd, String transferID, String start, String es, int isCheck) {

		this.centreID = ci;
		this.getDate = gd;
		this.transferID = transferID;
		this.start = start;
		this.expressState = es;
		this.isCheck = isCheck;
	}

	public String getTransforID() {
		return transferID;
	}

	public void setTransforID(String transforID) {
		this.transferID = transforID;
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

	public void setTransferID(String transforID) {
		this.transferID = transforID;
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
