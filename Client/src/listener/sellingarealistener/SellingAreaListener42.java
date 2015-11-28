package listener.sellingarealistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

import _enum.Operation;
import _enum.ResultMessage;
import logic.sellingareabl.SellingArea;
import logic.sellingareablservice.SellingareaBlService;
import presentation.sellingareaui.SellingAreaUI42;
import vo.DriverVO;

public class SellingAreaListener42 implements MouseListener, ActionListener {

	private SellingAreaUI42 ui;
	SellingareaBlService sellingarea = new SellingArea();
	CardLayout card;
	public SellingAreaListener42 (SellingAreaUI42 ui, CardLayout card){
		super();
		this.card=card;
		this.ui=ui;
	}

	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getBtnNewButton_17()){
			ui.getTextField().setText("");
			delete(ui.getLblNewLabel_11());
			delete(ui.getLblNewLabel_13());
			delete(ui.getLblNewLabel_15());
			delete(ui.getLblNewLabel_17());
			delete(ui.getLblNewLabel_3());
			delete(ui.getLblNewLabel_7());
			delete(ui.getLblNewLabel_8());
			delete(ui.getLblNewLabel_9());
		}else if(e.getSource()==ui.getBtnNewButton_16()){
			ResultMessage rm;
			String id = ui.getTextField().getText();
			rm = sellingarea.manageDriverinfo(sellingarea.findDriver(id), Operation.delete);
		}else if(e.getSource()==ui.getBtnNewButton_15()){
			String id = ui.getTextField().getText();
			DriverVO vo = sellingarea.findDriver(id);
			set(vo);
		}else if(e.getSource()==ui.getBtnNewButton_10()){
			
		}else if(e.getSource()==ui.getBtnNewButton_11()){
			
		}else if(e.getSource()==ui.getBtnNewButton_13()){
			
		}else if(e.getSource()==ui.getBtnNewButton_14()){
			
		}
	}
	
	private void set(DriverVO vo) {
		// TODO Auto-generated method stub
		ui.getLblNewLabel_11().setText(vo.getName());
		ui.getLblNewLabel_13().setText(""+vo.getID());
		ui.getLblNewLabel_15().setText(vo.getPhone());
		ui.getLblNewLabel_17().setText(vo.getLicenceTime());
		ui.getLblNewLabel_3().setText(""+vo.getNumber());
		ui.getLblNewLabel_7().setText(vo.getBirthday());
		ui.getLblNewLabel_8().setText(vo.getSex());
		ui.getLblNewLabel_9().setText(vo.getCarCompany());
	}

	private void delete(JLabel label) {
		// TODO Auto-generated method stub
		label.setText("");
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
