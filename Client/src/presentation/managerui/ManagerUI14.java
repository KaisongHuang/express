package presentation.managerui;
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


public class ManagerUI14 extends JPanel{



	
	/**
	 * Create the application.
	 */
	public ManagerUI14() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(136, 115, 748, 438);
		
		this.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 748, 50);
		this.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton_11 = new JButton("\u67E5\u8BE2");
		btnNewButton_11.setBounds(32, 6, 90, 30);
		panel_5.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("\u66F4\u65B0");
		btnNewButton_12.setBounds(168, 6, 90, 30);
		panel_5.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("\u5220\u9664");
		btnNewButton_13.setBounds(308, 6, 90, 30);
		panel_5.add(btnNewButton_13);
		
		JButton button = new JButton("\u65E5\u5FD7\u67E5\u770B");
		button.setBackground(new Color(255, 248, 220));
		button.setBounds(580, 6, 90, 30);
		panel_5.add(button);
		
		JButton button_1 = new JButton("\u6DFB\u52A0");
		button_1.setBounds(439, 5, 90, 30);
		panel_5.add(button_1);
		
		JButton btnNewButton_15 = new JButton("New button");
		btnNewButton_15.setBounds(42, 374, 90, 30);
		this.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("New button");
		btnNewButton_16.setBounds(493, 374, 90, 30);
		this.add(btnNewButton_16);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 78, 536, 281);
		this.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
	}
}
