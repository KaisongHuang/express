package listener.adminlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;

import _enum.Operation;
import _enum.ResultMessage;
import logic.adminbl.Admin;
import logic.adminblservice.AdminBlService;
import presentation.adminui.AdminUI4;
import vo.AdminVO;

public class AdminListener4 implements MouseListener, ActionListener {

	private AdminUI4 ui;
	AdminVO vo;
	AdminBlService admin = new Admin();
	
	public AdminListener4 (AdminUI4 ui){
		super();
		this.ui=ui;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getBtnNewButton_11()){
			delete(ui.getTextField());
		}else if(e.getSource()==ui.getBtnNewButton_10()){
			ResultMessage rm;
			String id = ui.getTextField().getText();
			vo = admin.find(id);
			rm = admin.manageCount(vo, Operation.delete);
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
