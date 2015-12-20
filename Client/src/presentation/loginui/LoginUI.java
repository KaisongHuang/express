package presentation.loginui;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import listener.mainlistener.LoginListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class LoginUI extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField1;
	private JButton Login;
	private LoginListener listener;
	private JButton logout;
	private JLabel lblUserName;
	private JLabel lblPassword;
	private JLabel label;
	private int height = 600;
	private int width = 900;
    private JLabel label1;
	/**
	 * Create the frame.
	 */
	public LoginUI() {
		setBackground(Color.white);
		this.setUndecorated(true);
		
		
		
		label = new JLabel();

		listener = new LoginListener(this);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
        contentPane.setBackground(new Color(158,211,240));
		lblUserName = new JLabel("用户名");
		lblUserName.setBounds(500, 233, 50, 16);
		contentPane.add(lblUserName);
		
		
	
		lblPassword = new JLabel("密码");
		lblPassword.setBounds(500, 300, 50, 16);
		contentPane.add(lblPassword);

		textField = new JTextField();
		textField.setBounds(550, 227, 134, 28);
		contentPane.add(textField);
		textField.setColumns(10);

		textField1 = new JPasswordField();
		textField1.setBounds(550,295, 134, 28);
		contentPane.add(textField1);
		textField1.setColumns(10);

		logout = new JButton();
		logout.setBounds(870, 0, 30, 30);
		contentPane.add(logout);
		logout.addActionListener(listener);
		
		Login = new JButton("登录");
		Login.setBounds(560, 348, 100, 28);
		contentPane.add(Login);
		Login.addActionListener(listener);
		setImage();
		label1=new JLabel();
		contentPane.add(label1);
		label1.setBounds(244, 222, 196, 172);
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/人物/登录图标.png"));
		icon.setImage(icon.getImage().getScaledInstance(label1.WIDTH, label1.HEIGHT, Image.SCALE_DEFAULT));
		label1.setIcon(icon);
		this.setVisible(true);
	}

	private void setImage() {

		label.setBounds(0, 0, width, height / 5);

		
		ImageIcon icon2 = new ImageIcon(this.getClass().getResource("/背景/装饰图.png"));
		icon2.setImage(icon2.getImage().getScaledInstance(width, height / 5, Image.SCALE_DEFAULT));
		label.setIcon(icon2);

		Login.setBackground(new Color(207,248,240));


		logout.setBorderPainted(false);
		ImageIcon icon4 = new ImageIcon(this.getClass().getResource("/按钮/红色按钮.png"));
		icon4.setImage(icon4.getImage().getScaledInstance(logout.getWidth(), logout.getHeight(), Image.SCALE_DEFAULT));
		logout.setIcon(icon4);
		logout.setContentAreaFilled(false);
		contentPane.add(label);
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
