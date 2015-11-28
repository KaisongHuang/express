package presentation.centreui;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

import listener.centrelistener.CentreMenuListener;

public class CentreMenuUI extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CardLayout card;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private int width;
	private int height;
	CentreMenuListener centreMenuListener;

	/**
	 * Create the application.
	 */
	public CentreMenuUI(CardLayout card) {
		centreMenuListener = new CentreMenuListener(this, card);
		this.card = card;
		width = this.getWidth();
		height = this.getHeight();
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setLayout(null);

		btnNewButton_8 = new JButton("\u88C5\u8FD0\u7BA1\u7406");
		btnNewButton_8.setBounds(0, height / 5, width, height);
		btnNewButton_8.addActionListener(centreMenuListener);
		this.add(btnNewButton_8);

		btnNewButton_7 = new JButton("\u63A5\u53D7\u5355");
		btnNewButton_7.setBackground(new Color(255, 248, 220));
		btnNewButton_7.setBounds(0, 0, width, height / 5);
		btnNewButton_7.addActionListener(centreMenuListener);
		this.add(btnNewButton_7);
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
