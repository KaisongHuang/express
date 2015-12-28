package presentation.senderui;
import java.awt.Color;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import listener.senderlistener.SenderListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class SearchUI extends JFrame{
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JLabel state;
    private JLabel state1;
  
    private JTextArea textArea;
    private JButton button;
    private SenderListener listen;
    private JTextField textField;
	private JLabel label;
	private JButton search;
	public SearchUI() {

		initialize();
		this.setImage();
		this.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
        listen=new SenderListener(this);
		this.setBackground(Color.white);
		getContentPane().setLayout(null);
		this.setBounds(100,100,900,480);
		JLabel state = new JLabel("货运状态:");
		state.setBounds(60, 88, 84, 18);
		getContentPane().add(state);

		
		label = new JLabel("订单编号：");
        label.setBounds(60,13,84,24);
        getContentPane().add(label);
		textField = new JTextField();
		textField.setBounds(158, 13, 228, 24);
		getContentPane().add(textField);
		textField.setColumns(10);

		search = new JButton("查询");
		search.addActionListener(listen);


		search.setBounds(400, 13,70, 27);
		getContentPane().add(search);
		
		state=new JLabel();
		state.setText("状态：");
		state.setBounds(60, 45, 50, 30);
		getContentPane().add(state);
		state1=new JLabel();
		state1.setBounds(145, 50, 132, 25);
		getContentPane().add(state1);

		JLabel label_1 = new JLabel("历史轨迹");
		label_1.setBounds(383, 101, 72, 18);
		getContentPane().add(label_1);

		textArea = new JTextArea();

		textArea.setBounds(167, 132, 519, 274);
		getContentPane().add(textArea);

		button = new JButton("返回");
		button.setBounds(729, 393, 73, 27);
		getContentPane().add(button);
		button.addActionListener(listen);

	
		this.setVisible(true);

	}


	public void setLabel2(String s){
		state1.setText(s);
	}

	public void  setText(String s){
	    textArea.append(s);;
	}
	private void setImage() {
	}

	public JButton getButton() {
		return button;
	}

	public JButton getSearch(){
		return search;
	}
	
	public String getText(){
		return textField.getText();
	}

	public void setState1(String state1) {
		this.state1.setText(state1);
	}

	
}
