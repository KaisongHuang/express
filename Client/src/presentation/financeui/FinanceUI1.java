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


public class FinanceUI1 extends JPanel{
	/**
	 * Create the application.
	 */
	public FinanceUI1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("收款单位:");
		lblNewLabel_2.setBounds(95, 139, 61, 16);
		this.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("收款人:");
		lblNewLabel_3.setBounds(95, 167, 61, 16);
		this.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("收款金额:");
		lblNewLabel_4.setBounds(95, 195, 61, 16);
		this.add(lblNewLabel_4);
		
		JLabel label_1 = new JLabel("收款地点:");
		label_1.setBounds(95, 223, 61, 16);
		this.add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(185, 139, 138, 16);
		this.add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(185, 167, 138, 16);
		this.add(label_3);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setBounds(185, 195, 138, 16);
		this.add(label_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setBounds(185, 223, 138, 16);
		this.add(label_6);
		
		JButton btnNewButton_10 = new JButton("上一张");
		btnNewButton_10.setBounds(62, 309, 111, 29);
		this.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("下一张");
		btnNewButton_11.setBounds(185, 309, 111, 29);
		this.add(btnNewButton_11);
		
		JLabel label_7 = new JLabel("序号:");
		label_7.setBounds(95, 111, 61, 16);
		this.add(label_7);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(185, 111, 61, 16);
		this.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("日期:");
		lblNewLabel_7.setBounds(95, 27, 57, 15);
		this.add(lblNewLabel_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(181, 22, 61, 25);
		this.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(278, 22, 61, 25);
		this.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(377, 22, 61, 25);
		this.add(comboBox_2);
		
		JLabel label_8 = new JLabel("年");
		label_8.setBounds(254, 27, 12, 15);
		this.add(label_8);
		
		JLabel label_9 = new JLabel("合计:");
		label_9.setBounds(95, 282, 57, 15);
		this.add(label_9);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(185, 282, 57, 15);
		this.add(lblNewLabel_8);
		
		JLabel label = new JLabel("营业厅:");
		label.setBounds(95, 84, 57, 15);
		this.add(label);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(185, 74, 78, 25);
		this.add(comboBox_3);
		
		JLabel label_4 = new JLabel("月");
		label_4.setBounds(351, 27, 12, 15);
		this.add(label_4);
		
		JLabel label_10 = new JLabel("日");
		label_10.setBounds(450, 27, 17, 15);
		this.add(label_10);
	}
}
