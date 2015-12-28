package listener.adminlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
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

	public AdminListener1(AdminUI1 ui) {
		super();
		this.ui = ui;

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getBtnNewButton_11()) {
			delete(ui.getTextField_3());
			delete(ui.getTextField());
			delete(ui.getTextField_1());
			ui.getComboBox().setSelectedIndex(0);
		} else if (e.getSource() == ui.getBtnNewButton_10()) {
			ResultMessage rm;
			AdminVO vo = this.read();
			if (!check(vo))
				return;
			rm = admin.manageCount(vo, Operation.insert);
			check(rm);
		}

	}

	private boolean check(AdminVO vo) {
		if (vo.checkIsNull() == 0) {
			ui.setText( "请将信息填写完整！");
			return false;
		}
		if (vo.checkId() == 0) {
			ui.setText( "请检查编号格式是否正确。");
			return false;
		}
		return true;
	}

	private AdminVO read() {
		// TODO Auto-generated method stub
		String name = ui.getTextField_3().getText();
		String id = ui.getTextField().getText();
		String password = ui.getTextField_1().getText();
		String role = (String) ui.getComboBox().getSelectedItem();
		AdminVO vo = new AdminVO(id, name, password, role);
		return vo;
	}

	private void check(ResultMessage rm) {
		String dialog = null;
		if (rm == ResultMessage.FunctionError) {
			dialog = "网络连接出现了问题，请检查您的网络！";
		} else if (rm == ResultMessage.Fail)
			dialog = "数据更新失败！";
		else if (rm == ResultMessage.Success) {
			dialog = "数据更新成功！";
		} else if (rm == ResultMessage.UpdateFail) {
			dialog = "请不要重复创建单据";
		}
		if (dialog != null)
			ui.setText( dialog);
	}

	private void delete(JTextField textField) {
		// TODO Auto-generated method stub
		textField.setText("");
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

}
