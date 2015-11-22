package server.data.courierdata;

import po.CourierPO;
import po.SenderPO;
import server.database.MySQLDataBase;
import _enum.ResultMessage;
import dataservice.courierdataservice.CourierDataService;

public class CourierData implements CourierDataService{

	public ResultMessage insert(MySQLDataBase db, Object po,String tableName) {
		String sql="insert into "+tableName+" values(";
		if(tableName.equals("CourierPO")){
			CourierPO po1=(CourierPO) po;
			sql=sql+po1.getNumber()+",'"+po1.getName()+"','"+po1.getDate()+"')";
	
		}else{
			SenderPO po1=(SenderPO) po;
			sql=sql+"'"+po1.getSenderName()+"',"+"'"+po1.getSenderAddress()+"',"+"'"+po1.getSenderCompany()+"',"+"'"+po1.getSenderCall()+"',"+"'"+po1.getSenderPhone()+"',"+"'"+po1.getRecipientName()+"',"+"'"+po1.getRecipientAddress()+"',"+"'"+po1.getRecipientCompany()+"',"+"'"+po1.getRecipientCall()+"',"+"'"+po1.getRecipientPhone()+"')";
			
		}
	    ResultMessage rm=db.insert(sql);	
		return rm;
	}

}
