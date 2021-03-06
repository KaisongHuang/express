/**
 * CentreUI1是centre用户的中转转出航运界面
 */

package presentation.centreui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Arrays;
import java.util.Vector;

import listener.centrelistener.CentreListener1;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyComboBox;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTable;
import presentation.MySwing.MyTextField;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import _enum.EmployeeMes;

public class CentreUI1 extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private MyTextField textField;
	private MyTextField textField_1;
	private MyTextField textField_2;
	private MyTextField textField_3;
	private MyTextField textField_4;
	private MyTextField textField_5;
	private MyTextField textField_6;
	private MyTextField textField_8;
	private JPanel panel;
    private MyDialog dialog;
	private MyButton confirm;
	private MyButton cancle;
	private MyButton myButton;
	private MyButton myButton_1;
	private MyButton myButton_2;
	private MyButton myButton_3;
	private MyComboBox<String> comboBox;

	private MyTable table;
	private JScrollPane JSP;
	private Vector<String> name;
	private Vector<Object> data;
	private DefaultTableModel model;

	private CentreListener1 centrelistener;
	private int width;
	private int height;
	private JLabel label_1;

	/**
	 * Create the application.
	 *
	 * @param j
	 * @param i
	 */
	public CentreUI1(int i, int j) {

		centrelistener = new CentreListener1(this);
		width = i;
		height = j;
		initialize();
		this.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setBounds(136, 116, 720,480);//437
		this.setBackground(Color.white);
		this.setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(720, 800));
		panel.setLayout(null);

		dialog=new MyDialog();
		this.add(dialog);
		JScrollPane scrollPane = new JScrollPane(panel);

		String names[] = { "中转单", "日期", "出发地","目的地","运输","班次","货柜号","监装员","费用","所有运单号" };
		name = new Vector<String>(Arrays.asList(names));
		table = new MyTable(data, name);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.addMouseListener(centrelistener);
		table.setSelectionForeground(Color.BLACK);
		table.setSelectionBackground(new Color(210, 240, 255));
		table.setEditableColumn(-1);
		table.setEditableRow(-1);
		table.setFocusable(false);
		table.hideColumn(9);
		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(28, 307, 685, 391);
		panel.add(JSP);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(73, 6, 476, 289);
		panel.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("装运日期：");
		lblNewLabel_2.setBounds(19, 44, 100, 18);
		panel_6.add(lblNewLabel_2);

		textField = new MyTextField();
		textField.setBounds(102, 38, 122, 30);
		panel_6.add(textField);
		textField.setColumns(10);

		textField_2 = new MyTextField();
		textField_2.setBounds(102, 140, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new MyTextField();
		textField_3.setBounds(348, 140, 122, 30);
		panel_6.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new MyTextField();
		textField_4.setBounds(102, 90, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("班次：");
		lblNewLabel_4.setBounds(19, 146, 100, 18);
		panel_6.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("货柜号：");
		lblNewLabel_5.setBounds(277, 146, 100, 18);
		panel_6.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("出发地：");
		lblNewLabel_6.setBounds(19, 96, 100, 18);
		panel_6.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("目的地：");
		lblNewLabel_7.setBounds(277, 96, 100, 18);
		panel_6.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("监装员：");
		lblNewLabel_8.setBounds(19, 200, 100, 18);
		panel_6.add(lblNewLabel_8);

		textField_5 = new MyTextField();
		textField_5.setBounds(348, 90, 122, 30);
		panel_6.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new MyTextField();
		textField_6.setBounds(102, 194, 122, 30);
		panel_6.add(textField_6);
		textField_6.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("费用：");
		lblNewLabel_10.setBounds(277, 200, 100, 18);
		panel_6.add(lblNewLabel_10);

		textField_8 = new MyTextField();
		textField_8.setBounds(348, 194, 122, 30);
		panel_6.add(textField_8);
		textField_8.setColumns(10);

		comboBox = new MyComboBox<String>();
		comboBox.setBounds(348, 41, 122, 27);
		comboBox.addItem("飞机");
		comboBox.addItem("火车");
		comboBox.addItem("汽车");
		panel_6.add(comboBox);

		JLabel label = new JLabel("装运方式:");
		label.setBounds(277, 45, 61, 16);
		panel_6.add(label);

		label_1 = new JLabel("中转单编号：");
		label_1.setBounds(19, 254, 86, 16);
		panel_6.add(label_1);

		textField_1 = new MyTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(102, 247, 122, 30);
		panel_6.add(textField_1);

		myButton_3 = new MyButton("本次装运所有运单号");
		myButton_3.setBounds(277, 247, 193, 30);
		panel_6.add(myButton_3);
		myButton_3.addActionListener(centrelistener);

		confirm = new MyButton("保存");
		confirm.setBounds(561, 172, 90, 30);
		panel.add(confirm);
		confirm.addActionListener(centrelistener);
		confirm.addMouseListener(centrelistener);

		cancle = new MyButton("清空");
		cancle.setBounds(561, 130, 90, 30);
		cancle.addActionListener(centrelistener);
		cancle.addMouseListener(centrelistener);
		panel.add(cancle);

		myButton = new MyButton("添加");
		myButton.setBounds(561, 46, 90, 30);
		myButton.addActionListener(centrelistener);
		myButton.addMouseListener(centrelistener);
		panel.add(myButton);

		myButton_1 = new MyButton("修改");
		myButton_1.setBounds(561, 88, 90, 30);
		myButton_1.addActionListener(centrelistener);
		myButton_1.addMouseListener(centrelistener);
		panel.add(myButton_1);

		myButton_2 = new MyButton("删除");
		myButton_2.setBounds(561, 214, 90, 30);
		myButton_2.addActionListener(centrelistener);
		myButton_2.addMouseListener(centrelistener);
		panel.add(myButton_2);

		scrollPane.setBounds(-10, -14, 746, 501);
		add(scrollPane);

	}
	public void setText(String s){
		dialog.setText(s);
	}

	public void setErrorText(String s){
		dialog.setErrorText(s);
	}
	public MyButton getMyButton_3() {
		return myButton_3;
	}

	public MyTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(MyTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public MyButton getMyButton() {
		return myButton;
	}

	public MyButton getMyButton_1() {
		return myButton_1;
	}

	public MyButton getMyButton_2() {
		return myButton_2;
	}

	public MyComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(MyComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}

	public MyTextField getTextField() {
		return textField;
	}

	public MyTextField getTextField_2() {
		return textField_2;
	}

	public MyTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(MyTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public MyTextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(MyTextField textField_4) {
		this.textField_4 = textField_4;
	}

	public MyTextField getTextField_5() {
		return textField_5;
	}

	public void setTextField_5(MyTextField textField_5) {
		this.textField_5 = textField_5;
	}

	public MyTextField getTextField_6() {
		return textField_6;
	}

	public void setTextField_6(MyTextField textField_6) {
		this.textField_6 = textField_6;
	}


	public MyTextField getTextField_8() {
		return textField_8;
	}

	public void setTextField_8(MyTextField textField_8) {
		this.textField_8 = textField_8;
	}

	public MyButton getConfirm() {
		return confirm;
	}

	public MyButton getCancle() {
		return cancle;
	}

	public MyTable getTable() {
		return table;
	}

	public DefaultTableModel getModel() {
		return model;
	}
}
