package DailyRecord;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import DailyRecordService.DailyRecordService;

public class DailyRecord implements DailyRecordService{
    BufferedReader br;
    BufferedWriter bw;
	public DailyRecord(){
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
		try {
			bw.write(record);
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
