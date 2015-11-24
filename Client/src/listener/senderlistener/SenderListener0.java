package listener.senderlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import logic.senderbl.Sender;
import logic.senderblservice.SenderBlService;
import presentation.senderui.SearchUI;

public class SenderListener0 implements MouseListener, ActionListener {

	private SearchUI ui;
	SenderBlService sender = new Sender();
	
	public SenderListener0 (SearchUI ui){
		super();
		this.ui=ui;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
