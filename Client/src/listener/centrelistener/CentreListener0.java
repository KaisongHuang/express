package listener.centrelistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import _enum.ResultMessage;
import logic.centrebl.Centre;
import logic.centreblservice.CentreBlService;
import logic.logicfactory.LogicFactory;
import presentation.MySwing.MyButton;
import presentation.centreui.CentreUI;
import vo.*;

public class CentreListener0 implements MouseListener, ActionListener {

	private CentreUI ui;
	CentreBlService centre;

	public CentreListener0(CentreUI ui) {
		super();
		this.ui = ui;
		centre=LogicFactory.getCentreService();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getMyButton()) {
			String barcode = ui.getTextField().getText();
			String arrivalDate = ui.getTextField_1().getText();
			String transferID = ui.getTextField_2().getText();
			String start = ui.getTextField_3().getText();
			String state = (String) ui.getComboBox().getSelectedItem();
			Vector<Object> item = new Vector<Object>();
			item.add(barcode);
			item.add(arrivalDate);
			item.add(transferID);
			item.add(start);
			item.add(state);
			ui.getModel().addRow(item);
		}

		if (e.getSource() == ui.getMyButton_1()) {
			int selectedRow = ui.getTable().getSelectedRow();// 获得选中行的索引
			if (selectedRow != -1) // 存在选中行
			{
				ui.getModel().removeRow(selectedRow); // 删除行
			}
		}

		if (e.getSource() == ui.getConfirm()) {
			// ResultMessage rm;

			for (int i = 0; i < ui.getTable().getRowCount(); i++) {
				// CentreArrivalVO vo = new CentreArrivalVO();
				Vector<Object> rowData = new Vector<Object>();
				for (int j = 0; j < 5; j++) {
					rowData.add(ui.getTable().getValueAt(i, j));
				}
				centre.createReceive(new CentreArrivalVO((String) rowData.get(0), (String) rowData.get(1),
						(String) rowData.get(2), (String) rowData.get(3), (String) rowData.get(4), 0));
				// check(rm);
			}

			ui.getTextField().setText("");
			ui.getTextField_1().setText("");
			ui.getTextField_2().setText("");
			ui.getTextField_3().setText("");
			ui.getComboBox().setSelectedItem(0);

			while (ui.getModel().getRowCount() > 0)
				ui.getModel().removeRow(0);

			// CentreArrivalVO vo = this.read();
			// if (!check(vo))
			// return;
			// rm = centre.createReceive(vo);
			// check(rm);
		} else if (e.getSource() == ui.getCancle()) {

			delete(ui.getTextField());
			delete(ui.getTextField_1());
			delete(ui.getTextField_2());
			delete(ui.getTextField_3());
		}

	}

	private void check(ResultMessage rm) {
		String dialog = null;
		if (rm == ResultMessage.FunctionError) {
			dialog = "网络连接出现了问题，请检查您的网络！";
		} else if (rm == ResultMessage.Fail)
			dialog = "数据更新失败！";
		else if (rm == ResultMessage.Success) {
			dialog = "数据更新成功！";
		} else if (rm == ResultMessage.UpdateFail) {
			dialog = "请不要重复创建单据";
		}
		if (dialog != null)
			JOptionPane.showMessageDialog(ui, dialog);
	}

	private boolean check(CentreArrivalVO vo) {
		if (vo.checkIsNull() == 0) {
			JOptionPane.showMessageDialog(ui, "请将信息填写完整！");
			return false;
		}
		if (vo.checkID() == 0) {
			JOptionPane.showMessageDialog(ui, "请检查中转中心编号格式是否正确。");
			return false;
		}
		if (vo.checkDate() == 0) {
			JOptionPane.showMessageDialog(ui, "请检查日期格式是否正确！");
			return false;
		}
		if (vo.checkTransfer() == 0) {
			JOptionPane.showMessageDialog(ui, "请检查中转单编号格式是否正确！");
			return false;
		}
		return true;
	}

	private void delete(JTextField textField) {
		// TODO Auto-generated method stub
		textField.setText("");

	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getTable()) {
			int selectedRow = ui.getTable().getSelectedRow(); // 获得选中行索引
			String barcode = (String) ui.getModel().getValueAt(selectedRow, 0);
			String arrivalDate = (String) ui.getModel().getValueAt(selectedRow, 1);
			String transferID = (String) ui.getModel().getValueAt(selectedRow, 2);
			String start = (String) ui.getModel().getValueAt(selectedRow, 3);
			String state = (String) ui.getModel().getValueAt(selectedRow, 4);
			ui.getTextField().setText(barcode); // 给文本框赋值
			ui.getTextField_1().setText(arrivalDate);
			ui.getTextField_2().setText(transferID);
			ui.getTextField_3().setText(start);
			ui.getComboBox().setSelectedItem(state);
		}
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

//	public CentreArrivalVO read() {
//
//		String centreID = ui.getTextField().getText();
//		String getData = ui.getTextField_1().getText();
//		String transferID = ui.getTextField_2().getText();
//		String start = ui.getTextField_3().getText();
//		String expressState = (String) ui.getComboBox().getSelectedItem();
//
//		CentreArrivalVO vo = new CentreArrivalVO(centreID, getData, transferID, start, expressState, 0);
//
//		return vo;
//
//	}

}
