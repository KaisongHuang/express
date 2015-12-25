package listener.managerlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import _enum.Opera;
import _enum.ResultMessage;
import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.MySwing.MyButton;
import presentation.managerui.ManagerUI0_3;
import vo.EmployeeVO;

public class ManagerListener0_3 implements MouseListener, ActionListener {
	
	private ManagerUI0_3 ui;
	ManagerBlService manager = new Manager();
	public ManagerListener0_3 (ManagerUI0_3 ui){
		super();
		this.ui = ui;
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
		}else if(e.getSource()==ui.getDelete()){
			ResultMessage rm;
			EmployeeVO vo = this.read();
			if(!check(vo))
				return ;
			rm = manager.manageMember(vo,Opera.Employee_delete);
			check(rm);
		}else if(e.getSource()==ui.getCancle()){
			delete1(ui.getTextField());
			delete2(ui.getLblNewLabel_3());
			delete2(ui.getLblNewLabel_5());
			delete2(ui.getLblNewLabel_7());
			delete2(ui.getLblNewLabel_9());
			delete2(ui.getLblNewLabel_11());
			delete2(ui.getLblNewLabel_13());
		}
		
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
		if (e.getSource() == ui.getSearch()) {
			MyButton button=ui.getSearch();
			button.setEntered(false);
			button.setPressed(true);
			button.repaint();
		} else if (e.getSource() == ui.getDelete()) {
			MyButton button=ui.getDelete();
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
		} else if (e.getSource() == ui.getDelete()) {
			MyButton button=ui.getDelete();
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
		} else if (e.getSource() == ui.getDelete()) {
			MyButton button=ui.getDelete();
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
		}else if(e.getSource()==ui.getDelete()){
			MyButton button=ui.getDelete();
		    button.setEntered(false);
		    button.repaint();
		}else if(e.getSource()==ui.getCancle()){
			MyButton button=ui.getCancle();
		    button.setEntered(false);
		    button.repaint();
		}
	}

}
