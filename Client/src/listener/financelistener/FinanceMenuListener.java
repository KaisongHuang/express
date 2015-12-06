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
	    if(e.getSource()==finance.getButton1()){
	    	card.show(panel, "0");
	    }else if(e.getSource()==finance.getButton1()){
	    	card.show(panel, "1");
	    }else if(e.getSource()==finance.getButton1()){
	    	card.show(panel, "2");
	    }else if(e.getSource()==finance.getButton1()){
	    	card.show(panel, "3");
	    }
		
	}

}
