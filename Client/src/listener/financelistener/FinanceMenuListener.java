package listener.financelistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import presentation.financeui.FinanceMenuUI;

public class FinanceMenuListener implements ActionListener{

	CardLayout card;
	FinanceMenuUI finance;
	private JPanel panel;
	public FinanceMenuListener(FinanceMenuUI finance,CardLayout card, JPanel panel1){
		this.finance=finance;
		this.card=card;
		this.panel=panel1;
	}
	public void actionPerformed(ActionEvent e) {
	
		
	}

}
