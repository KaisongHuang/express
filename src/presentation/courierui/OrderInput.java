package presentation.courierui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

import logic.courierblservice.OrderInputClass;
import vo.SenderVO;

public class OrderInput implements ActionListener {
	JButton button1;
	JButton button2;
	JButton button3;

	JLabel _label1;
	JLabel _label2;
	JLabel _label3;

	JLabel line1;
	JLabel line2;

	JFrame frame;
	JPanel panel;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	JLabel label6;
	JLabel label7;
	JLabel label8;
	JLabel label9;
	JLabel label10;
	JLabel label11;
	JLabel label12;
	JLabel label13;
	JLabel label14;
	JLabel label15;
	JLabel label16;
	JLabel combo_label1;
	JLabel combo_label2;
	JTextField field1;
	JTextField field2;
	JTextField field3;
	JTextField field4;
	JTextField field5;
	JTextField field6;
	JTextField field7;
	JTextField field8;
	JTextField field9;
	JTextField field10;
	JTextField field11;
	JTextField field12;
	JTextField field13;
	JTextField field14;
	JTextField field15;
	JTextField field16;
	JComboBox<String> combo1;
	JComboBox<String> combo2;

	int width;
	int height;

	public void init() {
		String s1[] = { "纸箱", "木箱", "快递袋" };
		String s2[] = { "经快", "标快", "特快" };

		line1 = new JLabel(
				"———————————————————————————————————————————————————————————————————");
		line2 = new JLabel(
				"———————————————————————————————————————————————————————————————————");

		combo1 = new JComboBox<String>();
		combo2 = new JComboBox<String>();
		combo_label1 = new JLabel("*包装:");
		combo_label2 = new JLabel("*种类:");
		combo1.insertItemAt(s1[0], 0);
		combo1.insertItemAt(s1[1], 1);
		combo1.insertItemAt(s1[2], 2);
		combo1.setSelectedIndex(0);

		combo2.insertItemAt(s2[0], 0);
		combo2.insertItemAt(s2[1], 1);
		combo2.insertItemAt(s2[2], 2);
		combo2.setSelectedIndex(0);

		combo_label1.setBounds(10, 410, 120, 30);
		combo1.setBounds(130, 410, 180, 30);
		combo_label2.setBounds(370, 410, 120, 30);
		combo2.setBounds(490, 410, 180, 30);
		frame = new JFrame();
		frame.setSize(800, 600);
		frame.setUndecorated(true);
		panel = new JPanel();
		frame.add(panel);
		panel.setLayout(null);

		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		width = screensize.width;
		height = screensize.height;

		frame.setLocation(width / 2 - 400, height / 2 - 300);

		_label1 = new JLabel("寄件人信息");
		_label2 = new JLabel("收件人信息");
		_label3 = new JLabel("货物信息");

		_label1.setBounds(350, 30, 120, 30);
		_label2.setBounds(350, 170, 120, 30);
		_label3.setBounds(350, 310, 120, 30);

		line1.setBounds(0, 172, 800, 5);
		line2.setBounds(0, 312, 800, 5);

		label1 = new JLabel("*寄件人姓名:");
		label2 = new JLabel("*单位:");
		label3 = new JLabel("*地址:");
		label4 = new JLabel("电话:");
		label5 = new JLabel("*手机:");
		label6 = new JLabel("*收件人地址:");
		label7 = new JLabel("*单位:");
		label8 = new JLabel("*地址:");
		label9 = new JLabel("电话:");
		label10 = new JLabel("*手机:");
		label11 = new JLabel("*原件数:");
		label12 = new JLabel("*实际重量:");
		label13 = new JLabel("*体积:");
		label14 = new JLabel("*内件品名:");
		label15 = new JLabel("*尺寸:");
		label16 = new JLabel("*条形码号:");

		field1 = new JTextField();
		field2 = new JTextField();
		field3 = new JTextField();
		field4 = new JTextField();
		field5 = new JTextField();
		field6 = new JTextField();
		field7 = new JTextField();
		field8 = new JTextField();
		field9 = new JTextField();
		field10 = new JTextField();
		field11 = new JTextField();
		field12 = new JTextField();
		field13 = new JTextField();
		field14 = new JTextField();
		field15 = new JTextField();
		field16 = new JTextField();

		button1 = new JButton("保存");
		button2 = new JButton("清空");
		button3 = new JButton("返回");

		label1.setBounds(10, 60, 120, 30);
		field1.setBounds(130, 60, 120, 30);
		label2.setBounds(250, 60, 120, 30);
		field2.setBounds(370, 60, 360, 30);
		label3.setBounds(10, 100, 120, 30);
		field3.setBounds(130, 100, 600, 30);
		label4.setBounds(10, 140, 120, 30);
		field4.setBounds(130, 140, 240, 30);
		label5.setBounds(370, 140, 120, 30);
		field5.setBounds(490, 140, 240, 30);

		label6.setBounds(10, 200, 120, 30);
		field6.setBounds(130, 200, 120, 30);
		label7.setBounds(250, 200, 120, 30);
		field7.setBounds(370, 200, 360, 30);
		label8.setBounds(10, 240, 120, 30);
		field8.setBounds(130, 240, 600, 30);
		label9.setBounds(10, 280, 120, 30);
		field9.setBounds(130, 280, 240, 30);
		label10.setBounds(370, 280, 120, 30);
		field10.setBounds(490, 280, 240, 30);

		label11.setBounds(10, 340, 120, 30);
		field11.setBounds(130, 340, 120, 30);
		label12.setBounds(250, 340, 120, 30);
		field12.setBounds(370, 340, 120, 30);
		label13.setBounds(490, 340, 120, 30);
		field13.setBounds(610, 340, 120, 30);
		label14.setBounds(10, 370, 120, 30);
		field14.setBounds(130, 370, 120, 30);
		label15.setBounds(490, 370, 120, 30);
		field15.setBounds(610, 370, 120, 30);

		label16.setBounds(10, 450, 120, 30);
		field16.setBounds(130, 450, 600, 30);

		button1.setBounds(100, 500, 60, 40);
		button2.setBounds(350, 500, 60, 40);
		button3.setBounds(600, 500, 60, 40);

		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(label3);
		panel.add(field3);
		panel.add(label4);
		panel.add(field4);
		panel.add(label5);
		panel.add(field5);
		panel.add(label6);
		panel.add(field6);
		panel.add(label7);
		panel.add(field7);
		panel.add(label8);
		panel.add(field8);
		panel.add(label9);
		panel.add(field9);
		panel.add(label10);
		panel.add(field10);
		panel.add(label11);
		panel.add(field11);
		panel.add(label12);
		panel.add(field12);
		panel.add(label13);
		panel.add(field13);
		panel.add(label14);
		panel.add(field14);
		panel.add(label15);
		panel.add(field15);
		panel.add(label16);
		panel.add(field16);
		panel.add(combo1);
		panel.add(combo_label1);
		panel.add(combo2);
		panel.add(combo_label2);
		panel.add(_label1);
		panel.add(_label2);
		panel.add(_label3);
		panel.add(line1);
		panel.add(line2);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);

		combo1.setBackground(Color.WHITE);
		combo2.setBackground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		frame.setVisible(true);

		button2.addActionListener(this);
		button3.addActionListener(this);
		button1.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button3) {
			frame.dispose();
		}
		if (e.getSource() == button2) {
			field1.setText("");
			field2.setText("");
			field3.setText("");
			field4.setText("");
			field5.setText("");
			field6.setText("");
			field7.setText("");
			field8.setText("");
			field9.setText("");
			field10.setText("");
			field11.setText("");
			field12.setText("");
			field13.setText("");
			field14.setText("");
			field15.setText("");
			field16.setText("");
			
		}

		if(e.getSource()==button1){
			new OrderInputClass().OrderInput(new SenderVO());
		}
	}
	
	public SenderVO read(){
		
		String SenderName = field1.getText();
		String SenderAddress = field2.getText();
		String SenderCompany = field3.getText();
		String SenderCall = field4.getText();
		String SenderPhone = field5.getText();
		String RecipientName = field6.getText();
		String RecipientAddress = field7.getText();
		String RecipientCompany = field8.getText();
		String RecipientCall = field9.getText();
		String RecipientPhone = field10.getText();
		int pcs = Integer.valueOf(field11.getText());
		int weight = Integer.valueOf(field12.getText());
		int volume = Integer.valueOf(field13.getText());
		int commodity = Integer.valueOf(field14.getText());
		String size = field15.getText();
		String bagging = (String) combo1.getSelectedItem();
		int BarCode = Integer.valueOf(field16.getText());
		String type = (String) combo2.getSelectedItem();
		
		
		return new SenderVO(SenderName,SenderAddress,SenderCompany,SenderCall,SenderPhone,
			    RecipientName,RecipientAddress,RecipientCompany,RecipientCall,RecipientPhone,
			    pcs,weight,volume,commodity,
			    size,bagging,BarCode,type);
		
	}

}