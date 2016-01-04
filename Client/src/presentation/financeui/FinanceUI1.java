/**
 * FinanceUI1是finance用户的结算界面
 */

package presentation.financeui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Image;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import com.eltima.components.ui.DatePicker;

import javax.swing.JScrollPane;
import listener.financelistener.FinanceListener1;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyComboBox;
import presentation.MySwing.MyDatePicker;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTable;

public class FinanceUI1 extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private MyComboBox<String> comboBox;
	private MyComboBox<String> comboBox_1;
	private MyComboBox<String> comboBox_2;
	private MyComboBox<String> comboBox_3;
	private MyButton search;
	private JTextArea textArea;
	private Vector<String> name;
	private Vector<Object> data;
	private DefaultTableModel model;
	private MyTable table;
	private JScrollPane JSP;
	private int height = 900;
	private int width = 600;
	private MyDialog dialog;
	FinanceListener1 financeListener1;

	private DatePicker mdp;

	public FinanceUI1() {
		financeListener1 = new FinanceListener1(this);
		initialize();
		//this.setImage();
		this.setVisible(true);
	}

	private void initialize() {
		setBackground(Color.white);
		this.setBounds(136, 115,720,480);
		this.setLayout(null);

		dialog=new MyDialog();
		this.add(dialog);

		String names[] = { "收款日期", "收款单位", "收款快递员", "收款金额" };
		name = new Vector<String>(Arrays.asList(names));
		table = new MyTable(data, name);
		table.setSelectionForeground(Color.BLACK);
		table.setSelectionBackground(new Color(210, 240, 255));
		table.setEditableColumn(-1);
		table.setEditableRow(-1);
		table.setFocusable(false);
		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(88, 84, 502, 300);
		this.add(JSP);

		mdp = new DatePicker(this);
		mdp.setBounds(134, 47, 106, 25);
		this.add(mdp);

//		comboBox = new MyComboBox<String>();
//		comboBox.setBounds(120, 34, 91, 25);
//		comboBox.addItem("2015");
//
////		comboBox.setSelectedIndex(0);
//		this.add(comboBox);
//
//		comboBox_1 = new MyComboBox<String>();
//		comboBox_1.setBounds(223, 34, 68, 25);
//		comboBox_1.addItem("01");
//
////		comboBox_1.setSelectedIndex(0);
//		this.add(comboBox_1);
//
//		comboBox_2 = new MyComboBox<String>();
//		comboBox_2.setBounds(297, 34, 68, 25);
//		comboBox_2.addItem("01");
////		comboBox_2.setSelectedIndex(0);
//		this.add(comboBox_2);

		comboBox_3 = new MyComboBox<String>();
		comboBox_3.setBounds(348, 47, 145, 25);
		comboBox_3.addItem("南京鼓楼营业厅4");
//		comboBox_3.setSelectedIndex(0);
		this.add(comboBox_3);

		label = new JLabel("营业厅:");
		label.setBounds(296, 51, 57, 15);
		this.add(label);

//		label_1 = new JLabel("年");
//		label_1.setBounds(209, 38, 22, 15);
//		this.add(label_1);
//
//		label_2 = new JLabel("月");
//		label_2.setBounds(285, 38, 13, 15);
//		this.add(label_2);
//
//		label_3 = new JLabel("日");
//		label_3.setBounds(360, 38, 17, 15);
//		this.add(label_3);

		label_4 = new JLabel("合计:");
		label_4.setBounds(451, 395, 57, 15);
		this.add(label_4);

		label_5 = new JLabel("日期:");
		label_5.setBounds(88, 57, 57, 15);
		this.add(label_5);

		search = new MyButton("查看");
		search.setBounds(505, 45, 85, 27);
		search.addActionListener(financeListener1);
		search.addMouseListener(financeListener1);;
		add(search);

		textArea = new JTextArea();
		textArea.setBounds(484, 389, 106, 27);
		textArea.setEditable(false);
		add(textArea);
	}
	public void setText(String s){
		dialog.setText(s);
	}
	public void setErrorText(String s){
		dialog.setErrorText(s);
	}
	public DefaultTableModel getModel() {
		return model;
	}

	public MyComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(MyComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}

	public MyComboBox<String> getComboBox_1() {
		return comboBox_1;
	}

	public void setComboBox_1(MyComboBox<String> comboBox_1) {
		this.comboBox_1 = comboBox_1;
	}

	public MyComboBox<String> getComboBox_2() {
		return comboBox_2;
	}

	public void setComboBox_2(MyComboBox<String> comboBox_2) {
		this.comboBox_2 = comboBox_2;
	}

	public MyComboBox<String> getComboBox_3() {
		return comboBox_3;
	}

	public void setComboBox_3(MyComboBox<String> comboBox_3) {
		this.comboBox_3 = comboBox_3;
	}

	public MyButton getSearch() {
		return search;
	}



	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public Vector<Object> getData() {
		return data;
	}

	public void setData(Vector<Object> data) {
		this.data = data;
	}

	public MyTable getTable() {
		return table;
	}

	public void setTable(MyTable table) {
		this.table = table;
	}
	private void setImage() {

	}

	public DatePicker getMdp() {
		return mdp;
	}

}
