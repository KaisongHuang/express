/**
 * ManagerUI2是manager用户的单据审批界面
 */

package presentation.managerui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JLabel;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.Arrays;
import java.util.Vector;

import listener.managerlistener.ManagerListener20;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyComboBox;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTable;

public class ManagerUI2 extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private MyComboBox<String> comboBox;
	private MyButton button1;
	private MyButton button2;
	private MyButton button;
	private MyButton button_1;
	private MyButton button_2;
	private JPanel panel;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
	private JPanel panel6;
	private JPanel panel7;
	private JPanel panel8;
	private JPanel panel9;
	private JPanel panel10;
	private JPanel panel11;
	private MyTable table2;
    private MyDialog dialog;
	private MyTable table3;
	private MyTable table4;
	private MyTable table5;
	private MyTable table6;
	private MyTable table7;
	private MyTable table8;
	private MyTable table9;
	private MyTable table10;
	private MyTable table11;
	private JScrollPane JSP2;
	private JScrollPane JSP3;
	private JScrollPane JSP4;
	private JScrollPane JSP5;
	private JScrollPane JSP6;
	private JScrollPane JSP7;
	private JScrollPane JSP8;
	private JScrollPane JSP9;
	private JScrollPane JSP10;
	private JScrollPane JSP11;
	private Vector<String> name2;
	private Vector<String> name3;
	private Vector<String> name4;
	private Vector<String> name5;
	private Vector<String> name6;
	private Vector<String> name7;
	private Vector<String> name8;
	private Vector<String> name9;
	private Vector<String> name10;
	private Vector<String> name11;
	private Vector<Object> data2;
	private Vector<Object> data3;
	private Vector<Object> data4;
	private Vector<Object> data5;
	private Vector<Object> data6;
	private Vector<Object> data7;
	private Vector<Object> data8;
	private Vector<Object> data9;
	private Vector<Object> data10;
	private Vector<Object> data11;
	private DefaultTableModel model2;
	private DefaultTableModel model3;
	private DefaultTableModel model4;
	private DefaultTableModel model5;
	private DefaultTableModel model6;
	private DefaultTableModel model7;
	private DefaultTableModel model8;
	private DefaultTableModel model9;
	private DefaultTableModel model10;
	private DefaultTableModel model11;
	private CardLayout card;
	private ManagerListener20 managerlistener;

	/**
	 * Create the application.
	 */
	public ManagerUI2() {
		managerlistener = new ManagerListener20(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		setBackground(Color.white);

		this.setBounds(136, 115, 746, 443);
		this.setBackground(Color.WHITE);
		this.setLayout(null);
        dialog=new MyDialog();
        this.add(dialog);
		card = new CardLayout();
		panel = new JPanel();
		panel.setBounds(0, 40, 715, 400);
		panel.setLayout(card);
		comboBox = new MyComboBox<String>();
		comboBox.addItem("无");
		comboBox.addItem("付款单");
		comboBox.addItem("收款单");
		comboBox.addItem("派件单");
		comboBox.addItem("中转单");
		comboBox.addItem("入库单");
		comboBox.addItem("出库单");
		comboBox.addItem("营业厅装车单");
		comboBox.addItem("营业厅到达单");
		comboBox.addItem("中转中心到达单");
		comboBox.addItem("中转中心装车单");

		comboBox.setSelectedIndex(0);
		comboBox.setBounds(61, 5, 150, 28);
		this.add(comboBox);

		button1 = new MyButton("确认");
		button1.setBounds(209, 5, 91, 28);
		this.add(button1);
		button1.addActionListener(managerlistener);
		button1.addMouseListener(managerlistener);

		button2 = new MyButton("取消");
		button2.setBounds(301, 5, 91, 28);
		this.add(button2);
		button2.addActionListener(managerlistener);
		button2.addMouseListener(managerlistener);

		JLabel label = new JLabel("数据类型：");
		label.setBounds(0, 9, 100, 18);
		this.add(label);

		String names2[] = { "付款日期", "付款金额", "付款人", "付款账号", "条目", "备注", "审批通过" };
		name2 = new Vector<String>(Arrays.asList(names2));
		table2 = new MyTable(data2, name2);
		TableColumn tc2 = table2.getColumnModel().getColumn(6);
		tc2.setCellEditor(table2.getDefaultEditor(Boolean.class));
		tc2.setCellRenderer(table2.getDefaultRenderer(Boolean.class));
		table2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table2.addMouseListener(managerlistener);
		model2 = (DefaultTableModel) table2.getModel();
		table2.setSelectionForeground(Color.BLACK);
		table2.setSelectionBackground(null);
		table2.setEditableColumn(6);
		table2.setFocusable(false);
		JSP2 = new JScrollPane(table2);
		JSP2.setBounds(0, 0, panel.getWidth(), panel.getHeight());

		String names3[] = { "收款日期", "收款金额","收款单位", "收款快递员", "id","审批通过" };
		name3 = new Vector<String>(Arrays.asList(names3));
		table3 = new MyTable(data3, name3);
		TableColumn tc3 = table3.getColumnModel().getColumn(5);
		tc3.setCellEditor(table3.getDefaultEditor(Boolean.class));
		tc3.setCellRenderer(table3.getDefaultRenderer(Boolean.class));
		table3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table3.addMouseListener(managerlistener);
		model3 = (DefaultTableModel) table3.getModel();
		table3.setSelectionForeground(Color.BLACK);
		table3.setSelectionBackground(null);
		table3.setEditableColumn(5);
		table3.hideColumn(4);
		table3.setFocusable(false);
		JSP3 = new JScrollPane(table3);
		JSP3.setBounds(0, 0, panel.getWidth(), panel.getHeight());

		String names4[] = { "到达日期", "订单号", "派送员", "审批通过" };
		name4 = new Vector<String>(Arrays.asList(names4));
		table4 = new MyTable(data4, name4);
		TableColumn tc4 = table4.getColumnModel().getColumn(3);
		tc4.setCellEditor(table4.getDefaultEditor(Boolean.class));
		tc4.setCellRenderer(table4.getDefaultRenderer(Boolean.class));
		table4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table4.addMouseListener(managerlistener);
		model4 = (DefaultTableModel) table4.getModel();
		table4.setSelectionForeground(Color.BLACK);
		table4.setSelectionBackground(null);
		table4.setEditableColumn(3);
		table4.setFocusable(false);
		JSP4 = new JScrollPane(table4);
		JSP4.setBounds(0, 0, panel.getWidth(), panel.getHeight());

		String names5[] = { "运输方式","装车日期", "中转单号", "航班号", "出发地", "到达地", "货柜号", "监装员", "ID", "运费", "审批通过" };
		name5 = new Vector<String>(Arrays.asList(names5));
		table5 = new MyTable(data5, name5);
		TableColumn tc5 = table5.getColumnModel().getColumn(10);
		tc5.setCellEditor(table5.getDefaultEditor(Boolean.class));
		tc5.setCellRenderer(table5.getDefaultRenderer(Boolean.class));
		table5.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table5.addMouseListener(managerlistener);
		model5 = (DefaultTableModel) table5.getModel();
		table5.setSelectionForeground(Color.BLACK);
		table5.setSelectionBackground(null);
		table5.setEditableColumn(10);
		table5.setFocusable(false);
		table5.hideColumn(8);
		JSP5 = new JScrollPane(table5);
		JSP5.setBounds(0, 0, panel.getWidth(), panel.getHeight());

		String names6[] = { "快递编号", "入库日期", "目的地","入库仓库", "区号", "排号", "架号", "位号", "审批通过" };
		name6 = new Vector<String>(Arrays.asList(names6));
		table6 = new MyTable(data6, name6);
		TableColumn tc6 = table6.getColumnModel().getColumn(8);
		tc6.setCellEditor(table6.getDefaultEditor(Boolean.class));
		tc6.setCellRenderer(table6.getDefaultRenderer(Boolean.class));
		table6.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table6.addMouseListener(managerlistener);
		model6 = (DefaultTableModel) table6.getModel();
		table6.setSelectionForeground(Color.BLACK);
		table6.setSelectionBackground(null);
		table6.setEditableColumn(8);
		table6.setFocusable(false);
		JSP6 = new JScrollPane(table6);
		JSP6.setBounds(0, 0, panel.getWidth(), panel.getHeight());

		String names7[] = { "快递编号", "出库日期", "目的地", "出库仓库","装运形式", "中转单号", "审批通过" };
		name7 = new Vector<String>(Arrays.asList(names7));
		table7 = new MyTable(data7, name7);
		TableColumn tc7 = table7.getColumnModel().getColumn(6);
		tc7.setCellEditor(table7.getDefaultEditor(Boolean.class));
		tc7.setCellRenderer(table7.getDefaultRenderer(Boolean.class));
		table7.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table7.addMouseListener(managerlistener);
		model7 = (DefaultTableModel) table7.getModel();
		table7.setSelectionForeground(Color.BLACK);
		table7.setSelectionBackground(null);
		table7.setEditableColumn(6);
		table7.setFocusable(false);
		JSP7 = new JScrollPane(table7);
		JSP7.setBounds(0, 0, panel.getWidth(), panel.getHeight());

		String names8[] = { "装车日期", "营业厅编号","中转单号", "出发地", "到达地", "车辆代号", "监装员", "押运员", "ID", "运费", "审批通过" };
		name8 = new Vector<String>(Arrays.asList(names8));
		table8 = new MyTable(data8, name8);
		TableColumn tc8 = table8.getColumnModel().getColumn(10);
		tc8.setCellEditor(table8.getDefaultEditor(Boolean.class));
		tc8.setCellRenderer(table8.getDefaultRenderer(Boolean.class));
		table8.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table8.addMouseListener(managerlistener);
		model8 = (DefaultTableModel) table8.getModel();
		table8.setSelectionForeground(Color.BLACK);
		table8.setSelectionBackground(null);
		table8.setEditableColumn(10);
		table8.setFocusable(false);
		table8.hideColumn(8);
		JSP8 = new JScrollPane(table8);
		JSP8.setBounds(0, 0, panel.getWidth(), panel.getHeight());

		String names9[] = { "快递单号","到达日期", "中转单编号", "出发地", "货物到达状态", "审批通过" };
		name9 = new Vector<String>(Arrays.asList(names9));
		table9 = new MyTable(data9, name9);
		TableColumn tc9 = table9.getColumnModel().getColumn(5);
		tc9.setCellEditor(table9.getDefaultEditor(Boolean.class));
		tc9.setCellRenderer(table9.getDefaultRenderer(Boolean.class));
		table9.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table9.addMouseListener(managerlistener);
		model9 = (DefaultTableModel) table9.getModel();
		table9.setSelectionForeground(Color.BLACK);
		table9.setSelectionBackground(null);
		table9.setEditableColumn(5);
		table9.setFocusable(false);
		JSP9 = new JScrollPane(table9);
		JSP9.setBounds(0, 0, panel.getWidth(), panel.getHeight());

		String names10[] = { "中转中心编号", "到达日期", "中转单编号", "出发地", "货物到达状态", "审批通过" };
		name10 = new Vector<String>(Arrays.asList(names10));
		table10 = new MyTable(data10, name10);
		TableColumn tc10 = table10.getColumnModel().getColumn(5);
		tc10.setCellEditor(table10.getDefaultEditor(Boolean.class));
		tc10.setCellRenderer(table10.getDefaultRenderer(Boolean.class));
		table10.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table10.addMouseListener(managerlistener);
		model10 = (DefaultTableModel) table10.getModel();
		table10.setSelectionForeground(Color.BLACK);
		table10.setSelectionBackground(null);
		table10.setEditableColumn(5);
		table10.setFocusable(false);
		JSP10 = new JScrollPane(table10);
		JSP10.setBounds(0, 0, panel.getWidth(), panel.getHeight());

		String names11[] = { "装车日期", "中转中心汽运编号", "到达地", "车辆代号", "监装员", "押运员", "ID", "运费", "审批通过" };
		name11 = new Vector<String>(Arrays.asList(names11));
		table11 = new MyTable(data11, name11);
		TableColumn tc11 = table11.getColumnModel().getColumn(8);
		tc11.setCellEditor(table11.getDefaultEditor(Boolean.class));
		tc11.setCellRenderer(table11.getDefaultRenderer(Boolean.class));
		table11.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table11.addMouseListener(managerlistener);
		model11 = (DefaultTableModel) table11.getModel();
		table11.setSelectionForeground(Color.BLACK);
		table11.setSelectionBackground(null);
		table11.setEditableColumn(8);
		table11.setFocusable(false);
		table11.hideColumn(6);
		JSP11 = new JScrollPane(table11);
		JSP11.setBounds(0, 0, panel.getWidth(), panel.getHeight());

		panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.add(JSP2);
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.add(JSP3);
		panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.add(JSP4);
		panel5 = new JPanel();
		panel5.setLayout(null);
		panel5.add(JSP5);
		panel6 = new JPanel();
		panel6.setLayout(null);
		panel6.add(JSP6);
		panel7 = new JPanel();
		panel7.setLayout(null);
		panel7.add(JSP7);
		panel8 = new JPanel();
		panel8.setLayout(null);
		panel8.add(JSP8);
		panel9 = new JPanel();
		panel9.setLayout(null);
		panel9.add(JSP9);
		panel10 = new JPanel();
		panel10.setLayout(null);
		panel10.add(JSP10);
		panel11 = new JPanel();
		panel11.setLayout(null);
		panel11.add(JSP11);

		panel.add(panel1, "0");
		panel.add(panel2, "1");
		panel.add(panel3, "2");
		panel.add(panel4, "3");
		panel.add(panel5, "4");
		panel.add(panel6, "5");
		panel.add(panel7, "6");
		panel.add(panel8, "7");
		panel.add(panel9, "8");
		panel.add(panel10, "9");
		panel.add(panel11, "10");
		add(panel);

		button = new MyButton("全选");
		button.setBounds(450, 5, 80, 29);
		button.addActionListener(managerlistener);
		button.addMouseListener(managerlistener);
		add(button);

		button_1 = new MyButton("取消全选");
		button_1.setBounds(543, 4, 80, 29);
		button_1.addActionListener(managerlistener);
		button_1.addMouseListener(managerlistener);
		add(button_1);

		button_2 = new MyButton("已审批");
		button_2.setBounds(635, 5, 80, 29);
		button_2.addActionListener(managerlistener);
		button_2.addMouseListener(managerlistener);
		add(button_2);

	}
	public void setText(String s){
		dialog.setText(s);
	}
	public MyButton getButton() {
		return button;
	}

	public MyButton getButton_1() {
		return button_1;
	}

	public MyButton getButton_2() {
		return button_2;
	}

	public JPanel getPanel() {
		return panel;
	}

	public DefaultTableModel getModel2() {
		return model2;
	}

	public DefaultTableModel getModel3() {
		return model3;
	}

	public DefaultTableModel getModel4() {
		return model4;
	}

	public DefaultTableModel getModel5() {
		return model5;
	}

	public DefaultTableModel getModel6() {
		return model6;
	}

	public DefaultTableModel getModel7() {
		return model7;
	}

	public DefaultTableModel getModel8() {
		return model8;
	}

	public DefaultTableModel getModel9() {
		return model9;
	}

	public DefaultTableModel getModel10() {
		return model10;
	}

	public DefaultTableModel getModel11() {
		return model11;
	}

	public void setData2(Vector<Object> data2) {
		this.data2 = data2;
	}

	public void setData3(Vector<Object> data3) {
		this.data3 = data3;
	}

	public void setData4(Vector<Object> data4) {
		this.data4 = data4;
	}

	public void setData5(Vector<Object> data5) {
		this.data5 = data5;
	}

	public void setData6(Vector<Object> data6) {
		this.data6 = data6;
	}

	public void setData7(Vector<Object> data7) {
		this.data7 = data7;
	}

	public void setData8(Vector<Object> data8) {
		this.data8 = data8;
	}

	public void setData9(Vector<Object> data9) {
		this.data9 = data9;
	}

	public void setData10(Vector<Object> data10) {
		this.data10 = data10;
	}

	public void setData11(Vector<Object> data11) {
		this.data11 = data11;
	}

	public MyButton getButton1() {
		return button1;
	}

	public void setButton1(MyButton button1) {
		this.button1 = button1;
	}

	public MyButton getButton2() {
		return button2;
	}

	public void setButton2(MyButton button2) {
		this.button2 = button2;
	}

	public MyComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(MyComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}

	public CardLayout getCard() {
		return card;
	}
}