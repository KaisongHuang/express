package presentation.managerui;
import java.awt.CardLayout;
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


	private CardLayout card;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private int width;
	private int height;
	ManagerMenuListener managermenulistener;

	/**
	 * Create the application.
	 * @param height 
	 * @param width 
	 * @param panel1 
	 */
	public ManagerMenuUI(CardLayout card, int width, int height, JPanel panel1) {
		managermenulistener = new ManagerMenuListener(this,card,panel1);
		this.card = card;
		this.width=width;
		this.height=height;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setSize(width,height);
		this.setLayout(null);
		
		button1 = new JButton("机构管理");
		button1.setBounds(0, 0, width, height/5);
		button1.addActionListener(managermenulistener);
		this.add(button1);
		
		button2 = new JButton("人员管理");
		
		button2.setBounds(0, height/5, width, height/5);
		button2.addActionListener(managermenulistener);
		this.add(button2);
		
		button3 = new JButton("审批单据");
		button3.setBounds(0, 2*height/5, width, height/5);
		button3.addActionListener(managermenulistener);
		this.add(button3);
		
		button4 = new JButton("查看统计分析");
		button4.setBounds(0, 3*height/5, width, height/5);
		button4.addActionListener(managermenulistener);
		this.add(button4);
		
		
		button5 = new JButton("制定");
		button5.setBounds(0, 4*height/5, width, height/5);
		button5.addActionListener(managermenulistener);
		this.add(button5);
		
	}
	public CardLayout getCard() {
		return card;
	}

	public void setCard(CardLayout card) {
		this.card = card;
	}

	public JButton getButton1() {
		return button1;
	}


	public JButton getButton2() {
		return button2;
	}

	public JButton getButton3() {
		return button3;
	}
	public JButton getButton4() {
		return button4;
	}

	public JButton getButton5() {
		return button5;
	}

	
	
}
