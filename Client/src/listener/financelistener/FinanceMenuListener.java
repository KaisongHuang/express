package listener.financelistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import presentation.financeui.FinanceMenuUI;

public class FinanceMenuListener implements ActionListener{

	CardLayout card;
	FinanceMenuUI finance;
	
	public FinanceMenuListener(FinanceMenuUI finance,CardLayout card){
		this.finance=finance;
		this.card=card;
	}
	public void actionPerformed(ActionEvent e) {
	
		
	}

}
