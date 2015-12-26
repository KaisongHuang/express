package listener.managerlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextArea;

import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.managerui.ManagerUI1_5;

public class ManagerListener1_5 implements MouseListener, ActionListener {

	private ManagerUI1_5 ui;
	ManagerBlService manager = new Manager();

	public ManagerListener1_5(ManagerUI1_5 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getBtnNewButton_15()) {

		} else if (e.getSource() == ui.getBtnNewButton_16()) {
			delete(ui.getTextArea());
		}

	}

	private void delete(JTextArea textArea) {
		// TODO Auto-generated method stub
		textArea.setText("");
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getBtnNewButton_15()) {
			ui.getBtnNewButton_15().setEntered(false);
			ui.getBtnNewButton_15().setPressed(true);
			ui.getBtnNewButton_15().repaint();
		} else if (e.getSource() == ui.getBtnNewButton_16()) {
			ui.getBtnNewButton_16().setEntered(false);
			ui.getBtnNewButton_16().setPressed(true);
			ui.getBtnNewButton_16().repaint();
		}
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getBtnNewButton_15()) {
			ui.getBtnNewButton_15().setEntered(true);
			ui.getBtnNewButton_15().setPressed(false);
			ui.getBtnNewButton_15().repaint();
		} else if (e.getSource() == ui.getBtnNewButton_16()) {
			ui.getBtnNewButton_16().setEntered(true);
			ui.getBtnNewButton_16().setPressed(false);
			ui.getBtnNewButton_16().repaint();
		}
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getBtnNewButton_15()) {
			ui.getBtnNewButton_15().setEntered(true);
			ui.getBtnNewButton_15().repaint();
		} else if (e.getSource() == ui.getBtnNewButton_16()) {
			ui.getBtnNewButton_16().setEntered(true);
			ui.getBtnNewButton_16().repaint();
		}
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		ui.getBtnNewButton_15().setEntered(false);
		ui.getBtnNewButton_15().repaint();
		ui.getBtnNewButton_16().setEntered(false);
		ui.getBtnNewButton_16().repaint();
	}

}
