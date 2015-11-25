package listener.sellingarealistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
			DeliverVO vo2 = this.read2();
			rm1=sellingarea.createReceiving(vo1);
			rm2=sellingarea.createDelivery(vo2);
		}
		
	}

	private DeliverVO read2() {
		// TODO Auto-generated method stub
		int BarCode = Integer.parseInt(ui.getTextField_3().getText());
		String date = ui.getTextField_5().getText();
		int number = Integer.parseInt(ui.getTextField_4().getText());
		
		DeliverVO vo = new DeliverVO(BarCode,date,number,0);
		
		return vo;
	}

	private AcceptVO read1() {
		// TODO Auto-generated method stub
		int BarCode = Integer.parseInt(ui.getTextField().getText());
		String date = ui.getTextField_1().getText();
		String start = ui.getTextField_2().getText();
		String state = (String) ui.getComboBox().getSelectedItem();
		
		AcceptVO vo = new AcceptVO(BarCode,date,BarCode,Integer.parseInt(start),
				Integer.parseInt(state),0);
		
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
