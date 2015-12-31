package listener.sellingarealistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import _enum.Operation;
import _enum.ResultMessage;
import logic.logicfactory.LogicFactory;
import logic.sellingareabl.SellingArea;
import logic.sellingareablservice.SellingareaBlService;
import presentation.sellingareaui.SellingAreaUI4_4;
import vo.DriverVO;

public class SellingAreaListener4_4 implements MouseListener, ActionListener {

	private SellingAreaUI4_4 ui;
	SellingareaBlService sellingarea ;
	public SellingAreaListener4_4 (SellingAreaUI4_4 ui){
		super();
		this.ui=ui;sellingarea=LogicFactory.getSellingAreaService();
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getBtnNewButton_17()){
			delete(ui.getTextField_1());
			delete(ui.getTextField_2());
			delete(ui.getTextField_3());
			delete(ui.getTextField_4());
			delete(ui.getTextField_5());
			delete(ui.getTextField_6());
			delete(ui.getTextField_7());
			delete(ui.getTextField_8());
		}else if(e.getSource()==ui.getBtnNewButton_16()){
			ResultMessage rm;
			DriverVO vo = this.read();
			if(!check(vo))
				return ;
			rm = sellingarea.manageDriverinfo(vo, Operation.insert);
			check(rm);
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
			ui.setText(dialog);
	}
	private boolean check(DriverVO vo){
		if(vo.checkIsNull()==0){
			ui.setText("请将信息填写完整！");
			return false;
		}
		if(vo.checkBirthday()==0){
			ui.setText("请检查司机生日格式是否正确！");
			return false;
		}
		if(vo.checkID()==0){
			ui.setText("请检查司机身份证号是否正确！");
			return false;
		}
		if(vo.checkNumber()==0){
			ui.setText("请检查司机编号！");
			return false;
		}
		if(vo.checkPhone()==0){
			ui.setText( "请检查司机手机号格式是否正确！");
			return false;
		}
		return true;
	}
	private void delete(JTextField textField) {
		// TODO Auto-generated method stub
		textField.setText("");
	}
	
	private DriverVO read() {
		// TODO Auto-generated method stub
		String number = ui.getTextField_1().getText();
		String name = ui.getTextField_5().getText();
		String birthday = ui.getTextField_2().getText();
		String ID = ui.getTextField_6().getText();
		String phone = ui.getTextField_7().getText();
		String CarCompany = ui.getTextField_4().getText();
		String sex = ui.getTextField_3().getText();
		String LicenceTime = ui.getTextField_8().getText();
		
		DriverVO vo = new DriverVO(number,name,birthday,ID,
				phone,CarCompany,sex,LicenceTime);
		
		return vo;
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
