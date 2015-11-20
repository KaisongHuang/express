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


public class Manager3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager3 window = new Manager3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Manager3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 137, 109);
		frame.getContentPane().add(panel);
		
		JLabel lblPic = new JLabel("pic");
		panel.add(lblPic);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(136, 0, 746, 58);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u67D0\u67D0\u90E8\u95E8 XXX \u6B22\u8FCE\u4F7F\u7528XXXXX\u7CFB\u7EDF");
		lblNewLabel.setBounds(14, 13, 309, 32);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 60, 137, 493);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("\u8425\u4E1A\u5385");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(0, 105, 137, 55);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("\u4ED3\u5E93\u7BA1\u7406");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(0, 215, 137, 55);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u8D22\u52A1");
		btnNewButton_4.setBounds(0, 270, 137, 55);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\u603B\u7ECF\u7406");
		btnNewButton_5.setBackground(new Color(255, 248, 220));
		btnNewButton_5.setBounds(0, 325, 137, 55);
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("\u7BA1\u7406\u5458");
		btnNewButton_6.setBounds(0, 380, 137, 55);
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton = new JButton("\u5FEB\u9012\u5458");
		btnNewButton.setBounds(0, 50, 137, 55);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("\u4E2D\u8F6C\u4E2D\u5FC3");
		btnNewButton_2.setBounds(0, 157, 137, 55);
		panel_2.add(btnNewButton_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(136, 58, 746, 58);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_8 = new JButton("\u673A\u6784\u7BA1\u7406");
		btnNewButton_8.setBounds(137, 0, 137, 55);
		panel_3.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("\u4EBA\u5458\u7BA1\u7406");
		btnNewButton_7.setBounds(0, 0, 137, 55);
		panel_3.add(btnNewButton_7);
		
		JButton btnNewButton_9 = new JButton("\u5BA1\u6279\u5355\u636E");
		btnNewButton_9.setBounds(272, 0, 137, 55);
		panel_3.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("\u67E5\u770B\u7EDF\u8BA1\u5206\u6790");
		btnNewButton_10.setBackground(new Color(255, 248, 220));
		btnNewButton_10.setBounds(409, 0, 137, 55);
		panel_3.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("\u5236\u5B9A");
		btnNewButton_11.setBounds(549, 0, 137, 55);
		panel_3.add(btnNewButton_11);
		frame.setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
