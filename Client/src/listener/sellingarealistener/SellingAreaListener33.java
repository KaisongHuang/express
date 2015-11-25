package listener.sellingarealistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import _enum.Operation;
import _enum.ResultMessage;
import logic.sellingareabl.SellingArea;
import logic.sellingareablservice.SellingareaBlService;
import presentation.sellingareaui.SellingAreaUI33;
import vo.CarVO;

public class SellingAreaListener33 implements ActionListener {

	private SellingAreaUI33 ui;
	SellingareaBlService sellingarea = new SellingArea();
	
	public SellingAreaListener33 (SellingAreaUI33 ui){
		super();
		this.ui=ui;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getBtnNewButton_16()){
			delete(ui.getTextField());
			delete(ui.getTextField_1());
			delete(ui.getTextField_2());
			delete(ui.getTextField_3());
			delete(ui.getTextField_4());
			delete(ui.getTextField_5());
		}else if(e.getSource()==ui.getBtnNewButton_15()){
			ResultMessage rm;
			CarVO vo = this.read();
			rm = sellingarea.manageCarinfo(vo, Operation.insert);
		}else if(e.getSource()==ui.getBtnNewButton_10()){
			
		}else if(e.getSource()==ui.getBtnNewButton_11()){
			
		}else if(e.getSource()==ui.getBtnNewButton_13()){
			
		}else if(e.getSource()==ui.getBtnNewButton_14()){
			
		}
	}

	private CarVO read() {
		// TODO Auto-generated method stub
		String number = ui.getTextField().getText();
		String EngineNumber = ui.getTextField_1().getText();
		String CarNumber = ui.getTextField_2().getText();
		String ChassisNumber = ui.getTextField_3().getText();
		String purchase = ui.getTextField_4().getText();
		String ServiceTime = ui.getTextField_5().getText();
		
		CarVO vo = new CarVO(number,EngineNumber,CarNumber,
				ChassisNumber,purchase,Integer.parseInt(ServiceTime));
		
		return vo;
	}

	private void delete(JTextField textField) {
		// TODO Auto-generated method stub
		textField.setText("");
	}

}
