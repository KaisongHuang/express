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
import presentation.adminui.AdminUI1;
import vo.AdminVO;

public class AdminListener1 implements MouseListener, ActionListener {

	private AdminUI1 ui;
	AdminBlService admin = new Admin();

	public AdminListener1 (AdminUI1 ui){
		super();
		this.ui=ui;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getBtnNewButton_11()){
			delete(ui.getTextField());
			delete(ui.getTextField_1());
			ui.getComboBox().setSelectedIndex(0);
		}else if(e.getSource()==ui.getBtnNewButton_10()){
			ResultMessage rm;
			AdminVO vo = this.read();
			rm=admin.manageCount(vo, Operation.insert);
		}

	}

	private AdminVO read() {
		// TODO Auto-generated method stub
		String name = ui.getTextField_3().getText();
		String id = ui.getTextField().getText();
		String password = ui.getTextField_1().getText();
		String role = (String) ui.getComboBox().getSelectedItem();
<<<<<<< HEAD
role="Sender";
=======

>>>>>>> origin/hks
		AdminVO vo = new AdminVO(id,name,password,role);

		return vo;
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
