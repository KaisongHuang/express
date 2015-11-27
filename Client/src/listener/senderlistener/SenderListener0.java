package listener.senderlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.senderbl.Sender;
import presentation.senderui.SearchUI;
import vo.HistoryVO;

public class SenderListener0 implements ActionListener{
    SearchUI search;
    Sender sender;
	public SenderListener0(SearchUI s){
		search=s;
		sender=new Sender();
	}
	public void actionPerformed(ActionEvent e) {
//		String s=search.getTextFieldContent();
//		HistoryVO h= sender.search(Integer.parseInt(s));
	}

}
