package listener.managerlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import _enum.Opera;
import _enum.ResultMessage;
import logic.logicfactory.LogicFactory;
import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.MySwing.MyButton;
import presentation.managerui.ManagerUI0_4;
import vo.EmployeeVO;

public class ManagerListener0_4 implements MouseListener, ActionListener {

	private ManagerUI0_4 ui;
	ManagerBlService manager  ;

	public ManagerListener0_4(ManagerUI0_4 ui) {
		super();
		this.ui = ui;
		manager=LogicFactory.getManagerService();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getAdd()) {
			ResultMessage rm;
			EmployeeVO vo = this.read();
			if(!check(vo))
				return ;
			rm = manager.manageMember(vo, Opera.Employee_insert);
			check(rm);
		} else if (e.getSource() == ui.getClear()) {
			delete(ui.getTextField());
			delete(ui.getTextField_2());
			delete(ui.getTextField_3());
			delete(ui.getTextField_4());
			delete(ui.getTextField_5());
			delete(ui.getTextField_1());
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
			ui.setText(dialog);
	}
	private boolean check(EmployeeVO vo){
		if(vo.checkIsNull()==0){
			ui.setText( "请将信息填写完整！");
   		    return false;	
		}
		if(vo.checkAge()==0){
			ui.setText("请检查员工年龄格式是否正确！");
   		    return false;
		}
		if(vo.checkBelong()==0){
			ui.setText("请检查员工附属单位格式是否正确！");
   		    return false;
		}
		if(vo.checkID()==0){
			ui.setText("请检查员工编号格式是否正确！");
   		    return false;
		}
		if(vo.checkTime()==0){
			ui.setText("请检查员工工作时间是否合理！");
   		    return false;
		}
		return true;
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
