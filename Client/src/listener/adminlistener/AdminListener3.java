package listener.adminlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import _enum.Operation;
import _enum.ResultMessage;
import logic.adminbl.Admin;
import logic.adminblservice.AdminBlService;
import presentation.MySwing.MyButton;
import presentation.adminui.AdminUI3;
import vo.AdminVO;

public class AdminListener3 implements MouseListener, ActionListener {

	public AdminUI3 ui;
	AdminVO vo;
	AdminBlService admin = new Admin();

	public AdminListener3(AdminUI3 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getCancle()) {
			delete(ui.getTextField());
			delete(ui.getTextField_1());
			delete(ui.getTextField_2());
		} else if (e.getSource() == ui.getConfirm()) {
			ResultMessage rm;
			String id = ui.getTextField_2().getText();
			if(!check(id))
				return ;
			vo = admin.find(id);
			if(!checkReturn(vo))
				return;
			vo.setPassword(ui.getTextField().getText());
			rm = admin.manageCount(vo, Operation.update);
			check(rm);
		}
	}

	private boolean checkReturn(AdminVO vo){
		if(vo==null){
			JOptionPane.showMessageDialog(ui,"系统中不存在此编号！");
	   	    return false;
		}
		return true;
	}
	private boolean check(String id){
		if(id.length()!=10){
			JOptionPane.showMessageDialog(ui,"请确保编号长度为10！");
   		   return false;
		}
   	 try{
   		 Integer.parseInt(id);
   	 }catch(NumberFormatException e){
   		JOptionPane.showMessageDialog(ui,"请确保编号只包含数字！");
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
