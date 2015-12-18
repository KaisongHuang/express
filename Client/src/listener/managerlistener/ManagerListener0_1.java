package listener.managerlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

import _enum.Opera;
import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.managerui.ManagerUI0_1;
import vo.EmployeeVO;

public class ManagerListener0_1 implements MouseListener, ActionListener {
	
	private ManagerUI0_1 ui;
	ManagerBlService manager = new Manager();
	public ManagerListener0_1 (ManagerUI0_1 ui){
		super();
		this.ui=ui;
	}
	

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getBtnNewButton_15()){
			String s = ui.getTextField().getText();
			EmployeeVO vo = (EmployeeVO) manager.find(s,Opera.Employee_find);
			setLabel(vo);
		}
		
	}

	private void setLabel(EmployeeVO vo) {
		// TODO Auto-generated method stub
		ui.setLblNewLabel_4(new JLabel(vo.getEmployeeName()));
		ui.setLblNewLabel_10(new JLabel(""+vo.getEmployeeID()));
		ui.setLblNewLabel_7(new JLabel(vo.getEmployeePosition()));
		ui.setLblNewLabel_13(new JLabel(""+vo.getEmployeeAging()));
		ui.setLblNewLabel_8(new JLabel(vo.getBelongToWho()));
		ui.setLblNewLabel_14(new JLabel(""+vo.getTimeOfWorking()));
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