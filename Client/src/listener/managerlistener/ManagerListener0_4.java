package listener.managerlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;

import _enum.Opera;
import _enum.ResultMessage;
import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.managerui.ManagerUI0_4;
import vo.EmployeeVO;

public class ManagerListener0_4 implements MouseListener, ActionListener {

	private ManagerUI0_4 ui;
	ManagerBlService manager = new Manager();

	public ManagerListener0_4(ManagerUI0_4 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getBtnNewButton_15()) {
			ResultMessage rm;
			EmployeeVO vo = this.read();
			rm = manager.manageMember(vo, Opera.Employee_insert);
		} else if (e.getSource() == ui.getBtnNewButton_16()) {
			delete(ui.getTextField());
			delete(ui.getTextField_2());
			delete(ui.getTextField_3());
			delete(ui.getTextField_4());
			delete(ui.getTextField_5());
			delete(ui.getTextField_1());
		}

	}

	private void delete(JTextField textField) {
		// TODO Auto-generated method stub
		textField.setText("");
	}

	private EmployeeVO read() {
		// TODO Auto-generated method stub
		String employeeID = ui.getTextField_1().getText();
		String employeeName = ui.getTextField().getText();
		String employeePosition = ui.getTextField_2().getText();
		String belongToWho = ui.getTextField_4().getText();
		String employeeAging = ui.getTextField_3().getText();
		String timeOfWorking = ui.getTextField_5().getText();

		EmployeeVO vo = new EmployeeVO(employeeID, employeeName, Integer.parseInt(employeeAging), employeePosition,
				Integer.parseInt(timeOfWorking), belongToWho);

		return vo;
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