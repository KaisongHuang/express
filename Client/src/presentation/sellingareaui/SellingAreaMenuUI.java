/**
 * SellingAreaMenuUI是sellingarea用户的主界面
 */

package presentation.sellingareaui;

import java.awt.CardLayout;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import listener.sellingarealistener.SellingAreaMenuListener;
import presentation.MySwing.MySeperator;
import presentation.MySwing.NaviButton;
import presentation.MySwing.ShowTimePanel;


public class SellingAreaMenuUI extends JPanel{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private CardLayout card;

	private NaviButton button1;
	private NaviButton button2;
	private NaviButton button3;
	private NaviButton button4;
	private NaviButton button;
	private JLabel user;
	private ShowTimePanel time;
	private int width;
	private int height;
	private int label_height;
	SellingAreaMenuListener sellingarealistener;

	/**
	 * Create the application.
	 * @param panel1
	 */
	public SellingAreaMenuUI(CardLayout card,int width,int height, JPanel panel1) {
		this.card=card;
		sellingarealistener = new SellingAreaMenuListener(this,card,panel1);
		this.width=width;
		this.height=height;
		this.label_height = height / 10;
		this.setBackground(new Color(246,246,246));
		initialize();
	}



	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	    this.setSize(width,height);
		this.setLayout(null);
		
		user=new JLabel();
		user.setBounds(10, 20, 50, 50);
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/圆形/营业厅.jpg"));
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
		button2 = new NaviButton("接收与派件","/导航/sellingarea/接收与派件.png");//"接收与派件"

		button2.setBounds(0, label_height * 3, width, label_height);
		this.add(button2);

		button3 = new NaviButton("录入收款单","/导航/sellingarea/录入收款单.png");//"收款"
		button3.setBounds(0, label_height * 4, width, label_height);
		this.add(button3);

		button1 = new NaviButton("快件装车管理","/导航/sellingarea/快件装车管理.png");//"车辆装车管理"
		button1.setBounds(0, label_height * 2, width, label_height);
		button1.setClicked(true);
		this.add(button1);

		button4 = new NaviButton("车辆信息管理","/导航/sellingarea/车辆信息管理.png");//"车辆信息管理"
		button4.setBounds(0, label_height * 5, width, label_height);
		this.add(button4);

		button = new NaviButton("司机信息管理","/导航/sellingarea/司机信息管理.png");//"司机信息管理"
		button.setBounds(0, label_height * 6, width, label_height);
		this.add(button);

		button1.addActionListener(sellingarealistener);
		button2.addActionListener(sellingarealistener);
		button3.addActionListener(sellingarealistener);
		button4.addActionListener(sellingarealistener);
		button.addActionListener(sellingarealistener);
		button1.addMouseListener(sellingarealistener);
		button2.addMouseListener(sellingarealistener);
		button3.addMouseListener(sellingarealistener);
		button4.addMouseListener(sellingarealistener);
		button.addMouseListener(sellingarealistener);

	}


	public NaviButton getButton1() {
		return button1;
	}

	public void setbutton1(NaviButton button1) {
		this.button1 = button1;
	}

	public NaviButton getButton2() {
		return button2;
	}

	public void setbutton2(NaviButton button2) {
		this.button2 = button2;
	}

	public NaviButton getButton3() {
		return button3;
	}

	public void setbutton3(NaviButton button3) {
		this.button3 = button3;
	}

	public NaviButton getButton4() {
		return button4;
	}

	public void setbutton4(NaviButton button4) {
		this.button4 = button4;
	}

	public NaviButton getButton() {
		return button;
	}

	public void setButton(NaviButton button) {
		this.button = button;
	}

	public CardLayout getCard() {
		return card;
	}

	public void setCard(CardLayout card) {
		this.card = card;
	}


}
