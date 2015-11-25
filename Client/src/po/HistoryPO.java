package po;

import java.util.ArrayList;

public class HistoryPO {
	String state;
	ArrayList<String> list;

	public HistoryPO(String state, ArrayList<String> list) {
		this.state = state;
		this.list = list;
	}

	public String getState() {
		return state;
	}

	public ArrayList<String> getList() {
		return list;
	}
}
