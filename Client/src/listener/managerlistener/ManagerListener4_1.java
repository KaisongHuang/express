package listener.managerlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.managerui.ManagerUI4_1;

public class ManagerListener4_1 implements MouseListener, ActionListener {

	private ManagerUI4_1 ui;
	ManagerBlService manager = new Manager();
	public ManagerListener4_1 (ManagerUI4_1 ui){
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
