package server.data.warehousedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import po.CentreArrivalPO;
import po.CentreTransforPO;
import po.InStoragePO;
import po.OutStoragePO;
import po.WarehousePO;
import server.database.MySQLDataBase;
import _enum.ResultMessage;
import dataservice.warehousedataservice.WareHouseDataBaseService;

public class WareHouseData extends UnicastRemoteObject implements WareHouseDataBaseService {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	MySQLDataBase db;
    int size;
	public WareHouseData(MySQLDataBase db) throws RemoteException {
		super();
		this.db = db;

	}

	public ResultMessage insert(Object po) throws RemoteException {
		String sql = null;
		ResultMessage rm = null;
		if (po instanceof InStoragePO) {
			InStoragePO po1 = (InStoragePO) po;
			System.out.println(po1.getPos_qu());
			sql = "insert into InStorage values('" + po1.getId() + "','" + po1.getIndate() + "','"
					+ po1.getDestination() + "','" + po1.getPos_qu() + "'," + po1.getPos_pai() + "," + po1.getPos_jia()
					+ "," + po1.getPos_wei() + "," + po1.getIsCheck() + ",'" + po1.getWarehouseID() + "',1);";
			String sql1="update table CentreArrival set isInStorage=1 where ID='"+po1.getId()+"';";
			db.update(sql1);
			rm = db.insert(sql);
		} else {
			OutStoragePO po1 = (OutStoragePO) po;
			sql = "insert into OutStorage values('" + po1.getId() + "','" + po1.getDestination() + "','"
					+ po1.getOutdate() + "','" + po1.getTransportation() + "','" + po1.getTrans_id() + "',"
					+ po1.getIsCheck() + ",'" + po1.getWarehouseID() + "');";
			rm = db.insert(sql);
			if (rm == ResultMessage.Success) {
				String sql1 = "update InStorage set isInStorage=0 where id='" + po1.getId() + "';";
				db.update(sql1);
			}
		}

		return rm;
	}

	public String findDestination(String id) throws RemoteException {
		String destination = null;
		String sql = "select * from Sender where BarCode='" + id + "';";
		ResultSet rs = db.find(sql);
		try {
			if (rs.next())
				destination = rs.getString(7);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return destination;
	}

	public ArrayList<InStoragePO> summarize(String date, String WarehouseID) throws RemoteException {
		String sql = "select * from InStorage where WarehouseID='" + WarehouseID + "' and indate='" + date + "';";
		ResultSet rs = db.find(sql);
		ArrayList<InStoragePO> list = new ArrayList<InStoragePO>();
		try {
			if (!rs.next()) {
				return null;
			}
			while (rs.next()) {
				list.add(new InStoragePO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(9),
						rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), 0));
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}


	public ResultMessage clear() throws RemoteException {
		String sql1 = "truncate table InStorage;";
		String sql2 = "truncate table OutStorage;";
		ResultMessage rm;
		rm = db.delete(sql1);
		rm = db.delete(sql2);
		return rm;
	}

	public ResultMessage update(Object po) throws RemoteException {
		InStoragePO po1 = (InStoragePO) po;
		String sql = "update InStorage set qu='" + po1.getPos_qu() + "',pai=" + po1.getPos_pai() + ",jia="
				+ po1.getPos_jia() + ",wei=" + po1.getPos_wei() + " where id='" + po1.getId() + "';";
		ResultMessage rm = db.update(sql);
		return rm;
	}

	public ArrayList<CentreArrivalPO> getArrival() throws RemoteException {
		String sql = "select * from CentreArrival where isCheck=1 and isInStorage=0;";
		ResultSet rs = db.find(sql);
//		System.out.println(rs);
		ArrayList<CentreArrivalPO> list = new ArrayList<CentreArrivalPO>();
		try {
//			if (!rs.next()) {
//				return null;
//			}
			while (rs.next()) {
				list.add(new CentreArrivalPO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getInt(6), rs.getInt(7)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list.size());
		return list;
	}

	public ResultMessage setAlarm(double d, String WarehouseID) throws RemoteException {
		String sql = "update Warehouse set alarm=" + d + " where WarehouseID='" + WarehouseID + "';";
		ResultMessage rm = null;
		rm = db.update(sql);
		return rm;
	}

	public ArrayList<CentreTransforPO> getTransfor(String start) throws RemoteException {
		System.out.println("debug!");
//		String sql = "select * from CentreTransfor where isCheck=1 and isOutStorage=0 and start='" + start + "';";
		String sql = "select * from CentreTransfor where isCheck=1 and isOutStorage=0;";
		ResultSet rs = db.find(sql);
		ArrayList<CentreTransforPO> list = new ArrayList<CentreTransforPO>();
		String id1 = null;
		String id2 = null;
		try {
			int count = 0;
//			if (!rs.next()) {
//				return null;
//			}
			while (rs.next()) {
				id1 = rs.getString(3);
				System.out.println("id1="+id1);
				if (count == 0){
					id2 = id1;
				}
				count++;
				ArrayList<String> l = new ArrayList<String>();
				if (id1.equals(id2)){
					l.add(rs.getString(9));
				}else {
					list.add(new CentreTransforPO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), l, rs.getDouble(10),
							rs.getInt(11), rs.getInt(12)));
					l.clear();
					l.add(rs.getString(9));
				}
				if(rs.next()){
					id2 = rs.getString(3);
				}else{
					id2 = null;
				}
				System.out.println("id2="+id2+"id1="+id1+"l="+l+"list.size"+list.size());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list.size());
		return list;
	}

	public ArrayList<InStoragePO> findIn(String begin, String end, String WarehouseID) throws RemoteException {

		String sql = "select * from InStorage where WarehouseID='" + WarehouseID + "';";
		ResultSet rs = db.find(sql);
		ArrayList<InStoragePO> list = new ArrayList<InStoragePO>();
		try {
			// if(!rs.next()){
			// return null;
			// }
			while (rs.next()) {
				String date = rs.getString(2);
				if (Integer.parseInt(date) >= Integer.parseInt(begin)
						&& Integer.parseInt(date) <= Integer.parseInt(end))
					list.add(new InStoragePO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(9),
							rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), 0));
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<OutStoragePO> findOut(String begin, String end, String WarehouseID) throws RemoteException {
		String sql = "select * from OutStorage where WarehouseID='" + WarehouseID + "';";
		ResultSet rs = db.find(sql);
		ArrayList<OutStoragePO> list = new ArrayList<OutStoragePO>();
		try {
			// if(!rs.next()){
			// return null;
			// }
			while (rs.next()) {
				String date = rs.getString(3);
				if (Integer.parseInt(date) >= Integer.parseInt(begin)
						&& Integer.parseInt(date) <= Integer.parseInt(end))
					list.add(new OutStoragePO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(7),
							rs.getString(4), rs.getString(5), rs.getInt(6)));
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public ResultMessage checkAlarm(String WarehouseID) throws RemoteException {
		String sql = "select * from Warehouse where WarehouseID='" + WarehouseID + "';";
		ResultSet rs = db.find(sql);

		double alarm = 0;
		try {
			alarm = rs.getDouble(14);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double Size1 = 0;
		double Size2 = 0;
		double Size3 = 0;

		try {
			Size1 = rs.getInt(2) * rs.getInt(3) * rs.getInt(4);
			Size2 = rs.getInt(5) * rs.getInt(6) * rs.getInt(7);
			Size3 = rs.getInt(8) * rs.getInt(9) * rs.getInt(10);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String sql1 = "select * from InStorage where WarehouseID='" + WarehouseID + "' and isInStorage=1 ;";
		ResultSet rs1 = db.find(sql1);
		int size1 = 0;
		int size2 = 0;
		int size3 = 0;
		try {

			while (rs1.next()) {
				if (rs1.getString(4).equals("car"))
					size1++;
				else if (rs1.getString(4).equals("train"))
					size2++;
				else if (rs1.getString(4).equals("air"))
					size3++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultMessage rm = null;
		if (size1 / Size1 >= alarm)
			rm = ResultMessage.Alarm;
		else if (size2 / Size2 >= alarm)
			rm = ResultMessage.Alarm;
		else if (size3 / Size3 >= alarm)
			rm = ResultMessage.Alarm;
		return rm;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * dataservice.warehousedataservice.WareHouseDataBaseService#adjust(java.
	 * lang.String)
	 */
	public ArrayList<InStoragePO> adjust(String WarehouseID) throws RemoteException {
		ArrayList<InStoragePO> list = new ArrayList<InStoragePO>();

		String sql1 = "select * from Warehouse where WarehouseID='" + WarehouseID + "';";
		ResultSet rs1 = db.find(sql1);

		double alarm = 0;
		try {
			if(rs1.next())
				alarm = rs1.getDouble(14);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double Size1 = 0;
		double Size2 = 0;
		double Size3 = 0;

		try {
			Size1 = rs1.getInt(2) * rs1.getInt(3) * rs1.getInt(4);
			System.out.println(Size1);
			Size2 = rs1.getInt(5) * rs1.getInt(6) * rs1.getInt(7);
			Size3 = rs1.getInt(8) * rs1.getInt(9) * rs1.getInt(10);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String sql2 = "select * from InStorage where WarehouseID='" + WarehouseID + "' and isInStorage=1 ;";
		ResultSet rs2 = db.find(sql2);
		int size1 = 0;
		int size2 = 0;
		int size3 = 0;
		try {

			while (rs2.next()) {
				if (rs2.getString(4).equals("car"))
					size1++;
				else if (rs2.getString(4).equals("train"))
					size2++;
				else if (rs2.getString(4).equals("air"))
					size3++;
			}

			System.out.println(size1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		int cout1 = (int) (Size1 * 0.1);
		int cout2 = (int) (Size2 * 0.1);
		int cout3 = (int) (Size3 * 0.1);
		String sql = "select * from InStorage where WarehouseID='" + WarehouseID + "' and isInStorage=1;";
		ResultSet rs = db.find(sql);
		try {

			while (rs.next()) {
				if (size1 / Size1 >= alarm && rs.getString(4).equals("car") && cout1 >= 0) {
					cout1--;
					list.add(new InStoragePO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(9),
							rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(10)));
				}

				if (size2 / Size2 >= alarm && rs.getString(4).equals("train") && cout2 >= 0) {
					cout2--;
					list.add(new InStoragePO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(9),
							rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(10)));
				}

				if (size3 / Size3 >= alarm && rs.getString(4).equals("air") && cout3 >= 0) {
					cout3--;
					list.add(new InStoragePO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(9),
							rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(10)));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		size=list.size();
		return list;
	}

	public ArrayList<int[]> findFreeSpace(String WarehouseID) throws RemoteException {

		String sql = "select * from Warehouse where WarehouseID='" + WarehouseID + "';";
		ResultSet rs = db.find(sql);
		ArrayList<int[]> list = new ArrayList<int[]>();
		int pai = 0;
		int jia = 0;
		int wei = 0;
		try {
			if (rs.next()) {
				pai = rs.getInt(11);
				jia = rs.getInt(12);
				wei = rs.getInt(13);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

A:		for (int i = 1; i <= pai; i++) {
			for (int m = 1; m <= jia; m++) {
				for (int n = 1; n <= wei; n++) {
					System.out.println(n);
					System.out.println(size);
					String sql1 = "select * from InStorage where isInStorage=1 and WarehouseID='" + WarehouseID
							+ "' and pai=" + pai + " and jia=" + jia + " and wei=" + wei + ";";
					rs = db.find(sql1);
					try {
						if (!rs.next() && list.size() <= size) {
							int[] a = { i, m, n };
							list.add(a);
						}
						else if(list.size()>size)
							break A;
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		}

		return list;
	}

}
