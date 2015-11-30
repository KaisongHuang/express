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
    private JFrame frame;

	public ManagerMenuListener(ManagerMenuUI managerMenuUI, CardLayout card, JFrame frame) {
		// TODO Auto-generated constructor stub
		super();
		this.ui = managerMenuUI;
		this.card=card;
		this.frame=frame;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getButton1()) {

		} else if (e.getSource() == ui.getButton2()) {

		} else if (e.getSource() == ui.getButton3()) {

		} else if (e.getSource() == ui.getButton4()) {

		} else if (e.getSource() == ui.getButton5()) {

		}

	}

}
