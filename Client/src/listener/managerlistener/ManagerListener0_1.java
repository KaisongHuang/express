package listener.managerlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import _enum.Opera;
import logic.logicfactory.LogicFactory;
import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.MySwing.MyButton;
import presentation.managerui.ManagerUI0_1;
import vo.DriverVO;
import vo.EmployeeVO;

public class ManagerListener0_1 implements MouseListener, ActionListener {

	private ManagerUI0_1 ui;
	ManagerBlService manager;
	public ManagerListener0_1 (ManagerUI0_1 ui){
		super();
		this.ui=ui;
		manager=LogicFactory.getManagerService();
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getSearch()){
			String s = ui.getTextField().getText();
System.out.println(s);			
			if(!check(s))
				return ;
			EmployeeVO vo = (EmployeeVO) manager.find(s,Opera.Employee_find);
			if(!check(vo))
				return ;
			setLabel(vo);
		}

	}
	private boolean check(EmployeeVO vo){
//System.out.println("检查id");
		if(vo==null){
			ui.setErrorText("员工编号不存在！");
   		    return false;
		}
		return true;
	}
	private boolean check(String id){

	   	 if(id.length()!=10){
	   		ui.setErrorText("请确认员工编号格式是否正确！");
	   		   		
	   		 return false;
	   	 }
	   	 try{
	   		 Integer.parseInt(id);
	   	 }catch(NumberFormatException e){
	   		ui.setErrorText("请确认员工编号格式是否正确！");
	   		 return false;
	   	 }
	   	 return true;
	   }
	private void setLabel(EmployeeVO vo) {
		// TODO Auto-generated method stub
		ui.getLblNewLabel_4().setText(vo.getEmployeeName());
		ui.getLblNewLabel_10().setText(""+vo.getEmployeeID());
		ui.getLblNewLabel_7().setText(vo.getEmployeePosition());
		ui.getLblNewLabel_13().setText(""+vo.getEmployeeAging());
		ui.getLblNewLabel_8().setText(vo.getBelongToWho());
		ui.getLblNewLabel_14().setText(""+vo.getTimeOfWorking());
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
