package listener.managerlistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;

import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.managerui.ManagerUI11;

public class ManagerListener11 implements MouseListener, ActionListener {

	private ManagerUI11 ui;
	ManagerBlService manager = new Manager();
	CardLayout card;
	public ManagerListener11 (ManagerUI11 ui, CardLayout card){
		super();
		this.ui=ui;
		this.card=card;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getBtnNewButton_11()){
			
		}else if(e.getSource()==ui.getBtnNewButton_12()){
			
		}else if(e.getSource()==ui.getBtnNewButton_13()){
			
		}else if(e.getSource()==ui.getBtnNewButton_14()){
			
		}else if(e.getSource()==ui.getBtnNewButton_15()){
			
		}else if(e.getSource()==ui.getBtnNewButton_16()){
			
		}else if(e.getSource()==ui.getBtnNewButton_17()){
			delete(ui.getTextField());
			delete(ui.getTextField_1());
			delete(ui.getTextField_2());
			delete(ui.getTextField_3());
			delete(ui.getTextField_4());
		}else if(e.getSource()==ui.getButton()){
			
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
