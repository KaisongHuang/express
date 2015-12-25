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
import presentation.MySwing.MyButton;
import presentation.MySwing.MyTextField;
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
       if(e.getSource()==ui.getSearch()){
			String s = ui.getTextField().getText();
			if(!check(s))
				return ;
			EmployeeVO vo = (EmployeeVO) manager.find(s,Opera.Employee_find);
			if(!check(vo))
				return ;
			setLabel(vo);
		}else if(e.getSource()==ui.getConfirm()){
			ResultMessage rm;
			EmployeeVO vo = this.read();
			if(!check(vo))
				return ;
			rm = manager.manageMember(vo,Opera.Employee_update);
			check(rm);
		}else if(e.getSource()==ui.getCancle()){
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
	private boolean check(EmployeeVO vo){
		if(vo==null){
			JOptionPane.showMessageDialog(ui, "员工编号不存在！");
   		    return false;	
		}
		if(vo.checkIsNull()==0){
			JOptionPane.showMessageDialog(ui, "请将信息填写完整！");
   		    return false;	
		}
		if(vo.checkAge()==0){
			JOptionPane.showMessageDialog(ui, "请检查员工年龄格式是否正确！");
   		    return false;
		}
		if(vo.checkBelong()==0){
			JOptionPane.showMessageDialog(ui, "请检查员工附属单位格式是否正确！");
   		    return false;
		}
		if(vo.checkID()==0){
			JOptionPane.showMessageDialog(ui, "请检查员工编号格式是否正确！");
   		    return false;
		}
		if(vo.checkTime()==0){
			JOptionPane.showMessageDialog(ui, "请检查员工工作时间是否合理！");
   		    return false;
		}
		return true;
	}
	private void check(ResultMessage rm){
		String dialog=null;
		if(rm==ResultMessage.FunctionError){
			dialog="网络连接出现了问题，请检查您的网络！";
		}else if(rm==ResultMessage.Fail)
			dialog="数据更新失败！";
		else if(rm==ResultMessage.Success){
			dialog="数据更新成功！";
		}else if(rm==ResultMessage.UpdateFail){
			dialog="请不要重复创建单据";
		}
		if(dialog!=null)
			JOptionPane.showMessageDialog(ui, dialog);
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
		ui.setTextField_1(new MyTextField(vo.getEmployeeName()));
		ui.setTextField_4(new MyTextField(""+vo.getEmployeeID()));
		ui.setTextField_2(new MyTextField(vo.getEmployeePosition()));
		ui.setTextField_3(new MyTextField(vo.getBelongToWho()));
		ui.setTextField_5(new MyTextField(""+vo.getEmployeeAging()));
		ui.setTextField_6(new MyTextField(""+vo.getTimeOfWorking()));
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
		} else if (e.getSource() == ui.getConfirm()) {
			MyButton button=ui.getConfirm();
			button.setEntered(false);
			button.setPressed(true);
			button.repaint();
		}else if(e.getSource()==ui.getCancle()){
			MyButton button=ui.getCancle();
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
		} else if (e.getSource() == ui.getConfirm()) {
			MyButton button=ui.getConfirm();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		}else if(e.getSource()==ui.getCancle()){
			MyButton button=ui.getCancle();
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
		} else if (e.getSource() == ui.getConfirm()) {
			MyButton button=ui.getConfirm();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		}else if(e.getSource()==ui.getCancle()){
			MyButton button=ui.getCancle();
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
		}else if(e.getSource()==ui.getConfirm()){
			MyButton button=ui.getConfirm();
		    button.setEntered(false);
		    button.repaint();
		}else if(e.getSource()==ui.getCancle()){
			MyButton button=ui.getCancle();
		    button.setEntered(false);
		    button.repaint();
		}
	}
	

}
