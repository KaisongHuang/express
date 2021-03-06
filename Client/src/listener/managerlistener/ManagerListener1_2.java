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
import po.InstitutionPO;
import presentation.MySwing.MyButton;
import presentation.managerui.ManagerUI1_2;
import vo.InstitutionVO;

public class ManagerListener1_2 implements MouseListener, ActionListener {

	private ManagerUI1_2 ui;
	ManagerBlService manager  ;

	public ManagerListener1_2(ManagerUI1_2 ui) {
		super();
		this.ui = ui;
		manager=LogicFactory.getManagerService();
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
		} else if (e.getSource() == ui.getUpdate()) {
			ResultMessage rm;
			InstitutionVO vo = this.read();
//			if (check(vo.getOrganizationID()))
//				return;
			rm = manager.manageMember(vo, Opera.Institution_update);
			check(rm);
		}

	}

	private boolean check(InstitutionVO vo) {
		if (vo == null) {
			ui.setErrorText( "机构编号不存在！");
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
			ui.setText( dialog);
		} else if (rm == ResultMessage.UpdateFail) {
			dialog = "请不要重复创建单据";
		}
		if (dialog != null)
			ui.setErrorText( dialog);
	}

	private boolean check(String id) {
		if (id.length() != 6) {
			ui.setErrorText( "请确认员工编号格式是否正确！");
			return false;
		}
		try {
			Integer.parseInt(id);
		} catch (NumberFormatException e) {
			ui.setErrorText("请确认员工编号格式是否正确！");
			return false;
		}
		return true;
	}

	private InstitutionVO read() {
		// TODO Auto-generated method stub
		String oi = ui.getTextField_1().getText();
		String name = ui.getTextField_3().getText();
		InstitutionVO vo = new InstitutionVO(oi, name);
		return vo;
	}

	private void set(InstitutionVO vo) {
		// TODO Auto-generated method stub
		ui.getTextField_1().setText(vo.getOrganizationID());
		ui.getTextField_3().setText(vo.getName());
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
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

}
