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
import po.SalaryPO;
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
			String list1=po1.getCity1();
			String list2=po1.getCity2();
			
				sql="insert into DistanceAndFee values('"+list1+"','"+list2+","+po1.getFee()+","+po1.getDistance()+");";
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
		}else if(po instanceof SalaryPO){
			SalaryPO salary=(SalaryPO) po;
			sql="update Salary set salaryMethod='"+salary.getSalaryMethod()+"' where employeeName='"+salary.getEmployeeName()+"';";
			rm=db.update(sql);
		}else if(po instanceof DistanceAndFee){
			DistanceAndFee po1=(DistanceAndFee) po;
			sql="update Salary set fee="+po1.getFee()+",distance="+po1.getDistance()+" where city1='"+po1.getCity1()+
					"';";
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
	
	public ArrayList<CarPackPO> getCarPack() throws RemoteException{
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
					list.add(new CarPackPO(rs.getString(1),rs.getString(10),rs.getString(2),rs.getString(3),rs.getString(4),
							rs.getString(11),rs.getString(5),rs.getString(6),
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
	
	public ArrayList<ReceiptPO> getReceipt() throws RemoteException{
		String sql="select * from Receipt where isCheck=0;";
		ArrayList<ReceiptPO> list=new ArrayList<ReceiptPO>();
		list=null;
		ArrayList<String> list1=new ArrayList<String>();
		ResultSet rs=db.find(sql);
		String id1="";
		String id2="";
		int count=0;
		try {
			while(rs.next()){
				id1=rs.getString(3);
				if(count==0)
					id2=id1;
				if(id1.equals(id2))
					list1.add(rs.getString(5));
				else{
					list.add(new ReceiptPO(rs.getDouble(1),rs.getString(2),rs.getString(6),rs.getString(3),list1,rs.getInt(4)));
					list1.clear();
					list1.add(rs.getString(5));
				}
				id2=rs.getString(3);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public ArrayList<AcceptPO> getAccept() throws RemoteException{
		String sql="select * from Accept where isCheck=0;";
		ArrayList<AcceptPO> list=new ArrayList<AcceptPO>();
		list=null;
		ResultSet rs=db.find(sql);
		try {
			while(rs.next()){
			    list.add(new AcceptPO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6)));	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<DeliverPO> getDeliver() throws RemoteException{
		String sql="select * from Deliver where isCheck=0;";
		ArrayList<DeliverPO> list=new ArrayList<DeliverPO>();
		list=null;
		ResultSet rs=db.find(sql);
		try {
			while(rs.next()){
			     list.add(new DeliverPO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4)));	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public ArrayList<CentreArrivalPO> getCentreArrival() throws RemoteException{
		String sql="select * from CentreArrival where isCheck=0;";
		ArrayList<CentreArrivalPO> list=new ArrayList<CentreArrivalPO>();
		ResultSet rs=db.find(sql);
		try {
			while(rs.next()){
			    list.add(new CentreArrivalPO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7)));
			    
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<CentrePackPO> getCentrePack() throws RemoteException{
		String sql="select * from CentrePack where isCheck=0;";
		ArrayList<CentrePackPO> list=new ArrayList<CentrePackPO>();
		list=null;
		ArrayList<String> list1=new ArrayList<String>();
		int count=0;
		String id1="";
		String id2="";
	    ResultSet rs=db.find(sql);
	    try {
			while(rs.next()){
			   id1=rs.getString(2);
			   if(count==0)
				   id2=id1;
			   if(id1.equals(id2))
				   list1.add(rs.getString(7));
			   else{
				   list.add(new CentrePackPO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
						   rs.getString(6),list1,rs.getDouble(8),rs.getInt(9)));
				   list.clear();
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
	
	public ArrayList<CentreTransforPO> getCentreTransfor() throws RemoteException{
		String sql="select * from CentreTransfor where isCheck=0;";
		ArrayList<CentreTransforPO> list=new ArrayList<CentreTransforPO>();
		list=null;
		ArrayList<String> list1=new ArrayList<String>();
		String id1="";
		String id2="";
		int count=0;
		ResultSet rs=db.find(sql);
		try {
			while(rs.next()){
			    id1=rs.getString(3);
			    if(count==0)
			    	id2=id1;
			    if(id1.equals(id2))
			    	list1.add(rs.getString(9));
			    else{
			    	list.add(new CentreTransforPO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
			    			rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),list1,rs.getDouble(10),
			    			rs.getInt(11),rs.getInt(12)));
			    	list1.clear();
			    	list1.add(rs.getString(9));
			    }
			    id2=rs.getString(3);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public ArrayList<InStoragePO> getInStorage() throws RemoteException{
		String sql="select * from InStorage where isCheck=0;";
		ArrayList<InStoragePO> list=new ArrayList<InStoragePO>();
		list=null;
		ResultSet rs=db.find(sql);
		try {
			while(rs.next()){
			     list.add(new InStoragePO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(9),
			    		 rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(10)));
			     
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<OutStoragePO> getOutStorage() throws RemoteException{
		String sql = "select * from OutStorage where isCheck=0;";
		ArrayList<OutStoragePO> list = new ArrayList<OutStoragePO>();
		list = null;
		ResultSet rs = db.find(sql);
		try {
			while (rs.next()) {
				list.add(new OutStoragePO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(7),
						rs.getString(4), rs.getString(5), rs.getInt(6)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<PayPO> getPay() throws RemoteException{
	   String sql="select * from Pay where isCheck=0;";
	   ArrayList<PayPO> list=new ArrayList<PayPO>();
	   list=null;
	   ResultSet rs=db.find(sql);
	   try {
		while(rs.next()){
			   list.add(new PayPO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
					   rs.getDouble(6),rs.getInt(7)));
		   }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return list;
	}
	public ArrayList<SalaryPO> getSalary() throws RemoteException {
		ArrayList<SalaryPO> list=new ArrayList<SalaryPO>();
		String sql="select * from Salary;";
		ResultSet rs=db.find(sql);
		try {
			while(rs.next()){
				list.add(new SalaryPO(rs.getString(1),rs.getString(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public ArrayList<DistanceAndFee> getDistanceAndFee() throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList<DistanceAndFee> list=new ArrayList<DistanceAndFee>();
		String sql="select * from DistanceAndFee;";
		ResultSet rs=db.find(sql);
		try {
			while(rs.next()){
				list.add(new DistanceAndFee(rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getDouble(4)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
}
