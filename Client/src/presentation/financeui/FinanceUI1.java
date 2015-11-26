package presentation.financeui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.UIManager;

import listener.financelistener.FinanceListener1;

public class FinanceUI1 extends JPanel {

	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JComboBox<?> comboBox;
	private JComboBox<?> comboBox_1;
	private JComboBox<?> comboBox_2;
	private JComboBox<?> comboBox_3;
	private JButton button;
	private Vector<String> name;
	private Vector<Object> data;
	private JTable table;
	private JScrollPane JSP;
	FinanceListener1 financeListener1;

	public FinanceUI1() {
		financeListener1 = new FinanceListener1(this);
		initialize();
	}

	private void initialize() {

		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);

		String names[] = { "日期", "收款单位", "收款人", "收款地点", "收款金额" };
		name = new Vector<String>(Arrays.asList(names));
		table = new JTable(data, name);
		JSP = new JScrollPane(table);
		JSP.setBounds(88, 84, 502, 300);
		this.add(JSP);

		comboBox = new JComboBox<Object>();
		comboBox.setBounds(127, 34, 61, 25);
		this.add(comboBox);

		comboBox_1 = new JComboBox<Object>();
		comboBox_1.setBounds(200, 34, 61, 25);
		this.add(comboBox_1);

		comboBox_2 = new JComboBox<Object>();
		comboBox_2.setBounds(273, 34, 61, 25);
		this.add(comboBox_2);

		comboBox_3 = new JComboBox<Object>();
		comboBox_3.setBounds(408, 34, 85, 25);
		this.add(comboBox_3);

		label = new JLabel("营业厅:");
		label.setBounds(364, 39, 57, 15);
		this.add(label);

		label_1 = new JLabel("年");
		label_1.setBounds(189, 39, 12, 15);
		this.add(label_1);

		label_2 = new JLabel("月");
		label_2.setBounds(261, 39, 12, 15);
		this.add(label_2);

		label_3 = new JLabel("日");
		label_3.setBounds(335, 39, 17, 15);
		this.add(label_3);

		label_4 = new JLabel("合计:");
		label_4.setBounds(661, 281, 57, 15);
		this.add(label_4);

		label_5 = new JLabel("日期:");
		label_5.setBounds(88, 39, 57, 15);
		this.add(label_5);

		button = new JButton("查看");
		button.setBounds(505, 33, 85, 27);
		button.addActionListener(financeListener1);
		add(button);
	}
}
