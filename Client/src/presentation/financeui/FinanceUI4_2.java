package presentation.financeui;

import java.awt.Color;
import java.awt.Image;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import listener.financelistener.FinanceListener4;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class FinanceUI4_2 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JLabel label_1;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JTable table;
	private JScrollPane JSP;
	private Vector<String> name;
	private Vector<Object> data;
	private DefaultTableModel model;
	private JTextField textField;
	private JTextField textField_1;
	FinanceListener4 financeListener4;
	private JButton button_5;
	private int height = 600;
	private int width = 900;
	private JLabel label1;

	/**
	 * Create the panel.
	 */
	public FinanceUI4_2(FinanceListener4 financeListener4) {
		this.financeListener4 = financeListener4;
		initialize();
		//this.setImage();
		this.setVisible(true);
	}

	private void initialize() {
		setBackground(Color.white);
		this.setLayout(null);
		 this.setBackground(new Color(158,211,240));
		String names[] = { "账户", "余额" };
		name = new Vector<String>(Arrays.asList(names));
		table = new JTable(data, name);
		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(33, 87, 444, 298);
		this.add(JSP);

		label = new JLabel("账户：");
		label.setBounds(489, 147, 39, 16);
		add(label);

		textField = new JTextField();
		textField.setBounds(526, 141, 175, 28);
		add(textField);
		textField.setColumns(10);

		label_1 = new JLabel("余额：");
		label_1.setBounds(489, 187, 39, 16);
		add(label_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(526, 181, 175, 28);
		add(textField_1);

		button = new JButton("新增");
		button.setBounds(526, 241, 80, 29);
		button.addActionListener(financeListener4);
		add(button);

		button_1 = new JButton("清空");
		button_1.setBounds(621, 241, 80, 29);
		button_1.addActionListener(financeListener4);
		add(button_1);

		button_2 = new JButton("删除");
		button_2.setBounds(526, 288, 80, 29);
		button_2.addActionListener(financeListener4);
		add(button_2);

		button_3 = new JButton("保存");
		button_3.setBounds(621, 288, 80, 29);
		button_3.addActionListener(financeListener4);
		add(button_3);

		button_4 = new JButton("返回");
		button_4.setBounds(33, 46, 80, 29);
		button_4.addActionListener(financeListener4);
		add(button_4);

		button_5 = new JButton("清空银行账户");
		button_5.setBounds(553, 100, 117, 29);
		add(button_5);
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

	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
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

	public DefaultTableModel getModel() {
		return model;
	}

	public void setData(Vector<Object> data) {
		this.data = data;
	}
	private void setImage() {

	}
}
