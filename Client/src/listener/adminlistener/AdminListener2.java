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
import presentation.MySwing.Button;
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
		if(e.getSource()==ui.getCancle()){
			delete1(ui.getLabel1());
			delete(ui.getTextField());
			delete(ui.getTextField_2());
			ui.getComboBox_1().setSelectedIndex(0);
		}else if(e.getSource()==ui.getSearch()){
			String id = ui.getTextField_2().getText();
			vo = admin.find(id);
			if(!checkReturn(vo))
				return;
			setAll(vo);
		}else if(e.getSource()==ui.getConfirm()){
			ResultMessage rm;
			vo = this.update();
			rm=admin.manageCount(vo, Operation.update);
			check(rm);
		}

	}
	private boolean checkReturn(AdminVO vo){
		if(vo==null){
			JOptionPane.showMessageDialog(ui,"系统中不存在此编号！");
	   	    return false;
		}
		return true;
	}
	private void check(ResultMessage rm){
		String dialog=null;
		if(rm==ResultMessage.FunctionError){
			dialog="网络连接出现了问题，请检查您的网络！";
		}else if(rm==ResultMessage.Fail)
			dialog="数据更新失败！";
		else if(rm==ResultMessage.Success){
			dialog="数据更新成功！";
		}else if(rm==ResultMessage.UpdateFail){
			dialog="请不要重复创建单据";
		}
		if(dialog!=null)
			JOptionPane.showMessageDialog(ui, dialog);
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
		ui.setTextField(vo.getName());
		ui.setLabel1(vo.getPassword());

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
		if (e.getSource() == ui.getSearch()) {
			Button button=ui.getSearch();
			button.setEntered(false);
			button.setPressed(true);
			button.repaint();
		} else if (e.getSource() == ui.getConfirm()) {
			Button button=ui.getConfirm();
			button.setEntered(false);
			button.setPressed(true);
			button.repaint();
		}else if(e.getSource()==ui.getCancle()){
			Button button=ui.getCancle();
			button.setEntered(false);
			button.setPressed(true);
			button.repaint();
		}
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getSearch()) {
			Button button=ui.getSearch();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		} else if (e.getSource() == ui.getConfirm()) {
			Button button=ui.getConfirm();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		}else if(e.getSource()==ui.getCancle()){
			Button button=ui.getCancle();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		}
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getSearch()) {
			Button button=ui.getSearch();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		} else if (e.getSource() == ui.getConfirm()) {
			Button button=ui.getConfirm();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		}else if(e.getSource()==ui.getCancle()){
			Button button=ui.getCancle();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		}
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getSearch()){
			Button button=ui.getSearch();
		    button.setEntered(false);
		    button.repaint();
		}else if(e.getSource()==ui.getConfirm()){
			Button button=ui.getConfirm();
		    button.setEntered(false);
		    button.repaint();
		}else if(e.getSource()==ui.getCancle()){
			Button button=ui.getCancle();
		    button.setEntered(false);
		    button.repaint();
		}
	}

}
