package presentation.senderui;


import listener.senderlistener.SenderListener0;
import presentation.MySwing.MyButton;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;

import java.awt.Color;


public class SearchUI extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	JLabel label;
	MyButton btnNewButton;
	public SearchUI() {
		this.setBackground(Color.white);
		this.setBounds(200,100,900,600);
		this.setLayout(null);
		label = new JLabel("订单编号：");


//		label.setBounds(152, 206, 200, 200);
//		ImageIcon icon1 = new ImageIcon(getClass().getResource("./image/search.png"));
//		icon1.setImage(icon1.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
//		label.setIcon(icon1);
//		this.add(label);

		textField = new JTextField();
		textField.setBounds(295, 203, 273, 24);
		this.add(textField);
		textField.setColumns(10);

		btnNewButton = new MyButton("查询");
		btnNewButton.addActionListener(new SenderListener0(this));


		btnNewButton.setBounds(650, 200, 113, 27);
		this.add(btnNewButton);
		this.setBackground(new Color(30,30,30));

		this.setVisible(true);
	}

	public String gettextFieldContent(){
		return textField.getText();
	}
}
