package listener.centrelistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import _enum.ResultMessage;
import logic.centrebl.Centre;
import logic.centreblservice.CentreBlService;
import presentation.MySwing.MyButton;
import presentation.centreui.CentreUI;
import vo.*;

public class CentreListener0 implements MouseListener, ActionListener {

	private CentreUI ui;
	CentreBlService centre = new Centre();

	public CentreListener0(CentreUI ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getConfirm()) {
			ResultMessage rm;

			CentreArrivalVO vo = this.read();
			if(!check(vo))
				return ;
			rm = centre.createReceive(vo);
			check(rm);
		} else if (e.getSource() == ui.getCancle()) {

			delete(ui.getTextField());
			delete(ui.getTextField_1());
			delete(ui.getTextField_2());
			delete(ui.getTextField_3());
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
	private boolean check(CentreArrivalVO vo){
		if(vo.checkIsNull()==0){
			JOptionPane.showMessageDialog(ui,"请将信息填写完整！");
			return false;
		}
		if(vo.checkID()==0){
			JOptionPane.showMessageDialog(ui,"请检查中转中心编号格式是否正确。");
			return false;
		}
		if(vo.checkDate()==0){
			JOptionPane.showMessageDialog(ui,"请检查日期格式是否正确！");
			return false;
		}
		if(vo.checkTransfer()==0){
			JOptionPane.showMessageDialog(ui,"请检查中转单编号格式是否正确！");
			return false;
		}	
		return true;
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

	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public CentreArrivalVO read() {

		String centreID = ui.getTextField().getText();
		String getData = ui.getTextField_1().getText();
		String transferID = ui.getTextField_2().getText();
		String start = ui.getTextField_3().getText();
		String expressState = (String) ui.getComboBox().getSelectedItem();

		CentreArrivalVO vo = new CentreArrivalVO(centreID, getData, transferID, start, expressState, 0);

		return vo;

	}

}
