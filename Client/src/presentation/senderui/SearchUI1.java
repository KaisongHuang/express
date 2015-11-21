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





	/**
	 * Create the application.
	 */
	public SearchUI1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBounds(100, 100, 900, 600);
	
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(87, 13, 436, 70);
		this.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8D27\u8FD0\u72B6\u6001\uFF1A");
		lblNewLabel.setBounds(14, 28, 84, 18);
		panel.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(112, 26, 127, 31);
		panel.add(textArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(90, 96, 652, 430);
		this.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, -12, 301, 61);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label = new JLabel("\u8BA2\u5355\u53F7\uFF1A");
		label.setBounds(12, 30, 72, 18);
		panel_2.add(label);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(106, 13, 138, 35);
		panel_2.add(textArea_2);
		
		JLabel label_1 = new JLabel("\u5386\u53F2\u8F68\u8FF9");
		label_1.setBounds(240, 62, 72, 18);
		panel_1.add(label_1);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setText("\u5386\u53F2\u8F68\u8FF9\u5C55\u793A\u533A");
		textArea_3.setBounds(35, 93, 519, 307);
		panel_1.add(textArea_3);
		
		JButton button = new JButton("\u8FD4\u56DE");
		button.setBounds(777, 499, 92, 27);
		this.add(button);
	}
}
