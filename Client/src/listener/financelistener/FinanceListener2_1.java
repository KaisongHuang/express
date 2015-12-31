package listener.financelistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.financebl.Finance;
import presentation.financeui.FinanceUI2_1;

public class FinanceListener2_1 implements ActionListener{
	private FinanceUI2_1 ui;
	Finance finance = new Finance();
	
	public FinanceListener2_1(FinanceUI2_1 ui){
		this.ui=ui;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getButton()){
			
		}
	}

}
