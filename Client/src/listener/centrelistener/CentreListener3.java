package listener.centrelistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import _enum.ResultMessage;
import logic.centrebl.Centre;
import logic.centreblservice.CentreBlService;
import logic.logicfactory.LogicFactory;
import presentation.MySwing.MyButton;
import presentation.centreui.*;
import vo.CentreTransforVO;

public class CentreListener3 implements MouseListener, ActionListener {

	private CentreUI3 ui;
	CentreBlService centre ;

	public CentreListener3(CentreUI3 ui) {
		super();
		this.ui = ui;
		centre=LogicFactory.getCentreService();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == ui.getConfirm()) {
			ResultMessage rm;
			CentreTransforVO vo = this.read();
			if(!check(vo))
				return;
			rm = centre.manageTranfor(vo);
			check(rm);
		} else if (e.getSource() == ui.getCancle()) {
			delete(ui.getTextField());
			delete(ui.getTextField_1());
			delete(ui.getTextField_2());
			delete(ui.getTextField_3());
			delete(ui.getTextField_4());
			delete(ui.getTextField_5());
			delete(ui.getTextField_6());
			delete(ui.getTextField_7());
			delete(ui.getTextField_8());
		}

	}

	private void delete(JTextField textField) {
		// TODO Auto-generated method stub
		textField.setText("");
	}
	private boolean check(CentreTransforVO vo){
		if(vo.checkIsNull()==0){
			ui.setErrorText( "请将信息填写完整！");
			return false;
		}
		if(vo.checkBanHao()==0){
			ui.setErrorText( "请检查班号格式是否正确！");
			return false;
		}
		if(vo.checkDate()==0){
			ui.setErrorText( "请检查日期格式是否正确！");
			return false;
		}
	
		if(vo.checkJian()==0){
			ui.setErrorText( "请检查监装员编号格式是否正确！");
			return false;
		}
		if(vo.checkList()==0){
			ui.setErrorText( "请检查所有快递单号格式是否正确！");
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
			ui.setText( dialog);
	}
	private CentreTransforVO read() {
		// TODO Auto-generated method stub
		String transferStyle = "飞机";
		String dataOfGetin = ui.getTextField().getText();
		String centreTransferID = ui.getTextField_1().getText();
		String banHao = ui.getTextField_2().getText();
		String huoGuiHao = ui.getTextField_3().getText();
		String start = ui.getTextField_4().getText();
		String arrival = ui.getTextField_5().getText();
		String JianZhuangYuan = ui.getTextField_6().getText();
		String YaYunYuan = ui.getTextField_7().getText();
		String fee = ui.getTextField_8().getText();

		CentreTransforVO vo = new CentreTransforVO(transferStyle, dataOfGetin, centreTransferID, banHao, start, arrival,
				JianZhuangYuan, YaYunYuan, null, Double.parseDouble(fee), 0);

		return vo;
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public void mouseExited(MouseEvent e) {
	}

}
