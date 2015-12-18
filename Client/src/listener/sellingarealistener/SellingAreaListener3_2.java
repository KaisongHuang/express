package listener.sellingarealistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import _enum.Operation;
import _enum.ResultMessage;
import logic.sellingareabl.SellingArea;
import logic.sellingareablservice.SellingareaBlService;
import presentation.sellingareaui.SellingAreaUI3_2;
import vo.CarVO;

public class SellingAreaListener3_2 implements ActionListener {

	private SellingAreaUI3_2 ui;
	SellingareaBlService sellingarea = new SellingArea();
	public SellingAreaListener3_2(SellingAreaUI3_2 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getBtnNewButton_17()) {
			delete(ui.getTextField());
			delete(ui.getTextField_1());
			delete(ui.getTextField_2());
			delete(ui.getTextField_3());
			delete(ui.getTextField_4());
			delete(ui.getTextField_5());
			delete(ui.getTextField_6());
		} else if (e.getSource() == ui.getBtnNewButton_16()) {
			ResultMessage rm;
			CarVO vo = this.read();
			rm = sellingarea.manageCarinfo(vo, Operation.update);
		} else if (e.getSource() == ui.getBtnNewButton_15()) {
			String id = ui.getTextField().getText();
			CarVO vo = sellingarea.findCar(id);
			set(vo);
		} 
	}

	private void set(CarVO vo) {
		// TODO Auto-generated method stub
		ui.getTextField_1().setText("" + vo.getNumber());
		ui.getTextField_2().setText("" + vo.getCarNumber());
		ui.getTextField_3().setText(vo.getPurchase());
		ui.getTextField_4().setText("" + vo.getEngineNumber());
		ui.getTextField_5().setText("" + vo.getChassisNumber());
		ui.getTextField_6().setText("" + vo.getServiceTime());
	}

	private CarVO read() {
		// TODO Auto-generated method stub
		String number = ui.getTextField_1().getText();
		String EngineNumber = ui.getTextField_4().getText();
		String CarNumber = ui.getTextField_2().getText();
		String ChassisNumber = ui.getTextField_5().getText();
		String purchase = ui.getTextField_3().getText();
		String ServiceTime = ui.getTextField_6().getText();

		CarVO vo = new CarVO(number, EngineNumber, CarNumber, ChassisNumber, purchase, Integer.parseInt(ServiceTime));

		return vo;
	}

	private void delete(JTextField textField) {
		// TODO Auto-generated method stub
		textField.setText("");
	}

}
