package DailyRecord;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import DailyRecordService.DailyRecordService;
import server.database.MySQLDataBase;

public class DailyRecord implements DailyRecordService{
    BufferedReader br;
    BufferedWriter bw;
    DateFormat format;
    Date date;

    MySQLDataBase db;
	public DailyRecord(MySQLDataBase db){
		date=new Date();
		format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.db=db;
		
	}
	public void insert(String s) {
		
		
		String time=format.format(date);
		String sql="insert into Record values('"+time+"','"+s+"');";
	    db.insert(sql);
	}
	

	public ArrayList<String> read() {
		ArrayList<String> list=new ArrayList<String>();

		String sql="select * from Record;";
		ResultSet rs=db.find(sql);
		
		try {
			while(rs.next()&&list.size()<1000){
				list.add(rs.getString(1)+" "+rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

}
