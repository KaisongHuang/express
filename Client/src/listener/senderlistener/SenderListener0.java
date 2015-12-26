package listener.senderlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import logic.senderbl.Sender;
import presentation.senderui.SearchUI;
import presentation.senderui.SearchUI1;
import vo.HistoryVO;

public class SenderListener0 implements ActionListener{
    SearchUI search;
    Sender sender;
    SearchUI1 search1;
    JLabel label1;
    JLabel label2;
    JTextArea text;
    String sellingAreaID;
    String centreID;
	public SenderListener0(SearchUI s){
		search=s;
		sender=new Sender();


	}
	public void actionPerformed(ActionEvent e) {
		String s=search.gettextFieldContent();
     	if(!check(s))
     		return ;
		HistoryVO h= sender.search(s);
		if(!check(h))
			return ;

		search1=new SearchUI1();
		set(h);
	}

	private boolean check(HistoryVO vo){
		if(vo==null){
			JOptionPane.showMessageDialog(search,"系统中不存在此快递编号！");
			return false;
		}
		return true;
	}
	private boolean check(String id){
		 if(id.length()!=10)
    		 return false;
    	 try{
    		 Integer.parseInt(id);
    	 }catch(NumberFormatException e){
    		 return false;
    	 }
    	 return true;
	}
	private void set(HistoryVO vo) {
		// TODO Auto-generated method stub

		ArrayList<String> list1 = vo.getList1();
		ArrayList<Integer> list2 = vo.getList2();

		sellingAreaID = list1.get(0);
		centreID = list1.get(1);
        search1.setLabel2(vo.getState());;
        search1.setID(vo.getID());
		int selling = list2.get(0);
		int centre = list2.get(1);


		search1.setText("已揽件");

		// 判断是否达到发货地的营业厅
		if (!sellingAreaID.equals("0"))
			search1.setText("\n" + "快件在营业厅:" + sellingAreaID.substring(0, 6) + "准备装车……");
		// 判断是否达到发货地中转中心
		if (!centreID.equals("0"))
			search1.setText("\n" + "快件已到达中转中心:" + centreID.substring(0, 6));
		// 判断是否发往收货地中转中心
		if (centre >= 2)
			search1.setText("\n" + "快递已离开中转中心" + centreID.substring(0, 6) + "发往下一中转中心");
		// 判断是否到达收货地中转中心
		if (centre >= 3)
			search1.setText("\n" + "快件已到达中转中心:" + centreID.substring(6, 12));
		// 判断是否发往收货地营业厅
		if (centre == 4)
			search1.setText("\n" + "快件已离开中转中心:" + centreID.substring(6, 12) + "正发往营业厅");
		// 判断是否达到收货地营业厅
		if (sellingAreaID.length() == 12)
			search1.setText("\n" + "快件已到达营业厅:" + sellingAreaID.substring(6, 12) + "准备派送");
		// 判断是否派件
		if (selling == 3)
			search1.setText("\n" + "快递员正在为您派件，请保持电话畅通。");

	}

}
