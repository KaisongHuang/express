package po;

import java.io.Serializable;

import po.CentrePO;

public class CentreArrivalPO extends CentrePO  implements Serializable{

	private String ID;
	private String getDate;
	private String transferID;
	private String start;
	private String expressState;
	private int isCheck;
	private int isInStorage;
	public CentreArrivalPO(String id, String gd, String transferID, String start, String es, int isCheck,int isInstorage) {

		this.ID = id;
		this.getDate = gd;
		this.transferID = transferID;
		this.start = start;
		this.expressState = es;
		this.isCheck = isCheck;
		this.isInStorage=isInstorage;
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

	public String getID() {
		return ID;
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

	public int getIsInstorage(){
		return isInStorage;
	}
}
