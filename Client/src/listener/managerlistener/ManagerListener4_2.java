package listener.managerlistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.managerui.ManagerUI4_2;

public class ManagerListener4_2 implements MouseListener, ActionListener {

	private ManagerUI4_2 ui;
	ManagerBlService manager = new Manager();
	CardLayout card;
	public ManagerListener4_2 (ManagerUI4_2 ui, CardLayout card){
		super();
		this.ui=ui;
		this.card=card;
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
