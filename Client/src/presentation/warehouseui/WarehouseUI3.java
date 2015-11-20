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
import javax.swing.JList;


public class WarehouseUI3 extends JPanel{

	private JTextField textField;


	/**
	 * Create the application.
	 */
	public WarehouseUI3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		
		JLabel label = new JLabel("当前警戒比例:");
		label.setBounds(50, 89, 86, 15);
		this.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(148, 89, 57, 15);
		this.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("设置警戒比例:");
		lblNewLabel_2.setBounds(50, 138, 86, 15);
		this.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(148, 132, 57, 27);
		this.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("当前商品比例:");
		label_1.setBounds(50, 40, 86, 15);
		this.add(label_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(148, 40, 57, 15);
		this.add(lblNewLabel_3);
		
		JButton btnNewButton_10 = new JButton("确认");
		btnNewButton_10.setBounds(217, 132, 57, 27);
		this.add(btnNewButton_10);
	}
}
