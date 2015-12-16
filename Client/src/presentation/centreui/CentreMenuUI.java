/**
 * CentreMenuUI是centre用户的主界面
 */

package presentation.centreui;

import java.awt.CardLayout;
import javax.swing.JPanel;

import listener.centrelistener.CentreMenuListener;
import presentation.button.MyButton;

public class CentreMenuUI extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private CardLayout card;
	private MyButton button1;
	private MyButton button2;
	private MyButton button3;
	private MyButton button4;
	private int width;
	private int height;
	private int label_height;
	CentreMenuListener centreMenuListener;

	/**
	 * Create the application.
	 * 
	 * @param width
	 * @param width
	 * @param panel1
	 */
	public CentreMenuUI(CardLayout card, int width, int height, JPanel panel1) {
		centreMenuListener = new CentreMenuListener(this, card, panel1);
		this.card = card;
		this.width = width;
		this.height = height;
		this.label_height = height / 10;
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setSize(width, height);
		this.setLayout(null);
		
		button1 = new MyButton("运单管理","/导航/centre/运单管理.png");// "接受单"
		button1.setBounds(0, label_height * 2, width, label_height);
		button1.addActionListener(centreMenuListener);
		button1.addMouseListener(centreMenuListener);
		button1.setClicked(true);
		this.add(button1);

		button2 = new MyButton("飞机装运","/导航/centre/飞机装运.png");// "飞机装运"
		button2.setBounds(0, label_height * 3, width, label_height);
		button2.addActionListener(centreMenuListener);
		button2.addMouseListener(centreMenuListener);
		this.add(button2);

		button3 = new MyButton("火车装运","/导航/centre/火车装运.png");// "火车装运"
		button3.setBounds(0, label_height * 4, width, label_height);
		button3.addActionListener(centreMenuListener);
		button3.addMouseListener(centreMenuListener);
		this.add(button3);

		button4 = new MyButton("汽车装运","/导航/centre/汽车装运.png");// "汽车装运"
		button4.setBounds(0, label_height * 5, width, label_height);
		button4.addActionListener(centreMenuListener);
		button4.addMouseListener(centreMenuListener);
		this.add(button4);

		

	}

	public MyButton getButton1() {
		return button1;
	}

	public MyButton getButton2() {
		return button2;
	}

	public MyButton getButton3() {
		return button3;
	}

	public MyButton getButton4() {
		return button4;
	}

	public CardLayout getCard() {
		return card;
	}

	public void setCard(CardLayout card) {
		this.card = card;
	}

}
