package vo;

import java.util.ArrayList;

public class HistoryVO {
	String state;
	ArrayList<String> list;

	public HistoryVO(String state, ArrayList<String> list) {
		this.state = state;
		this.list = list;
	}

	public HistoryVO() {
	}

	public String getState() {
		return state;
	}

	public ArrayList<String> getList() {
		return list;
	}

}
