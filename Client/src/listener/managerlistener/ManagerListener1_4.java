package listener.managerlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import _enum.Opera;
import _enum.ResultMessage;
import logic.logicfactory.LogicFactory;
import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.managerui.ManagerUI1_4;
import vo.InstitutionVO;

public class ManagerListener1_4 implements MouseListener, ActionListener {

	private ManagerUI1_4 ui;
	private ManagerBlService manager  ;

	public ManagerListener1_4(ManagerUI1_4 ui) {
		super();
		this.ui = ui;manager=LogicFactory.getManagerService();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getBtnNewButton_15()) {
			ResultMessage rm;
			InstitutionVO vo = this.read();
			if (!check(vo.getOrganizationID()))
				return;
			rm = manager.manageMember(vo, Opera.Institution_insert);
			check(rm);
		} else if (e.getSource() == ui.getBtnNewButton_16()) {
			delete(ui.getTextField());
			delete(ui.getTextField_2());
		}

	}

	private boolean check(String id) {
		if (id.length() != 6) {
			ui.setErrorText("请确认机构编号格式是否正确！");
			return false;
		}
		try {
			Integer.parseInt(id);
		} catch (NumberFormatException e) {
			ui.setErrorText( "请确认机构编号格式是否正确！");
			return false;
		}
		return true;
	}

	private void check(ResultMessage rm) {
		String dialog = null;
		if (rm == ResultMessage.FunctionError) {
			dialog = "网络连接出现了问题，请检查您的网络！";
		} else if (rm == ResultMessage.Fail)
			dialog = "数据更新失败！";
		else if (rm == ResultMessage.Success) {
			dialog = "数据更新成功！";
			ui.setText(dialog);
			return ;
		} else if (rm == ResultMessage.UpdateFail) {
			dialog = "请不要重复创建单据";
		}
		if (dialog != null)
			ui.setErrorText(dialog);
	}

	private InstitutionVO read() {
		// TODO Auto-generated method stub
		String oi = ui.getTextField().getText();
		String name = ui.getTextField_2().getText();
		InstitutionVO vo = new InstitutionVO(oi, name);
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
