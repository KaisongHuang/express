package listener.adminlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import _enum.Operation;
import _enum.ResultMessage;
import logic.adminbl.Admin;
import logic.adminblservice.AdminBlService;
import logic.logicfactory.LogicFactory;
import presentation.MySwing.MyButton;
import presentation.adminui.AdminUI2;
import vo.AdminVO;

public class AdminListener2 implements MouseListener, ActionListener {

	private AdminUI2 ui;
	AdminVO vo ;
	AdminBlService admin ;

	public AdminListener2 (AdminUI2 ui){
		super();
		this.ui=ui;
		admin=LogicFactory.getAdminService();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getClear()){
			delete1(ui.getLabel1());
			delete(ui.getTextField());
			delete(ui.getTextField_2());
			ui.getComboBox_1().setSelectedIndex(0);
		}else if(e.getSource()==ui.getSearch()){
			String id = ui.getTextField_2().getText();
			if(!check(id))
				return ;
			vo = admin.find(id);
			if(!checkReturn(vo))
				return;
			setAll(vo);
		}else if(e.getSource()==ui.getConfirm()){
			ResultMessage rm;
			vo = this.update();
			rm=admin.manageCount(vo, Operation.update);
			check(rm);
		}

	}
	private boolean check(String id){
		if(id.length()!=10){
			ui.setErrorText( "请检查编号格式是否正确！");
	   	    return false;
		}else{
			try{
				Integer.parseInt(id);
			}
			catch(NumberFormatException e){
				ui.setErrorText( "编号必须全部由数字组成！");
		   	    return false;
			}
		}
		return true;
	}
	private boolean checkReturn(AdminVO vo){
		if(vo==null){
			ui.setErrorText( "系统中不存在此编号！");
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
			ui.setText(dialog);
			return;
		}else if(rm==ResultMessage.UpdateFail){
			dialog="请不要重复创建单据";
		}
		if(dialog!=null)
			ui.setErrorText(dialog);
	}
	

	private void delete1(JLabel label1) {
		// TODO Auto-generated method stub
		label1.setText("");
	}

	private AdminVO update() {
		// TODO Auto-generated method stub
		String id = ui.getTextField_2().getText();
		String name = ui.getTextField().getText();
		String password = ui.getLabel1().getText();
		String role = (String) ui.getComboBox_1().getSelectedItem();

		AdminVO vo1 = new AdminVO(id,name,password,role);
		return vo1;
	}

	private void setAll(AdminVO vo) {
		// TODO Auto-generated method stub
		ui.setTextField(vo.getName());
		ui.setLabel1(vo.getPassword());

	}

	private void delete(JTextField textField) {
		// TODO Auto-generated method stub
		textField.setText("");
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
