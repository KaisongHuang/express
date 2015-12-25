package presentation.financeui;

import java.awt.Color;
import java.awt.Image;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import listener.financelistener.FinanceListener4;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyTable;

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
	private MyButton add;
	private MyButton clear;
	private MyButton delete;
	private MyButton save;
	private MyButton ret;
	private MyTable table;
	private JScrollPane JSP;
	private Vector<String> name;
	private Vector<Object> data;
	private DefaultTableModel model;
	private JTextField textField;
	private JTextField textField_1;
	FinanceListener4 financeListener4;
	private MyButton clearAll;
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
	
		String names[] = { "账户", "余额" };
		name = new Vector<String>(Arrays.asList(names));
		table = new MyTable(data, name);
		table.setSelectionForeground(Color.BLACK);
		table.setSelectionBackground(new Color(210, 240, 255));
		table.setEditableColumn(-1);
		table.setEditableRow(-1);
		table.setFocusable(false);
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

		add = new MyButton("新增");
		add.setBounds(526, 241, 80, 29);
		add.addActionListener(financeListener4);
		add.addMouseListener(financeListener4);
		add(add);

		clear = new MyButton("清空");
		clear.setBounds(621, 241, 80, 29);
		clear.addActionListener(financeListener4);
		clear.addMouseListener(financeListener4);
		add(clear);

		delete = new MyButton("删除");
		delete.setBounds(526, 288, 80, 29);
		delete.addActionListener(financeListener4);
		delete.addMouseListener(financeListener4);
		add(delete);

		save = new MyButton("保存");
		save.setBounds(621, 288, 80, 29);
		save.addActionListener(financeListener4);
		save.addMouseListener(financeListener4);
		add(save);

		ret = new MyButton("返回");
		ret.setBounds(33, 46, 80, 29);
		ret.addActionListener(financeListener4);
		ret.addMouseListener(financeListener4);
		add(ret);

		clearAll = new MyButton("清空银行账户");
		clearAll.setBounds(553, 100, 117, 29);
		add(clearAll);
		clearAll.addActionListener(financeListener4);
		clearAll.addMouseListener(financeListener4);
	}

	public MyTable getTable() {
		return table;
	}

	public MyButton getAdd() {
		return add;
	}

	public MyButton getClear() {
		return clear;
	}

	public MyButton getDelete() {
		return delete;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public MyButton getSave() {
		return save;
	}

	public MyButton getRet() {
		return ret;
	}

	public MyButton getClearAll() {
		return clearAll;
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
