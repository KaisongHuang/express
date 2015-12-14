/**
 * WarehouseUI3是Warehouse用户的库存报警界面
 */

package presentation.warehouseui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Color;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import listener.warehouselistener.WarehouseListener3;

public class WarehouseUI3 extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private DefaultTableModel model;
	private JScrollPane JSP;
	private Vector<String> name;
	private Vector<Object> data;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	WarehouseListener3 warehouseListener;

	/**
	 * Create the application.
	 */
	public WarehouseUI3() {
		warehouseListener = new WarehouseListener3(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		this.setBackground(new Color(158,211,238));
		String names[] = { "快递编号", "原区号", "原排号", "原架号", "原位号", "现区号", "现排号", "现架号", "现位号" };
		name = new Vector<String>(Arrays.asList(names));
		table = new JTable(data, name);
		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(36, 32, 678, 326);
		this.add(JSP);

		button = new JButton("刷新");
		button.setBounds(36, 380, 94, 27);
		button.addActionListener(warehouseListener);
		add(button);

		button_1 = new JButton("确认");
		button_1.setBounds(142, 380, 94, 27);
		button_1.addActionListener(warehouseListener);
		add(button_1);

		button_2 = new JButton("清空");
		button_2.setBounds(248, 380, 94, 27);
		button_2.addActionListener(warehouseListener);
		add(button_2);

		button_3 = new JButton("设置报警比例");
		button_3.setBounds(600, 380, 114, 27);
		button_3.addActionListener(warehouseListener);
		add(button_3);
	}

	public JTable getTable() {
		return table;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public Vector<Object> getData() {
		return data;
	}

	public void setData(Vector<Object> data) {
		this.data = data;
	}

	public JButton getButton() {
		return button;
	}

	public JButton getButton_1() {
		return button_1;
	}

	public JButton getButton_2() {
		return button_2;
	}

	public JButton getButton_3() {
		return button_3;
	}

}
