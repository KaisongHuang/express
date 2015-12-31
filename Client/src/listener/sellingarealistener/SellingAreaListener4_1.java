package listener.sellingarealistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import logic.logicfactory.LogicFactory;
import logic.sellingareabl.SellingArea;
import logic.sellingareablservice.SellingareaBlService;
import presentation.sellingareaui.SellingAreaUI4_1;
import vo.DriverVO;

public class SellingAreaListener4_1 implements ActionListener {

	private SellingAreaUI4_1 ui;
	SellingareaBlService sellingarea  ;
	public SellingAreaListener4_1 (SellingAreaUI4_1 ui){
		super();
		this.ui=ui;sellingarea=LogicFactory.getSellingAreaService();
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getBtnNewButton_16()){
			ui.getTextField().setText("");
			delete(ui.getLblNewLabel_11());
			delete(ui.getLblNewLabel_13());
			delete(ui.getLblNewLabel_15());
			delete(ui.getLblNewLabel_17());
			delete(ui.getLblNewLabel_3());
			delete(ui.getLblNewLabel_7());
			delete(ui.getLblNewLabel_8());
			delete(ui.getLblNewLabel_9());
		}else if(e.getSource()==ui.getBtnNewButton_15()){
			String id = ui.getTextField().getText();
			if(!check(id))
				return ;
			DriverVO vo = sellingarea.findDriver(id);
			set(vo);
		}
	}
	  private boolean check(String id){
	    	 if(id.length()!=10){
	    		 ui.setErrorText("请确认车辆编号格式是否正确！");
	    		 return false;
	    	 }
	    	 try{
	    		 Integer.parseInt(id);
	    	 }catch(NumberFormatException e){
	    		 ui.setErrorText( "请确认车辆编号格式是否正确！");
	    		 return false;
	    	 }
	    	 return true;
	    }
	private void set(DriverVO vo) {
		// TODO Auto-generated method stub
		ui.getLblNewLabel_11().setText(vo.getName());
		ui.getLblNewLabel_13().setText(""+vo.getID());
		ui.getLblNewLabel_15().setText(vo.getPhone());
		ui.getLblNewLabel_17().setText(vo.getLicenceTime());
		ui.getLblNewLabel_3().setText(""+vo.getNumber());
		ui.getLblNewLabel_7().setText(vo.getBirthday());
		ui.getLblNewLabel_8().setText(vo.getSex());
		ui.getLblNewLabel_9().setText(vo.getCarCompany());
	}

	private void delete(JLabel label) {
		// TODO Auto-generated method stub
		label.setText("");
	}

}
