package listener.centrelistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import presentation.centreui.CentreMenuUI;
import presentation.centreui.*;

public class CentreMenuListener implements ActionListener {
	private CardLayout card;
	private CentreMenuUI ui;
	
	public CentreMenuListener(CentreMenuUI centreMenuUI, CardLayout card) {
		super();
		this.ui = centreMenuUI;
		this.card=card;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getBtnNewButton_8()){
					
		}else if(e.getSource()==ui.getBtnNewButton_7()){
			
		}
		
	}
}
