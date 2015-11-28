package listener.financelistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.financebl.Finance;
import logic.financeblservice.FinanceBlService;
import presentation.financeui.FinanceUI2;

public class FinanceListener2 implements ActionListener {
	private FinanceUI2 ui;
	FinanceBlService financeBl = new Finance();

	public FinanceListener2(FinanceUI2 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// add
		if (e.getSource() == ui.getButton()) {
			
		}
		// clear
		else if (e.getSource() == ui.getButton_1()) {

		}
		
		// excel
		// else if(e.getSource()==ui.getButton_2()){}
		
		// delete
		else if (e.getSource() == ui.getBtnNewButton()) {

		}
		// done
		else if (e.getSource() == ui.getButton_3()) {

		}
	}

}
