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
import po.InstitutionPO;
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
			InstitutionPO po = (InstitutionPO) manager.find(id, Opera.Institution_find);
			InstitutionVO vo = new InstitutionVO(po.getOrganizationID(),po.getName());
//			InstitutionVO vo = (InstitutionVO) manager.find(id, Opera.Institution_find);
			set(vo);

			if (!check(vo))
				return;

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
		ui.setLblNewLabel_4(vo.getOrganizationID());
		ui.setLblNewLabel_7(vo.getName());
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getSearch()) {
			MyButton button=ui.getSearch();
			button.setEntered(false);
			button.setPressed(true);
			button.repaint();
		}
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getSearch()) {
			MyButton button=ui.getSearch();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		}
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getSearch()) {
			MyButton button=ui.getSearch();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		}
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getSearch()){
			MyButton button=ui.getSearch();
		    button.setEntered(false);
		    button.repaint();
		}
	}

}
