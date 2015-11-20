package presentation.financeui;

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


public class FinanceUI4 extends JPanel{

	private JTextField textField;

	/**
	 * Create the application.
	 */
	public FinanceUI4() {
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
//		JButton btnNewButton_7 = new JButton("结算管理");
//		btnNewButton_7.setBackground(UIManager.getColor("Button.background"));
//		btnNewButton_7.setBounds(0, 0, 137, 55);
//		panel_3.add(btnNewButton_7);
//		
//		JButton btnNewButton_8 = new JButton("成本管理");
//		btnNewButton_8.setBounds(137, 0, 137, 55);
//		panel_3.add(btnNewButton_8);
//		
//		JButton btnNewButton_9 = new JButton("统计报表");
//		btnNewButton_9.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		btnNewButton_9.setBounds(271, 0, 130, 55);
//		panel_3.add(btnNewButton_9);
//		
//		JButton btnNewButton_12 = new JButton("账户管理");
//		btnNewButton_12.setBackground(new Color(255, 248, 220));
//		btnNewButton_12.setBounds(400, 0, 137, 55);
//		panel_3.add(btnNewButton_12);
		
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		
		JLabel label = new JLabel("请输入银行账号关键字段:");
		label.setBounds(60, 41, 143, 15);
		this.add(label);
		
		textField = new JTextField();
		textField.setBounds(215, 35, 143, 27);
		this.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("查询");
		button.setBounds(370, 35, 94, 27);
		this.add(button);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(60, 95, 398, 181);
		this.add(textArea);
		
		JLabel label_1 = new JLabel("账号");
		label_1.setBounds(215, 80, 57, 15);
		this.add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("余额");
		lblNewLabel_1.setBounds(380, 80, 57, 15);
		this.add(lblNewLabel_1);
		
		JLabel label_2 = new JLabel("操作");
		label_2.setBounds(485, 80, 57, 15);
		this.add(label_2);
		
		JButton btnNewButton_10 = new JButton("修改");
		btnNewButton_10.setBounds(470, 146, 57, 27);
		this.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("删除");
		btnNewButton_11.setBounds(470, 185, 57, 27);
		this.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("新增");
		btnNewButton_13.setBounds(470, 107, 57, 27);
		this.add(btnNewButton_13);
		
		JButton button_1 = new JButton("期初建账");
		button_1.setBounds(448, 288, 94, 27);
		this.add(button_1);
		
		JButton btnNewButton_14 = new JButton("期初信息");
		btnNewButton_14.setBounds(448, 327, 94, 27);
		this.add(btnNewButton_14);
	}
}
