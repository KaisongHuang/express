package listener.managerlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextArea;

import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.managerui.ManagerUI14;

public class ManagerListener14 implements MouseListener, ActionListener {

	private ManagerUI14 ui;
	ManagerBlService manager = new Manager();
	
	public ManagerListener14 (ManagerUI14 ui){
		super();
		this.ui=ui;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
        if(e.getSource()==ui.getBtnNewButton_11()){
			
		}else if(e.getSource()==ui.getBtnNewButton_12()){
			
		}else if(e.getSource()==ui.getBtnNewButton_13()){
			
		}else if(e.getSource()==ui.getButton_1()){
			
		}else if(e.getSource()==ui.getBtnNewButton_15()){
			
		}else if(e.getSource()==ui.getBtnNewButton_16()){
			delete(ui.getTextArea());
		}else if(e.getSource()==ui.getButton()){
			
		}
		
	}

	private void delete(JTextArea textArea) {
		// TODO Auto-generated method stub
		textArea.setText("");
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
