package listener.managerlistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;

import _enum.Opera;
import _enum.ResultMessage;
import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.managerui.ManagerUI1_2;
import vo.InstitutionVO;

public class ManagerListener1_2 implements MouseListener, ActionListener {

	private ManagerUI1_2 ui;
	ManagerBlService manager = new Manager();
	CardLayout card;
	public ManagerListener1_2 (ManagerUI1_2 ui, CardLayout card){
		super();
		this.ui=ui;
		this.card=card;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getBtnNewButton_11()){
			
		}else if(e.getSource()==ui.getBtnNewButton_12()){
			
		}else if(e.getSource()==ui.getBtnNewButton_13()){
			
		}else if(e.getSource()==ui.getBtnNewButton_14()){
			
		}else if(e.getSource()==ui.getBtnNewButton_15()){
			String id = ui.getTextField().getText();
			InstitutionVO vo = (InstitutionVO) manager.find(id, Opera.Institution_find);
			set(vo);
		}else if(e.getSource()==ui.getBtnNewButton_16()){
			ResultMessage rm;
			InstitutionVO vo = this.read();
			rm = manager.manageMember(vo, Opera.Institution_update);
		}else if(e.getSource()==ui.getBtnNewButton_17()){
			delete(ui.getTextField());
			delete(ui.getTextField_1());
			delete(ui.getTextField_3());
		}else if(e.getSource()==ui.getButton()){
			
		}
		
	}

	private InstitutionVO read() {
		// TODO Auto-generated method stub
		String oi = ui.getTextField_1().getText();
		String name = ui.getTextField_3().getText();
		InstitutionVO vo = new InstitutionVO(oi,name);
		return vo;
	}

	private void set(InstitutionVO vo) {
		// TODO Auto-generated method stub
		ui.getTextField_1().setText(vo.getOrganizationID());
		ui.getTextField_3().setText(vo.getName());
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
