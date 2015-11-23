package presentation.managerui;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import listener.managerlistener.ManagerMenuListener;


public class ManagerMenuUI extends JPanel{


	private JFrame frame;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_16;
	
	ManagerMenuListener managermenulistener;

	/**
	 * Create the application.
	 */
	public ManagerMenuUI(JFrame frame) {
		managermenulistener = new ManagerMenuListener(this);
		this.frame = frame;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	
		this.setLayout(null);
		
		btnNewButton_8 = new JButton("\u673A\u6784\u7BA1\u7406");
		btnNewButton_8.setBounds(137, 0, 137, 55);
		this.add(btnNewButton_8);
		
		btnNewButton_7 = new JButton("\u4EBA\u5458\u7BA1\u7406");
		btnNewButton_7.setBackground(new Color(255, 248, 220));
		btnNewButton_7.setBounds(0, 0, 137, 55);
		this.add(btnNewButton_7);
		
		btnNewButton_9 = new JButton("\u5BA1\u6279\u5355\u636E");
		btnNewButton_9.setBounds(272, 0, 137, 55);
		this.add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("\u67E5\u770B\u7EDF\u8BA1\u5206\u6790");
		btnNewButton_10.setBounds(409, 0, 137, 55);
		this.add(btnNewButton_10);
		
		btnNewButton_16 = new JButton("\u5236\u5B9A");
		btnNewButton_16.setBounds(546, 0, 137, 55);
		this.add(btnNewButton_16);
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JButton getBtnNewButton_7() {
		return btnNewButton_7;
	}

	public void setBtnNewButton_7(JButton btnNewButton_7) {
		this.btnNewButton_7 = btnNewButton_7;
	}

	public JButton getBtnNewButton_8() {
		return btnNewButton_8;
	}

	public void setBtnNewButton_8(JButton btnNewButton_8) {
		this.btnNewButton_8 = btnNewButton_8;
	}

	public JButton getBtnNewButton_9() {
		return btnNewButton_9;
	}

	public void setBtnNewButton_9(JButton btnNewButton_9) {
		this.btnNewButton_9 = btnNewButton_9;
	}

	public JButton getBtnNewButton_10() {
		return btnNewButton_10;
	}

	public void setBtnNewButton_10(JButton btnNewButton_10) {
		this.btnNewButton_10 = btnNewButton_10;
	}

	public JButton getBtnNewButton_16() {
		return btnNewButton_16;
	}

	public void setBtnNewButton_16(JButton btnNewButton_16) {
		this.btnNewButton_16 = btnNewButton_16;
	}
	
	
}
