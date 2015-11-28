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
	private JFrame frame;
	public CentreMenuListener(CentreMenuUI centreMenuUI, CardLayout card, JFrame frame) {
		super();
		this.ui = centreMenuUI;
		this.card=card;
		this.frame=frame;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getButton1()){
					
		}else if(e.getSource()==ui.getButton2()){
			
		}else if(e.getSource()==ui.getButton3()){
			
		}else if(e.getSource()==ui.getButton4()){
			
		}
		
	}
}
