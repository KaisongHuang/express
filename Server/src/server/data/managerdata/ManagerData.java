package server.data.managerdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import po.AcceptPO;
import po.CarPackPO;
import po.CentreArrivalPO;
import po.CentrePackPO;
import po.CentreTransforPO;
import po.DeliverPO;
import po.DistanceAndFee;
import po.EmployeePO;
import po.InStoragePO;
import po.InstitutionPO;
import po.ManagerPO;
import po.OutStoragePO;
import po.PayPO;
import po.ReceiptPO;
import po.WarehousePO;
import server.database.MySQLDataBase;
import vo.AcceptVO;
import vo.CarPackVO;
import vo.CentreArrivalVO;
import vo.CentreTransforVO;
import vo.DeliverVO;
import vo.InStorageVO;
import vo.OutStorageVO;
import vo.CentrePackVO;
import vo.PayVO;
import vo.ReceiptVO;
import _enum.ResultMessage;
import dataservice.managerdataservice.ManagerDataBaseService;



public class ManagerData extends UnicastRemoteObject implements ManagerDataBaseService{
	MySQLDataBase db;
	public ManagerData(MySQLDataBase db) throws RemoteException{
		super();
		this.db=db;
	}
	public ResultMessage insert(Object po) throws RemoteException{
		
		String sql;
		ResultMessage rm=null;
		if(po instanceof EmployeePO){
			EmployeePO po1=(EmployeePO) po;
			sql="insert into Employee values('"+po1.getEmployeeID()+"','"+po1.getEmployeeName()+"',"+po1.getEmployeeAging()+",'"+po1.getEmployeePosition()+"',"+po1.getTimeOfWorking()+",'"+po1.getBelongToWho()+"');";
			rm=db.insert(sql);
		}else if(po instanceof InstitutionPO){
			InstitutionPO po1=(InstitutionPO) po;
			sql="insert into Institution values('"+po1.getOrganizationID()+"','"+po1.getName()+"');";
			rm=db.delete(sql);
		}else {
			DistanceAndFee po1=(DistanceAndFee) po;
			ArrayList<String> list1=po1.getCity1();
			ArrayList<String> list2=po1.getCity2();
			for(int i=0;i<list1.size();i++){
				sql="insert into DistanceAndFee values('"+list1.get(i)+"','"+list2.get(i)+","+po1.getFee()+","+po1.getDistance()+");";
			}
		}
		return rm;
	}

	public EmployeePO findEmployee(String id) throws RemoteException{
		String sql;
		ResultSet rs;
		sql="select * from Employee where id='"+id+"';";
	    rs=db.find(sql);
	    try {
			if(rs.next()){
				return new EmployeePO(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getDouble(5),rs.getString(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
	}
	public InstitutionPO findInstitution(String id) throws RemoteException{
		String sql;
		ResultSet rs;
		sql="select * from Institution where id='"+id+"';";
	    rs=db.find(sql);
	    try {
			if(rs.next()){
				return new InstitutionPO(rs.getString(1),rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public WarehousePO findWarehouse(String id) throws RemoteException{
		String sql;
		ResultSet rs;
		sql="select * from Warehouse where WarehouseID='"+id+"';";
	    rs=db.find(sql);
	    try {
			if(rs.next()){
				return new WarehousePO(rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9),rs.getInt(10),rs.getInt(11),rs.getInt(12),rs.getInt(13),rs.getDouble(14));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public Object find() throws RemoteException{
	    
		return null;
	}

	public ResultMessage update( Object po) throws RemoteException{
		String sql;
		ResultMessage rm=null;
		if(po instanceof CarPackPO){
			CarPackPO car=(CarPackPO) po;
			sql="update CarPack set isCheck="+car.getIsCheck()+" where number='"+car.getNumber()+"';";
			rm=db.update(sql);
		}else if(po instanceof ReceiptPO){
			ReceiptPO receipt=(ReceiptPO) po;
			sql="update Receipt set isCheck="+receipt.getIsCheck()+" where number='"+receipt.getNumber()+"';";	
			rm=db.update(sql);
		}else if(po instanceof AcceptPO){
			AcceptPO accept=(AcceptPO) po;
			sql="update Accept set isCheck="+accept.getIsCheck()+" where number='"+accept.getNumber()+"';";
			rm=db.update(sql);
		}else if(po instanceof DeliverPO){
			DeliverPO deliver=(DeliverPO) po;
			sql="update Deliver set isCheck="+deliver.getIsCheck()+"where number='"+deliver.getNumber()+"';";
			rm=db.update(sql);
		}else if(po instanceof CentreArrivalPO){
			CentreArrivalPO centre=(CentreArrivalPO) po;
			sql="update CentreArrival set isCheck="+centre.getIsCheck()+" where transforID='"+centre.getID()+"';";
		    rm=db.update(sql);
		}else if(po instanceof CentreTransforPO){
			CentreTransforPO centre=(CentreTransforPO) po;
			sql="update CentreTransfor set isCheck="+centre.getIsCheck()+" where centreTransforID='"+centre.getCentreTransferID()+"';";
			rm=db.update(sql);
		}else if(po instanceof CentrePackPO){
			CentrePackPO centre=(CentrePackPO) po;
			sql="update CentrePack set isCheck="+centre.getIsCheck()+" where centreTransferID='"+centre.getCentreTransferID()+"';";
			rm=db.update(sql);
		}else if(po instanceof InStoragePO){
			InStoragePO in=(InStoragePO) po;
			sql="update InStorage set isCheck="+in.getIsCheck()+" where id='"+in.getId()+"';";
			rm=db.update(sql);
		}else if(po instanceof OutStoragePO){
			OutStoragePO out=(OutStoragePO) po;
			sql="update OutStorage set isCheck="+out.getIsCheck()+" where id='"+out.getId()+"';";
			rm=db.update(sql);
		}else if(po instanceof PayPO){
			PayPO pay=(PayPO) po;
			sql="update PayPO set isCheck="+pay.getIsCheck()+" where date='"+pay.getDate()+"' and payer='"+pay.getPayer()+"' and payAccount='"+pay.getPayAccount()+"' and entry='"+pay.getEntry()+"' and comments='"+pay.getComments()+"' and cost='"+pay.getCost()+"';";
		    rm=db.update(sql);
		}
		return rm;
	}

	public ResultMessage update(ManagerPO po)throws RemoteException{
		
		return null;
	}
	public ResultMessage delete( Object po) throws RemoteException{
		String sql;
		ResultMessage rm;
		if(po instanceof EmployeePO){
			EmployeePO po1=(EmployeePO) po;
			sql="delete from Employee where id='"+po1.getEmployeeID()+"');";
			rm=db.delete(sql);
		}else{
			InstitutionPO po1=(InstitutionPO) po;
			sql="delete from Institution where id='"+po1.getOrganizationID()+"');";
			rm=db.delete(sql);
		}
		return rm;
	}
	
	public ArrayList<CarPackPO> getCarPack(){
		ArrayList<CarPackPO> list=new ArrayList<CarPackPO>();
		list=null;
		String sql="select * from CarPack where isCheck=0;";
		ResultSet rs=db.find(sql);
		String id1=null;
		String id2=null;
		ArrayList<String> list1=new ArrayList<String>();
		try {
			int count=0;
			while(rs.next()){
				id1=rs.getString(2);
				if(count==0)
					id2=id1;
				count++;
				if(id1.equals(id2)){
				   list1.add(rs.getString(7));
				}
				else{
					list.add(new CarPackPO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
						list1,rs.getDouble(8),rs.getInt(9)));
					list1.clear();
					list1.add(rs.getString(7));
				}
				id2=rs.getString(2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	
	public ArrayList<ReceiptPO> getReceipt(){
		String sql="select * from Receipt where isCheck=0;";
		ArrayList<ReceiptPO> list=new ArrayList<ReceiptPO>();
		list=null;
		return list;
	}

}
