package presentation.centreui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import listener.centrelistener.CentreListener1;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTable;
import presentation.MySwing.MyTextField;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class CentreUI1_1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private MyButton myButton;
	private MyButton myButton1;
	private MyButton myButton2;
    private MyDialog dialog;
	private MyButton myButton3;
	private MyTable table;
	private JScrollPane JSP;
	private Vector<String> name;
	private Vector<Object> data;
	private DefaultTableModel model;
	private CentreListener1 listener;
	private MyTextField textField;

	public CentreUI1_1(CentreListener1 listener,Vector<Object> data) {
		this.listener = listener;
		this.data=data;
		init();
	}


	/**
	 * Create the frame.
	 */
	private void init() {

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 590, 418);
		setUndecorated(true);
		setVisible(true);
		dialog=new MyDialog();
		this.add(dialog);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		String names[] = { "所有运单号" };
		name = new Vector<String>(Arrays.asList(names));
		table = new MyTable(data, name);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.addMouseListener(listener);
		table.setSelectionForeground(Color.BLACK);
		table.setSelectionBackground(new Color(210, 240, 255));
		table.setEditableColumn(-1);
		table.setEditableRow(-1);
		table.setFocusable(false);
		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(23, 23, 284, 372);
		contentPane.add(JSP);
		
		myButton = new MyButton("添加");
		myButton1 = new MyButton("删除");
		myButton2 = new MyButton("保存");
		myButton3 = new MyButton("取消");

		myButton.setBounds(348, 177, 104, 28);
		myButton1.setBounds(464, 177, 104, 28);
		myButton2.setBounds(348, 217, 104, 28);
		myButton3.setBounds(464, 217, 104, 28);

		myButton.addActionListener(listener);
		myButton.addMouseListener(listener);
		myButton1.addActionListener(listener);
		myButton1.addMouseListener(listener);
		myButton2.addActionListener(listener);
		myButton2.addMouseListener(listener);
		myButton3.addActionListener(listener);
		myButton3.addMouseListener(listener);

		contentPane.add(myButton);
		contentPane.add(myButton1);
		contentPane.add(myButton2);
		contentPane.add(myButton3);
		
		JLabel label = new JLabel("运单号：");
		label.setBounds(348, 92, 61, 16);
		contentPane.add(label);
		
		textField = new MyTextField();
		textField.setBounds(348, 120, 220, 28);
		contentPane.add(textField);
		textField.setColumns(10);

	}
	public void setText(String s){
		dialog.setText(s);
	}

	public void setErrorText(String s){
		dialog.setErrorText(s);
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

	public MyButton getMyButton1() {
		return myButton1;
	}

	public MyButton getMyButton2() {
		return myButton2;
	}

	public MyButton getMyButton3() {
		return myButton3;
	}
	

	public MyTextField getTextField() {
		return textField;
	}
}
