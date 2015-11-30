package presentation.financeui;

import java.util.Arrays;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
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
	private JTable table;
	private JScrollPane JSP;
	private Vector<String> name;
	private Vector<Object> data;
	private DefaultTableModel model;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public FinanceUI4_2() {
		initialize();
	}

	private void initialize() {
		this.setLayout(null);
		String names[] = { "账户", "余额" };
		name = new Vector<String>(Arrays.asList(names));
		table = new JTable(data, name);
		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(33, 87, 444, 298);
		this.add(JSP);

		label = new JLabel("账户：");
		label.setBounds(489, 121, 39, 16);
		add(label);

		textField = new JTextField();
		textField.setBounds(526, 115, 175, 28);
		add(textField);
		textField.setColumns(10);

		label_1 = new JLabel("余额：");
		label_1.setBounds(489, 149, 39, 16);
		add(label_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(526, 143, 175, 28);
		add(textField_1);

		button = new JButton("新增");
		button.setBounds(526, 200, 80, 29);
		add(button);

		button_1 = new JButton("清空");
		button_1.setBounds(621, 200, 80, 29);
		add(button_1);

		button_2 = new JButton("删除");
		button_2.setBounds(526, 241, 80, 29);
		add(button_2);

		button_3 = new JButton("保存");
		button_3.setBounds(621, 241, 80, 29);
		add(button_3);
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setData(Vector<Object> data) {
		this.data = data;
	}
}
