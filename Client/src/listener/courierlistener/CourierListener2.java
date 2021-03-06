package listener.courierlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import _enum.ResultMessage;
import logic.courierbl.Courier;
import logic.courierblservice.CourierBlService;
import logic.logicfactory.LogicFactory;
import presentation.MySwing.MyButton;
import presentation.courierui.CourierUI2;
import vo.CourierVO;
/**
 * 收件信息输入界面监听
 * @author john
 *
 */
public class CourierListener2 implements MouseListener, ActionListener {

	private CourierUI2 ui;
	CourierBlService courier ;

	public CourierListener2(CourierUI2 ui) {
		super();
		this.ui = ui;
		courier=LogicFactory.getCourierService();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getConfirm()) {
			ResultMessage rm;
			CourierVO vo = this.read();
			if(!check(vo))
				return ;
			rm = courier.ConsigneeinfoInput(vo);
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
			ui.setText(dialog);
			return ;
		}else if(rm==ResultMessage.UpdateFail){
			dialog="请不要重复创建单据";
		}
		if(dialog!=null)
			ui.setErrorText(dialog);
	}
	private CourierVO read() {
		// TODO Auto-generated method stub
		String number = ui.getTextField().getText();
		String name = ui.getTextField_1().getText();
		String date = ui.getTextField_2().getText();

		CourierVO vo = new CourierVO(number, name, date);

		return vo;
	}

	private boolean check(CourierVO vo){
		if(vo.checkIsNull()==0){
			ui.setErrorText("请将信息填写完整！");
			return false;
		}
		if(vo.checkDate()==0){
			ui.setErrorText("请检查日期格式是否正确！");
			return false;
		}
		if(vo.checkNumber()==0){
			ui.setErrorText("请检查快递单号格式是否正确！");
			return false;
		}
		return true;
	}
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}


	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
			}

	public void mouseExited(MouseEvent e) {
	}
}
