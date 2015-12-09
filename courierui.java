import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;


public class courierui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					courierui window = new courierui();
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
	public courierui() {
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
		panel.setBounds(0, 0, 137, 58);
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
		
		JButton btnNewButton = new JButton("\u5FEB\u9012\u5458");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(0, 0, 137, 55);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u8425\u4E1A\u5385");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(0, 55, 137, 55);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u4E2D\u8F6C\u4E2D\u5FC3");
		btnNewButton_2.setBounds(0, 108, 137, 55);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u4ED3\u5E93\u7BA1\u7406");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(0, 161, 137, 55);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u8D22\u52A1");
		btnNewButton_4.setBounds(0, 214, 137, 55);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\u603B\u7ECF\u7406");
		btnNewButton_5.setBounds(0, 267, 137, 55);
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("\u7BA1\u7406\u5458");
		btnNewButton_6.setBounds(0, 320, 137, 55);
		panel_2.add(btnNewButton_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(136, 60, 746, 58);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBounds(136, 119, 746, 434);
		frame.getContentPane().add(panel_4);
		frame.setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
