package listener.sellingarealistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import logic.sellingareabl.SellingArea;
import logic.sellingareablservice.SellingareaBlService;
import presentation.sellingareaui.SellingAreaMenuUI;

public class SellingAreaMenuListener implements ActionListener {

	private SellingAreaMenuUI ui;
	SellingareaBlService sellingarea = new SellingArea();
	CardLayout card;
    JPanel panel;
	public SellingAreaMenuListener(SellingAreaMenuUI sellingAreaMenuUI, CardLayout card, JPanel panel1) {
		super();
		this.ui = sellingAreaMenuUI;
		this.card = card;
		this.panel=panel1;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getButton()) {
              card.show(panel, "7");
		} else if (e.getSource() == ui.getBtnNewButton_7()) {
			card.show(panel, "0");
		} else if (e.getSource() == ui.getBtnNewButton_8()) {
			card.show(panel, "1");
		} else if (e.getSource() == ui.getBtnNewButton_9()) {
			card.show(panel, "2");
		} else if (e.getSource() == ui.getBtnNewButton_12()) {
			card.show(panel, "3");
		}

	}
}
