package presentation.senderui;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTree;

import listener.senderlistener.SenderListener1;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class SearchUI1 extends JPanel{
    JLabel label1;
    JLabel label2;
    JTextArea textArea;
    SenderListener1 listen;
    private int width = 900;
    private int height = 600;
    private JLabel label3;
	public SearchUI1() {
		listen=new SenderListener1(this);
		initialize();
		this.setImage();
		this.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {	
		this.setLayout(null);	
		this.setBounds(100,100,900,600);
		JLabel lblNewLabel = new JLabel("货运状态:");
		lblNewLabel.setBounds(60, 28, 84, 18);
		this.add(lblNewLabel);
		
		label1=new JLabel();
		label1.setBounds(160, 28, 127, 31);	
		JLabel label = new JLabel("订单编号:");
		label.setBounds(60, 60, 84, 18);
		this.add(label);
		
		label2=new JLabel();
		label2.setBounds(160, 13, 138, 35);
		this.add(label2);
		
		JLabel label_1 = new JLabel("历史轨迹");
		label_1.setBounds(260, 90, 72, 18);
		this.add(label_1);
		
		textArea = new JTextArea();
	
		textArea.setBounds(100, 120, 519, 307);
		this.add(textArea);
		
		JButton button = new JButton("返回");
		button.setBounds(700, 499, 92, 27);
		this.add(button);
		button.addActionListener(listen);
	}
	public JLabel getLabel1(){
		return label1;
	}
	public JLabel getLabel2(){
		return label2;
	}
	
	public JTextArea getText(){
		return textArea;
	}
	private void setImage() {
		label3 = new JLabel();
		label3.setBounds(0, 0, width,height);
		ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/蓝色背景.png"));
		icon1.setImage(icon1.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));

		label3.setIcon(icon1);
		this.add(label3);
	}
	
}
