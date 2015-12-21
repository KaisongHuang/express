package listener.courierlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import _enum.ResultMessage;
import logic.courierbl.Courier;
import logic.courierblservice.CourierBlService;
import po.DistanceAndFee;
import presentation.courierui.CourierUI;
import presentation.courierui.CourierUI1;
import vo.SenderVO;
/**
 * 订单输入界面监听
 * @author john
 *
 */
public class CourierListener0 implements ActionListener {

	private CourierUI ui;
	CourierBlService courier = new Courier();
	
	CourierUI1 panel;

	public CourierListener0(CourierUI ui) {
		super();
		this.ui = ui;
		panel = new CourierUI1(ui.WIDTH, ui.HEIGHT);
		ui.add(panel);
		panel.setVisible(false);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getBtnNewButton_11()) {
			delete(ui.getTextField());
			delete(ui.getTextField_1());
			delete(ui.getTextField_2());
			delete(ui.getTextField_3());
			delete(ui.getTextField_4());
			delete(ui.getTextField_5());
			delete(ui.getTextField_6());
			delete(ui.getTextField_7());
			delete(ui.getTextField_8());
			delete(ui.getTextField_9());
			delete(ui.getTextField_10());
			delete(ui.getTextField_11());
			delete(ui.getTextField_12());
			delete(ui.getTextField_13());
			delete(ui.getTextField_14());
			ui.getComboBox().setSelectedIndex(1);
			ui.getComboBox_1().setSelectedIndex(1);
		} else if (e.getSource() == ui.getBtnNewButton_10()) {
			ResultMessage rm;
			SenderVO vo = this.read();
			if(!check(vo))
				return ;
			rm = courier.OrderInput(vo);
			check(rm);
			panel.setVisible(true);

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
		}else if(rm==ResultMessage.UpdateFail){
			dialog="请不要重复创建单据";
		}
		if(dialog!=null)
			JOptionPane.showMessageDialog(ui, dialog);
	}
    private boolean check(SenderVO vo){
    	if(vo.checkIsNull()==0){
    		JOptionPane.showMessageDialog(ui,"请将信息填写完整！");
			return false;
    	}
    	if(vo.checkRecipientPhone()==0){
    		JOptionPane.showMessageDialog(ui,"请检查收件人的手机号格式！");
			return false;
    	}
    	if(vo.checkSenderPhone()==0){
    		JOptionPane.showMessageDialog(ui,"请检查寄件人的手机号格式！");
			return false;
    	}
    	return true;
    }
	private SenderVO read() {
		// TODO Auto-generated method stub
		String SenderName = ui.getTextField().getText();
		String SenderCity = "";
		
		if (ui.getTextField_1().getText().equals("北京") || ui.getTextField_1().getText().equals("天津")
				|| ui.getTextField_1().getText().equals("上海") || ui.getTextField_1().getText().equals("重庆"))
			SenderCity = ui.getTextField_1().getText();
		else
			SenderCity = ui.getTextField_15().getText();
		
		String SenderAddress = ui.getTextField_1().getText() + ui.getTextField_15().getText()
				+ ui.getTextField_16().getText();
		String SenderCompany = ui.getTextField_2().getText();
		String SenderCall = ui.getTextField_3().getText();
		String SenderPhone = ui.getTextField_4().getText();

		String RecipientName = ui.getTextField_5().getText();
		String RecipientCity = "";
		if (ui.getTextField_6().getText().equals("北京") || ui.getTextField_6().getText().equals("天津")
				|| ui.getTextField_6().getText().equals("上海") || ui.getTextField_6().getText().equals("重庆"))
			RecipientCity = ui.getTextField_6().getText();
		else
			RecipientCity = ui.getTextField_17().getText();
		
		String RecipientAddress = ui.getTextField_6().getText() + ui.getTextField_17().getText()
				+ ui.getTextField_18().getText();
		String RecipientCompany = ui.getTextField_7().getText();
		String RecipientCall = ui.getTextField_8().getText();
		String RecipientPhone = ui.getTextField_9().getText();

		String pcs = ui.getTextField_10().getText();
		String weight = ui.getTextField_11().getText();
		String volume = ui.getTextField_12().getText();
		String commodity = ui.getTextField_13().getText();
		String size = ui.getTextField_14().getText();
		String bagging = (String) ui.getComboBox().getSelectedItem();
		String BarCode = "";
		String type = (String) ui.getComboBox_1().getSelectedItem();

		SenderVO vo = new SenderVO(SenderName, SenderAddress, SenderCompany, SenderCall, SenderPhone, RecipientName,
				RecipientAddress, RecipientCompany, RecipientCall, RecipientPhone, Integer.parseInt(pcs),
				Integer.parseInt(weight), Integer.parseInt(volume), commodity, size, bagging, BarCode, type);
		vo.setSenderCity(SenderCity);
		vo.setRecipientCity(RecipientCity);
		return vo;
	}

	private void delete(JTextField textField) {
		// TODO Auto-generated method stub
		textField.setText("");
	}

}
