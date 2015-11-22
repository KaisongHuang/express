package presentation.warehouseui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.UIManager;


public class WarehouseUI1_1 extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Create the application.
	 */
	public WarehouseUI1_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		
		JButton button_1 = new JButton("新建出库单");
		button_1.setBackground(UIManager.getColor("Button.background"));
		button_1.setBounds(6, 6, 94, 27);
		this.add(button_1);
		
		JButton button_2 = new JButton("新建入库单");
		button_2.setBackground(new Color(255, 248, 220));
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
		label_1.setBounds(6, 45, 57, 15);
		panel_5.add(label_1);
		
		JLabel label_2 = new JLabel("目的地:");
		label_2.setBounds(236, 6, 57, 15);
		panel_5.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(298, -1, 122, 27);
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox<?> comboBox = new JComboBox<Object>();
		comboBox.setBounds(75, 39, 70, 25);
		panel_5.add(comboBox);
		
		JLabel label_3 = new JLabel("年");
		label_3.setBounds(157, 45, 57, 15);
		panel_5.add(label_3);
		
		JComboBox<?> comboBox_1 = new JComboBox<Object>();
		comboBox_1.setBounds(200, 41, 70, 25);
		panel_5.add(comboBox_1);
		
		JLabel label_4 = new JLabel("月");
		label_4.setBounds(282, 45, 57, 15);
		panel_5.add(label_4);
		
		JComboBox<?> comboBox_2 = new JComboBox<Object>();
		comboBox_2.setBounds(318, 41, 70, 25);
		panel_5.add(comboBox_2);
		
		JLabel label_5 = new JLabel("日");
		label_5.setBounds(390, 45, 57, 15);
		panel_5.add(label_5);
		
		JButton btnNewButton_10 = new JButton("确认");
		btnNewButton_10.setBounds(75, 126, 94, 27);
		panel_5.add(btnNewButton_10);
		
		JButton button_3 = new JButton("清空");
		button_3.setBounds(200, 126, 94, 27);
		panel_5.add(button_3);
		
		JButton button_4 = new JButton("返回");
		button_4.setBounds(328, 126, 94, 27);
		panel_5.add(button_4);
		
		JLabel label_6 = new JLabel("区号:");
		label_6.setBounds(6, 83, 61, 16);
		panel_5.add(label_6);
		
		JComboBox<?> comboBox_3 = new JComboBox<Object>();
		comboBox_3.setBounds(75, 76, 70, 27);
		panel_5.add(comboBox_3);
		
		JLabel label_7 = new JLabel("排号:");
		label_7.setBounds(157, 83, 61, 16);
		panel_5.add(label_7);
		
		JComboBox<?> comboBox_4 = new JComboBox<Object>();
		comboBox_4.setBounds(200, 79, 70, 27);
		panel_5.add(comboBox_4);
		
		JLabel label_8 = new JLabel("架号:");
		label_8.setBounds(282, 83, 61, 16);
		panel_5.add(label_8);
		
		JComboBox<?> comboBox_5 = new JComboBox<Object>();
		comboBox_5.setBounds(318, 78, 70, 27);
		panel_5.add(comboBox_5);
		
		JLabel label_9 = new JLabel("位号:");
		label_9.setBounds(390, 83, 61, 16);
		panel_5.add(label_9);
		
		JComboBox<?> comboBox_6 = new JComboBox<Object>();
		comboBox_6.setBounds(435, 79, 70, 27);
		panel_5.add(comboBox_6);
	}
}
