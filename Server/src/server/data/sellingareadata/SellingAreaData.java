package server.data.sellingareadata;

import java.sql.ResultSet;
import server.database.MySQLDataBase;
import po.*;
import Server_enum.ResultMessage;
import dataservice.sellingareadataservice.SellingAreaDataService;

public class SellingAreaData implements SellingAreaDataService{

	public SellingareaPO find(MySQLDataBase db, int id,String tableName) {
	    String sql="select * from "+tableName+" where ";
	    if(tableName.equals("Car"))
	    	sql=sql+"number="+id;
	    else if(tableName.equals("Driver"))
	    	sql=sql+"number="+id;
	    ResultSet rs=db.find(sql);
		return null;
	}

	public ResultMessage update(MySQLDataBase db, Object po,String tableName) {
		String sql="update "+tableName+" set ";
		 if(tableName.equals("Car")){
			 CarPO po1=(CarPO)po;
		    	sql=sql+"EngineNumber="+po1.getEngineNumber()+",CarNumber="+po1.getCarNumber()+",ChassisNumber="+po1.getChassisNumber()+
		    			",purchase="+po1.getPurchase()+",ServiceTime="+po1.getServiceTime()+" where number="+po1.getNumber();
		 }
		    else if(tableName.equals("Driver")) {
			    DriverPO po1=(DriverPO) po;
		    	sql=sql+"name="+po1.getName()+",birthday="+po1.getBirthday()+",ID="+po1.getID()+",phone="+po1.getPhone()+
		    			",CarCompany="+po1.getCarCompany()+",sex="+po1.getSex()+",LicenceTime="+po1.getSex()+
		    			" where number="+po1.getNumber();
		    
		    }
		 ResultMessage rm=db.update(sql);
		return rm;
	}

	public ResultMessage delete(MySQLDataBase db, Object po,String tableName) {
		String sql="delete from "+tableName+" where number=";
		if(tableName.equals("Car")){
			sql=sql+((CarPO) po).getNumber();
		}else if(tableName.equals("Car")){
			sql=sql+((DriverPO) po).getNumber();
		}
		ResultMessage rm=db.delete(sql);	
		
		
		return rm;
	}

	public ResultMessage insert(MySQLDataBase db, Object po,String tableName) {
		String sql="insert into "+tableName+" values(";
		if(tableName.equals("CarPack")){
			CarPackPO po1=(CarPackPO) po;
			sql=sql+"'"+po1.getDate()+"',"+po1.getNumber()+",'"+po1.getStart()+"','"
				+po1.getDestination()+"',"+po1.getSupervisor()+","+po1.getSupercargo()+","+po1.getList()+","+po1.getFee()+","+po1.getIsCheck()+")";
		}else if(tableName.equals("Car")){
			CarPO po1=(CarPO) po;
			sql=sql+po1.getNumber()+","+po1.getEngineNumber()+","+po1.getCarNumber()+","+po1.getChassisNumber()+",'"+po1.getPurchase()+"',"+po1.getServiceTime()+")";
		}else if(tableName.equals("Driver")){
			DriverPO po1=(DriverPO) po;
			sql=sql+po1.getNumber()+",'"+po1.getName()+"','"+po1.getBirthday()+"',"+po1.getID()+",'"+po1.getPhone()+"','"+po1.getCarCompany()+"','"+po1.getSex()+"','"+po1.getLicenceTime()+"')";
		}else if(tableName.equals("Receipt")){
			ReceiptPO po1=(ReceiptPO) po;
			sql=sql+po1.getMoney()+",'"+po1.getDate()+"',"+po1.getNumber()+","+po1.getIsChenk()+")";
		}else if(tableName.equals("Accept")){
			AcceptPO po1=(AcceptPO) po;
			sql=sql+po1.getBarCode()+",'"+po1.getDate()+"',"+po1.getNumber()+","+po1.getStart()+","+po1.getState()+","+po1.getIsCheck()+")";
		}else if(tableName.equals("Deliver")){
			DeliverPO po1=(DeliverPO) po;
			sql=sql+po1.getBarCode()+",'"+po1.getDate()+"',"+po1.getNumber()+","+po1.getIsCheck()+")";
		}
		ResultMessage rm=db.insert(sql);
		return null;
	}
}

