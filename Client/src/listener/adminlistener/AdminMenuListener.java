package listener.adminlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import presentation.adminui.AdminMenuUI;

public class AdminMenuListener implements ActionListener {
	
	private AdminMenuUI ui;
	
	public AdminMenuListener (AdminMenuUI ui){
		super();
		this.ui=ui;
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
