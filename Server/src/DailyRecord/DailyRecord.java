package DailyRecord;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import DailyRecordService.DailyRecordService;

public class DailyRecord implements DailyRecordService{
    BufferedReader br;
    BufferedWriter bw;
    DateFormat format;
    Date date;
	public DailyRecord(){
		date=new Date();
		format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			br=new BufferedReader(new FileReader(""));
			bw=new BufferedWriter(new FileWriter(""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void insert(String s) {
		String record=null;
		
		String time=format.format(date);
		try {
			bw.write(time+" "+record);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public ArrayList<String> read() {
		ArrayList<String> list=new ArrayList<String>();
		try {
			String record=br.readLine();
			int count=0;
			while(record!=null&&count<=4000){
				count++;
				list.add(record);
				record=br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
