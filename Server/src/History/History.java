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
		sql="insert into History values('"+id+"','完整','0','0',0,0);";
		
	}

	

	public void SellingArea(String id, String sellingAreaID, String state) {
		sql="select * from History where id='"+id+"';";
		ResultSet rs=db.find(sql);
		int selling=0;
	    String sid="";
		try {
			if(rs.next()){
			selling=rs.getInt(5)+1;
			if(rs.getString(3).equals(sellingAreaID))
				sid="";
			
			else if(!rs.getString(3).equals("0"))
				sid=rs.getString(3);
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(state!=null&&sellingAreaID!=null)
			sql="update History set sellingAreaID='"+sid+sellingAreaID+"' ,state='"+state+"',selling="+selling+" where id='"+id+"';";
		
		else if(state==null&&sellingAreaID==null)
			sql="update History set sellingAreaID='"+sid+"',selling="+selling+" where id='"+id+"';";
		db.update(sql);
	}

	public void Centre(String id, String centreID, String state) {
		sql="select * from History where id='"+id+"';";
		ResultSet rs=db.find(sql);
		int centre=0;
		String cid=null;
		try {
			centre=rs.getInt(6)+1;
			if(!rs.getString(4).equals("0"))
				cid=rs.getString(4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sql="update History set centreID='"+cid+centreID+"' ,state="+state+",centre="+centre+" where id='"+id+"';";
		db.update(sql);
		
	}
}

