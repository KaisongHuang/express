package listener.managerlistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

import _enum.Opera;
import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.managerui.ManagerUI1;
import vo.InstitutionVO;

public class ManagerListener10 implements MouseListener, ActionListener {

	private ManagerUI1 ui;
	ManagerBlService manager = new Manager();
	CardLayout card;
	public ManagerListener10 (ManagerUI1 ui, CardLayout card){
		super();
		this.ui=ui;
		this.card=card;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getButton()){
			
		}else if(e.getSource()==ui.getBtnNewButton_15()){
			String id = ui.getTextField().getText();
			InstitutionVO vo = (InstitutionVO) manager.find(id,Opera.Institution_find);
			set(vo);			
		}else if(e.getSource()==ui.getButton_1()){
			ui.getTextField().setText("");;
			delete(ui.getLblNewLabel_4());
			delete(ui.getLblNewLabel_7());
			
		}else if(e.getSource()==ui.getBtnNewButton_11()){
			
		}else if(e.getSource()==ui.getBtnNewButton_12()){
			
		}else if(e.getSource()==ui.getBtnNewButton_13()){
			
		}else if(e.getSource()==ui.getBtnNewButton_14()){
			
		}
		
	}

	private void delete(JLabel jLabel) {
		// TODO Auto-generated method stub
		jLabel.setText("");;
	}

	private void set(InstitutionVO vo) {
		// TODO Auto-generated method stub
		ui.setLblNewLabel_4(new JLabel(vo.getOrganizationID()));
		ui.setLblNewLabel_7(new JLabel(vo.getName()));
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
