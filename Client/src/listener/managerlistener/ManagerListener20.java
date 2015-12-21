package listener.managerlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComboBox;

import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.managerui.ManagerUI2;

public class ManagerListener20 implements MouseListener, ActionListener {

	private ManagerUI2 ui;
	ManagerBlService manager = new Manager();
	private int previousIndex = 0;

	public ManagerListener20(ManagerUI2 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getButton1()) {
			if (ui.getComboBox().getSelectedIndex() == 0) {
				previousIndex = 0;
				ui.getCard().show(ui.getPanel(), "0");
			} else if (ui.getComboBox().getSelectedIndex() == 1) {
				previousIndex = 1;
				ui.getCard().show(ui.getPanel(), "1");
			} else if (ui.getComboBox().getSelectedIndex() == 2) {
				previousIndex = 2;
				ui.getCard().show(ui.getPanel(), "2");
			} else if (ui.getComboBox().getSelectedIndex() == 3) {
				previousIndex = 3;
				ui.getCard().show(ui.getPanel(), "3");
			} else if (ui.getComboBox().getSelectedIndex() == 4) {
				previousIndex = 4;
				ui.getCard().show(ui.getPanel(), "4");
			} else if (ui.getComboBox().getSelectedIndex() == 5) {
				previousIndex = 5;
				ui.getCard().show(ui.getPanel(), "5");
			} else if (ui.getComboBox().getSelectedIndex() == 6) {
				previousIndex = 6;
				ui.getCard().show(ui.getPanel(), "6");
			} else if (ui.getComboBox().getSelectedIndex() == 7) {
				previousIndex = 7;
				ui.getCard().show(ui.getPanel(), "7");
			} else if (ui.getComboBox().getSelectedIndex() == 8) {
				previousIndex = 8;
				ui.getCard().show(ui.getPanel(), "8");
			} else if (ui.getComboBox().getSelectedIndex() == 9) {
				previousIndex = 9;
				ui.getCard().show(ui.getPanel(), "9");
			} else if (ui.getComboBox().getSelectedIndex() == 10) {
				previousIndex = 10;
				ui.getCard().show(ui.getPanel(), "10");
			}
		} else if (e.getSource() == ui.getButton2()) {
			ui.getComboBox().setSelectedIndex(previousIndex);
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
