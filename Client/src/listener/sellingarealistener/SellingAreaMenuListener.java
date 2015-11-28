package listener.sellingarealistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import logic.sellingareabl.SellingArea;
import logic.sellingareablservice.SellingareaBlService;
import presentation.sellingareaui.SellingAreaMenuUI;

public class SellingAreaMenuListener implements ActionListener {

	private SellingAreaMenuUI ui;
	SellingareaBlService sellingarea = new SellingArea();
	CardLayout card;
    JFrame frame;
	public SellingAreaMenuListener(SellingAreaMenuUI sellingAreaMenuUI, CardLayout card, JFrame frame) {
		super();
		this.ui = sellingAreaMenuUI;
		this.card = card;
		this.frame=frame;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getButton()) {

		} else if (e.getSource() == ui.getBtnNewButton_7()) {

		} else if (e.getSource() == ui.getBtnNewButton_8()) {

		} else if (e.getSource() == ui.getBtnNewButton_9()) {

		} else if (e.getSource() == ui.getBtnNewButton_12()) {

		}

	}
}
