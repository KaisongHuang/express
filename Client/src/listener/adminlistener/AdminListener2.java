package listener.adminlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import _enum.Operation;
import _enum.ResultMessage;
import logic.adminbl.Admin;
import logic.adminblservice.AdminBlService;
import presentation.adminui.AdminUI2;
import vo.AdminVO;

public class AdminListener2 implements MouseListener, ActionListener {

	private AdminUI2 ui;
	AdminVO vo ;
	AdminBlService admin = new Admin();

	public AdminListener2 (AdminUI2 ui){
		super();
		this.ui=ui;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getButton_1()){
			delete1(ui.getLabel1());
			delete(ui.getTextField());
			delete(ui.getTextField_2());
			ui.getComboBox_1().setSelectedIndex(0);
		}else if(e.getSource()==ui.getButton_2()){
			String id = ui.getTextField_2().getText();
			vo = admin.find(id);
			
			setAll(vo);
		}else if(e.getSource()==ui.getButton()){
			ResultMessage rm;
			vo = this.update();
			rm=admin.manageCount(vo, Operation.update);
		}

	}
	
	private void checkResultMessage(ResultMessage rm){
		String dialog=null;
		if(rm==ResultMessage.FunctionError){
			dialog="网络连接出现了问题，请检查您的网络！";
		}else if(rm==ResultMessage.Fail)
			dialog="数据更新失败！";
		else if(rm==ResultMessage.Success){
			dialog="数据更新成功！";
		}
		if(dialog!=null)
			JOptionPane.showConfirmDialog(ui, dialog);
	}
	

	private void delete1(JLabel label1) {
		// TODO Auto-generated method stub
		label1.setText("");
	}

	private AdminVO update() {
		// TODO Auto-generated method stub
		String id = ui.getTextField_2().getText();
		String name = ui.getTextField().getText();
		String password = ui.getLabel1().getText();
		String role = (String) ui.getComboBox_1().getSelectedItem();

		AdminVO vo1 = new AdminVO(id,name,password,role);
		return vo1;
	}

	private void setAll(AdminVO vo) {
		// TODO Auto-generated method stub
		ui.setTextField(new JTextField(vo.getName()));
		ui.setLabel1(new JLabel(vo.getPassword()));

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
