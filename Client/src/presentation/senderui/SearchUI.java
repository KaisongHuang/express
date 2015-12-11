package presentation.senderui;


import java.awt.Image;

import javax.swing.JPanel;
import listener.senderlistener.SenderListener0;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;


public class SearchUI extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	JLabel label;
	JButton btnNewButton;
	private String path=System.getProperty("user.dir")+"\\Client\\";

	public SearchUI() {
	    path.replaceAll("/", "\\");
		this.setBounds(200,100,900,600);
		this.setLayout(null);
		label = new JLabel("订单编号：");
		label.setIcon(new ImageIcon("D:\\Java\\express\\Client\\image\\search.png"));

		label.setBounds(152, 206, 200, 200);
		ImageIcon icon1 = new ImageIcon(getClass().getResource("./image/search.png"));
		icon1.setImage(icon1.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
		label.setIcon(icon1);
		this.add(label);

		textField = new JTextField();
		textField.setBounds(295, 203, 273, 24);
		this.add(textField);
		textField.setColumns(10);

		btnNewButton = new JButton("查询");
		btnNewButton.addActionListener(new SenderListener0(this));


		btnNewButton.setBounds(650, 200, 113, 27);
		this.add(btnNewButton);
		this.setBackground(new Color(30,30,30));
	}

	public String gettextFieldContent(){
		return textField.getText();
	}
}
