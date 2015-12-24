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
import presentation.MySwing.MyButton;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FinanceUI4_1 extends JPanel {

	/**
	 * 
	 */
	private MyButton ret;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel year;
	private JLabel month;
	private JLabel day;
	private static final long serialVersionUID = 1L;
	private JTable table;
	private DefaultTableModel model;
	private JScrollPane JSP;
	private Vector<String> name;
	private Vector<Object> data;
	FinanceListener4 financeListener4;
	private int height = 600;
	private int width = 900;
	private JLabel label1;

	/**
	 * Create the panel.
	 */
	public FinanceUI4_1(FinanceListener4 financeListener4) {
		this.financeListener4 = financeListener4;
		initialize();
		//this.setImage();
		this.setVisible(true);
	}

	private void initialize() {
		this.setLayout(null);
		setBackground(Color.white);
		String names[] = { "账户", "余额" };
		name = new Vector<String>(Arrays.asList(names));
		table = new JTable(data, name);
		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(80, 60, 444, 270);
		this.add(JSP);

		ret = new MyButton("返回");
		ret.setBounds(80, 19, 75, 29);
		ret.addActionListener(financeListener4);
		ret.addMouseListener(financeListener4);
		add(ret);

		label = new JLabel("建账日期：");
		label.setBounds(366, 342, 65, 16);
		add(label);

		year = new JLabel("2015");
		year.setBounds(428, 342, 38, 16);
		add(year);

		label_1 = new JLabel("/");
		label_1.setBounds(459, 342, 7, 16);
		add(label_1);

		month = new JLabel("01");
		month.setBounds(465, 342, 16, 16);
		add(month);

		label_2 = new JLabel("/");
		label_2.setBounds(480, 342, 7, 16);
		add(label_2);

		day = new JLabel("01");
		day.setBounds(486, 342, 16, 16);
		add(day);
	}

	public MyButton getRet() {
		return ret;
	}

	public void setData(Vector<Object> data) {
		this.data = data;
	}

	public DefaultTableModel getModel() {
		return model;
	}
}
