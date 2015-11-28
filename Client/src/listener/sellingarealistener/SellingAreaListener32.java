package listener.sellingarealistener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import _enum.Operation;
import _enum.ResultMessage;
import logic.sellingareabl.SellingArea;
import logic.sellingareablservice.SellingareaBlService;
import presentation.sellingareaui.SellingAreaUI32;
import vo.CarVO;

public class SellingAreaListener32 implements ActionListener {

	private SellingAreaUI32 ui;
	SellingareaBlService sellingarea = new SellingArea();
    CardLayout card;
	public SellingAreaListener32(SellingAreaUI32 ui, CardLayout card) {
		super();
		this.card=card;
		this.ui = ui;
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getBtnNewButton_16()) {
			ui.getTextField().setText("");
			delete(ui.getLblNewLabel_3());
			delete(ui.getLblNewLabel_5());
			delete(ui.getLblNewLabel_7());
			delete(ui.getLblNewLabel_9());
			delete(ui.getLblNewLabel_11());
			delete(ui.getLblNewLabel_13());
		} else if (e.getSource() == ui.getBtnNewButton_15()) {
			ResultMessage rm;
			String id = ui.getTextField().getText();
			rm = sellingarea.manageCarinfo(sellingarea.findCar(id), Operation.delete);
		} else if (e.getSource() == ui.getButton_1()) {
			String id = ui.getTextField().getText();
			CarVO vo = sellingarea.findCar(id);
			set(vo);
		} else if (e.getSource() == ui.getBtnNewButton_10()) {

		} else if (e.getSource() == ui.getBtnNewButton_11()) {

		} else if (e.getSource() == ui.getBtnNewButton_13()) {

		} else if (e.getSource() == ui.getBtnNewButton_14()) {

		}
	}

	private void set(CarVO vo) {
		// TODO Auto-generated method stub
		ui.getLblNewLabel_3().setText("" + vo.getNumber());
		ui.getLblNewLabel_5().setText("" + vo.getNumber());
		ui.getLblNewLabel_7().setText(vo.getPurchase());
		ui.getLblNewLabel_9().setText("" + vo.getEngineNumber());
		ui.getLblNewLabel_11().setText("" + vo.getChassisNumber());
		ui.getLblNewLabel_13().setText("" + vo.getServiceTime());
	}

	private void delete(JLabel label) {
		// TODO Auto-generated method stub
		label.setText("");
	}

}
