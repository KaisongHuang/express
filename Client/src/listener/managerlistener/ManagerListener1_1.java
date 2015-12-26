package listener.managerlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import _enum.Opera;
import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.MySwing.MyButton;
import presentation.managerui.ManagerUI1_1;
import vo.EmployeeVO;
import vo.InstitutionVO;

public class ManagerListener1_1 implements MouseListener, ActionListener {

	private ManagerUI1_1 ui;
	ManagerBlService manager = new Manager();

	public ManagerListener1_1(ManagerUI1_1 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getSearch()) {
			String id = ui.getTextField().getText();
			if (!check(id))
				return;
			InstitutionVO vo = (InstitutionVO) manager.find(id, Opera.Institution_find);
			if (!check(vo))
				return;
			set(vo);
		} 

	}

	private boolean check(InstitutionVO vo) {
		if (vo == null) {
			JOptionPane.showMessageDialog(ui, "机构编号不存在！");
			return false;
		}
		return true;
	}

	private boolean check(String id) {
		if (id.length() != 6) {
			JOptionPane.showMessageDialog(ui, "请确认机构编号格式是否正确！");
			return false;
		}
		try {
			Integer.parseInt(id);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(ui, "请确认机构编号格式是否正确！");
			return false;
		}
		return true;
	}

	private void delete(JLabel jLabel) {
		// TODO Auto-generated method stub
		jLabel.setText("");
		;
	}

	private void set(InstitutionVO vo) {
		// TODO Auto-generated method stub
		ui.setLblNewLabel_4(new JLabel(vo.getOrganizationID()));
		ui.setLblNewLabel_7(new JLabel(vo.getName()));
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
		// TODO Auto-generated method stub
	}

	public void mouseExited(MouseEvent e) {
	}

}
