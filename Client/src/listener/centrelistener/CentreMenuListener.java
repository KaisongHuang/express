package listener.centrelistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import presentation.centreui.CentreMenuUI;
import presentation.centreui.*;

public class CentreMenuListener implements ActionListener {
	private CardLayout card;
	private CentreMenuUI ui;
	private JPanel panel;
	public CentreMenuListener(CentreMenuUI centreMenuUI, CardLayout card, JPanel panel1) {
		super();
		this.ui = centreMenuUI;
		this.card=card;
		this.panel=panel1;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getButton1()){
				card.show(panel, "0");	
		}else if(e.getSource()==ui.getButton2()){
			card.show(panel, "1");
		}else if(e.getSource()==ui.getButton3()){
			card.show(panel, "2");
		}else if(e.getSource()==ui.getButton4()){
			card.show(panel, "3");
		}
		
	}
}
