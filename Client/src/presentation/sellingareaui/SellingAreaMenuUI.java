package presentation.sellingareaui;
import java.awt.CardLayout;
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

import listener.sellingarealistener.SellingAreaMenuListener;


public class SellingAreaMenuUI extends JPanel{
	
	private CardLayout card;
	
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_12;
	private JButton button;
	private int width;
	private int height;
	
	SellingAreaMenuListener sellingarealistener;

	/**
	 * Create the application.
	 */
	public SellingAreaMenuUI(CardLayout card) {
		this.card=card;
		sellingarealistener = new SellingAreaMenuListener(this);
		width=this.getWidth();
		height=this.getHeight();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		this.setLayout(null);
		
		btnNewButton_8 = new JButton("8\u63A5\u6536\u4E0E\u6D3E\u4EF6");
		btnNewButton_8.setBounds(0, height/5, width, height/5);
		this.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("9\u6536\u6B3E\u5355");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_9.setBounds(0, 2*height/5, 137, 55);
		this.add(btnNewButton_9);
		
		btnNewButton_7 = new JButton("7\u8F66\u8F86\u88C5\u8F66\u7BA1\u7406");
		btnNewButton_7.setBackground(new Color(255, 248, 220));
		btnNewButton_7.setBounds(0, 0, width, height/5);
		this.add(btnNewButton_7);
		
		btnNewButton_12 = new JButton("12\u8F66\u8F86\u4FE1\u606F\u7BA1\u7406");
		btnNewButton_12.setBounds(0, 3*height/5, 137, 55);
		this.add(btnNewButton_12);
		
		button = new JButton("\u53F8\u673A\u4FE1\u606F\u7BA1\u7406");
		button.setBounds(0, 4*height/5, width, height/5);
		this.add(button);
		
		btnNewButton_7.addActionListener(sellingarealistener);
		btnNewButton_8.addActionListener(sellingarealistener);
		btnNewButton_9.addActionListener(sellingarealistener);
		btnNewButton_12.addActionListener(sellingarealistener);
		button.addActionListener(sellingarealistener);
	
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

	public JButton getBtnNewButton_12() {
		return btnNewButton_12;
	}

	public void setBtnNewButton_12(JButton btnNewButton_12) {
		this.btnNewButton_12 = btnNewButton_12;
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}

	public CardLayout getCard() {
		return card;
	}

	public void setCard(CardLayout card) {
		this.card = card;
	}
	
	
}
