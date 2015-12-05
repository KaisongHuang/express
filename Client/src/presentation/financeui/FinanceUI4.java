package presentation.financeui;

import java.awt.CardLayout;

import javax.swing.JPanel;

import listener.financelistener.FinanceListener4;

public class FinanceUI4 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CardLayout card;
	private FinanceUI4_3 ui3;
	private FinanceUI4_1 ui1;
	private FinanceUI4_2 ui2;
	private FinanceListener4 financeListener4;

	/**
	 * Create the application.
	 * 
	 * @param width
	 * @param width
	 */
	public FinanceUI4() {
		financeListener4 = new FinanceListener4(this);

		initialize();
	}

	private void initialize() {
		this.setBounds(136, 115, 746, 438);

		ui1 = new FinanceUI4_1(financeListener4);
		ui2 = new FinanceUI4_2(financeListener4);
		ui3 = new FinanceUI4_3(financeListener4);

		card = new CardLayout(0, 0);
		this.setLayout(card);
		this.add(ui3, "0");
		this.add(ui1, "1");
		this.add(ui2, "2");
		card.show(this, "0");

	}

	public FinanceListener4 getFinanceListener4() {
		return financeListener4;
	}

	public CardLayout getCard() {
		return card;
	}

	public FinanceUI4_3 getUi3() {
		return ui3;
	}

	public FinanceUI4_1 getUi1() {
		return ui1;
	}

	public FinanceUI4_2 getUi2() {
		return ui2;
	}
}
