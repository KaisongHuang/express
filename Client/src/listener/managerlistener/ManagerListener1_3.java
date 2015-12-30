package listener.managerlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import _enum.Opera;
import _enum.ResultMessage;
import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import po.InstitutionPO;
import presentation.MySwing.MyButton;
import presentation.managerui.ManagerUI1_3;
import vo.EmployeeVO;
import vo.InstitutionVO;

public class ManagerListener1_3 implements MouseListener, ActionListener {

	private ManagerUI1_3 ui;
	ManagerBlService manager = new Manager();

	public ManagerListener1_3(ManagerUI1_3 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getSearch()) {
			String id = ui.getTextField().getText();
			if (!check(id))
				return;
			InstitutionPO po = (InstitutionPO) manager.find(id, Opera.Institution_find);
			InstitutionVO vo = new InstitutionVO(po.getOrganizationID(),po.getName());
			if (!check(vo))
				return;
			set(vo);
		} else if (e.getSource() == ui.getDelete()) {
			ResultMessage rm;
			String id = ui.getTextField().getText();
			if (!check(id))
				return;
			InstitutionPO po = (InstitutionPO) manager.find(id, Opera.Institution_find);
			InstitutionVO vo = new InstitutionVO(po.getOrganizationID(),po.getName());
			if (!check(vo))
				return;
			rm = manager.manageMember(vo, Opera.Institution_delete);
			check(rm);
		}

	}

	private boolean check(InstitutionVO vo) {
		if (vo == null) {
			ui.setText( "员工编号不存在！");
			return false;
		}
		return true;
	}

	private boolean check(String id) {
		if (id.length() != 6) {
			ui.setText("请确认机构编号格式是否正确！");
			return false;
		}
		try {
			Integer.parseInt(id);
		} catch (NumberFormatException e) {
			ui.setText("请确认机构编号格式是否正确！");
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
		} else if (rm == ResultMessage.UpdateFail) {
			dialog = "请不要重复创建单据";
		}
		if (dialog != null)
			ui.setText( dialog);
	}

	private void set(InstitutionVO vo) {
		// TODO Auto-generated method stub
		ui.getLblNewLabel_5().setText(vo.getOrganizationID());
		ui.getLblNewLabel_8().setText(vo.getName());
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
