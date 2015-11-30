package presentation.financeui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

import listener.financelistener.FinanceListener2;

public class FinanceUI2 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel label;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JComboBox<String> comboBox;
	private JButton btnNewButton;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button;
	private JTable table;
	private DefaultTableModel model;
	private JScrollPane JSP;
	private Vector<String> name;
	private Vector<Object> data;
	FinanceListener2 financeListener2;
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox_2;
	private JComboBox<String> comboBox_3;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;

	public FinanceUI2() {
		financeListener2 = new FinanceListener2(this);
		initialize();
	}

	private void initialize() {

		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);

		String names[] = { "付款日期", "付款账号", "付款人", "付款金额", "条目", "备注" };
		name = new Vector<String>(Arrays.asList(names));
		table = new JTable(data, name);
		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(29, 61, 444, 327);
		this.add(JSP);

		lblNewLabel_1 = new JLabel("付款日期:");
		lblNewLabel_1.setBounds(491, 65, 67, 15);
		this.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("付款金额:");
		lblNewLabel_2.setBounds(491, 132, 67, 15);
		this.add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setBounds(570, 126, 134, 28);
		this.add(textField_1);
		textField_1.setColumns(10);

		lblNewLabel_3 = new JLabel("付款人:");
		lblNewLabel_3.setBounds(491, 171, 61, 16);
		this.add(lblNewLabel_3);

		textField_2 = new JTextField();
		textField_2.setBounds(570, 166, 134, 28);
		this.add(textField_2);
		textField_2.setColumns(10);

		lblNewLabel_4 = new JLabel("付款账号:");
		lblNewLabel_4.setBounds(491, 211, 61, 16);
		this.add(lblNewLabel_4);

		textField_3 = new JTextField();
		textField_3.setBounds(570, 206, 134, 28);
		this.add(textField_3);
		textField_3.setColumns(10);

		lblNewLabel_5 = new JLabel("条目:");
		lblNewLabel_5.setBounds(491, 251, 61, 16);
		this.add(lblNewLabel_5);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(570, 246, 134, 27);
		this.add(comboBox);

		label = new JLabel("备注:");
		label.setBounds(491, 290, 61, 16);
		this.add(label);

		textField_4 = new JTextField();
		textField_4.setBounds(570, 285, 134, 28);
		this.add(textField_4);
		textField_4.setColumns(10);

		button = new JButton("新增");
		button.setBounds(570, 325, 67, 29);
		button.addActionListener(financeListener2);
		this.add(button);

		button_1 = new JButton("清空");
		button_1.setBounds(637, 325, 67, 29);
		button_1.addActionListener(financeListener2);
		this.add(button_1);

		button_2 = new JButton("查看成本收益表");
		button_2.setBounds(29, 20, 134, 29);
		button_2.addActionListener(financeListener2);
		this.add(button_2);

		btnNewButton = new JButton("删除");
		btnNewButton.setBounds(570, 361, 67, 27);
		btnNewButton.addActionListener(financeListener2);
		add(btnNewButton);

		button_3 = new JButton("完成");
		button_3.setBounds(637, 361, 67, 27);
		button_3.addActionListener(financeListener2);
		add(button_3);

		comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(570, 60, 122, 25);
		add(comboBox_1);

		comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(570, 89, 55, 25);
		add(comboBox_2);

		comboBox_3 = new JComboBox<String>();
		comboBox_3.setBounds(637, 89, 55, 25);
		add(comboBox_3);

		label_1 = new JLabel("年");
		label_1.setBounds(692, 65, 19, 15);
		add(label_1);

		label_2 = new JLabel("月");
		label_2.setBounds(624, 94, 19, 15);
		add(label_2);

		label_3 = new JLabel("日");
		label_3.setBounds(692, 94, 19, 15);
		add(label_3);
	}

	// public JTextField getTextField() {
	// return textField;
	// }

	public JComboBox<String> getComboBox_1() {
		return comboBox_1;
	}

	public JComboBox<String> getComboBox_2() {
		return comboBox_2;
	}

	public JComboBox<String> getComboBox_3() {
		return comboBox_3;
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

	public JTextField getTextField_4() {
		return textField_4;
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
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

	public JButton getButton() {
		return button;
	}

	public JTable getTable() {
		return table;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setData(Vector<Object> data) {
		this.data = data;
	}
}
