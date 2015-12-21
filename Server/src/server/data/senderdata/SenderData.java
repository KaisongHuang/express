package server.data.senderdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import HistoryService.HistoryService;
import po.HistoryPO;
import dataservice.senderdataservice.SenderDataBaseService;
import server.database.MySQLDataBase;




public class SenderData extends UnicastRemoteObject implements SenderDataBaseService{
	MySQLDataBase db;

	public SenderData(MySQLDataBase db) throws RemoteException{
		super();
		this.db=db;

	}
	public HistoryPO find(String id) throws RemoteException{
        String sql="select * from HistoryPO where id='"+id+"';";
        ResultSet rs=db.find(sql);
        HistoryPO po=null;
        try {
			while(rs.next()){
				String ID=rs.getString(1);
				String state=rs.getString(2);
				ArrayList<String> list1=new ArrayList<String>();
				list1.add(rs.getString(3));
				list1.add(rs.getString(4));
				list1.add(rs.getString(5));
				ArrayList<Integer> list2=new ArrayList<Integer>();
				list2.add(rs.getInt(6));
				list2.add(rs.getInt(7));
				list2.add(rs.getInt(8));
				list2.add(rs.getInt(9));
				po=new HistoryPO(ID,state,list1,list2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return po;
	}



}
