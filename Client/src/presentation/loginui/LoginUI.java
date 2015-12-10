package presentation.loginui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import listener.mainlistener.LoginListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class LoginUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField1;
	private JButton Login;
	private LoginListener listener;
	private JButton logout;
	private JLabel lblUserName;
	private JLabel lblPassword;
	private JLabel label1;
	private JLabel label2;
	private int height = 600;
	private int width = 900;

	/**
	 * Create the frame.
	 */
	public LoginUI() {
		this.setUndecorated(true);

		label1 = new JLabel();
		label2 = new JLabel();

		listener = new LoginListener(this);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblUserName = new JLabel("User Name:");
		lblUserName.setBounds(254, 233, 79, 16);
		contentPane.add(lblUserName);

		lblPassword = new JLabel("Password:");
		lblPassword.setBounds(264, 296, 79, 16);
		contentPane.add(lblPassword);

		textField = new JTextField();
		textField.setBounds(345, 227, 134, 28);
		contentPane.add(textField);
		textField.setColumns(10);

		textField1 = new JTextField();
		textField1.setBounds(345, 290, 134, 28);
		contentPane.add(textField1);
		textField1.setColumns(10);

		logout = new JButton();
		logout.setBounds(840, 0, 30, 30);
		contentPane.add(logout);
		logout.addActionListener(listener);
		
		Login = new JButton();
		Login.setBounds(345, 349, 134, 28);
		contentPane.add(Login);
		Login.addActionListener(listener);
		;

		this.setImage();
		this.setVisible(true);
	}

	private void setImage() {

		label1.setBounds(0, height / 5, width, 4 * height / 5);
		label2.setBounds(0, 0, width, height / 5);

		ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/蓝色背景.png"));
		icon1.setImage(icon1.getImage().getScaledInstance(width, 4 * height / 5, Image.SCALE_DEFAULT));
		ImageIcon icon2 = new ImageIcon(this.getClass().getResource("/装饰图.png"));
		icon2.setImage(icon2.getImage().getScaledInstance(width, height / 5, Image.SCALE_DEFAULT));
		ImageIcon icon3 = new ImageIcon(this.getClass().getResource("/绿色圆角大按钮.png"));
		icon3.setImage(icon3.getImage().getScaledInstance(Login.getWidth(), Login.getHeight(), Image.SCALE_DEFAULT));

		label1.setIcon(icon1);
		label2.setIcon(icon2);

		Login.setIcon(icon3);
		Login.setContentAreaFilled(false);
		Login.setBorderPainted(false);

		logout.setBorderPainted(false);
		ImageIcon icon4 = new ImageIcon(this.getClass().getResource("/红色按钮.png"));
		icon4.setImage(icon4.getImage().getScaledInstance(logout.getWidth(), logout.getHeight(), Image.SCALE_DEFAULT));
		logout.setIcon(icon4);
		logout.setContentAreaFilled(false);
		
		contentPane.add(label1);
		contentPane.add(label2);
	}

	public JTextField getText() {
		return textField;
	}

	public JTextField getText1() {
		return textField1;
	}

	public JButton getLogout() {
		return logout;

	}

	public JButton getLogin() {
		return Login;
	}
}
