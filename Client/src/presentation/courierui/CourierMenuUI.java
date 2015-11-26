package presentation.courierui;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import listener.courierlistener.CourierMenuListener;


public class CourierMenuUI extends JPanel{
	
	CardLayout card;
	
	
	CourierMenuListener courierlistener;


	private JButton btnNewButton_8;


	private JButton btnNewButton_9;


	private JButton btnNewButton_7;


	/**
	 * Create the application.
	 */
	public CourierMenuUI(CardLayout card) {
		this.card=card;
		courierlistener = new CourierMenuListener(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

        this.setBounds(136, 58, 746, 58);
	
        this.setLayout(null);
		
		btnNewButton_7 = new JButton("\u8BA2\u5355\u8F93\u5165");
		btnNewButton_7.setBackground(new Color(255, 248, 220));
		btnNewButton_7.setBounds(0, 0, 137, 55);
		this.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("\u6536\u4EF6\u4FE1\u606F\u8F93\u5165");
		btnNewButton_8.setBounds(137, 0, 137, 55);
		this.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("\u7269\u6D41\u4FE1\u606F\u67E5\u8BE2");
		btnNewButton_9.setBounds(271, 0, 130, 55);
		this.add(btnNewButton_9);
		
	}

	public CardLayout getCard() {
		return card;
	}

	public void setCard(CardLayout card) {
		this.card = card;
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

	public JButton getBtnNewButton_7() {
		return btnNewButton_7;
	}

	public void setBtnNewButton_7(JButton btnNewButton_7) {
		this.btnNewButton_7 = btnNewButton_7;
	}
	
	

}
