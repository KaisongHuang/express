package listener.managerlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.managerui.ManagerUI3;

public class ManagerListener30 implements MouseListener, ActionListener {

	private ManagerUI3 ui;
	ManagerBlService manager = new Manager();
	
	public ManagerListener30 (ManagerUI3 ui){
		super();
		this.ui=ui;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getButton1()){
			
		}else if(e.getSource()==ui.getButton2()){
			
		}
		
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
