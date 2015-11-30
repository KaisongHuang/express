package listener.managerlistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;

import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.managerui.ManagerUI13;

public class ManagerListener13 implements MouseListener, ActionListener {

	private ManagerUI13 ui;
	ManagerBlService manager = new Manager();
	CardLayout card;
	public ManagerListener13 (ManagerUI13 ui, CardLayout card){
		super();
		this.ui=ui;
		this.card=card;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
        if(e.getSource()==ui.getButton()){
			
		}else if(e.getSource()==ui.getBtnNewButton_15()){
			
		}else if(e.getSource()==ui.getBtnNewButton_11()){
			
		}else if(e.getSource()==ui.getBtnNewButton_12()){
			
		}else if(e.getSource()==ui.getBtnNewButton_13()){
			
		}else if(e.getSource()==ui.getBtnNewButton_14()){
			
		}else if(e.getSource()==ui.getBtnNewButton_16()){
			delete(ui.getTextField());
			delete(ui.getTextField_1());
			delete(ui.getTextField_2());
			delete(ui.getTextField_3());
		}
		
	}
	
	private void delete(JTextField textField) {
		// TODO Auto-generated method stub
		textField.setText("");
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
