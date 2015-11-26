package listener.warehouselistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import logic.warehousebl.Warehouse;
import logic.warehouseblservice.WarehouseBlService;
import presentation.warehouseui.WarehouseUI5;

public class WarehouseListener50 implements ActionListener {
	private WarehouseUI5 ui;
	WarehouseBlService warehouseBl = new Warehouse();

	public WarehouseListener50() {
	}

	public WarehouseListener50(WarehouseUI5 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// add
		if (e.getSource() == ui.getButton_1()) {
			Vector<Object> item = new Vector<Object>();
			String id = ui.getTextField().getText();
			String destination = ui.getTextField_1().getText();
			// String year = (String) ui.getComboBox().getSelectedItem();
			// String month = (String) ui.getComboBox_1().getSelectedItem();
			// String date = (String) ui.getComboBox_2().getSelectedItem();
			// String time = year + month + date;
			// String qu = (String) ui.getComboBox_3().getSelectedItem();
			// int pai = (Integer) ui.getComboBox_4().getSelectedItem();
			// int jia = (Integer) ui.getComboBox_5().getSelectedItem();
			// int wei = (Integer) ui.getComboBox_6().getSelectedItem();
			item.add(id);
			item.add(destination);
			// item.add(time);
			// item.add(qu);
			// item.add(pai);
			// item.add(jia);
			// item.add(wei);
			ui.getModel().addRow(item);
		}
		// delete
		else if (e.getSource() == ui.getButton()) {
			int selectedRow = ui.getTable().getSelectedRow();// 获得选中行的索引
			if (selectedRow != -1) // 存在选中行
			{
				ui.getModel().removeRow(selectedRow); // 删除行
			}
		}
		// clear
		else if (e.getSource() == ui.getButton_2()) {
			ui.getTextField().setText("");
			ui.getTextField_1().setText("");
			;
			ui.getComboBox().setSelectedIndex(0);
			ui.getComboBox_1().setSelectedIndex(0);
			ui.getComboBox_2().setSelectedIndex(0);
			ui.getComboBox_3().setSelectedIndex(0);
			ui.getComboBox_4().setSelectedIndex(0);
			ui.getComboBox_5().setSelectedIndex(0);
			ui.getComboBox_6().setSelectedIndex(0);
		}
		// save&back
		else if (e.getSource() == ui.getButton_3()) {
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

			JLabel label = new JLabel("是否保存新建的库存信息？");
			label.setBounds(149, 47, 244, 16);
			contentPane.add(label);
		}
	}

}
