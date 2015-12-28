/**
 * ManagerMenuUI是manager用户的主界面
 */

package presentation.managerui;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import listener.managerlistener.ManagerMenuListener;
import presentation.MySwing.MySeperator;
import presentation.MySwing.NaviButton;
import presentation.MySwing.ShowTimePanel;


public class ManagerMenuUI extends JPanel{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private CardLayout card;
	private NaviButton button1;
	private NaviButton button2;
	private NaviButton button3;
	private NaviButton button4;
	private NaviButton button5;
	private int width;
	private int height;
	private int label_height;
	private JLabel user;
	private ShowTimePanel time;
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
		this.label_height=height/10;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setSize(width,height);
		this.setLayout(null);
		this.setBackground(new Color(246,246,246));
		
		user=new JLabel();
		user.setBounds(10, 20, 50, 50);
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/圆形/总经理.jpg"));
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
		
		button1 = new NaviButton("机构管理","/导航/manager/机构管理.png");//"机构管理"
		button1.setBounds(0, label_height * 2, width, label_height);
		button1.setClicked(true);
		button1.addActionListener(managermenulistener);
		button1.addMouseListener(managermenulistener);
		this.add(button1);

		button2 = new NaviButton("人员管理","/导航/manager/人员管理.png");//"人员管理"

		button2.setBounds(0, label_height * 3, width, label_height);
		button2.addActionListener(managermenulistener);
		button2.addMouseListener(managermenulistener);
		this.add(button2);

		button3 = new NaviButton("审批单据","/导航/manager/审批单据.png");//"审批单据"
		button3.setBounds(0, label_height * 4, width, label_height);
		button3.addActionListener(managermenulistener);
		button3.addMouseListener(managermenulistener);
		this.add(button3);

		button4 = new NaviButton("查看报表","/导航/manager/查看报表.png");//"查看统计分析"
		button4.setBounds(0, label_height * 5, width, label_height);
		button4.addActionListener(managermenulistener);
		button4.addMouseListener(managermenulistener);
		this.add(button4);


		button5 = new NaviButton("制定策略","/导航/manager/制定策略.png");//"制定"
		button5.setBounds(0, label_height * 6, width, label_height);
		button5.addActionListener(managermenulistener);
		button5.addMouseListener(managermenulistener);
		this.add(button5);

	}
	public CardLayout getCard() {
		return card;
	}

	public void setCard(CardLayout card) {
		this.card = card;
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

	public NaviButton getButton5() {
		return button5;
	}



}
