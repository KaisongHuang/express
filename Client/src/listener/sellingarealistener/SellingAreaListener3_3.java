package listener.sellingarealistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import _enum.Operation;
import _enum.ResultMessage;
import logic.logicfactory.LogicFactory;
import logic.sellingareabl.SellingArea;
import logic.sellingareablservice.SellingareaBlService;
import presentation.sellingareaui.SellingAreaUI3_3;
import vo.CarVO;

public class SellingAreaListener3_3 implements ActionListener {

	private SellingAreaUI3_3 ui;
	SellingareaBlService sellingarea  ;
	public SellingAreaListener3_3(SellingAreaUI3_3 ui) {
		super();
		this.ui = ui;sellingarea=LogicFactory.getSellingAreaService();
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
			
//此方法需修改
			
			ResultMessage rm;
			String id = ui.getTextField().getText();
			if(!check(id))
				return ;
			CarVO vo=sellingarea.findCar(id);
			
			rm = sellingarea.manageCarinfo(vo, Operation.delete);
			check(rm);
		} else if (e.getSource() == ui.getButton_1()) {
			String id = ui.getTextField().getText();
			CarVO vo = sellingarea.findCar(id);
			set(vo);
		} 
	}

	private void check(ResultMessage rm){
		String dialog=null;
		if(rm==ResultMessage.FunctionError){
			dialog="网络连接出现了问题，请检查您的网络！";
		}else if(rm==ResultMessage.Fail)
			dialog="数据更新失败！";
		else if(rm==ResultMessage.Success){
			dialog="数据更新成功！";
			ui.setText(dialog);
			return;
		}else if(rm==ResultMessage.UpdateFail){
			dialog="请不要重复创建单据";
		}
		if(dialog!=null)
			ui.setErrorText(dialog);
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
