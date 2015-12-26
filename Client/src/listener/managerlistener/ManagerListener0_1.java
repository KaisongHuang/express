package listener.managerlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import _enum.Opera;
import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.MySwing.MyButton;
import presentation.managerui.ManagerUI0_1;
import vo.DriverVO;
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
		if(e.getSource()==ui.getSearch()){
			String s = ui.getTextField().getText();
			if(!check(s))
				return ;
			EmployeeVO vo = (EmployeeVO) manager.find(s,Opera.Employee_find);
			if(!check(vo))
				return ;
			setLabel(vo);
		}
		
	}
	private boolean check(EmployeeVO vo){
		if(vo==null){
			JOptionPane.showMessageDialog(ui, "员工编号不存在！");
   		    return false;	
		}
		return true;
	}
	private boolean check(String id){
	   	 if(id.length()!=10){
	   		 JOptionPane.showMessageDialog(ui, "请确认员工编号格式是否正确！");
	   		 return false;
	   	 }
	   	 try{
	   		 Integer.parseInt(id);
	   	 }catch(NumberFormatException e){
	   		 JOptionPane.showMessageDialog(ui, "请确认员工编号格式是否正确！");
	   		 return false;
	   	 }
	   	 return true;
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
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
			}

}
