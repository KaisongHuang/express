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
import javax.swing.JList;


public class FinanceUI3 extends JPanel{

	/**
	 * Create the application.
	 */
	public FinanceUI3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("开始日期:");
		lblNewLabel_1.setBounds(90, 58, 57, 15);
		this.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("结束日期:");
		lblNewLabel_2.setBounds(90, 85, 57, 15);
		this.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(159, 53, 80, 25);
		this.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("年");
		lblNewLabel_3.setBounds(246, 58, 20, 15);
		this.add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(278, 53, 80, 25);
		this.add(comboBox_1);
		
		JLabel label = new JLabel("月");
		label.setBounds(370, 58, 20, 15);
		this.add(label);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(402, 53, 80, 25);
		this.add(comboBox_2);
		
		JLabel lblRi = new JLabel("日");
		lblRi.setBounds(494, 58, 20, 15);
		this.add(lblRi);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(159, 80, 80, 25);
		this.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(278, 80, 80, 25);
		this.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(402, 80, 80, 25);
		this.add(comboBox_5);
		
		JLabel label_1 = new JLabel("年");
		label_1.setBounds(246, 85, 57, 15);
		this.add(label_1);
		
		JLabel label_2 = new JLabel("月");
		label_2.setBounds(370, 85, 57, 15);
		this.add(label_2);
		
		JLabel label_3 = new JLabel("日");
		label_3.setBounds(494, 85, 57, 15);
		this.add(label_3);
		
		JLabel lblNewLabel_4 = new JLabel("/*提示信息*/");
		lblNewLabel_4.setBounds(278, 117, 80, 15);
		this.add(lblNewLabel_4);
		
		JButton button = new JButton("查看报表");
		button.setBounds(159, 148, 94, 27);
		this.add(button);
		
		JButton button_1 = new JButton("导出报表");
		button_1.setBounds(278, 148, 94, 27);
		this.add(button_1);
		
		JButton button_2 = new JButton("返回");
		button_2.setBounds(402, 148, 94, 27);
		this.add(button_2);
	}
}
