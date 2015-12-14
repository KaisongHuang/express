package listener.managerlistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import presentation.managerui.*;

public class ManagerMenuListener implements ActionListener,MouseListener {
	private CardLayout card;
	private ManagerMenuUI ui;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
    private JPanel panel;
    private boolean button1_clicked=true;
	private boolean button2_clicked=false;
	private boolean button3_clicked=false;
	private boolean button4_clicked=false;
	private boolean button5_clicked=false;

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

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
