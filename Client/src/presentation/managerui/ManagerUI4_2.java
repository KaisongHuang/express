/**
 * ManagerUI41是manager用户修改价格策略的界面
 */

package presentation.managerui;

import java.awt.Color;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JButton;

import listener.managerlistener.ManagerListener4_2;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTable;
import presentation.MySwing.MyTextField;

public class ManagerUI4_2 extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private MyTextField textField_1;
	private MyTextField myTextField;
	private MyTextField myTextField_1;
	private MyTextField myTextField_2;

	private MyButton myButton;
	private MyButton myButton_1;
	private MyButton myButton_2;
	private MyButton myButton_3;

	private MyTable table;
	private JScrollPane JSP;
	private Vector<String> name;
	private Vector<Object> data;
	private DefaultTableModel model;

	private MyDialog dialog;
	private ManagerListener4_2 managerlistener;

	/**
	 * Create the application.
	 * 
	 * @param card
	 */
	public ManagerUI4_2() {
		managerlistener = new ManagerListener4_2(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		setBackground(Color.white);
		this.setBounds(0, 44, 790, 433);

		this.setLayout(null);
		dialog = new MyDialog();
		this.add(dialog);

		String names[] = { "城市A", "城市B", "距离(KM)" };
		name = new Vector<String>(Arrays.asList(names));
		table = new MyTable(data, name);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.addMouseListener(managerlistener);
		table.setSelectionForeground(Color.BLACK);
		table.setSelectionBackground(new Color(210, 240, 255));
		table.setEditableColumn(-1);
		table.setEditableRow(-1);
		table.setFocusable(false);
		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(21, 90, 340, 272);
		this.add(JSP);

		JLabel label = new JLabel("价格(每千公里):");
		label.setBounds(21, 60, 150, 18);
		add(label);

		JLabel lbla = new JLabel("城市A：");
		lbla.setBounds(392, 101, 61, 16);
		add(lbla);

		JLabel lblb = new JLabel("城市B：");
		lblb.setBounds(392, 161, 61, 16);
		add(lblb);

		JLabel lblkm = new JLabel("距离(KM)：");
		lblkm.setBounds(392, 220, 73, 16);
		add(lblkm);

		textField_1 = new MyTextField();
		textField_1.setBounds(115, 54, 122, 30);
		add(textField_1);
		textField_1.setColumns(10);

		myTextField = new MyTextField();
		myTextField.setColumns(10);
		myTextField.setBounds(465, 94, 122, 30);
		add(myTextField);

		myTextField_1 = new MyTextField();
		myTextField_1.setColumns(10);
		myTextField_1.setBounds(465, 155, 122, 30);
		add(myTextField_1);

		myTextField_2 = new MyTextField();
		myTextField_2.setColumns(10);
		myTextField_2.setBounds(465, 214, 122, 30);
		add(myTextField_2);

		myButton = new MyButton("添加");
		myButton.setBounds(392, 260, 195, 30);
		myButton.addActionListener(managerlistener);
		add(myButton);

		myButton_1 = new MyButton("修改");
		myButton_1.setBounds(392, 296, 195, 30);
		myButton_1.addActionListener(managerlistener);
		add(myButton_1);

		myButton_2 = new MyButton("删除");
		myButton_2.setBounds(392, 332, 195, 30);
		myButton_2.addActionListener(managerlistener);
		add(myButton_2);

		myButton_3 = new MyButton("设定");
		myButton_3.setBounds(243, 54, 118, 30);
		add(myButton_3);

		setData();
	}

	public MyTextField getTextField_1() {
		return textField_1;
	}

	public MyTextField getMyTextField() {
		return myTextField;
	}

	public MyTextField getMyTextField_1() {
		return myTextField_1;
	}

	public MyTextField getMyTextField_2() {
		return myTextField_2;
	}

	public MyTable getTable() {
		return table;
	}

	public DefaultTableModel getModel() {
		return model;
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

	public MyButton getMyButton_3() {
		return myButton_3;
	}

	public void setText(String s) {
		dialog.setText(s);
	}

	private void setData() {
		this.myTextField.setText();
		this.myTextField_1.setText();
		this.myTextField_2.setText();
		this.textField_1.setText();
	}
}
