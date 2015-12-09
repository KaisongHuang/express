package presentation.loginui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import listener.mainlistener.LoginListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LoginUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField1;
	private JButton Login;
    private LoginListener listener;
	private JButton logout;
	/**
	 * Create the frame.
	 */
	public LoginUI() {
		this.setUndecorated(true);
        listener=new LoginListener(this);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name:");
		lblUserName.setBounds(343, 131, 79, 16);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(343, 177, 79, 16);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(434, 125, 134, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField1 = new JTextField();
		textField1.setBounds(434, 171, 134, 28);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		
		
		JLabel lblPic = new JLabel("pic");
		lblPic.setBounds(119, 83, 19, 16);
		this.add(lblPic);
		
		logout=new JButton("退出");
		logout.setBounds(840,0,60,30);
		contentPane.add(logout);
		logout.addActionListener(listener);
		Login = new JButton("Login");
		Login.setBounds(434, 211, 134, 29);
		contentPane.add(Login);
		Login.addActionListener(listener);;
		this.setVisible(true);
	}
	
	public JTextField getText(){
		return textField;
	}
	public JTextField getText1(){
		return textField1;
	}
	
	public JButton getLogout(){
		return logout;
		
	}
	public JButton getLogin(){
		return Login;
	}
}
