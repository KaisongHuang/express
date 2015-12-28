package po;

import java.io.Serializable;
import java.util.ArrayList;

public class HistoryPO  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String state;
	private ArrayList<String> list1;
	private ArrayList<Integer> list2 ;
   
	public HistoryPO(String id,String state, ArrayList<String> list1,ArrayList<Integer> list2) {
		this.state = state;
		this.list1 = list1;
		this.list2=list2;
		this.id=id;
		
	}

	public String getState() {
		return state;
	}

	public ArrayList<String> getList1() {
		return list1;
	}
	
	public ArrayList<Integer> getList2(){
		return list2;
	}
	public String getID(){
		return id;
	}
}
