package listener.adminlistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import presentation.adminui.AdminMenuUI;

public class AdminMenuListener implements ActionListener {
	
	private AdminMenuUI ui;
	private CardLayout card;
    private JFrame frame;
	public AdminMenuListener(AdminMenuUI adminMenuUI, CardLayout card, JFrame frame) {
		super();
		this.ui=adminMenuUI;
		this.card=card;
		this.frame=frame;
		
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==ui.getBtnNewButton_12()){
			;
		}else if(e.getSource()==ui.getBtnNewButton_7()){
			
		}else if(e.getSource()==ui.getBtnNewButton_8()){
			
		}else if(e.getSource()==ui.getBtnNewButton_9()){
			
		}

	}

}
