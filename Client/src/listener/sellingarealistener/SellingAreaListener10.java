package listener.sellingarealistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import _enum.ResultMessage;
import logic.centrebl.Centre;
import logic.centreblservice.CentreBlService;
import logic.sellingareabl.SellingArea;
import logic.sellingareablservice.SellingareaBlService;
import presentation.sellingareaui.SellingAreaUI1;
import vo.AcceptVO;
import vo.DeliverVO;

public class SellingAreaListener10 implements MouseListener, ActionListener {

	private SellingAreaUI1 ui;
	SellingareaBlService sellingarea = new SellingArea();
	CentreBlService centre = new Centre();
	
	public SellingAreaListener10 (SellingAreaUI1 ui){
		super();
		this.ui=ui;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getBtnNewButton_11()){
			delete(ui.getTextField());
			delete(ui.getTextField_1());
			delete(ui.getTextField_2());
			delete(ui.getTextField_3());
			delete(ui.getTextField_4());
			delete(ui.getTextField_5());
			ui.getComboBox().setSelectedIndex(0);
		}else if(e.getSource()==ui.getBtnNewButton_10()){
			ResultMessage rm1,rm2;
			AcceptVO vo1 = this.read1();
			if(!check(vo1))
				return;
			DeliverVO vo2 = this.read2();
			if(!check(vo2))
				return ;
			rm1=sellingarea.createReceiving(vo1);
			check(rm1);
			
			rm2=sellingarea.createDelivery(vo2);
			check(rm2);
		}
		
	}

	private  boolean check(AcceptVO vo){
		if(vo.checkIsNull()==0){
			JOptionPane.showMessageDialog(ui, "请将信息填写完整！");
			return false;
		}
		if(vo.checkData()==0){
			JOptionPane.showMessageDialog(ui, "请检查日期格式是否正确！");
			return false;
		}
		if(vo.checkNumber()==0){
			JOptionPane.showMessageDialog(ui, "请检查中转单格式是否正确！");
			return false;
		}
		if(vo.checkBarCode()==0){
			JOptionPane.showMessageDialog(ui, "请检查订单编号格式是否正确！");
			return false;
		}
		return true;
	}
	private boolean check(DeliverVO vo){
		if(vo.checkIsNull()==0){
			JOptionPane.showMessageDialog(ui, "请将信息填写完整！！");
			return false;
		}
		if(vo.checkCode()==0){
			JOptionPane.showMessageDialog(ui, "请检查订单编号格式是否正确！");
			return false;
		}
		if(vo.checkDate()==0){
			JOptionPane.showMessageDialog(ui, "请检查日期格式是否正确！");
			return false;
		}
		if(vo.checkNumber()==0){
			JOptionPane.showMessageDialog(ui, "请检查中转单格式是否正确！");
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
	private DeliverVO read2() {
		// TODO Auto-generated method stub
		String BarCode = ui.getTextField_3().getText();
		String date = ui.getTextField_5().getText();
		String number = ui.getTextField_4().getText();
		
		DeliverVO vo = new DeliverVO(BarCode,date,number,0);
		
		return vo;
	}

	private AcceptVO read1() {
		// TODO Auto-generated method stub
		String BarCode = ui.getTextField().getText();
		String date = ui.getTextField_1().getText();
		String start = ui.getTextField_2().getText();
		String state = (String) ui.getComboBox().getSelectedItem();
		
		AcceptVO vo = new AcceptVO(BarCode,date,BarCode,start,
				state,0);
		
		return vo;
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
		if (e.getSource() == ui.getBtnNewButton_10()) {
			ui.getBtnNewButton_10().setEntered(false);
			ui.getBtnNewButton_10().setPressed(true);
			ui.getBtnNewButton_10().repaint();
		} else if (e.getSource() == ui.getBtnNewButton_11()) {
			ui.getBtnNewButton_11().setEntered(false);
			ui.getBtnNewButton_11().setPressed(true);
			ui.getBtnNewButton_11().repaint();
		}
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getBtnNewButton_10()) {
			ui.getBtnNewButton_10().setEntered(true);
			ui.getBtnNewButton_10().setPressed(false);
			ui.getBtnNewButton_10().repaint();
		} else if (e.getSource() == ui.getBtnNewButton_11()) {
			ui.getBtnNewButton_11().setEntered(true);
			ui.getBtnNewButton_11().setPressed(false);
			ui.getBtnNewButton_11().repaint();
		}
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getBtnNewButton_10()) {
			ui.getBtnNewButton_10().setEntered(true);
			ui.getBtnNewButton_10().repaint();
		} else if (e.getSource() == ui.getBtnNewButton_11()) {
			ui.getBtnNewButton_11().setEntered(true);
			ui.getBtnNewButton_11().repaint();
		}
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		ui.getBtnNewButton_10().setEntered(false);
		ui.getBtnNewButton_10().repaint();
		ui.getBtnNewButton_11().setEntered(false);
		ui.getBtnNewButton_11().repaint();
	}
}
