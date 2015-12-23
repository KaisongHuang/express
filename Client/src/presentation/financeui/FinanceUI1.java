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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;

import listener.financelistener.FinanceListener1;
import presentation.MySwing.Button;

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
	private JComboBox<?> comboBox;
	private JComboBox<?> comboBox_1;
	private JComboBox<?> comboBox_2;
	private JComboBox<?> comboBox_3;
	private Button search;
	private JTextArea textArea;
	private Vector<String> name;
	private Vector<Object> data;
	private JTable table;
	private JScrollPane JSP;
	private int height = 900;
	private int width = 600;
	private JLabel label1;
	FinanceListener1 financeListener1;

	public FinanceUI1() {
		financeListener1 = new FinanceListener1(this);
		initialize();
		//this.setImage();
		this.setVisible(true);
	}

	private void initialize() {
		setBackground(Color.white);
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);

		String names[] = { "收款日期", "收款单位", "收款快递员", "收款金额" };
		name = new Vector<String>(Arrays.asList(names));
		table = new JTable(data, name);
		JSP = new JScrollPane(table);
		JSP.setBounds(88, 84, 502, 300);
		this.add(JSP);

		comboBox = new JComboBox<Object>();
		comboBox.setBounds(127, 34, 61, 25);
//		comboBox.setSelectedIndex(0);
		this.add(comboBox);

		comboBox_1 = new JComboBox<Object>();
		comboBox_1.setBounds(200, 34, 61, 25);
//		comboBox_1.setSelectedIndex(0);
		this.add(comboBox_1);

		comboBox_2 = new JComboBox<Object>();
		comboBox_2.setBounds(273, 34, 61, 25);
//		comboBox_2.setSelectedIndex(0);
		this.add(comboBox_2);

		comboBox_3 = new JComboBox<Object>();
		comboBox_3.setBounds(408, 34, 85, 25);
//		comboBox_3.setSelectedIndex(0);
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
		label_4.setBounds(451, 395, 57, 15);
		this.add(label_4);

		label_5 = new JLabel("日期:");
		label_5.setBounds(88, 39, 57, 15);
		this.add(label_5);

		search = new Button("查看");
		search.setBounds(505, 33, 85, 27);
		search.addActionListener(financeListener1);
		add(search);

		textArea = new JTextArea();
		textArea.setBounds(484, 389, 106, 27);
		textArea.setEditable(false);
		add(textArea);
	}

	public JComboBox<?> getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox<?> comboBox) {
		this.comboBox = comboBox;
	}

	public JComboBox<?> getComboBox_1() {
		return comboBox_1;
	}

	public void setComboBox_1(JComboBox<?> comboBox_1) {
		this.comboBox_1 = comboBox_1;
	}

	public JComboBox<?> getComboBox_2() {
		return comboBox_2;
	}

	public void setComboBox_2(JComboBox<?> comboBox_2) {
		this.comboBox_2 = comboBox_2;
	}

	public JComboBox<?> getComboBox_3() {
		return comboBox_3;
	}

	public void setComboBox_3(JComboBox<?> comboBox_3) {
		this.comboBox_3 = comboBox_3;
	}

	public Button getSearch() {
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

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}
	private void setImage() {
		
	}
	
}
