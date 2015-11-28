package listener.adminlistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import presentation.adminui.AdminMenuUI;

public class AdminMenuListener implements ActionListener {
	
	private AdminMenuUI ui;
	private CardLayout card;

	public AdminMenuListener(AdminMenuUI adminMenuUI, CardLayout card) {
		super();
		this.ui=adminMenuUI;
		this.card=card;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getBtnNewButton_12()){
			
		}else if(e.getSource()==ui.getBtnNewButton_7()){
			
		}else if(e.getSource()==ui.getBtnNewButton_8()){
			
		}else if(e.getSource()==ui.getBtnNewButton_9()){
			
		}

	}

}
