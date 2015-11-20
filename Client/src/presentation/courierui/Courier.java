package presentation.courierui;
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


public class Courier extends JPanel{


	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;



	/**
	 * Create the application.
	 */
	public Courier() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		this.setBackground(Color.LIGHT_GRAY);
		this.setBounds(136, 116, 746, 434);
	
		this.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(487, 13, 2, 2);
		this.add(scrollPane);
		
		JLabel lblNewLabel_1 = new JLabel("\u5BC4\u4EF6\u4EBA\u4FE1\u606F");
		lblNewLabel_1.setBounds(322, 0, 72, 18);
		this.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u5BC4\u4EF6\u4EBA\u59D3\u540D\uFF1A");
		lblNewLabel_2.setBounds(10, 13, 72, 30);
		this.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(83, 13, 84, 30);
		this.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u5730\u5740\uFF1A");
		lblNewLabel_3.setBounds(200, 19, 45, 18);
		this.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(257, 13, 122, 30);
		this.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("\u5355\u4F4D\uFF1A");
		label.setBounds(434, 19, 55, 18);
		this.add(label);
		
		textField_2 = new JTextField();
		textField_2.setBounds(497, 15, 122, 30);
		this.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\u7535\u8BDD\uFF1A");
		lblNewLabel_4.setBounds(10, 60, 55, 18);
		this.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(72, 54, 107, 30);
		this.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_1 = new JLabel("\u6536\u4EF6\uFF1A");
		label_1.setBounds(232, 60, 55, 18);
		this.add(label_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(322, 54, 122, 30);
		this.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\u6536\u4EF6\u4EBA\u4FE1\u606F");
		lblNewLabel_5.setBounds(324, 96, 70, 18);
		this.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u6536\u4EF6\u4EBA\u59D3\u540D\uFF1A ");
		lblNewLabel_6.setBounds(10, 117, 83, 18);
		this.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(91, 114, 81, 30);
		this.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("\u5730\u5740\uFF1A");
		lblNewLabel_7.setBounds(200, 117, 55, 18);
		this.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(257, 114, 122, 30);
		this.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel label_2 = new JLabel("\u5355\u4F4D\uFF1A");
		label_2.setBounds(434, 120, 55, 18);
		this.add(label_2);
		
		textField_7 = new JTextField();
		textField_7.setBounds(500, 112, 120, 30);
		this.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewlabel = new JLabel("\u7535\u8BDD\uFF1A");
		lblNewlabel.setBounds(9, 163, 55, 18);
		this.add(lblNewlabel);
		
		textField_8 = new JTextField();
		textField_8.setBounds(77, 156, 105, 30);
		this.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel label_3 = new JLabel("\u6536\u4EF6\uFF1A");
		label_3.setBounds(233, 165, 55, 18);
		this.add(label_3);
		
		textField_9 = new JTextField();
		textField_9.setBounds(329, 160, 122, 30);
		this.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel label_4 = new JLabel("\u8D27\u7269\u4FE1\u606F");
		label_4.setBounds(329, 201, 55, 18);
		this.add(label_4);
		
		JLabel label_5 = new JLabel("\u539F\u4EF6\u6570\uFF1A");
		label_5.setBounds(10, 226, 55, 18);
		this.add(label_5);
		
		textField_10 = new JTextField();
		textField_10.setBounds(83, 220, 107, 30);
		this.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("\u5B9E\u9645\u91CD\u91CF\uFF1A");
		lblNewLabel_8.setBounds(232, 226, 72, 18);
		this.add(lblNewLabel_8);
		
		textField_11 = new JTextField();
		textField_11.setBounds(322, 220, 122, 30);
		this.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("\u4F53\u79EF\uFF1A");
		lblNewLabel_9.setBounds(471, 226, 55, 18);
		this.add(lblNewLabel_9);
		
		textField_12 = new JTextField();
		textField_12.setBounds(528, 221, 122, 30);
		this.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("\u5185\u4EF6\u54C1\u540D\uFF1A");
		lblNewLabel_10.setBounds(10, 265, 72, 18);
		this.add(lblNewLabel_10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(83, 259, 122, 30);
		this.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("\u5C3A\u5BF8\uFF1A");
		lblNewLabel_11.setBounds(232, 265, 55, 18);
		this.add(lblNewLabel_11);
		
		textField_14 = new JTextField();
		textField_14.setBounds(325, 260, 122, 30);
		this.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("\u5305\u88C5\uFF1A");
		lblNewLabel_12.setBounds(14, 316, 55, 18);
		this.add(lblNewLabel_12);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(81, 312, 96, 28);
		this.add(comboBox);
		
		JLabel label_6 = new JLabel("\u5FEB\u9012\u65B9\u5F0F\uFF1A");
		label_6.setBounds(240, 317, 64, 18);
		this.add(label_6);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(329, 311, 84, 28);
		this.add(comboBox_1);
		
		JButton btnNewButton_10 = new JButton("\u4FDD\u5B58");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_10.setBounds(138, 384, 90, 30);
		this.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("\u6E05\u7A7A");
		btnNewButton_11.setBounds(529, 384, 90, 30);
		this.add(btnNewButton_11);
		
	}
}
