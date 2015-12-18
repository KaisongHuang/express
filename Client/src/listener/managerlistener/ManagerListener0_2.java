package listener.managerlistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;

import _enum.Opera;
import _enum.ResultMessage;
import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.managerui.ManagerUI0_2;
import vo.EmployeeVO;

public class ManagerListener0_2 implements MouseListener, ActionListener {
	
	private ManagerUI0_2 ui;
	ManagerBlService manager = new Manager();
	public ManagerListener0_2 (ManagerUI0_2 ui){
		super();
		this.ui=ui;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
       if(e.getSource()==ui.getBtnNewButton_15()){
			String s = ui.getTextField().getText();
			EmployeeVO vo = (EmployeeVO) manager.find(s,Opera.Employee_find);
			setLabel(vo);
		}else if(e.getSource()==ui.getBtnNewButton_16()){
			ResultMessage rm;
			EmployeeVO vo = this.read();
			rm = manager.manageMember(vo,Opera.Employee_update);
		}else if(e.getSource()==ui.getBtnNewButton_17()){
			delete(ui.getTextField());
			delete(ui.getTextField_1());
			delete(ui.getTextField_2());
			delete(ui.getTextField_3());
			delete(ui.getTextField_4());
			delete(ui.getTextField_5());
			delete(ui.getTextField_6());
		}
		
	}
	
	private void delete(JTextField textField) {
		// TODO Auto-generated method stub
		textField.setText("");
	}

	private EmployeeVO read() {
		// TODO Auto-generated method stub
		String employeeID = ui.getTextField_4().getText();
		String employeeName = ui.getTextField_1().getText();
		String employeePosition = ui.getTextField_2().getText();
		String belongToWho = ui.getTextField_3().getText();
		String employeeAging = ui.getTextField_5().getText();
		String timeOfWorking = ui.getTextField_6().getText();
		
		EmployeeVO vo = new EmployeeVO(employeeID, employeeName, Integer.parseInt(employeeAging),
				employeePosition, Integer.parseInt(timeOfWorking), belongToWho);
		
		return vo;
	}

	private void setLabel(EmployeeVO vo) {
		// TODO Auto-generated method stub
		ui.setTextField_1(new JTextField(vo.getEmployeeName()));
		ui.setTextField_4(new JTextField(""+vo.getEmployeeID()));
		ui.setTextField_2(new JTextField(vo.getEmployeePosition()));
		ui.setTextField_3(new JTextField(vo.getBelongToWho()));
		ui.setTextField_5(new JTextField(""+vo.getEmployeeAging()));
		ui.setTextField_6(new JTextField(""+vo.getTimeOfWorking()));
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
