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
import javax.swing.JTable;
import javax.swing.JTextPane;


public class WarehouseUI5 extends JPanel{

	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the application.
	 */
	public WarehouseUI5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
//		JPanel panel_3 = new JPanel();
//		panel_3.setBounds(136, 58, 746, 58);
//		panel_3.setLayout(null);
//		
//		JButton btnNewButton_7 = new JButton("出库入库");
//		btnNewButton_7.setBackground(UIManager.getColor("Button.background"));
//		btnNewButton_7.setBounds(0, 0, 137, 55);
//		panel_3.add(btnNewButton_7);
//		
//		JButton btnNewButton_8 = new JButton("库存盘点");
//		btnNewButton_8.setBackground(UIManager.getColor("Button.background"));
//		btnNewButton_8.setBounds(135, 0, 137, 55);
//		panel_3.add(btnNewButton_8);
//		
//		JButton btnNewButton_9 = new JButton("库存报警");
//		btnNewButton_9.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		btnNewButton_9.setBounds(271, 0, 130, 55);
//		panel_3.add(btnNewButton_9);
//		
//		JButton btnNewButton_12 = new JButton("库区调整");
//		btnNewButton_12.setBackground(UIManager.getColor("Button.background"));
//		btnNewButton_12.setBounds(400, 0, 137, 55);
//		panel_3.add(btnNewButton_12);
//		
//		JButton button = new JButton("库存信息初始化");
//		button.setBackground(new Color(255, 248, 220));
//		button.setBounds(536, 0, 130, 55);
//		panel_3.add(button);
		
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		
		JLabel label = new JLabel("快递编号:");
		label.setBounds(41, 30, 57, 15);
		this.add(label);
		
		textField = new JTextField();
		textField.setBounds(110, 24, 122, 27);
		this.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("目的地:");
		label_1.setBounds(275, 30, 57, 15);
		this.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(333, 24, 122, 27);
		this.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("入库时间:");
		label_2.setBounds(41, 76, 57, 15);
		this.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(110, 71, 57, 25);
		this.add(comboBox);
		
		JLabel label_3 = new JLabel("年");
		label_3.setBounds(179, 76, 12, 15);
		this.add(label_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(203, 71, 57, 25);
		this.add(comboBox_1);
		
		JLabel label_4 = new JLabel("月");
		label_4.setBounds(275, 76, 12, 15);
		this.add(label_4);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(299, 71, 57, 25);
		this.add(comboBox_2);
		
		JLabel label_5 = new JLabel("日");
		label_5.setBounds(368, 76, 12, 15);
		this.add(label_5);
		
		JLabel lblNewLabel_1 = new JLabel("位置:");
		lblNewLabel_1.setBounds(41, 125, 57, 15);
		this.add(lblNewLabel_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(110, 120, 57, 25);
		this.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(203, 120, 57, 25);
		this.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(299, 120, 57, 25);
		this.add(comboBox_5);
		
		JLabel label_6 = new JLabel("区");
		label_6.setBounds(179, 125, 12, 15);
		this.add(label_6);
		
		JLabel label_7 = new JLabel("排");
		label_7.setBounds(275, 125, 12, 15);
		this.add(label_7);
		
		JLabel label_8 = new JLabel("架");
		label_8.setBounds(368, 125, 12, 15);
		this.add(label_8);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(392, 120, 57, 25);
		this.add(comboBox_6);
		
		JLabel label_9 = new JLabel("位");
		label_9.setBounds(461, 125, 12, 15);
		this.add(label_9);
		
		JButton button_1 = new JButton("新增");
		button_1.setBounds(110, 175, 94, 27);
		this.add(button_1);
		
		JButton button_2 = new JButton("清空");
		button_2.setBounds(216, 175, 94, 27);
		this.add(button_2);
		
		JButton button_3 = new JButton("返回");
		button_3.setBounds(322, 175, 94, 27);
		this.add(button_3);
	}
}
