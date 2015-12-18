/**
 * SellingAreaUI2是SellingArea用户的收款界面
 */

package presentation.sellingareaui;

import java.awt.Color;
import java.awt.Image;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import listener.sellingarealistener.SellingAreaListener20;
import javax.swing.JComboBox;

public class SellingAreaUI2 extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;
	private JTable table;
	private JScrollPane JSP;
	private Vector<String> name;
	private Vector<Object> data;
	private DefaultTableModel model;
	private JTable table1;
	private JScrollPane JSP1;
	private Vector<String> name1;
	private Vector<Object> data1;
	private DefaultTableModel model1;

	SellingAreaListener20 sellingarealistener;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;

	/**
	 * Create the application.
	 * 
	 * @param j
	 * @param i
	 */
	public SellingAreaUI2(int i, int j) {
		sellingarealistener = new SellingAreaListener20(this);
		width = i;
		height = j;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setBackground(new Color(158, 211, 238));
		this.setBounds(136, 114, 742, 533);
		this.setLayout(null);

		String names[] = { "收款日期", "收款金额", "收款快递员" };
		name = new Vector<String>(Arrays.asList(names));
		table = new JTable(data, name);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.addMouseListener(sellingarealistener);
		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(28, 58, 370, 298);
		this.add(JSP);

		String names1[] = { "快递订单条形码号" };
		name1 = new Vector<String>(Arrays.asList(names1));
		table1 = new JTable(data1, name1);
		table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table1.addMouseListener(sellingarealistener);
		model1 = (DefaultTableModel) table1.getModel();
		JSP1 = new JScrollPane(table1);
		JSP1.setBounds(398, 58, 236, 298);
		this.add(JSP1);

		JLabel label = new JLabel("收款日期：");
		label.setBounds(28, 368, 79, 16);
		add(label);

		textField = new JTextField();
		textField.setBounds(100, 362, 108, 28);
		add(textField);
		textField.setColumns(10);

		JLabel label_1 = new JLabel("收款金额：");
		label_1.setBounds(28, 401, 73, 16);
		add(label_1);

		textField_1 = new JTextField();
		textField_1.setBounds(100, 396, 108, 28);
		add(textField_1);
		textField_1.setColumns(10);

		JLabel label_2 = new JLabel("收款快递员：");
		label_2.setBounds(28, 436, 88, 16);
		add(label_2);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(100, 430, 108, 28);
		add(textField_2);

		JLabel label_3 = new JLabel("条形码号：");
		label_3.setBounds(338, 368, 79, 16);
		add(label_3);

		textField_3 = new JTextField();
		textField_3.setBounds(398, 362, 134, 28);
		add(textField_3);
		textField_3.setColumns(10);

		button = new JButton("新增收款单");
		button.setBounds(220, 363, 93, 29);
		button.addActionListener(sellingarealistener);
		add(button);

		button_1 = new JButton("修改收款单");
		button_1.setBounds(220, 396, 93, 29);
		button_1.addActionListener(sellingarealistener);
		add(button_1);

		button_2 = new JButton("删除收款单");
		button_2.setBounds(220, 431, 93, 29);
		button_2.addActionListener(sellingarealistener);
		add(button_2);

		button_3 = new JButton("添加");
		button_3.setBounds(527, 363, 60, 29);
		button_3.addActionListener(sellingarealistener);
		add(button_3);

		button_4 = new JButton("删除");
		button_4.setBounds(582, 363, 60, 29);
		button_4.addActionListener(sellingarealistener);
		add(button_4);

		button_5 = new JButton("保存");
		button_5.setBounds(28, 30, 60, 29);
		button_5.addActionListener(sellingarealistener);
		add(button_5);

		button_6 = new JButton("清空");
		button_6.setBounds(89, 30, 60, 29);
		button_6.addActionListener(sellingarealistener);
		add(button_6);
	}

	public void setData(Vector<Object> data) {
		this.data = data;
	}
	
	public void setData1(Vector<Object> data1) {
		this.data1 = data1;
	}

	public JTable getTable() {
		return table;
	}

	public Vector<Object> getData() {
		return data;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public JTable getTable1() {
		return table1;
	}

	public Vector<String> getName1() {
		return name1;
	}

	public Vector<Object> getData1() {
		return data1;
	}

	public DefaultTableModel getModel1() {
		return model1;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public JTextField getTextField_3() {
		return textField_3;
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

	public JButton getButton_4() {
		return button_4;
	}

	public JButton getButton_5() {
		return button_5;
	}

	public JButton getButton_6() {
		return button_6;
	}
}
