package listener.managerlistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import presentation.managerui.*;

public class ManagerMenuListener implements ActionListener {
	private CardLayout card;
	private ManagerMenuUI ui;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JPanel panel5;
    private JPanel panel;

	public ManagerMenuListener(ManagerMenuUI managerMenuUI, CardLayout card, JPanel panel12) {
		// TODO Auto-generated constructor stub
		super();
		this.ui = managerMenuUI;
		this.card=card;
		this.panel=panel12;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getButton1()) {
              card.show(panel, "4");
		} else if (e.getSource() == ui.getButton2()) {
			card.show(panel, "0");
		} else if (e.getSource() == ui.getButton3()) {
			card.show(panel, "9");
		} else if (e.getSource() == ui.getButton4()) {
			card.show(panel, "10");
		} else if (e.getSource() == ui.getButton5()) {
			card.show(panel, "11");
		}

	}

}
