package listener.courierlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;

import _enum.ResultMessage;
import logic.courierbl.Courier;
import logic.courierblservice.CourierBlService;
import presentation.courierui.CourierUI2;
import vo.CourierVO;

public class CourierListener2 implements MouseListener, ActionListener {

	private CourierUI2 ui;
	CourierBlService courier = new Courier();
	
	public CourierListener2 (CourierUI2 ui){
		super();
		this.ui=ui;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getBtnNewButton_11()){
			delete(ui.getTextField());
			delete(ui.getTextField_1());
			delete(ui.getTextField_2());
		}else if(e.getSource()==ui.getBtnNewButton_10()){
			ResultMessage rm;
			CourierVO vo = this.read();
			rm = courier.ConsigneeinfoInput(vo);
		}
	}

	private CourierVO read() {
		// TODO Auto-generated method stub
		String number = ui.getTextField().getText();
		String name = ui.getTextField_1().getText();
		String date = ui.getTextField_2().getText();
		
		CourierVO vo = new CourierVO(number,name,date);
		
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
