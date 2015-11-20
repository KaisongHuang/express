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


public class WarehouseUI2 extends JPanel{

	/**
	 * Create the application.
	 */
	public WarehouseUI2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(34, 29, 444, 300);
		this.add(textArea);
		
		JLabel label = new JLabel("快递编号");
		label.setBounds(85, 15, 57, 15);
		this.add(label);
		
		JLabel label_1 = new JLabel("入库日期");
		label_1.setBounds(174, 15, 57, 15);
		this.add(label_1);
		
		JLabel label_2 = new JLabel("目的地");
		label_2.setBounds(243, 15, 57, 15);
		this.add(label_2);
		
		JLabel label_3 = new JLabel("区号");
		label_3.setBounds(312, 15, 24, 15);
		this.add(label_3);
		
		JLabel label_4 = new JLabel("排号");
		label_4.setBounds(348, 15, 24, 15);
		this.add(label_4);
		
		JLabel label_5 = new JLabel("架号");
		label_5.setBounds(384, 15, 24, 15);
		this.add(label_5);
		
		JLabel label_6 = new JLabel("位号");
		label_6.setBounds(420, 15, 24, 15);
		this.add(label_6);
		
		JLabel label_7 = new JLabel("当前日期");
		label_7.setBounds(34, 341, 57, 15);
		this.add(label_7);
		
		JButton btnexcel = new JButton("导出为Excel");
		btnexcel.setBounds(384, 335, 94, 27);
		this.add(btnexcel);
		
		JLabel label_8 = new JLabel("库存查看");
		label_8.setBounds(579, 15, 57, 15);
		this.add(label_8);
		
		JLabel label_9 = new JLabel("开始日期:");
		label_9.setBounds(490, 35, 57, 15);
		this.add(label_9);
		
		JLabel label_10 = new JLabel("结束日期:");
		label_10.setBounds(490, 62, 57, 15);
		this.add(label_10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(545, 30, 64, 25);
		this.add(comboBox);
		
		JLabel label_11 = new JLabel("年");
		label_11.setBounds(608, 35, 12, 15);
		this.add(label_11);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(621, 30, 44, 25);
		this.add(comboBox_1);
		
		JLabel label_12 = new JLabel("月");
		label_12.setBounds(663, 35, 12, 15);
		this.add(label_12);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(677, 30, 44, 25);
		this.add(comboBox_2);
		
		JLabel label_13 = new JLabel("日");
		label_13.setBounds(720, 35, 12, 15);
		this.add(label_13);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(545, 57, 64, 25);
		this.add(comboBox_3);
		
		JLabel label_14 = new JLabel("年");
		label_14.setBounds(608, 62, 12, 15);
		this.add(label_14);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(621, 57, 44, 25);
		this.add(comboBox_4);
		
		JLabel label_15 = new JLabel("月");
		label_15.setBounds(663, 62, 12, 15);
		this.add(label_15);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(677, 57, 44, 25);
		this.add(comboBox_5);
		
		JLabel label_16 = new JLabel("日");
		label_16.setBounds(720, 62, 12, 15);
		this.add(label_16);
		
		JButton button_1 = new JButton("查询");
		button_1.setBounds(545, 94, 64, 27);
		this.add(button_1);
		
		JButton button_2 = new JButton("清空");
		button_2.setBounds(618, 94, 64, 27);
		this.add(button_2);
		
		JLabel lblNewLabel_1 = new JLabel("/*提示系统信息*/");
		lblNewLabel_1.setBounds(490, 133, 231, 15);
		this.add(lblNewLabel_1);
	}
}
