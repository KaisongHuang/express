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
import presentation.MySwing.MyButton;
import presentation.centreui.*;
import vo.CentreTransforVO;

public class CentreListener2 implements MouseListener, ActionListener {

	private CentreUI2 ui;
	CentreBlService centre = new Centre();

	public CentreListener2(CentreUI2 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == ui.getConfirm()) {
			ResultMessage rm;
			CentreTransforVO vo = this.read();
			if(!check(vo))
				return ;
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

	private CentreTransforVO read() {
		// TODO Auto-generated method stub
		String transferStyle = "火车";
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
	private boolean check(CentreTransforVO vo){
		if(vo.checkIsNull()==0){
			JOptionPane.showMessageDialog(ui,"请将信息填写完整！");
			return false;
		}
		if(vo.checkBanHao()==0){
			JOptionPane.showMessageDialog(ui,"请检查班号格式是否正确！");
			return false;
		}
		if(vo.checkDate()==0){
			JOptionPane.showMessageDialog(ui,"请检查日期格式是否正确！");
			return false;
		}
		if(vo.checkFee()==0){
			JOptionPane.showMessageDialog(ui,"费用不合理，请检查！");
			return false;
		}
		if(vo.checkJian()==0){
			JOptionPane.showMessageDialog(ui,"请检查监装员编号格式是否正确！");
			return false;
		}
		if(vo.checkList()==0){
			JOptionPane.showMessageDialog(ui,"请检查所有快递单号格式是否正确！");
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
		// TODO Auto-generated method stub
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

}
