package listener.sellingarealistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import _enum.EmployeeMes;
import logic.sellingareabl.SellingArea;
import logic.sellingareablservice.SellingareaBlService;
import presentation.sellingareaui.SellingAreaUI2;
import vo.ReceiptVO;

public class SellingAreaListener20 implements MouseListener, ActionListener {

	private SellingAreaUI2 ui;
	private Vector<Object> vec = new Vector<Object>();
	SellingareaBlService sellingarea = new SellingArea();

	public SellingAreaListener20(SellingAreaUI2 ui) {
		super();
		this.ui = ui;
	}

	@SuppressWarnings("unchecked")
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ui.getButton()) {
			if (!(ui.getTextField().getText().equals("") || ui.getTextField_1().getText().equals("")
					|| ui.getTextField_2().getText().equals(""))) {
				Vector<Object> item = new Vector<Object>();
				String date = ui.getTextField().getText();
				double money = Double.parseDouble(ui.getTextField_1().getText());
				String courier = ui.getTextField_2().getText();

				item.add(date);
				item.add(money);
				item.add(courier);

				ui.getModel().addRow(item);
				Vector<Object> data = new Vector<Object>();
				item.add(data);
				vec.add(item);

				ui.getTextField().setText("");
				ui.getTextField_1().setText("");
				ui.getTextField_2().setText("");
				ui.getTextField_3().setText("");
			}
		} else if (e.getSource() == ui.getButton_1()) {
			// edit selected account
			String date = ui.getTextField().getText();
			double money = Double.parseDouble(ui.getTextField_1().getText());
			String courier = ui.getTextField_2().getText();
			int selectedRow = ui.getTable().getSelectedRow();// 获得选中行的索引
			if (selectedRow != -1) // 是否存在选中行
			{
				// 修改指定的值：
				ui.getModel().setValueAt(date, selectedRow, 0);
				ui.getModel().setValueAt(money, selectedRow, 1);
				ui.getModel().setValueAt(courier, selectedRow, 2);
				// table.setValueAt(arg0, arg1, arg2)
			}
		} else if (e.getSource() == ui.getButton_2()) {
			int selectedRow = ui.getTable().getSelectedRow();// 获得选中行的索引
			if (selectedRow != -1) // 存在选中行
			{
				ui.getModel().removeRow(selectedRow); // 删除行
				while (ui.getModel1().getRowCount() > 0)
					ui.getModel1().removeRow(ui.getModel1().getRowCount() - 1);
			}
			vec.remove(selectedRow);
			ui.getTextField().setText("");
			ui.getTextField_1().setText("");
			ui.getTextField_2().setText("");
			ui.getTextField_3().setText("");
		} else if (e.getSource() == ui.getButton_3()) {

			String id = ui.getTextField_3().getText();
			Vector<Object> idRow = new Vector<Object>();
			idRow.add(id);
			ui.getModel1().addRow(idRow);

			int selectedRow = ui.getTable().getSelectedRow();
			// 存储到对应收款单的vector中
			if (selectedRow != -1) {
				Vector<Object> idTable = (Vector<Object>) ((Vector<Object>) vec.get(selectedRow)).get(3);
				idTable.add(idRow);
			} else {
				if (ui.getTable().getRowCount() > 0) {
					selectedRow = ui.getTable().getRowCount() - 1;
					Vector<Object> idTable = (Vector<Object>) ((Vector<Object>) vec.get(selectedRow)).get(3);
					idTable.add(idRow);
				}
			}

		} else if (e.getSource() == ui.getButton_4()) {
			int selectedRow = ui.getTable().getSelectedRow();// 获得选中行的索引
			int selectedRow1 = ui.getTable1().getSelectedRow();
			if (selectedRow != -1) // 存在选中行
			{
				if (selectedRow1 != -1) {
					ui.getModel1().removeRow(selectedRow1); // 删除行
					Vector<Object> idTable = (Vector<Object>) ((Vector<Object>) vec.get(selectedRow)).get(3);
					idTable.remove(selectedRow1);
				}
			} else {
				if (ui.getTable().getRowCount() > 0) {
					selectedRow = ui.getTable().getRowCount() - 1;
					ui.getModel1().removeRow(selectedRow1);
					Vector<Object> idTable = (Vector<Object>) ((Vector<Object>) vec.get(selectedRow)).get(3);
					idTable.remove(selectedRow1);
				}
			}
			// vec.get(index)remove(selectedRow);
		} else if (e.getSource() == ui.getButton_5()) {
			final JFrame jf = new JFrame();
			jf.setVisible(true);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setBounds(300, 300, 450, 150);
			JPanel contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			jf.setContentPane(contentPane);
			contentPane.setLayout(null);

			JButton button = new JButton("保存");
			button.setBounds(86, 75, 117, 29);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					for (int i = 0; i < ui.getTable().getRowCount(); i++) {
						ReceiptVO vo = new ReceiptVO();
						Vector<Object> rowData = new Vector<Object>();
						Vector<Object> rowData1 = new Vector<Object>();
						ArrayList<String> id = new ArrayList<String>();

						for (int j = 0; j < 3; j++) {
							rowData.add(ui.getTable().getValueAt(i, j));
						}

						rowData1 = (Vector<Object>) ((Vector<Object>) vec.get(i)).get(3);
						for (int k = 0; k < rowData1.size(); k++) {
							id.add((String) ((Vector<Object>) rowData1.get(k)).get(0));
						}

						vo.setDate((String) rowData.get(0));
						// System.out.println(vo.getDate());
						vo.setMoney((Double) rowData.get(1));
						vo.setNumber((String) rowData.get(2));
						vo.setId(id);
						vo.setSellingArea(EmployeeMes.belongToWho);
						vo.setIsCheck(0);
						// if(!check(vo))
						// return ;
						sellingarea.createDebitnote(vo);
					}
				}
			});
			contentPane.add(button);

			JButton button_1 = new JButton("继续修改");
			button_1.setBounds(245, 75, 117, 29);
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					jf.dispose();
				}
			});
			contentPane.add(button_1);

			JLabel label = new JLabel("是否保存收款单信息？");
			label.setBounds(149, 47, 244, 16);
			contentPane.add(label);
		} else if (e.getSource() == ui.getButton_6()) {
			while (ui.getModel().getRowCount() > 0)
				ui.getModel().removeRow(ui.getModel().getRowCount() - 1);
			while (ui.getModel1().getRowCount() > 0)
				ui.getModel1().removeRow(ui.getModel1().getRowCount() - 1);
			ui.getTextField().setText("");
			ui.getTextField_1().setText("");
			ui.getTextField_2().setText("");
			ui.getTextField_3().setText("");
			vec.removeAllElements();
		}

	}

	// private boolean check(ReceiptVO vo){
	// if(vo.checkIsNull()==0){
	// JOptionPane.showMessageDialog(ui, "请将信息填写完整！！");
	// return false;
	// }
	// if(vo.checkDate()==0){
	// JOptionPane.showMessageDialog(ui, "请检查日期格式是否正确！");
	// return false;
	// }
	// if(vo.checkID()==0){
	// JOptionPane.showMessageDialog(ui, "请检查快递编号格式是否正确！");
	// return false;
	// }
	// if(vo.checkNumber()==0){
	// JOptionPane.showMessageDialog(ui, "请检查收款人编号格式是否正确！");
	// return false;
	// }
	// if(vo.checkSelling()==0){
	//
	// }
	// return true;
	// }
	@SuppressWarnings("unchecked")
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getTable()) {
			int selectedRow = ui.getTable().getSelectedRow(); // 获得选中行索引
			// 给文本框赋值
			String date = (String) ui.getModel().getValueAt(selectedRow, 0);
			double money = (Double) ui.getModel().getValueAt(selectedRow, 1);
			String courier = (String) ui.getModel().getValueAt(selectedRow, 2);
			ui.getTextField().setText(date);
			ui.getTextField_1().setText(String.valueOf(money));
			ui.getTextField_2().setText(courier);
			// refresh IdTable
			while (ui.getModel1().getRowCount() > 0)
				ui.getModel1().removeRow(ui.getModel1().getRowCount() - 1);

			Vector<Object> data = (Vector<Object>) ((Vector<Object>) vec.get(selectedRow)).get(3);
			for (int i = 0; i < data.size(); i++)
				ui.getModel1().addRow((Vector<Object>) data.get(i));
		}
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
