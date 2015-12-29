/**
 * FinanceUI3是finance用户的统计报表界面
 */

package presentation.financeui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import listener.financelistener.FinanceListener3;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyTable;

import javax.swing.JLabel;

import java.awt.Color;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class FinanceUI3 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel label;
	private JLabel lblRi;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox_2;
	private JComboBox<String> comboBox_3;
	private JComboBox<String> comboBox_4;
	private JComboBox<String> comboBox_5;
	private MyButton search;
	private Vector<String> name1;
	private Vector<Object> data1;
	private MyTable table1;
	private DefaultTableModel model1;
	private JScrollPane JSP1;
	private Vector<String> name2;
	private Vector<Object> data2;
	private MyTable table2;
	private DefaultTableModel model2;

	private MyButton export;
	private JScrollPane JSP2;
	FinanceListener3 financeListener3;
	private JLabel label1;
	private int height = 600;
	private int width = 900;

	public FinanceUI3() {
		financeListener3 = new FinanceListener3(this);
		initialize();
		// this.setImage();
		this.setVisible(true);
	}

	private void initialize() {
		setBackground(Color.white);
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);

		String names1[] = { "付款日期", "付款账号", "付款人", "付款金额", "条目", "备注" };
		name1 = new Vector<String>(Arrays.asList(names1));
		table1 = new MyTable(data1, name1);
		table1.setSelectionForeground(Color.BLACK);
		table1.setSelectionBackground(new Color(210, 240, 255));
		table1.setEditableColumn(-1);
		table1.setEditableRow(-1);
		table1.setFocusable(false);
		model1 = (DefaultTableModel) table1.getModel();
		JSP1 = new JScrollPane(table1);
		JSP1.setBounds(90, 79, 530, 175);
		this.add(JSP1);

		export=new MyButton("导出");
		export.setBounds(528,52,92,25);
		this.add(export);
		
		String names2[] = { "收款日期", "收款单位", "收款快递员", "收款金额" };
		name2 = new Vector<String>(Arrays.asList(names2));
		table2 = new MyTable(data2, name2);
		table2.setSelectionForeground(Color.BLACK);
		table2.setSelectionBackground(new Color(210, 240, 255));
		table2.setEditableColumn(-1);
		table2.setEditableRow(-1);
		table2.setFocusable(false);
		model2 = (DefaultTableModel) table2.getModel();
		JSP2 = new JScrollPane(table2);
		JSP2.setBounds(90, 257, 530, 175);
		this.add(JSP2);

		lblNewLabel_1 = new JLabel("开始日期:");
		lblNewLabel_1.setBounds(90, 25, 57, 15);
		this.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("结束日期:");
		lblNewLabel_2.setBounds(90, 52, 57, 15);
		this.add(lblNewLabel_2);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(159, 20, 87, 25);
		comboBox.addItem("2015");
		this.add(comboBox);

		lblNewLabel_3 = new JLabel("年");
		lblNewLabel_3.setBounds(258, 25, 20, 15);
		this.add(lblNewLabel_3);

		comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(278, 20, 80, 25);
		comboBox_1.addItem("01");
		this.add(comboBox_1);

		label = new JLabel("月");
		label.setBounds(370, 25, 20, 15);
		this.add(label);

		comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(402, 20, 80, 25);
		comboBox_2.addItem("01");
		this.add(comboBox_2);

		lblRi = new JLabel("日");
		lblRi.setBounds(494, 25, 20, 15);
		this.add(lblRi);

		comboBox_3 = new JComboBox<String>();
		comboBox_3.setBounds(159, 47, 87, 25);
		comboBox_3.addItem("2015");
		this.add(comboBox_3);

		comboBox_4 = new JComboBox<String>();
		comboBox_4.setBounds(278, 47, 80, 25);
		comboBox_4.addItem("01");
		this.add(comboBox_4);

		comboBox_5 = new JComboBox<String>();
		comboBox_5.setBounds(402, 47, 80, 25);
		comboBox_5.addItem("01");
		this.add(comboBox_5);

		label_1 = new JLabel("年");
		label_1.setBounds(258, 52, 57, 15);
		this.add(label_1);

		label_2 = new JLabel("月");
		label_2.setBounds(370, 52, 57, 15);
		this.add(label_2);

		label_3 = new JLabel("日");
		label_3.setBounds(494, 52, 20, 15);
		this.add(label_3);

		search = new MyButton("查看");
		search.setBounds(526, 20, 94, 27);
		search.addActionListener(financeListener3);
		search.addMouseListener(financeListener3);
		this.add(search);
		
		export.addActionListener(financeListener3);
	}

	public MyTable getTable1() {
		return table1;
	}

	public MyButton getExport(){
		return export;
	}
	public MyTable getTable2() {
		return table2;
	}

	public void setData1(Vector<Object> data1) {
		this.data1 = data1;
	}

	public void setData2(Vector<Object> data2) {
		this.data2 = data2;
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public JComboBox<String> getComboBox_1() {
		return comboBox_1;
	}

	public JComboBox<String> getComboBox_2() {
		return comboBox_2;
	}

	public JComboBox<String> getComboBox_3() {
		return comboBox_3;
	}

	public JComboBox<String> getComboBox_4() {
		return comboBox_4;
	}

	public JComboBox<String> getComboBox_5() {
		return comboBox_5;
	}

	public MyButton getSearch() {
		return search;
	}

	public DefaultTableModel getModel1() {
		return model1;
	}

	public DefaultTableModel getModel2() {
		return model2;
	}
}
