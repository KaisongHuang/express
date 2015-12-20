package presentation.financeui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Image;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import listener.financelistener.FinanceListener4;

public class FinanceUI4_3 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JLabel label;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JTable table;
	private JScrollPane JSP;
	private Vector<String> name;
	private Vector<Object> data;
	private DefaultTableModel model;
	private FinanceListener4 financeListener4;
	private JTextField textField_1;
	private JTextField textField_2;


	public FinanceUI4_3(FinanceListener4 financeListener4) {
		this.financeListener4=financeListener4;
		initialize();
		//this.setImage();
		this.setVisible(true);
	}

	private void initialize() {
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		setBackground(Color.white);
		
		String names[] = { "账户", "余额" };
		name = new Vector<String>(Arrays.asList(names));

		table = new JTable(data, name);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.addMouseListener(financeListener4);

		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(82, 176, 340, 200);
		this.add(JSP);

		label = new JLabel("请输入银行账号关键字段:");
		label.setBounds(82, 113, 153, 15);
		this.add(label);

		textField = new JTextField();
		textField.setBounds(247, 106, 175, 27);
		this.add(textField);
		textField.setColumns(10);

		button_3 = new JButton("查询");
		button_3.setBounds(434, 108, 55, 27);
		button_3.addActionListener(financeListener4);
		this.add(button_3);

		button_5 = new JButton("修改");
		button_5.setBounds(533, 251, 57, 27);
		button_5.addActionListener(financeListener4);
		this.add(button_5);

		button_6 = new JButton("删除");
		button_6.setBounds(591, 251, 57, 27);
		button_6.addActionListener(financeListener4);
		this.add(button_6);

		button_4 = new JButton("新增");
		button_4.setBounds(473, 251, 57, 27);
		button_4.addActionListener(financeListener4);
		this.add(button_4);

		button_1 = new JButton("期初建账");
		button_1.setBounds(188, 53, 94, 27);
		button_1.addActionListener(financeListener4);
		this.add(button_1);

		button_2 = new JButton("期初信息");
		button_2.setBounds(82, 53, 94, 27);
		button_2.addActionListener(financeListener4);
		this.add(button_2);

		JLabel label_1 = new JLabel("账户：");
		label_1.setBounds(434, 177, 44, 16);
		add(label_1);

		JLabel label_2 = new JLabel("余额：");
		label_2.setBounds(434, 217, 44, 16);
		add(label_2);

		textField_1 = new JTextField();
		textField_1.setBounds(473, 171, 175, 28);
		add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(475, 211, 173, 28);
		add(textField_2);
		textField_2.setColumns(10);

	}

	public JTable getTable() {
		return table;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setData(Vector<Object> data) {
		this.data = data;
	}

	public JTextField getTextField() {
		return textField;
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
	private void setImage() {
		
	}
}