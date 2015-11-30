package listener.managerlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

import _enum.Opera;
import _enum.ResultMessage;
import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.managerui.ManagerUI02;
import vo.EmployeeVO;

public class ManagerListener02 implements MouseListener, ActionListener {
	
	private ManagerUI02 ui;
	ManagerBlService manager = new Manager();
	
	public ManagerListener02 (ManagerUI02 ui){
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
        if(e.getSource()==ui.getBtnNewButton_11()){
			
		}else if(e.getSource()==ui.getBtnNewButton_13()){
			
		}else if(e.getSource()==ui.getBtnNewButton_14()){
			
		}else if(e.getSource()==ui.getBtnNewButton_15()){
			String s = ui.getTextField().getText();
			EmployeeVO vo = (EmployeeVO) manager.find(s,Opera.Employee_find);
			setLabel(vo);
		}else if(e.getSource()==ui.getBtnNewButton_16()){
			ResultMessage rm;
			EmployeeVO vo = this.read();
			rm = manager.manageMember(vo,Opera.Employee_delete);
		}else if(e.getSource()==ui.getBtnNewButton_17()){
			delete1(ui.getTextField());
			delete2(ui.getLblNewLabel_3());
			delete2(ui.getLblNewLabel_5());
			delete2(ui.getLblNewLabel_7());
			delete2(ui.getLblNewLabel_9());
			delete2(ui.getLblNewLabel_11());
			delete2(ui.getLblNewLabel_13());
		}
		
	}
	private void delete1(JTextField textField) {
		// TODO Auto-generated method stub
		textField.setText("");
	}
	
	private void delete2(JLabel label) {
		// TODO Auto-generated method stub
		label.setText("");
	}

	private EmployeeVO read() {
		// TODO Auto-generated method stub
		String employeeID = ui.getLblNewLabel_9().getText();
		String employeeName = ui.getLblNewLabel_3().getText();
		String employeePosition = ui.getLblNewLabel_5().getText();
		String belongToWho = ui.getLblNewLabel_7().getText();
		String employeeAging = ui.getLblNewLabel_11().getText();
		String timeOfWorking = ui.getLblNewLabel_13().getText();
		
		EmployeeVO vo = new EmployeeVO(employeeID, employeeName, Integer.parseInt(employeeAging),
				employeePosition, Integer.parseInt(timeOfWorking), belongToWho);
		
		return vo;
	}

	private void setLabel(EmployeeVO vo) {
		// TODO Auto-generated method stub
		ui.setLblNewLabel_3(new JLabel(vo.getEmployeeName()));
		ui.setLblNewLabel_9(new JLabel(""+vo.getEmployeeID()));
		ui.setLblNewLabel_5(new JLabel(vo.getEmployeePosition()));
		ui.setLblNewLabel_11(new JLabel(""+vo.getEmployeeAging()));
		ui.setLblNewLabel_7(new JLabel(vo.getBelongToWho()));
		ui.setLblNewLabel_13(new JLabel(""+vo.getTimeOfWorking()));
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
