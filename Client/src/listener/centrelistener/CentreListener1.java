package listener.centrelistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import _enum.ResultMessage;
import logic.centrebl.Centre;
import logic.centreblservice.CentreBlService;
import logic.logicfactory.LogicFactory;
import presentation.MySwing.MyButton;
import presentation.centreui.*;
import vo.CentreTransforVO;

public class CentreListener1 implements MouseListener, ActionListener {

	private CentreUI1 ui;
	private CentreUI1_1 ui1;
	private boolean hasUI1 = false;
	private Vector<Object> data;
	CentreBlService centre;

	public CentreListener1(CentreUI1 ui) {
		super();
		this.ui = ui;
		centre=LogicFactory.getCentreService();
	}

	@SuppressWarnings("unchecked")
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getMyButton()) {
			// add rowData
			Vector<Object> item = new Vector<Object>();
			String date = ui.getTextField().getText();
			String transferID = ui.getTextField_1().getText();
			System.out.println(transferID);
			String banci = ui.getTextField_2().getText();
			String huoguihao = ui.getTextField_3().getText();
			String start = ui.getTextField_4().getText();
			String destination = ui.getTextField_5().getText();
			String jianzhuangyuan = ui.getTextField_6().getText();
			// String yayunyuan = ui.getTextField_7().getText();
			double fee = Double.parseDouble(ui.getTextField_8().getText());
			String transferType = (String) ui.getComboBox().getSelectedItem();

			item.add(transferID);
			item.add(date);
			item.add(start);
			item.add(destination);
			item.add(transferType);
			item.add(banci);
			item.add(huoguihao);
			item.add(jianzhuangyuan);
			// item.add(yayunyuan);
			item.add(fee);
			item.add(new ArrayList<String>());

			ui.getModel().addRow(item);
		}
		if (!hasUI1 && e.getSource() == ui.getMyButton_3()) {
			// add 本次装运所有单号
			int selectedRow = ui.getTable().getSelectedRow();

			if (selectedRow != -1)
				ui1 = new CentreUI1_1(this, data);
			else{
				ui1 = new CentreUI1_1(this, new Vector<Object>());
			}

			hasUI1 = true;
		} else if (hasUI1 && e.getSource() == ui.getMyButton_3())
			;
		if (hasUI1 && e.getSource() == ui1.getMyButton()) {
			// 添加运单
			String barcode = ui1.getTextField().getText();
			Vector<Object> rowData = new Vector<Object>();
			rowData.add(barcode);
			ui1.getModel().addRow(rowData);
		}
		if (hasUI1 && e.getSource() == ui1.getMyButton1()) {
			// 删除选中行
			int selectedRow = ui1.getTable().getSelectedRow();// 获得选中行的索引
			if (selectedRow != -1) // 存在选中行
				ui1.getModel().removeRow(selectedRow); // 删除行

		}
		if (hasUI1 && e.getSource() == ui1.getMyButton2()) {
			// 保存至大表中
			int selectedRow = ui.getTable().getSelectedRow();
			ArrayList<String> barcode = new ArrayList<String>();
			for (int i = 0; i < ui1.getModel().getRowCount(); i++) {
				barcode.add((String) ui1.getModel().getValueAt(i, 0));
			}

			if (selectedRow != -1) {
				ui.getModel().setValueAt(barcode, selectedRow, 9);
			} else {
				ui.getModel().setValueAt(barcode, ui.getModel().getRowCount() - 1, 9);
			}

			hasUI1 = false;
			ui1.dispose();
		}
		if (hasUI1 && e.getSource() == ui1.getMyButton3()) {
			// 取消不作任何修改
			while (ui1.getModel().getRowCount() > 0)
				ui1.getModel().removeRow(0);
			hasUI1 = false;
			ui1.dispose();
		}
		if (e.getSource() == ui.getMyButton_1()) {
			// edit selected rowData
			String date = ui.getTextField().getText();
			String centreID = ui.getTextField_1().getText();
			String banci = ui.getTextField_2().getText();
			String huoguihao = ui.getTextField_3().getText();
			String start = ui.getTextField_4().getText();
			String destination = ui.getTextField_5().getText();
			String jianzhuangyuan = ui.getTextField_6().getText();
			// String yayunyuan = ui.getTextField_7().getText();
			double fee = Double.parseDouble(ui.getTextField_8().getText());
			String transferType = (String) ui.getComboBox().getSelectedItem();

			int selectedRow = ui.getTable().getSelectedRow();// 获得选中行的索引
			if (selectedRow != -1) // 是否存在选中行
			{
				// 修改指定的值：
				ui.getModel().setValueAt(centreID, selectedRow, 0);
				ui.getModel().setValueAt(date, selectedRow, 1);
				ui.getModel().setValueAt(start, selectedRow, 2);
				ui.getModel().setValueAt(destination, selectedRow, 3);
				ui.getModel().setValueAt(transferType, selectedRow, 4);
				ui.getModel().setValueAt(banci, selectedRow, 5);
				ui.getModel().setValueAt(huoguihao, selectedRow, 6);
				ui.getModel().setValueAt(jianzhuangyuan, selectedRow, 7);
				// ui.getModel().setValueAt(yayunyuan, selectedRow, 8);
				ui.getModel().setValueAt(fee, selectedRow, 8);
				// table.setValueAt(arg0, arg1, arg2)
			}
		}
		if (e.getSource() == ui.getMyButton_2()) {
			// remove selected rowData
			int selectedRow = ui.getTable().getSelectedRow();// 获得选中行的索引
			if (selectedRow != -1) // 存在选中行
				ui.getModel().removeRow(selectedRow); // 删除行
		}
		if (e.getSource() == ui.getConfirm()) {
			// save the table
			int n = ui.getModel().getRowCount();
			for (int i = 0; i < n; i++) {
				Vector<Object> rowData = new Vector<Object>();
				for (int j = 0; j < 10; j++) {
					rowData.add(ui.getModel().getValueAt(i, j));
				}
				System.out.println((String) rowData.get(0));
				centre.manageTranfor(new CentreTransforVO((String) rowData.get(4), (String) rowData.get(1),
						(String) rowData.get(0), (String) rowData.get(5), (String) rowData.get(2),
						(String) rowData.get(3), (String) rowData.get(6), (String) rowData.get(7),
						(ArrayList<String>) rowData.get(9), (Double) rowData.get(8), 0));
			}
			while (ui.getModel().getRowCount() > 0)
				ui.getModel().removeRow(0);
		}
		if (e.getSource() == ui.getCancle()) {
			delete(ui.getTextField());// date
			delete(ui.getTextField_2());// banci
			delete(ui.getTextField_3());// huoguihao
			delete(ui.getTextField_4());// start
			delete(ui.getTextField_5());// destination
			delete(ui.getTextField_6());// jianzhuangyuan
			delete(ui.getTextField_8());// feiyong
			ui.getComboBox().setSelectedIndex(0);
		}

	}

	// private void check(ResultMessage rm) {
	// String dialog = null;
	// if (rm == ResultMessage.FunctionError) {
	// dialog = "网络连接出现了问题，请检查您的网络！";
	// } else if (rm == ResultMessage.Fail)
	// dialog = "数据更新失败！";
	// else if (rm == ResultMessage.Success) {
	// dialog = "数据更新成功！";
	// } else if (rm == ResultMessage.UpdateFail) {
	// dialog = "请不要重复创建单据";
	// }
	// if (dialog != null)
	// JOptionPane.showMessageDialog(ui, dialog);
	// }
	//
	// private boolean check(CentreTransforVO vo) {
	// if (vo.checkIsNull() == 0) {
	// JOptionPane.showMessageDialog(ui, "请将信息填写完整！");
	// return false;
	// }
	// if (vo.checkBanHao() == 0) {
	// JOptionPane.showMessageDialog(ui, "请检查班号格式是否正确！");
	// return false;
	// }
	// if (vo.checkDate() == 0) {
	// JOptionPane.showMessageDialog(ui, "请检查日期格式是否正确！");
	// return false;
	// }
	//
	// if (vo.checkJian() == 0) {
	// JOptionPane.showMessageDialog(ui, "请检查监装员编号格式是否正确！");
	// return false;
	// }
	// if (vo.checkList() == 0) {
	// JOptionPane.showMessageDialog(ui, "请检查所有快递单号格式是否正确！");
	// return false;
	// }
	// return true;
	// }

	private void delete(JTextField textField) {
		// TODO Auto-generated method stub
		textField.setText("");
	}

	// private CentreTransforVO read() {
	// // TODO Auto-generated method stub
	// String transferStyle = "飞机";
	// String dataOfGetin = ui.getTextField().getText();
	// System.out.println(dataOfGetin);
	// String centreTransferID = ui.getTextField_1().getText();
	// System.out.println(centreTransferID);
	// String banHao = ui.getTextField_2().getText();
	// System.out.println(banHao);
	// String huoGuiHao = ui.getTextField_3().getText();
	// System.out.println(huoGuiHao);
	// String start = ui.getTextField_4().getText();
	// System.out.println(start);
	// String arrival = ui.getTextField_5().getText();
	// System.out.println(arrival);
	// String JianZhuangYuan = ui.getTextField_6().getText();
	// System.out.println(JianZhuangYuan);
	// String YaYunYuan = ui.getTextField_7().getText();
	// System.out.println(YaYunYuan);
	// // String fee = ui.getTextField_8().getText();
	// // System.out.println(fee);
	//
	// CentreTransforVO vo = new CentreTransforVO(transferStyle, dataOfGetin,
	// centreTransferID, banHao, start, arrival,
	// JianZhuangYuan, YaYunYuan, null, 0, 0);
	//
	// return vo;
	// }

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getTable()) {
			int selectedRow = ui.getTable().getSelectedRow(); // 获得选中行索引
			// 给文本框赋值

			String transferID = (String) ui.getModel().getValueAt(selectedRow, 0);
			ui.getTextField_1().setText(transferID);

			String date = (String) ui.getModel().getValueAt(selectedRow, 1);
			ui.getTextField().setText(date);

			String start = (String) ui.getModel().getValueAt(selectedRow, 2);
			ui.getTextField_4().setText(start);

			String destination = (String) ui.getModel().getValueAt(selectedRow, 3);
			ui.getTextField_5().setText(destination);

			String transferType = (String) ui.getModel().getValueAt(selectedRow, 4);
			ui.getComboBox().setSelectedItem(transferType);

			String banci = (String) ui.getModel().getValueAt(selectedRow, 5);
			ui.getTextField_2().setText(banci);

			String huoguihao = (String) ui.getModel().getValueAt(selectedRow, 6);
			ui.getTextField_3().setText(huoguihao);

			String jianzhuangyuan = (String) ui.getModel().getValueAt(selectedRow, 7);
			ui.getTextField_6().setText(jianzhuangyuan);

			// String yayunyuan = (String) ui.getModel().getValueAt(selectedRow,
			// 8);
			// ui.getTextField_7().setText(yayunyuan);

			double fee = (Double) ui.getModel().getValueAt(selectedRow, 8);
			ui.getTextField_8().setText("" + fee);

			@SuppressWarnings("unchecked")
			ArrayList<String> barcode = (ArrayList<String>) ui.getModel().getValueAt(selectedRow, 9);
			Vector<Object> data1 = new Vector<Object>();
			for (int i = 0; i < barcode.size(); i++) {
				Vector<String> item = new Vector<String>();
				item.add(barcode.get(i));
				data1.add(item);
			}
			this.data = data1;
		}
		// if (e.getSource() == ui1.getTable()) {
		// int selectedRow1 = ui1.getTable().getSelectedRow();
		// }
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
