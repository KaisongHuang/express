package listener.adminlistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import presentation.adminui.AdminMenuUI;

public class AdminMenuListener implements ActionListener, MouseListener {

	private AdminMenuUI ui;
	private CardLayout card;
	private JPanel panel;
	private boolean button1_clicked=false;
	private boolean button2_clicked=false;
	private boolean button3_clicked=true;
	private boolean button4_clicked=false;

	public AdminMenuListener(AdminMenuUI adminMenuUI, CardLayout card, JPanel panel1) {
		super();
		this.ui = adminMenuUI;
		this.card = card;
		this.panel = panel1;

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == ui.getButton1()) {
			// 修改账户
			card.show(panel, "3");
		} else if (e.getSource() == ui.getButton2()) {
			card.show(panel, "2");
		} else if (e.getSource() == ui.getButton3()) {
			card.show(panel, "0");
		} else if (e.getSource() == ui.getButton4()) {
			card.show(panel, "1");
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
