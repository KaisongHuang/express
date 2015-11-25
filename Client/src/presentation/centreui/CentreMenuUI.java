package presentation.centreui;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import listener.centrelistener.CentreMenuListener;


public class CentreMenuUI extends JPanel{

	private CardLayout card;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	CentreMenuListener centreMenuListener;

	/**
	 * Create the application.
	 */
	public CentreMenuUI(CardLayout card) {
		centreMenuListener = new CentreMenuListener(this);
		this.card = card;
		initialize();
	
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		
		
		this.setLayout(null);
		
		btnNewButton_8 = new JButton("\u88C5\u8FD0\u7BA1\u7406");
		btnNewButton_8.setBounds(137, 0, 137, 55);
		this.add(btnNewButton_8);
		btnNewButton_8.addActionListener(centreMenuListener);
		
		
		btnNewButton_7 = new JButton("\u63A5\u53D7\u5355");
		btnNewButton_7.setBackground(new Color(255, 248, 220));
		btnNewButton_7.setBounds(0, 0, 137, 55);
		this.add(btnNewButton_7);
		btnNewButton_7.addActionListener(centreMenuListener);
		System.out.println("ok");
		
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

	public CardLayout getCard() {
		return card;
	}

	public void setCard(CardLayout card) {
		this.card = card;
	}

	
	
	
}
