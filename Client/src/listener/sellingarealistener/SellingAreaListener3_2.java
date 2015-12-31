package listener.sellingarealistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import _enum.Operation;
import _enum.ResultMessage;
import logic.logicfactory.LogicFactory;
import logic.sellingareabl.SellingArea;
import logic.sellingareablservice.SellingareaBlService;
import presentation.sellingareaui.SellingAreaUI3_2;
import vo.CarVO;

public class SellingAreaListener3_2 implements ActionListener {

	private SellingAreaUI3_2 ui;
	SellingareaBlService sellingarea  ;
	public SellingAreaListener3_2(SellingAreaUI3_2 ui) {
		super();
		this.ui = ui;sellingarea=LogicFactory.getSellingAreaService();
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
			
			check(rm);
		} else if (e.getSource() == ui.getBtnNewButton_15()) {
			String id = ui.getTextField().getText();
			if(!check(id))
				return ;
			CarVO vo = sellingarea.findCar(id);	
			if(!check(vo))
				return ;
			set(vo);
		} 
	}
	private boolean check(CarVO vo){
		if(vo==null){
			ui.setText("车辆编号不存在！");
   		    return false;	
		}
		return true;
	}
	  private boolean check(String id){
	    	 if(id.length()!=10){
	    		 ui.setText("请确认车辆编号格式是否正确！");
	    		 return false;
	    	 }
	    	 try{
	    		 Integer.parseInt(id);
	    	 }catch(NumberFormatException e){
	    		 ui.setText("请确认车辆编号格式是否正确！");
	    		 return false;
	    	 }
	    	 return true;
	    }
	private void check(ResultMessage rm){
		String dialog=null;
		if(rm==ResultMessage.FunctionError){
			dialog="网络连接出现了问题，请检查您的网络！";
		}else if(rm==ResultMessage.Fail)
			dialog="数据更新失败！";
		else if(rm==ResultMessage.Success){
			dialog="数据更新成功！";
		}else if(rm==ResultMessage.UpdateFail){
			dialog="请不要重复创建单据";
		}
		if(dialog!=null)
			ui.setText(dialog);
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
