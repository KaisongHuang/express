package vo;

public class CentreArrivalVO {

	private String ID;
	private String getDate;
	private String transferID;
	private String start;
	private String expressState;
	private int isCheck;
    private Check c;
	public String getID() {
		return ID;
	}

	public CentreArrivalVO(String id, String gd, String ti, String start, String es, int isCheck) {

		this.ID = id;
		this.getDate = gd;
		this.transferID = ti;
		this.start = start;
		this.expressState = es;
		this.isCheck = isCheck;
        c=new Check();
	}

	public int checkIsNull(){
		if(ID.length()==0||getDate.length()==0||transferID.length()==0||start.length()==0||expressState.length()==0)
			return 0;
		return 1;
	}
	public int checkID(){
		return c.checkID(ID,6);
	}
	public int checkDate(){
		return c.checkDate(getDate);
	}
	public int checkTransfer(){
		return c.checkID(transferID, 21);
	}
	public int getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}

	public String getCentreID() {
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
