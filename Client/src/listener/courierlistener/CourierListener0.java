package listener.courierlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;

import _enum.ResultMessage;
import logic.courierbl.Courier;
import logic.courierblservice.CourierBlService;
import po.DistanceAndFee;
import presentation.courierui.CourierUI;
import vo.SenderVO;

public class CourierListener0 implements MouseListener, ActionListener {
	
	private CourierUI ui;
	CourierBlService courier = new Courier();
	private DistanceAndFee daf;
	
	public CourierListener0 (CourierUI ui){
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
			delete(ui.getTextField_6());
			delete(ui.getTextField_7());
			delete(ui.getTextField_8());
			delete(ui.getTextField_9());
			delete(ui.getTextField_10());
			delete(ui.getTextField_11());
			delete(ui.getTextField_12());
			delete(ui.getTextField_13());
			delete(ui.getTextField_14());
			ui.getComboBox().setSelectedIndex(1);
			ui.getComboBox_1().setSelectedIndex(1);
		}else if(e.getSource()==ui.getBtnNewButton_10()){
			ResultMessage rm;
			SenderVO vo = this.read();
			rm = courier.OrderInput(vo, daf);
			//跳转至CourierUI1
		}
	}

	private SenderVO read() {
		// TODO Auto-generated method stub
		String SenderName=ui.getTextField().getText();
		String SenderAddress=ui.getTextField_1().getText();
		String SenderCompany=ui.getTextField_2().getText();
		String SenderCall=ui.getTextField_3().getText();
		String SenderPhone=ui.getTextField_4().getText();
		String RecipientName=ui.getTextField_5().getText();
		String RecipientAddress=ui.getTextField_6().getText();
		String RecipientCompany=ui.getTextField_7().getText();
		String RecipientCall=ui.getTextField_8().getText();
		String RecipientPhone=ui.getTextField_9().getText();
		String pcs=ui.getTextField_10().getText();
		String weight=ui.getTextField_11().getText();
		String volume=ui.getTextField_12().getText();
		String commodity=ui.getTextField_13().getText();
		String size=ui.getTextField_14().getText();
		String bagging=(String) ui.getComboBox().getSelectedItem();
		String BarCode="";
		String type=(String) ui.getComboBox_1().getSelectedItem();
		
		SenderVO vo = new SenderVO(SenderName,SenderAddress,SenderCompany,SenderCall,SenderPhone,
				RecipientName,RecipientAddress,RecipientCompany,RecipientCall,RecipientPhone,
				Integer.parseInt(pcs),Integer.parseInt(weight),Integer.parseInt(volume),
				commodity,size,bagging,BarCode,type);
		
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
