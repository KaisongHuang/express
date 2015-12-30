/**
 * FinanceUI2是finance用户的成本管理界面
 */

package presentation.financeui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import com.eltima.components.ui.DatePicker;

import listener.financelistener.FinanceListener2;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyComboBox;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTable;
import presentation.MySwing.MyTextField;

public class FinanceUI2 extends JPanel {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel label;
	private MyTextField textField_1;
	private MyTextField textField_2;
	private MyTextField textField_3;
	private MyTextField textField_4;
	private MyComboBox<String> comboBox;
	private MyButton check;
	private MyButton add;
	private MyButton delete;
	private MyButton clear;
	private MyButton finish;
	private MyTable table;
	private DefaultTableModel model;
	private JScrollPane JSP;
	private Vector<String> name;
	private Vector<Object> data;
	private FinanceListener2 financeListener2;
	private MyComboBox<String> comboBox_1;
	private MyComboBox<String> comboBox_2;
	private MyComboBox<String> comboBox_3;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
//	private int height = 600;
//	private int width = 900;
	private DatePicker dp;
    private MyDialog dialog;
	public FinanceUI2() {
		financeListener2 = new FinanceListener2(this);
		initialize();
		//this.setImage();
		this.setVisible(true);
	}

	private void initialize() {
		setBackground(Color.white);
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);

		dialog=new MyDialog();
		this.add(dialog);
		String names[] = { "付款日期", "付款账号", "付款人", "付款金额", "条目", "备注" };
		name = new Vector<String>(Arrays.asList(names));
		table = new MyTable(data, name);
		table.setSelectionForeground(Color.BLACK);
		table.setSelectionBackground(new Color(210, 240, 255));
		table.setEditableColumn(-1);
		table.setEditableRow(-1);
		table.setFocusable(false);
		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(29, 61, 444, 327);
		this.add(JSP);

		lblNewLabel_1 = new JLabel("付款日期:");
		lblNewLabel_1.setBounds(485, 63, 67, 15);
		this.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("付款金额:");
		lblNewLabel_2.setBounds(483, 100, 67, 15);
		this.add(lblNewLabel_2);

		textField_1 = new MyTextField();
		textField_1.setBounds(546, 94, 134, 28);
		this.add(textField_1);
		textField_1.setColumns(10);

		lblNewLabel_3 = new JLabel("付款人:");
		lblNewLabel_3.setBounds(483, 141, 61, 16);
		this.add(lblNewLabel_3);

		textField_2 = new MyTextField();
		textField_2.setBounds(546, 136, 134, 28);
		this.add(textField_2);
		textField_2.setColumns(10);

		lblNewLabel_4 = new JLabel("付款账号:");
		lblNewLabel_4.setBounds(483, 180, 61, 16);
		this.add(lblNewLabel_4);

		textField_3 = new MyTextField();
		textField_3.setBounds(546, 175, 134, 28);
		this.add(textField_3);
		textField_3.setColumns(10);

		lblNewLabel_5 = new JLabel("条目:");
		lblNewLabel_5.setBounds(483, 223, 61, 16);
		this.add(lblNewLabel_5);

		comboBox = new MyComboBox<String>();
		comboBox.setBounds(546, 218, 134, 27);
		comboBox.addItem("租金");
		comboBox.addItem("运费");
		comboBox.addItem("工资");
		comboBox.addItem("奖励");
		this.add(comboBox);

		label = new JLabel("备注:");
		label.setBounds(483, 266, 61, 16);
		this.add(label);

		textField_4 = new MyTextField();
		textField_4.setBounds(546, 261, 134, 28);
		this.add(textField_4);
		textField_4.setColumns(10);

		add = new MyButton("新增");
		add.setBounds(546, 325, 67, 29);
		add.addActionListener(financeListener2);
		add.addMouseListener(financeListener2);
		this.add(add);

		clear = new MyButton("清空");
		clear.setBounds(546, 359, 67, 29);
		clear.addActionListener(financeListener2);
		clear.addMouseListener(financeListener2);
		this.add(clear);

		check = new MyButton("查看成本收益表");
		check.setBounds(29, 20, 134, 29);
		check.addActionListener(financeListener2);
		check.addMouseListener(financeListener2);
		this.add(check);

		delete = new MyButton("删除");
		delete.setBounds(613, 325, 67, 29);
		delete.addActionListener(financeListener2);
		delete.addMouseListener(financeListener2);
		add(delete);

		finish = new MyButton("保存");
		finish.setBounds(613, 359, 67, 29);
		finish.addActionListener(financeListener2);
		finish.addMouseListener(financeListener2);
		add(finish);

		dp = new DatePicker(this);
		dp.setBounds(546, 60, 119, 25);
		add(dp);

//		comboBox_1 = new MyComboBox<String>();
//		comboBox_1.setBounds(546, 60, 119, 25);
//		comboBox_1.addItem("2015");
//		add(comboBox_1);
//
//		comboBox_2 = new MyComboBox<String>();
//		comboBox_2.setBounds(546, 89, 67, 25);
//		comboBox_2.addItem("01");
//		add(comboBox_2);
//
//		comboBox_3 = new MyComboBox<String>();
//		comboBox_3.setBounds(625, 89, 67, 25);
//		comboBox_3.addItem("01");
//		add(comboBox_3);
//
//		label_1 = new JLabel("年");
//		label_1.setBounds(662, 63, 19, 15);
//		add(label_1);
//
//		label_2 = new JLabel("月");
//		label_2.setBounds(609, 93, 19, 15);
//		add(label_2);
//
//		label_3 = new JLabel("日");
//		label_3.setBounds(692, 94, 19, 15);
//		add(label_3);
	}

	// public MyTextField getTextField() {
	// return textField;
	// }

	public void setText(String s){
		dialog.setText(s);
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

	public MyTextField getTextField_1() {
		return textField_1;
	}

	public MyTextField getTextField_2() {
		return textField_2;
	}

	public MyTextField getTextField_3() {
		return textField_3;
	}

	public MyTextField getTextField_4() {
		return textField_4;
	}

	public MyComboBox<String> getComboBox() {
		return comboBox;
	}

	public MyButton getCheck() {
		return check;
	}

	public MyButton getAdd() {
		return add;
	}

	public MyButton getClear() {
		return clear;
	}

	public MyButton getDelete() {
		return delete;
	}

	public MyButton getFinish() {
		return finish;
	}

	public MyTable getTable() {
		return table;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setData(Vector<Object> data) {
		this.data = data;
	}

	public DatePicker getDp() {
		return dp;
	}

}
