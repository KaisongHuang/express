package presentation.warehouseui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.UIManager;


public class WarehouseUI1 extends JPanel{

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		
		JButton button_1 = new JButton("新建出库单");
		button_1.setBackground(new Color(255, 248, 220));
		button_1.setBounds(6, 6, 94, 27);
		this.add(button_1);
		
		JButton button_2 = new JButton("新建入库单");
		button_2.setBounds(112, 6, 94, 27);
		this.add(button_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(6, 45, 532, 334);
		this.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel label = new JLabel("快递编号:");
		label.setBounds(6, 6, 57, 15);
		panel_5.add(label);
		
		textField = new JTextField();
		textField.setBounds(75, 0, 122, 27);
		panel_5.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("出库日期:");
		label_1.setBounds(209, 6, 57, 15);
		panel_5.add(label_1);
		
		JLabel label_2 = new JLabel("目的地:");
		label_2.setBounds(6, 33, 57, 15);
		panel_5.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(75, 27, 122, 27);
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(278, 1, 70, 25);
		panel_5.add(comboBox);
		
		JLabel label_3 = new JLabel("年");
		label_3.setBounds(349, 6, 57, 15);
		panel_5.add(label_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(360, 1, 70, 25);
		panel_5.add(comboBox_1);
		
		JLabel label_4 = new JLabel("月");
		label_4.setBounds(430, 6, 57, 15);
		panel_5.add(label_4);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(442, 1, 57, 25);
		panel_5.add(comboBox_2);
		
		JLabel label_5 = new JLabel("日");
		label_5.setBounds(499, 6, 57, 15);
		panel_5.add(label_5);
		
		JLabel label_6 = new JLabel("装运形式:");
		label_6.setBounds(209, 33, 57, 15);
		panel_5.add(label_6);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(278, 28, 70, 25);
		panel_5.add(comboBox_3);
		
		JLabel lblNewLabel_1 = new JLabel("中转单编号:");
		lblNewLabel_1.setBounds(6, 60, 70, 15);
		panel_5.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(75, 54, 122, 27);
		panel_5.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_10 = new JButton("确认");
		btnNewButton_10.setBounds(75, 93, 94, 27);
		panel_5.add(btnNewButton_10);
		
		JButton button_3 = new JButton("清空");
		button_3.setBounds(209, 93, 94, 27);
		panel_5.add(button_3);
		
		JButton button_4 = new JButton("返回");
		button_4.setBounds(349, 93, 94, 27);
		panel_5.add(button_4);
	}
}
