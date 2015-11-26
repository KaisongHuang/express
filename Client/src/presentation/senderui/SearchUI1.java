package presentation.senderui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.JButton;


public class SearchUI1 extends JPanel{

	public SearchUI1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {	
		this.setLayout(null);	
		JLabel lblNewLabel = new JLabel("货运状态");
		lblNewLabel.setBounds(14, 28, 84, 18);
		this.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(112, 26, 127, 31);	
		JLabel label = new JLabel("订单编号");
		label.setBounds(12, 30, 72, 18);
		this.add(label);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(106, 13, 138, 35);
		this.add(textArea_2);
		
		JLabel label_1 = new JLabel("历史轨迹");
		label_1.setBounds(240, 62, 72, 18);
		this.add(label_1);
		
		JTextArea textArea_3 = new JTextArea();
	
		textArea_3.setBounds(35, 93, 519, 307);
		this.add(textArea_3);
		
		JButton button = new JButton("返回");
		button.setBounds(777, 499, 92, 27);
		this.add(button);
	}
}
