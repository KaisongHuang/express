package presentation.warehouseui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import listener.warehouselistener.WarehouseListener50;

import javax.swing.JComboBox;
import java.util.Arrays;
import java.util.Vector;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WarehouseUI5 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
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
	private JComboBox<?> comboBox;
	private JComboBox<?> comboBox_1;
	private JComboBox<?> comboBox_2;
	private JComboBox<?> comboBox_3;
	private JComboBox<?> comboBox_4;
	private JComboBox<?> comboBox_5;
	private JComboBox<?> comboBox_6;
	private DefaultTableModel model;
	WarehouseListener50 warehouseListener50;

	/**
	 * Create the application.
	 */
	public WarehouseUI5() {
		warehouseListener50 = new WarehouseListener50(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// JPanel panel_3 = new JPanel();
		// panel_3.setBounds(136, 58, 746, 58);
		// panel_3.setLayout(null);
		//
		// JButton btnNewButton_7 = new JButton("出库入库");
		// btnNewButton_7.setBackground(UIManager.getColor("Button.background"));
		// btnNewButton_7.setBounds(0, 0, 137, 55);
		// panel_3.add(btnNewButton_7);
		//
		// JButton btnNewButton_8 = new JButton("库存盘点");
		// btnNewButton_8.setBackground(UIManager.getColor("Button.background"));
		// btnNewButton_8.setBounds(135, 0, 137, 55);
		// panel_3.add(btnNewButton_8);
		//
		// JButton btnNewButton_9 = new JButton("库存报警");
		// btnNewButton_9.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// }
		// });
		// btnNewButton_9.setBounds(271, 0, 130, 55);
		// panel_3.add(btnNewButton_9);
		//
		// JButton btnNewButton_12 = new JButton("库区调整");
		// btnNewButton_12.setBackground(UIManager.getColor("Button.background"));
		// btnNewButton_12.setBounds(400, 0, 137, 55);
		// panel_3.add(btnNewButton_12);
		//
		// JButton button = new JButton("库存信息初始化");
		// button.setBackground(new Color(255, 248, 220));
		// button.setBounds(536, 0, 130, 55);
		// panel_3.add(button);

		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);

		String names[] = { "快递编号", "入库日期", "目的地", "区号", "排号", "架号", "位号" };
		name = new Vector<String>(Arrays.asList(names));
		table = new JTable(data, name);
		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(29, 88, 444, 300);
		this.add(JSP);

		label = new JLabel("快递编号:");
		label.setBounds(519, 122, 57, 15);
		this.add(label);

		textField = new JTextField();
		textField.setBounds(588, 116, 122, 27);
		this.add(textField);
		textField.setColumns(10);

		label_1 = new JLabel("目的地:");
		label_1.setBounds(519, 161, 57, 15);
		this.add(label_1);

		textField_1 = new JTextField();
		textField_1.setBounds(588, 155, 122, 27);
		this.add(textField_1);
		textField_1.setColumns(10);

		label_2 = new JLabel("入库时间:");
		label_2.setBounds(485, 188, 57, 15);
		this.add(label_2);

		comboBox = new JComboBox<Object>();
		comboBox.setBounds(598, 183, 57, 25);
		this.add(comboBox);

		label_3 = new JLabel("年");
		label_3.setBounds(661, 188, 12, 15);
		this.add(label_3);

		comboBox_1 = new JComboBox<Object>();
		comboBox_1.setBounds(519, 215, 57, 25);
		this.add(comboBox_1);

		label_4 = new JLabel("月");
		label_4.setBounds(588, 224, 12, 15);
		this.add(label_4);

		comboBox_2 = new JComboBox<Object>();
		comboBox_2.setBounds(624, 219, 57, 25);
		this.add(comboBox_2);

		label_5 = new JLabel("日");
		label_5.setBounds(688, 224, 12, 15);
		this.add(label_5);

		label_6 = new JLabel("位置:");
		label_6.setBounds(485, 261, 57, 15);
		this.add(label_6);

		comboBox_3 = new JComboBox<Object>();
		comboBox_3.setBounds(521, 256, 57, 25);
		this.add(comboBox_3);

		comboBox_4 = new JComboBox<Object>();
		comboBox_4.setBounds(624, 256, 57, 25);
		this.add(comboBox_4);

		comboBox_5 = new JComboBox<Object>();
		comboBox_5.setBounds(521, 293, 57, 25);
		this.add(comboBox_5);

		label_7 = new JLabel("区");
		label_7.setBounds(588, 261, 12, 15);
		this.add(label_7);

		label_8 = new JLabel("排");
		label_8.setBounds(688, 261, 12, 15);
		this.add(label_8);

		label_9 = new JLabel("架");
		label_9.setBounds(588, 298, 12, 15);
		this.add(label_9);

		comboBox_6 = new JComboBox<Object>();
		comboBox_6.setBounds(624, 293, 57, 25);
		this.add(comboBox_6);

		label_10 = new JLabel("位");
		label_10.setBounds(688, 298, 12, 15);
		this.add(label_10);

		button_1 = new JButton("新增");
		button_1.setBounds(506, 361, 94, 27);
		button_1.addActionListener(warehouseListener50);
		this.add(button_1);

		button_2 = new JButton("清空");
		button_2.setBounds(616, 361, 94, 27);
		button_2.addActionListener(warehouseListener50);
		this.add(button_2);

		button_3 = new JButton("完成");
		button_3.setBounds(29, 49, 94, 27);
		button_3.addActionListener(warehouseListener50);
		this.add(button_3);

		button = new JButton("删除");
		button.setBounds(379, 49, 94, 27);
		button.addActionListener(warehouseListener50);
		add(button);
	}

	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public JTable getTable() {
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

	public JComboBox<?> getComboBox() {
		return comboBox;
	}

	public JComboBox<?> getComboBox_1() {
		return comboBox_1;
	}

	public JComboBox<?> getComboBox_2() {
		return comboBox_2;
	}

	public JComboBox<?> getComboBox_3() {
		return comboBox_3;
	}

	public JComboBox<?> getComboBox_4() {
		return comboBox_4;
	}

	public JComboBox<?> getComboBox_5() {
		return comboBox_5;
	}

	public JComboBox<?> getComboBox_6() {
		return comboBox_6;
	}

	public DefaultTableModel getModel() {
		return model;
	}
}
