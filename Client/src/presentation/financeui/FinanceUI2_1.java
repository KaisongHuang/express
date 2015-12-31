package presentation.financeui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

import listener.financelistener.FinanceListener2_1;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyTable;

import java.awt.Font;
import java.util.Arrays;
import java.util.Vector;

public class FinanceUI2_1 extends JPanel {

	/**
	 * Create the panel.
	 */
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel income;
	private JLabel outcome;
	private JLabel balance;
	private Vector<String> name1;
	private Vector<Object> data1;
	private MyTable table1;
	private DefaultTableModel model1;
	private JScrollPane JSP1;
	private Vector<String> name2;
	private Vector<Object> data2;
	private MyTable table2;
	private DefaultTableModel model2;
	private JScrollPane JSP2;
	private MyButton button;
	private FinanceListener2_1 listener;

	public FinanceUI2_1() {
		listener=new FinanceListener2_1(this);
		init();
	}

	private void init() {
		setBackground(Color.WHITE);
		setLayout(null);

		String names1[] = { "付款日期","付款人", "付款金额", "条目" };
		name1 = new Vector<String>(Arrays.asList(names1));
		table1 = new MyTable(data1, name1);
		table1.setSelectionForeground(Color.BLACK);
		table1.setSelectionBackground(new Color(210, 240, 255));
		table1.setEditableColumn(-1);
		table1.setEditableRow(-1);
		table1.setFocusable(false);
		model1 = (DefaultTableModel) table1.getModel();
		JSP1 = new JScrollPane(table1);
		JSP1.setBounds(362, 70, 347, 270);
		this.add(JSP1);

		String names2[] = { "收款日期", "收款单位", "收款人", "收款金额" };
		name2 = new Vector<String>(Arrays.asList(names2));
		table2 = new MyTable(data2, name2);
		table2.setSelectionForeground(Color.BLACK);
		table2.setSelectionBackground(new Color(210, 240, 255));
		table2.setEditableColumn(-1);
		table2.setEditableRow(-1);
		table2.setFocusable(false);
		model2 = (DefaultTableModel) table2.getModel();
		JSP2 = new JScrollPane(table2);
		JSP2.setBounds(16, 70, 347, 270);
		this.add(JSP2);

		label = new JLabel("总收入：");
		label.setFont(new Font("Adobe Gothic Std", Font.PLAIN, 20));
		label.setBounds(18, 25, 114, 50);
		add(label);

		label_1 = new JLabel("总支出:");
		label_1.setFont(new Font("Adobe Gothic Std", Font.PLAIN, 20));
		label_1.setBounds(267, 25, 114, 50);
		add(label_1);

		income = new JLabel("吃");
		income.setBounds(96, 28, 100, 42);
		income.setForeground(new Color(96, 203, 151));
		income.setFont(new Font("Adobe Gothic Std", Font.PLAIN, 20));
		income.setHorizontalAlignment(JLabel.CENTER);
		add(income);

		outcome = new JLabel("土");
		outcome.setBounds(340, 28, 100, 42);
		outcome.setForeground(new Color(248, 190, 192));
		outcome.setFont(new Font("Adobe Gothic Std", Font.PLAIN, 20));
		outcome.setHorizontalAlignment(JLabel.CENTER);
		add(outcome);

		label_2 = new JLabel("－");
		label_2.setBounds(208, 35, 57, 50);
		label_2.setFont(new Font("Adobe Gothic Std", Font.PLAIN, 40));
		add(label_2);

		label_3 = new JLabel("＝");
		label_3.setBounds(440, 30, 61, 60);
		label_3.setFont(new Font("Adobe Gothic Std", Font.PLAIN, 40));
		add(label_3);

		label_4 = new JLabel("总利润:");
		label_4.setFont(new Font("Adobe Gothic Std", Font.PLAIN, 20));
		label_4.setBounds(493, 25, 114, 50);
		add(label_4);

		balance = new JLabel("了");
		balance.setBounds(566, 28, 112, 49);
		balance.setFont(new Font("Adobe Gothic Std", Font.PLAIN, 20));
		balance.setForeground(new Color(179, 216, 253));
		balance.setHorizontalAlignment(JLabel.CENTER);
		add(balance);

		label_5 = new JLabel("(元)");
		label_5.setFont(new Font("Adobe Gothic Std", Font.PLAIN, 20));
		label_5.setBounds(662, 25, 114, 50);
		add(label_5);
		
		button = new MyButton("刷新");
		button.setBounds(592, 352, 117, 29);
		button.addActionListener(listener);
		add(button);

	}

	public JLabel getIncome() {
		return income;
	}

	public JLabel getOutcome() {
		return outcome;
	}

	public JLabel getBalance() {
		return balance;
	}

	public MyTable getTable1() {
		return table1;
	}

	public DefaultTableModel getModel1() {
		return model1;
	}

	public MyTable getTable2() {
		return table2;
	}

	public DefaultTableModel getModel2() {
		return model2;
	}

	public MyButton getButton() {
		return button;
	}
}
