/**
 * WarehouseUI2是Warehouse用户的库存盘点界面
 */

package presentation.warehouseui;

import javax.swing.JPanel;

import javax.swing.JScrollPane;
import javax.swing.JLabel;

import java.awt.Color;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import com.eltima.components.ui.DatePicker;

import listener.warehouselistener.WarehouseListener2;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyComboBox;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTable;
import presentation.MySwing.MyTextField;

public class WarehouseUI2 extends JPanel {
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private MyButton button_1;
	private MyButton button_2;
	private MyComboBox<String> comboBox;
	private MyComboBox<String> comboBox_1;
	private MyComboBox<String> comboBox_2;
	private MyComboBox<String> comboBox_3;
	private MyComboBox<String> comboBox_4;
	private MyComboBox<String> comboBox_5;
	private MyTextField textArea;
	private MyTextField textArea_1;
	private MyTextField textArea_2;
	private MyTable table;

	private DatePicker begin;
	private DatePicker end;

	private DefaultTableModel model;
	private JScrollPane JSP;
	private Vector<String> name;
	private Vector<Object> data;
	private MyDialog dialog;
	private static final long serialVersionUID = 1L;
	WarehouseListener2 warehouseListener;

	public WarehouseUI2() {
		warehouseListener = new WarehouseListener2(this);
		initialize();
		this.setImage();
		this.setVisible(true);
	}

	private void initialize() {

		this.setBounds(136, 115,720,480);
		this.setLayout(null);
		this.setBackground(Color.white);
		String names[] = { "快递编号", "入库日期", "目的地", "区号", "排号", "架号", "位号" };
		name = new Vector<String>(Arrays.asList(names));
		table = new MyTable(data, name);
		table.setSelectionForeground(Color.BLACK);
		table.setSelectionBackground(new Color(210, 240, 255));
		table.setEditableColumn(-1);
		table.setEditableRow(-1);
		table.setFocusable(false);
		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(6, 29, 472, 350);
		this.add(JSP);

		dialog=new MyDialog();
		this.add(dialog);
		label_8 = new JLabel("库存查看");
		label_8.setBounds(562, 31, 57, 15);
		this.add(label_8);

		label_9 = new JLabel("开始日期:");
		label_9.setBounds(488, 55, 57, 15);
		this.add(label_9);

		label_10 = new JLabel("结束日期:");
		label_10.setBounds(488, 100, 57, 15);
		this.add(label_10);

		begin = new DatePicker(this);
		begin.setBounds(545, 51, 100, 25);
		this.add(begin);

		end = new DatePicker(this);
		end.setBounds(545, 95, 100, 25);
		this.add(end);

//		comboBox = new MyComboBox<String>();
//		comboBox.setBounds(545, 51, 85, 25);
//		comboBox.addItem("2015");
//		this.add(comboBox);
//
//		label_11 = new JLabel("年");
//		label_11.setBounds(631, 55, 20, 15);
//		this.add(label_11);
//
//		comboBox_1 = new MyComboBox<String>();
//		comboBox_1.setBounds(545, 77, 85, 25);
//		comboBox_1.addItem("01");
//		this.add(comboBox_1);
//
//		label_12 = new JLabel("月");
//		label_12.setBounds(631, 81, 20, 15);
//		this.add(label_12);
//
//		comboBox_2 = new MyComboBox<String>();
//		comboBox_2.setBounds(545, 105, 85, 25);
//		comboBox_2.addItem("01");
//		this.add(comboBox_2);
//
//		label_13 = new JLabel("日");
//		label_13.setBounds(631, 109, 20, 15);
//		this.add(label_13);
//
//		comboBox_3 = new MyComboBox<String>();
//		comboBox_3.setBounds(545, 162, 85, 25);
//		comboBox_3.addItem("2015");
//		this.add(comboBox_3);
//
//		label_14 = new JLabel("年");
//		label_14.setBounds(629, 166, 22, 15);
//		this.add(label_14);
//
//		comboBox_4 = new MyComboBox<String>();
//		comboBox_4.setBounds(545, 188, 85, 25);
//		comboBox_4.addItem("01");
//		this.add(comboBox_4);
//
//		label_15 = new JLabel("月");
//		label_15.setBounds(631, 192, 29, 15);
//		this.add(label_15);
//
//		comboBox_5 = new MyComboBox<String>();
//		comboBox_5.setBounds(545, 216, 85, 25);
//		comboBox_5.addItem("01");
//		this.add(comboBox_5);
//
//		label_16 = new JLabel("日");
//		label_16.setBounds(632, 220, 19, 15);
//		this.add(label_16);

		button_1 = new MyButton("查询");
		button_1.setBounds(490, 142, 80, 27);
		button_1.addActionListener(warehouseListener);
		this.add(button_1);

		button_2 = new MyButton("清空");
		button_2.setBounds(580, 142, 78, 27);
		button_2.addActionListener(warehouseListener);
		this.add(button_2);

		label_17 = new JLabel("入库数量(件)：");
		label_17.setBounds(488, 280, 99, 15);
		this.add(label_17);

		JLabel label = new JLabel("出库数量(件)：");
		label.setBounds(488, 320, 99, 15);
		add(label);

		JLabel lblji = new JLabel("库存合计(件)：");
		lblji.setBounds(488, 360, 99, 15);
		add(lblji);

		textArea = new MyTextField();
		textArea.setBounds(580, 275, 80, 25);
		textArea.setEditable(false);
		add(textArea);

		textArea_1 = new MyTextField();
		textArea_1.setBounds(580, 315, 80, 25);
		textArea_1.setEditable(false);
		add(textArea_1);

		textArea_2 = new MyTextField();
		textArea_2.setBounds(580, 355, 80, 25);
		textArea_2.setEditable(false);
		add(textArea_2);
	}
	public void setText(String s){
		dialog.setText(s);
	}
	public void setErrorText(String s){
		dialog.setErrorText(s);;
	}
	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}

	public MyTable getTable() {
		return table;
	}

	public JLabel getLabel_8() {
		return label_8;
	}

	public JLabel getLabel_9() {
		return label_9;
	}

	public JLabel getLabel_10() {
		return label_10;
	}

	public JLabel getLabel_11() {
		return label_11;
	}

	public JLabel getLabel_12() {
		return label_12;
	}

	public JLabel getLabel_13() {
		return label_13;
	}

	public JLabel getLabel_14() {
		return label_14;
	}

	public JLabel getLabel_15() {
		return label_15;
	}

	public JLabel getLabel_16() {
		return label_16;
	}

	public JLabel getLabel_17() {
		return label_17;
	}

	public MyButton getButton_1() {
		return button_1;
	}

	public MyButton getButton_2() {
		return button_2;
	}

	public MyComboBox<String> getComboBox() {
		return comboBox;
	}

	public MyComboBox<String> getComboBox_1() {
		return comboBox_1;
	}

	public MyComboBox<String> getComboBox_2() {
		return comboBox_2;
	}

	public MyComboBox<String> getComboBox_3() {
		return comboBox_3;
	}

	public MyComboBox<String> getComboBox_4() {
		return comboBox_4;
	}

	public MyComboBox<String> getComboBox_5() {
		return comboBox_5;
	}

	public void setData(Vector<Object> data) {
		this.data = data;
	}

	public String getBeginDate() {
		String date = this.getBegin().getText().replace("/", "");
		date = date.substring(4, 8) + date.substring(0, 4);
		return date;
	}

	public String getEndDate() {
		String date = this.getEnd().getText().replace("/", "");
		date = date.substring(4, 8) + date.substring(0, 4);
		return date;
	}

	public MyTextField getTextArea() {
		return textArea;
	}

	public MyTextField getTextArea_1() {
		return textArea_1;
	}

	public MyTextField getTextArea_2() {
		return textArea_2;
	}

	private void setImage() {
	}

	public DatePicker getBegin() {
		return begin;
	}

	public DatePicker getEnd() {
		return end;
	}


}
