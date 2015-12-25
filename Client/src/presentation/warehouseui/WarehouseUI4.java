/**
 * WarehouseUI4是Warehouse用户的库存初始化界面
 */

package presentation.warehouseui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import listener.warehouselistener.WarehouseListener4;
import presentation.MySwing.MyTable;
import presentation.MySwing.MyTextField;

import javax.swing.JComboBox;

import java.awt.Color;
import java.util.Arrays;
import java.util.Vector;

public class WarehouseUI4 extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private MyTextField textField;
	private MyTextField textField_1;
	private MyTable table;
	private JScrollPane JSP;
	private Vector<String> name;
	private Vector<Object> data;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox_2;
	private JComboBox<String> comboBox_3;
	private JComboBox<String> comboBox_4;
	private JComboBox<String> comboBox_5;
	private JComboBox<String> comboBox_6;
	private DefaultTableModel model;
	WarehouseListener4 warehouseListener;

	/**
	 * Create the application.
	 */
	public WarehouseUI4() {
		warehouseListener = new WarehouseListener4(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		this.setBackground(Color.white);
		String names[] = { "快递编号", "入库日期", "目的地", "区号", "排号", "架号", "位号" };
		name = new Vector<String>(Arrays.asList(names));
		table = new MyTable(data, name);
		table.setSelectionForeground(Color.BLACK);
		table.setSelectionBackground(new Color(210, 240, 255));
		table.setEditableColumn(-1);
		table.setEditableRow(-1);
		table.setFocusable(false);
		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(29, 68, 444, 298);
		this.add(JSP);

		label = new JLabel("快递编号:");
		label.setBounds(485, 92, 57, 15);
		this.add(label);

		textField = new MyTextField();
		textField.setBounds(554, 86, 122, 27);
		this.add(textField);
		textField.setColumns(10);

		label_1 = new JLabel("目的地:");
		label_1.setBounds(485, 119, 57, 15);
		this.add(label_1);

		textField_1 = new MyTextField();
		textField_1.setBounds(554, 113, 122, 27);
		this.add(textField_1);
		textField_1.setColumns(10);

		label_2 = new JLabel("入库时间:");
		label_2.setBounds(485, 146, 57, 15);
		this.add(label_2);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(554, 141, 94, 25);
		comboBox.addItem("2015");
		this.add(comboBox);

		label_3 = new JLabel("年");
		label_3.setBounds(649, 146, 12, 15);
		this.add(label_3);

		comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(554, 173, 57, 25);
		comboBox_1.addItem("01");
		this.add(comboBox_1);

		label_4 = new JLabel("月");
		label_4.setBounds(610, 178, 12, 15);
		this.add(label_4);

		comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(640, 173, 57, 25);
		comboBox_2.addItem("01");
		this.add(comboBox_2);

		label_5 = new JLabel("日");
		label_5.setBounds(698, 178, 12, 15);
		this.add(label_5);

		label_6 = new JLabel("位置:");
		label_6.setBounds(485, 215, 57, 15);
		this.add(label_6);

		comboBox_3 = new JComboBox<String>();
		comboBox_3.setBounds(554, 210, 57, 25);
		comboBox_3.addItem("航运区");
		comboBox_3.addItem("铁运区");
		comboBox_3.addItem("汽运区");
		this.add(comboBox_3);

		comboBox_4 = new JComboBox<String>();
		comboBox_4.setBounds(640, 210, 57, 25);
		comboBox_4.addItem("1");
		this.add(comboBox_4);

		comboBox_5 = new JComboBox<String>();
		comboBox_5.setBounds(554, 247, 57, 25);
		comboBox_5.addItem("1");
		this.add(comboBox_5);

		label_7 = new JLabel("区");
		label_7.setBounds(610, 215, 12, 15);
		this.add(label_7);

		label_8 = new JLabel("排");
		label_8.setBounds(698, 215, 12, 15);
		this.add(label_8);

		label_9 = new JLabel("架");
		label_9.setBounds(610, 252, 12, 15);
		this.add(label_9);

		comboBox_6 = new JComboBox<String>();
		comboBox_6.setBounds(640, 247, 57, 25);
		comboBox_6.addItem("1");
		this.add(comboBox_6);

		label_10 = new JLabel("位");
		label_10.setBounds(698, 252, 12, 15);
		this.add(label_10);

		button_1 = new JButton("新增");
		button_1.setBounds(554, 284, 65, 27);
		button_1.addActionListener(warehouseListener);
		this.add(button_1);

		button_2 = new JButton("清空");
		button_2.setBounds(630, 284, 65, 27);
		button_2.addActionListener(warehouseListener);
		this.add(button_2);

		button_3 = new JButton("保存");
		button_3.setBounds(630, 323, 65, 27);
		button_3.addActionListener(warehouseListener);
		this.add(button_3);

		button = new JButton("删除");
		button.setBounds(554, 323, 65, 27);
		button.addActionListener(warehouseListener);
		add(button);

		button_4 = new JButton("库存清空");
		button_4.setBounds(29, 27, 117, 29);
		button_4.addActionListener(warehouseListener);
		add(button_4);
	}

	public MyTextField getTextField() {
		return textField;
	}

	public MyTextField getTextField_1() {
		return textField_1;
	}

	public MyTable getTable() {
		return table;
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
	
	public JButton getButton_4(){
		return button_4;
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public JComboBox<String> getComboBox_1() {
		return comboBox_1;
	}

	public JComboBox<String> getComboBox_2() {
		return comboBox_2;
	}

	public JComboBox<String> getComboBox_3() {
		return comboBox_3;
	}

	public JComboBox<String> getComboBox_4() {
		return comboBox_4;
	}

	public JComboBox<String> getComboBox_5() {
		return comboBox_5;
	}

	public JComboBox<String> getComboBox_6() {
		return comboBox_6;
	}

	public DefaultTableModel getModel() {
		return model;
	}
}
