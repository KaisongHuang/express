package listener.centrelistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;

import _enum.ResultMessage;
import logic.centrebl.Centre;
import logic.centreblservice.CentreBlService;
import presentation.centreui.*;
import vo.CentreTransforVO;

public class CentreListener3 implements MouseListener, ActionListener {

	private CentreUI3 ui;
	CentreBlService centre = new Centre();

	public CentreListener3(CentreUI3 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == ui.getBtnNewButton_9()) {

		} else if (e.getSource() == ui.getBtnNewButton_10()) {

		} else if (e.getSource() == ui.getBtnNewButton_12()) {
			ResultMessage rm;
			CentreTransforVO vo = this.read();
			rm = centre.manageTranfor(vo);
		} else if (e.getSource() == ui.getBtnNewButton_13()) {
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
