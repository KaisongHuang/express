package listener.adminlistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import presentation.adminui.AdminMenuUI;

public class AdminMenuListener implements ActionListener {
	
	private AdminMenuUI ui;
	private CardLayout card;
    private JPanel panel;
	public AdminMenuListener(AdminMenuUI adminMenuUI, CardLayout card, JPanel panel1) {
		super();
		this.ui=adminMenuUI;
		this.card=card;
		this.panel=panel1;
		
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
