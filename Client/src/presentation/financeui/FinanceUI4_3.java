package presentation.financeui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

import java.awt.Color;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import listener.financelistener.FinanceListener4;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyTable;
import presentation.MySwing.MyTextField;

public class FinanceUI4_3 extends JPanel {

	private static final long serialVersionUID = 1L;
	private MyTextField textField;
	private JLabel label;
	private MyButton button_1;
	private MyButton button_2;
	private MyButton button_3;
	private MyButton button_4;
	private MyButton button_5;
	private MyButton button_6;
	private MyTable table;
	private JScrollPane JSP;
	private Vector<String> name;
	private Vector<Object> data;
	private DefaultTableModel model;
	private FinanceListener4 financeListener4;
	private MyTextField textField_1;
	private MyTextField textField_2;

	public FinanceUI4_3(FinanceListener4 financeListener4) {
		this.financeListener4 = financeListener4;
		initialize();
		// this.setImage();
		this.setVisible(true);
	}

	private void initialize() {
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		setBackground(Color.white);

		String names[] = { "账户", "余额" };
		name = new Vector<String>(Arrays.asList(names));
		table = new MyTable(data, name);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.addMouseListener(financeListener4);
		table.setSelectionForeground(Color.BLACK);
		table.setSelectionBackground(new Color(210, 240, 255));
		table.setEditableColumn(-1);
		table.setEditableRow(-1);
		table.setFocusable(false);
		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(82, 176, 340, 200);
		this.add(JSP);

		label = new JLabel("请输入银行账号关键字段:");
		label.setBounds(82, 113, 153, 15);
		this.add(label);

		textField = new MyTextField();
		textField.setBounds(247, 106, 175, 27);
		this.add(textField);
		textField.setColumns(10);

		button_3 = new MyButton("查询");
		button_3.setBounds(434, 108, 55, 27);
		button_3.addActionListener(financeListener4);
		button_3.addMouseListener(financeListener4);
		this.add(button_3);

		button_5 = new MyButton("修改");
		button_5.setBounds(533, 251, 57, 27);
		button_5.addActionListener(financeListener4);
		button_5.addMouseListener(financeListener4);
		this.add(button_5);

		button_6 = new MyButton("删除");
		button_6.setBounds(591, 251, 57, 27);
		button_6.addActionListener(financeListener4);
		button_6.addMouseListener(financeListener4);
		this.add(button_6);

		button_4 = new MyButton("新增");
		button_4.setBounds(473, 251, 57, 27);
		button_4.addActionListener(financeListener4);
		button_4.addMouseListener(financeListener4);
		this.add(button_4);

		button_1 = new MyButton("期初建账");
		button_1.setBounds(188, 53, 94, 27);
		button_1.addActionListener(financeListener4);
		button_1.addMouseListener(financeListener4);
		this.add(button_1);

		button_2 = new MyButton("期初信息");
		button_2.setBounds(82, 53, 94, 27);
		button_2.addActionListener(financeListener4);
		button_2.addMouseListener(financeListener4);
		this.add(button_2);

		JLabel label_1 = new JLabel("账户：");
		label_1.setBounds(434, 177, 44, 16);
		add(label_1);

		JLabel label_2 = new JLabel("余额：");
		label_2.setBounds(434, 217, 44, 16);
		add(label_2);

		textField_1 = new MyTextField();
		textField_1.setBounds(473, 171, 175, 28);
		add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new MyTextField();
		textField_2.setBounds(475, 211, 173, 28);
		add(textField_2);
		textField_2.setColumns(10);

	}

	public MyTable getTable() {
		return table;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public MyTextField getTextField_1() {
		return textField_1;
	}

	public MyTextField getTextField_2() {
		return textField_2;
	}

	public void setData(Vector<Object> data) {
		this.data = data;
	}

	public MyTextField getTextField() {
		return textField;
	}

	public MyButton getButton_1() {
		return button_1;
	}

	public MyButton getButton_2() {
		return button_2;
	}

	public MyButton getButton_3() {
		return button_3;
	}

	public MyButton getButton_4() {
		return button_4;
	}

	public MyButton getButton_5() {
		return button_5;
	}

	public MyButton getButton_6() {
		return button_6;
	}

	private void setImage() {

	}
}