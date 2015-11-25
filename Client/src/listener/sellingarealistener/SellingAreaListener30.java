package listener.sellingarealistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

import logic.sellingareabl.SellingArea;
import logic.sellingareablservice.SellingareaBlService;
import presentation.sellingareaui.SellingAreaUI3;
import vo.CarVO;

public class SellingAreaListener30 implements ActionListener {

	private SellingAreaUI3 ui;
	SellingareaBlService sellingarea = new SellingArea();
	
	public SellingAreaListener30 (SellingAreaUI3 ui){
		super();
		this.ui=ui;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getButton_2()){
			ui.getTextField().setText("");
			delete(ui.getLblNewLabel_3());
			delete(ui.getLblNewLabel_5());
			delete(ui.getLblNewLabel_7());
			delete(ui.getLblNewLabel_9());
			delete(ui.getLblNewLabel_12());
			delete(ui.getLblNewLabel_13());
		}else if(e.getSource()==ui.getButton_1()){
			int id = Integer.parseInt(ui.getTextField().getText());
			CarVO vo = sellingarea.findCar(id);
			set(vo);
		}else if(e.getSource()==ui.getBtnNewButton_10()){
			
		}else if(e.getSource()==ui.getBtnNewButton_11()){
			
		}else if(e.getSource()==ui.getBtnNewButton_13()){
			
		}else if(e.getSource()==ui.getBtnNewButton_14()){
			
		}
		
	}

	private void set(CarVO vo) {
		// TODO Auto-generated method stub
		ui.setLblNewLabel_3(new JLabel(""+vo.getCarNumber()));
		ui.setLblNewLabel_5(new JLabel(""+vo.getEngineNumber()));
		ui.setLblNewLabel_7(new JLabel(""+vo.getNumber()));
		ui.setLblNewLabel_9(new JLabel(vo.getPurchase()));
		ui.setLblNewLabel_12(new JLabel(""+vo.getChassisNumber()));
		ui.setLblNewLabel_13(new JLabel(""+vo.getServiceTime()));
	}

	private void delete(JLabel label) {
		// TODO Auto-generated method stub
		label.setText("");
	}

}
