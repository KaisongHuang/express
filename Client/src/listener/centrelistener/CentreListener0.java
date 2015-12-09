package listener.centrelistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;

import _enum.ResultMessage;
import logic.centrebl.Centre;
import logic.centreblservice.CentreBlService;
import presentation.centreui.CentreUI;
import vo.*;

public class CentreListener0 implements MouseListener, ActionListener {

	private CentreUI ui;
	CentreBlService centre = new Centre();

	public CentreListener0(CentreUI ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getBtnNewButton_9()) {
			ResultMessage rm;

			CentreArrivalVO vo = this.read();
			rm = centre.createReceive(vo);
		} else if (e.getSource() == ui.getBtnNewButton_10()) {

			delete(ui.getTextField());
			delete(ui.getTextField_1());
			delete(ui.getTextField_2());
			delete(ui.getTextField_3());
		}

	}

	private void delete(JTextField textField) {
		// TODO Auto-generated method stub
		textField.setText("");

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

	public CentreArrivalVO read() {

		String centreID = ui.getTextField().getText();
		String getData = ui.getTextField_1().getText();
		String transferID = ui.getTextField_2().getText();
		String start = ui.getTextField_3().getText();
		String expressState = (String) ui.getComboBox().getSelectedItem();

		CentreArrivalVO vo = new CentreArrivalVO(centreID, getData, transferID, start, expressState, 0);

		return vo;

	}

}
