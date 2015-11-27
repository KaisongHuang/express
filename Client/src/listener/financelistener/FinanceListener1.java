package listener.financelistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import logic.financebl.Finance;
import presentation.financeui.FinanceUI1;

public class FinanceListener1 implements ActionListener {
	private FinanceUI1 ui;
	Finance finance = new Finance();

	public FinanceListener1(FinanceUI1 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {

	}

}
