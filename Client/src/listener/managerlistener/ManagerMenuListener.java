package listener.managerlistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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


	public ManagerMenuListener(ManagerMenuUI managerMenuUI, CardLayout card) {
		// TODO Auto-generated constructor stub
		super();
		this.ui = managerMenuUI;
		this.card=card;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getBtnNewButton_7()) {

		} else if (e.getSource() == ui.getBtnNewButton_8()) {

		} else if (e.getSource() == ui.getBtnNewButton_9()) {

		} else if (e.getSource() == ui.getBtnNewButton_10()) {

		} else if (e.getSource() == ui.getBtnNewButton_16()) {

		}

	}

}
