package listener.senderlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import presentation.senderui.SearchUI1;

public class SenderListener1 implements ActionListener{
	SearchUI1 search;
    public SenderListener1(SearchUI1 s){
    	search=s;
    }
	public void actionPerformed(ActionEvent e) {
	     search.setVisible(false);;
         search.getLabel1().setText("");
         search.getLabel2().setText("");
         search.getText().setText("");
		
	}

}
