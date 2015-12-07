package History;

import java.sql.ResultSet;
import java.sql.SQLException;

import HistoryService.HistoryService;
import server.database.MySQLDataBase;

public class History implements HistoryService{
    MySQLDataBase db;
    String sql;
	public History(MySQLDataBase db){
		this.db=db;
	}
	public void init(String id) {
		sql="insert into History values('"+id+"',0,'0','0','0',0,0,0,0);";
		
	}

	public void courier(String id) {
		sql="select * from History where id='"+id+"';";
		ResultSet rs=db.find(sql);
		int courier=0;
		try {
			courier=rs.getInt(2)+1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sql="update History set courier="+courier+" where id='"+id+"';";
		db.update(id);
	}

	public void SellingArea(String id, String sellingAreaID, String state) {
		sql="select * from History where id='"+id+"';";
		ResultSet rs=db.find(sql);
		int selling=0;
	    String sid=null;
		try {
			selling=rs.getInt(6)+1;
			if(!rs.getString(3).equals("0")){
				sid=rs.getString(3);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sql="update History set sellingAreaID='"+sid+sellingAreaID+"' ,state="+state+",selling="+selling+" where id='"+id+"';";
		db.update(sql);
	}

	public void Centre(String id, String centreID, String state) {
		sql="select * from History where id='"+id+"';";
		ResultSet rs=db.find(sql);
		int centre=0;
		String cid=null;
		try {
			centre=rs.getInt(7)+1;
			if(!rs.getString(4).equals("0"))
				cid=rs.getString(4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sql="update History set centreID='"+cid+centreID+"' ,state="+state+",centre="+centre+" where id='"+id+"';";
		db.update(sql);
		
	}

	public void Warehouse(String id, String WarehouseID, String state) {
	    
		sql="select * from History where id='"+id+"';";
		ResultSet rs=db.find(sql);
		int warehouse=0;
		String wid=null;
		try {
			warehouse=rs.getInt(7)+1;
			if(!rs.getString(5).equals("0"))
				wid=rs.getString(5);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sql="update History set centreID='"+wid+WarehouseID+"' ,state="+state+",warehouse="+warehouse+" where id='"+id+"';";
		db.update(sql);
	}

}
