package listener.sellingarealistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;

import _enum.Operation;
import _enum.ResultMessage;
import logic.sellingareabl.SellingArea;
import logic.sellingareablservice.SellingareaBlService;
import presentation.sellingareaui.SellingAreaUI43;
import vo.DriverVO;

public class SellingAreaListener43 implements MouseListener, ActionListener {

	private SellingAreaUI43 ui;
	SellingareaBlService sellingarea = new SellingArea();
	CardLayout card;
	public SellingAreaListener43 (SellingAreaUI43 ui, CardLayout card){
		super();
		this.card=card;
		this.ui=ui;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getBtnNewButton_17()){
			delete(ui.getTextField_1());
			delete(ui.getTextField_2());
			delete(ui.getTextField_3());
			delete(ui.getTextField_4());
			delete(ui.getTextField_5());
			delete(ui.getTextField_6());
			delete(ui.getTextField_7());
			delete(ui.getTextField_8());
		}else if(e.getSource()==ui.getBtnNewButton_16()){
			ResultMessage rm;
			DriverVO vo = this.read();
			rm = sellingarea.manageDriverinfo(vo, Operation.insert);
		}else if(e.getSource()==ui.getBtnNewButton_10()){
			
		}else if(e.getSource()==ui.getBtnNewButton_11()){
			
		}else if(e.getSource()==ui.getBtnNewButton_13()){
			
		}else if(e.getSource()==ui.getBtnNewButton_14()){
			
		}
	}
	
	private void delete(JTextField textField) {
		// TODO Auto-generated method stub
		textField.setText("");
	}
	
	private DriverVO read() {
		// TODO Auto-generated method stub
		String number = ui.getTextField_1().getText();
		String name = ui.getTextField_5().getText();
		String birthday = ui.getTextField_2().getText();
		String ID = ui.getTextField_6().getText();
		String phone = ui.getTextField_7().getText();
		String CarCompany = ui.getTextField_4().getText();
		String sex = ui.getTextField_3().getText();
		String LicenceTime = ui.getTextField_8().getText();
		
		DriverVO vo = new DriverVO(number,name,birthday,ID,
				phone,CarCompany,sex,LicenceTime);
		
		return vo;
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
