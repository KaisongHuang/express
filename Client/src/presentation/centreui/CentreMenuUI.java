/**
 * CentreMenuUI是centre用户的主界面
 */

package presentation.centreui;

import java.awt.CardLayout;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listener.centrelistener.CentreMenuListener;
import presentation.MySwing.MySeperator;
import presentation.MySwing.NaviButton;
import presentation.MySwing.ShowTimePanel;

public class CentreMenuUI extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private CardLayout card;
	private NaviButton button1;
	private NaviButton button2;
	private NaviButton button3;
	private NaviButton button4;
	private JLabel user;
	private ShowTimePanel time;
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
		this.setBackground(new Color(246,246,246));
		
		user=new JLabel();
		user.setBounds(10, 20, 50, 50);
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/圆形/中转中心.jpg"));
		icon.setImage(icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		user.setIcon(icon);
		add(user);
		
		time=new ShowTimePanel();
		time.setBounds(75, 10, 80, 70);
		time.setBackground(new Color(246,246,246));
		add(time);
		
		MySeperator line=new MySeperator();
		line.setBounds(width/20, label_height*7/4, width*9/10, label_height);
		add(line);
		
		button1 = new NaviButton("运单管理","/导航/centre/运单管理.png");// "接受单"
		button1.setBounds(0, label_height * 2, width, label_height);
		button1.addActionListener(centreMenuListener);
		button1.addMouseListener(centreMenuListener);
		button1.setClicked(true);
		this.add(button1);

		button2 = new NaviButton("飞机装运","/导航/centre/飞机装运.png");// "飞机装运"
		button2.setBounds(0, label_height * 3, width, label_height);
		button2.addActionListener(centreMenuListener);
		button2.addMouseListener(centreMenuListener);
		this.add(button2);

		button3 = new NaviButton("火车装运","/导航/centre/火车装运.png");// "火车装运"
		button3.setBounds(0, label_height * 4, width, label_height);
		button3.addActionListener(centreMenuListener);
		button3.addMouseListener(centreMenuListener);
		this.add(button3);

		button4 = new NaviButton("汽车装运","/导航/centre/汽车装运.png");// "汽车装运"
		button4.setBounds(0, label_height * 5, width, label_height);
		button4.addActionListener(centreMenuListener);
		button4.addMouseListener(centreMenuListener);
		this.add(button4);

		

	}

	public NaviButton getButton1() {
		return button1;
	}

	public NaviButton getButton2() {
		return button2;
	}

	public NaviButton getButton3() {
		return button3;
	}

	public NaviButton getButton4() {
		return button4;
	}

	public CardLayout getCard() {
		return card;
	}

	public void setCard(CardLayout card) {
		this.card = card;
	}

}
