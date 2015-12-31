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
import presentation.sellingareaui.SellingAreaUI4_2;
import vo.DriverVO;

public class SellingAreaListener4_2 implements MouseListener, ActionListener {

	private SellingAreaUI4_2 ui;
	SellingareaBlService sellingarea  ;
	public SellingAreaListener4_2(SellingAreaUI4_2 ui) {
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
			delete(ui.getTextField_7());
			delete(ui.getTextField_8());
		} else if (e.getSource() == ui.getBtnNewButton_16()) {
			ResultMessage rm;
			DriverVO vo = this.read();
			if(!check(vo))
				return ;
			rm = sellingarea.manageDriverinfo(vo, Operation.update);
		} else if (e.getSource() == ui.getBtnNewButton_15()) {
			String id = ui.getTextField().getText();
			DriverVO vo = sellingarea.findDriver(id);
			set(vo);
		}
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
			ui.setText("请检查司机手机号格式是否正确！");
			return false;
		}
		return true;
	}
	private void set(DriverVO vo) {
		// TODO Auto-generated method stub
		ui.getTextField_5().setText(vo.getName());
		ui.getTextField_6().setText("" + vo.getID());
		ui.getTextField_7().setText(vo.getPhone());
		ui.getTextField_8().setText(vo.getLicenceTime());
		ui.getTextField_1().setText("" + vo.getNumber());
		ui.getTextField_2().setText(vo.getBirthday());
		ui.getTextField_3().setText(vo.getSex());
		ui.getTextField_4().setText(vo.getCarCompany());
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

		DriverVO vo = new DriverVO(number, name, birthday, ID, phone, CarCompany, sex, LicenceTime);

		return vo;
	}

	private void delete(JTextField textField) {
		// TODO Auto-generated method stub
		textField.setText("");
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
