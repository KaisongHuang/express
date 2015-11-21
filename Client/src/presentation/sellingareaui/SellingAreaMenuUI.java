package presentation.sellingareaui;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class SellingAreaMenuUI extends JPanel{

	/**
	 * Create the application.
	 */
	public SellingAreaMenuUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		this.setBounds(136, 58, 746, 58);
	
		this.setLayout(null);
		
		JButton btnNewButton_8 = new JButton("\u63A5\u6536\u4E0E\u6D3E\u4EF6");
		btnNewButton_8.setBounds(137, 0, 137, 55);
		this.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("\u6536\u6B3E\u5355");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_9.setBounds(271, 0, 137, 55);
		this.add(btnNewButton_9);
		
		JButton btnNewButton_7 = new JButton("\u8F66\u8F86\u88C5\u8F66\u7BA1\u7406");
		btnNewButton_7.setBackground(new Color(255, 248, 220));
		btnNewButton_7.setBounds(0, 0, 137, 55);
		this.add(btnNewButton_7);
		
		JButton btnNewButton_12 = new JButton("\u8F66\u8F86\u4FE1\u606F\u7BA1\u7406");
		btnNewButton_12.setBounds(405, 0, 137, 55);
		this.add(btnNewButton_12);
		
		JButton button = new JButton("\u53F8\u673A\u4FE1\u606F\u7BA1\u7406");
		button.setBounds(540, 0, 137, 55);
		this.add(button);
	
	}
}
