package po;

import java.io.Serializable;

public class CourierPO implements Serializable {
	int number;
	String name;
	String date;

	public CourierPO(int num, String na, String da) {
		number = num;
		name = na;
		date = da;
	}

	public CourierPO() {
		// TODO 锟皆讹拷锟斤拷傻墓锟斤拷旌拷锟斤拷锟�
	}

}
