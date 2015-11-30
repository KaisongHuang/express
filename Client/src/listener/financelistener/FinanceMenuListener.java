package listener.financelistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import presentation.financeui.FinanceMenuUI;

public class FinanceMenuListener implements ActionListener{

	CardLayout card;
	FinanceMenuUI finance;
	private JFrame frame;
	public FinanceMenuListener(FinanceMenuUI finance,CardLayout card, JFrame frame){
		this.finance=finance;
		this.card=card;
		this.frame=frame;
	}
	public void actionPerformed(ActionEvent e) {
	
		
	}

}
