package presentation.warehouseui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import listener.warehouselistener.WarehouseListener10;

import javax.swing.JComboBox;

public class WarehouseUI1 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JPanel panel_5;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel lblNewLabel_1;
	private JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox_2;
	private JComboBox<String> comboBox_3;
	private WarehouseListener10 listener;

	/**
	 * Create the application.
	 */
	public WarehouseUI1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		listener = new WarehouseListener10(this);
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);

		button_1 = new JButton("新建出库单");
		button_1.setBackground(new Color(255, 248, 220));
		button_1.setBounds(6, 6, 94, 27);
		button_1.addActionListener(listener);
		this.add(button_1);

		button_2 = new JButton("新建入库单");
		button_2.setBounds(112, 6, 94, 27);
		button_2.addActionListener(listener);
		this.add(button_2);

		panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(6, 45, 532, 334);
		this.add(panel_5);
		panel_5.setLayout(null);

		label = new JLabel("快递编号:");
		label.setBounds(6, 6, 57, 15);
		panel_5.add(label);

		textField = new JTextField();
		textField.setBounds(75, 0, 122, 27);
		panel_5.add(textField);
		textField.setColumns(10);

		label_1 = new JLabel("出库日期:");
		label_1.setBounds(209, 6, 57, 15);
		panel_5.add(label_1);

		label_2 = new JLabel("目的地:");
		label_2.setBounds(6, 33, 57, 15);
		panel_5.add(label_2);

		textField_1 = new JTextField();
		textField_1.setBounds(75, 27, 122, 27);
		panel_5.add(textField_1);
		textField_1.setColumns(10);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(278, 1, 70, 25);
		panel_5.add(comboBox);

		label_3 = new JLabel("年");
		label_3.setBounds(349, 6, 57, 15);
		panel_5.add(label_3);

		comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(360, 1, 70, 25);
		panel_5.add(comboBox_1);

		label_4 = new JLabel("月");
		label_4.setBounds(430, 6, 57, 15);
		panel_5.add(label_4);

		comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(442, 1, 57, 25);
		panel_5.add(comboBox_2);

		label_5 = new JLabel("日");
		label_5.setBounds(499, 6, 57, 15);
		panel_5.add(label_5);

		label_6 = new JLabel("装运形式:");
		label_6.setBounds(209, 33, 57, 15);
		panel_5.add(label_6);

		comboBox_3 = new JComboBox<String>();
		comboBox_3.setBounds(278, 28, 70, 25);
		panel_5.add(comboBox_3);

		lblNewLabel_1 = new JLabel("中转单编号:");
		lblNewLabel_1.setBounds(6, 60, 70, 15);
		panel_5.add(lblNewLabel_1);

		textField_2 = new JTextField();
		textField_2.setBounds(75, 54, 122, 27);
		panel_5.add(textField_2);
		textField_2.setColumns(10);

		button_5 = new JButton("确认");
		button_5.setBounds(75, 93, 94, 27);
		button_5.addActionListener(listener);
		panel_5.add(button_5);

		button_3 = new JButton("清空");
		button_3.setBounds(209, 93, 94, 27);
		button_3.addActionListener(listener);
		panel_5.add(button_3);

		button_4 = new JButton("返回");
		button_4.setBounds(349, 93, 94, 27);
		button_4.addActionListener(listener);
		panel_5.add(button_4);

	}
	
	public String getID(){
		return this.textField.getText();
	}
	
	public String getDestination(){
		return this.textField_1.getText();
	}
	
	public String getTrans_ID(){
		return this.textField_2.getText();
	}
	
	public String getDate(){
		String year=(String) comboBox.getSelectedItem();
		String month=(String) comboBox_1.getSelectedItem();
		String date=(String) comboBox_2.getSelectedItem();		
		return year+month+date;
	}
	
	public String getTransportation(){
		return (String) comboBox_3.getSelectedItem();
	}
	
	public JButton getExportButton() {
		return this.button_1;
	}

	public JButton getImportButton() {
		return this.button_2;
	}

	public JButton getClearButton() {
		return this.button_3;
	}

	public JButton getBackButton() {
		return this.button_4;
	}

	public JButton getConfirmButton() {
		return this.button_5;
	}

}
