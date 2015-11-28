package presentation.centreui;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import listener.centrelistener.CentreMenuListener;

public class CentreMenuUI extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CardLayout card;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private int width;
	private int height;
	CentreMenuListener centreMenuListener;

	/**
	 * Create the application.
	 * @param width 
	 * @param width 
	 * @param frame 
	 */
	public CentreMenuUI(CardLayout card, int width, int hieght, JFrame frame) {
		centreMenuListener = new CentreMenuListener(this, card,frame);
		this.card = card;
		width = width;
		height = hieght;

		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
        this.setSize(width,height);
		this.setLayout(null);

		button2 = new JButton("飞机装运");
		button2.setBounds(0, height / 6, width, height/6);
		button2.addActionListener(centreMenuListener);
		this.add(button2);

		button2 = new JButton("火车装运");
		button2.setBounds(0, 2*height / 6, width, height/6);
		button2.addActionListener(centreMenuListener);
		this.add(button2);
		
		button2 = new JButton("汽车装运");
		button2.setBounds(0, 3*height / 6, width, height/6);
		button2.addActionListener(centreMenuListener);
		this.add(button2);
		
		button1 = new JButton("接受单");
		button1.setBackground(new Color(255, 248, 220));
		button1.setBounds(0, 0, width, height / 6);
		button1.addActionListener(centreMenuListener);
		this.add(button1);
		System.out.println("ok");

	}

	public JButton getButton1() {
		return button1;
	}
	public JButton getButton2() {
		return button2;
	}
    public JButton getButton3(){
    	return button3;
    }
    public JButton getButton4(){
    	return button4;
    }

	public CardLayout getCard() {
		return card;
	}

	public void setCard(CardLayout card) {
		this.card = card;
	}

}
