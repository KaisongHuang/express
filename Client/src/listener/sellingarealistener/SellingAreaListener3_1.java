package listener.sellingarealistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import logic.logicfactory.LogicFactory;
import logic.sellingareabl.SellingArea;
import logic.sellingareablservice.SellingareaBlService;
import presentation.sellingareaui.SellingAreaUI3_1;
import vo.CarVO;

public class SellingAreaListener3_1 implements ActionListener {

	private SellingAreaUI3_1 ui;
	SellingareaBlService sellingarea ;
	public SellingAreaListener3_1 (SellingAreaUI3_1 ui){
		super();
		this.ui=ui;sellingarea=LogicFactory.getSellingAreaService();
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
			String id = ui.getTextField().getText();
			if(!check(id))
				return ;
			CarVO vo = sellingarea.findCar(id);
			if(!check(vo))
				return;
			set(vo);
		}


	}
	private boolean check(CarVO vo){
		if(vo.equals(null)){
			ui.setErrorText("车辆编号不存在！");
   		    return false;
		}
		return true;
	}
    private boolean check(String id){
    	 if(id.length()!=10){
    		 ui.setErrorText("请确认车辆编号格式是否正确！");
    		 return false;
    	 }
    	 try{
    		 Integer.parseInt(id);
    	 }catch(NumberFormatException e){
    		 ui.setErrorText("请确认车辆编号格式是否正确！");
    		 return false;
    	 }
    	 return true;
    }
	private void set(CarVO vo) {
		// TODO Auto-generated method stub
		ui.getLblNewLabel_3().setText(""+vo.getCarNumber());
		ui.getLblNewLabel_5().setText(""+vo.getEngineNumber());
		ui.getLblNewLabel_7().setText(""+vo.getNumber());
		ui.getLblNewLabel_9().setText(vo.getPurchase());
		ui.getLblNewLabel_12().setText(""+vo.getChassisNumber());
		ui.getLblNewLabel_13().setText(""+vo.getServiceTime());
		/*
		ui.setLblNewLabel_3(new JLabel(""+vo.getCarNumber()));
		ui.setLblNewLabel_5(new JLabel(""+vo.getEngineNumber()));
		ui.setLblNewLabel_7(new JLabel(""+vo.getNumber()));
		ui.setLblNewLabel_9(new JLabel(vo.getPurchase()));
		ui.setLblNewLabel_12(new JLabel(""+vo.getChassisNumber()));
		ui.setLblNewLabel_13(new JLabel(""+vo.getServiceTime()));
		*/
	}

	private void delete(JLabel label) {
		// TODO Auto-generated method stub
		label.setText("");
	}

}
