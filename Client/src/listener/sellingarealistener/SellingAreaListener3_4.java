package listener.sellingarealistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import _enum.Operation;
import _enum.ResultMessage;
import logic.sellingareabl.SellingArea;
import logic.sellingareablservice.SellingareaBlService;
import presentation.sellingareaui.SellingAreaUI3_4;
import vo.CarVO;

public class SellingAreaListener3_4 implements ActionListener {

	private SellingAreaUI3_4 ui;
	SellingareaBlService sellingarea = new SellingArea();
	public SellingAreaListener3_4 (SellingAreaUI3_4 ui){
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
			if(!check(vo))
				return ;
			rm = sellingarea.manageCarinfo(vo, Operation.insert);
			check(rm);
		}else if(e.getSource()==ui.getBtnNewButton_10()){

		}else if(e.getSource()==ui.getBtnNewButton_11()){

		}else if(e.getSource()==ui.getBtnNewButton_13()){

		}else if(e.getSource()==ui.getBtnNewButton_14()){

		}
	}
    private boolean check(CarVO vo){
    	if(vo.checkIsNull()==0){
    		JOptionPane.showMessageDialog(ui, "请将信息填写完整！");
			return false;
    	}
    	if(vo.checkCarNumber()==0){
    		JOptionPane.showMessageDialog(ui, "请检查车辆代号格式是否正确！");
			return false;
    	}
    	if(vo.checkNumber()==0){
    		JOptionPane.showMessageDialog(ui, "请检查车辆好格式是否正确！");
			return false;
    	}
    	if(vo.checkPurchase()==0){
    		JOptionPane.showMessageDialog(ui, "请检查车辆购买时间是否合理！");
			return false;
    	}
    	if(vo.checkService()==0){
    		JOptionPane.showMessageDialog(ui, "请检查车辆服役时间是否合理！");
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
			JOptionPane.showMessageDialog(ui, dialog);

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
